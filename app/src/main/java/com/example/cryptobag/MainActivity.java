package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.List;

import com.example.cryptobag.Entities.CoinLoreResponse;
import com.example.cryptobag.Entities.Coin;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private boolean mTwoPane;
    private MyAdapter mAdapter;
    private static final String TAG = "MainActivity";
    private List<Coin> coins;

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

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.coinlore.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            CoinService service = retrofit.create(CoinService.class);
            Call<CoinLoreResponse> coinCall = service.getCoins();
//            Response<CoinLoreResponse> coinResponse = coinCall.execute();
//            List<Coin> coins = coinResponse.body().getData();
            coinCall.enqueue(new Callback<CoinLoreResponse>() {
                @Override
                public void onResponse(Call<CoinLoreResponse> call, Response<CoinLoreResponse> response) {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "onResponse: do response code here ");
                        coins = response.body().getData();
                        mAdapter.setCoins(coins);
                        mRecyclerView.setAdapter(mAdapter);

                    } else {
                        Log.d(TAG, "onResponse: ERROR IS " + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<CoinLoreResponse> call, Throwable t) {
                    // something went completely south (like no internet connection)
                    Log.d("Error", t.getLocalizedMessage());
                }

            });

        mRecyclerView.setAdapter(mAdapter);

    }
}
