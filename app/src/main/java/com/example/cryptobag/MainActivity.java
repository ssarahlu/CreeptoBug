package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Detail";
    private List<Coin> coinList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
 //      setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mAdapter = new MyAdapter(coinList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerClickListener(getApplicationContext(), recyclerView, new RecyclerClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Coin coin = coinList.get(position);
                Toast.makeText(getApplicationContext(), coin.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareCoin();
    }

    private void prepareCoin() {
        for (Coin c : Coin.getCoins()){
            Coin coins = new Coin(c.getName(), c.getSymbol(), c.getValue(), c.getChange1h(), c.getChange24h(), c.getChange7d(), c.getMarketcap(), c.getVolume());
            coinList.add(coins);
            mAdapter.notifyDataSetChanged();

        }


}


    public void sendMessage(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Message", "Bitcoin");


        startActivity(intent);
        Log.d(TAG, "sendMessage: hello");

    }

}
