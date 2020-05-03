package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;

import java.util.List;

import com.example.cryptobag.Entities.CoinLoreResponse;
import com.example.cryptobag.Entities.Coin;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private boolean mTwoPane;
    private MyAdapter mAdapter;
    private static final String TAG = "MainActivity";
    private List<Coin> coins = new ArrayList<>();
    private CoinDatabase cDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.detailContainer) != null) {
            mTwoPane = true;
        }
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(this, new ArrayList<Coin>(), mTwoPane);
        mRecyclerView.setAdapter(mAdapter);
        cDb = Room.databaseBuilder(getApplicationContext(), CoinDatabase.class, "coin-database").build();
        new GetCoinDBTask().execute();
        new MyCoinTask().execute();

    }

    private class MyCoinTask extends AsyncTask<Void, Void, List<Coin>> {
        @Override
        protected List<Coin> doInBackground(Void... voids) {
            try {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.coinlore.net/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                CoinService service = retrofit.create(CoinService.class);
                Call<CoinLoreResponse> coinCall = service.getCoins();
                Response<CoinLoreResponse> coinResponse = coinCall.execute();
                List<Coin> coins = coinResponse.body().getData();
//                cDb.coinDao().deleteAll(cDb.coinDao().getCoins().toArray(new Coin[cDb.coinDao().getCoins().size()]));
                cDb.coinDao().delAll();
                cDb.coinDao().insertAll(coins.toArray(new Coin[coins.size()]));

                return coins;

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Coin> coins) {
            mAdapter.setCoins(coins);
            mAdapter.notifyDataSetChanged();

        }
    }

    private class GetCoinDBTask extends AsyncTask<Void, Void, List<Coin>> {

        @Override
        protected List<Coin> doInBackground(Void... voids) {
            return cDb.coinDao().getCoins();
        }

        @Override
        protected void onPostExecute(List<Coin> beers) {
            mAdapter.setCoins(coins);
            mAdapter.notifyDataSetChanged();
        }
    }

}
