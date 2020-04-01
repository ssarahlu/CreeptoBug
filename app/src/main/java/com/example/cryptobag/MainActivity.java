package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.List;

import com.example.cryptobag.Entities.CoinLoreResponse;
import com.example.cryptobag.Entities.Coin;

public class MainActivity extends AppCompatActivity {
    private boolean mTwoPane;


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

        Gson gson = new Gson();
        CoinLoreResponse response = gson.fromJson(CoinLoreResponse.json, CoinLoreResponse.class);
        List<Coin> coins = response.getData();

        RecyclerView.Adapter mAdapter = new MyAdapter(this, coins, mTwoPane);

        mRecyclerView.setAdapter(mAdapter);

    }
}
