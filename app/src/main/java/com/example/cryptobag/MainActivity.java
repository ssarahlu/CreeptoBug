package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
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

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Detail";
    private List<Coin> coinList = new ArrayList<>();
    private RecyclerView recyclerView;
    private String coinSelected;
    private FragmentManager fragmentManager;
    //private boolean isTwoPane;
    private boolean mTwoPane;
    private MyAdapter mAdapter;



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
        RecyclerView.Adapter mAdapter = new MyAdapter(this, Coin.getCoins(), mTwoPane);
        mRecyclerView.setAdapter(mAdapter);


//        fragmentManager = getSupportFragmentManager();
//        Fragment fragment = fragmentManager.findFragmentById(R.id.container);
//
//
//        if (findViewById(R.id.container) != null) {
//            isTwoPane = true;
//        } else {
//            isTwoPane = false;
//        }
//
//        if (savedInstanceState == null) {
//            fragmentManager.beginTransaction()
//                    .add(R.id.container, new CoinListFragment())
//                    .commit();
//        }
//
//        if (isTwoPane) {
//            fragmentManager.beginTransaction()
//                    .replace(R.id.detailContainer, new DetailFragment())
//                    .commit();
//        }


//        recyclerView = findViewById(R.id.recyclerView);
//
//        //learn what these do
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        myAdapter = new MyAdapter(this, coinList);
//
//        recyclerView.setAdapter(myAdapter);
//
//        recyclerView.addOnItemTouchListener(new RecyclerClickListener(getApplicationContext(), recyclerView, new RecyclerClickListener.ClickListener() {
//            @Override
//            //why do we need position and how do we even get that
//            public void onClick(View view, int position) {
//                Coin coin = coinList.get(position);
//                Toast.makeText(getApplicationContext(), coin.getName() + " is selected!", Toast.LENGTH_SHORT).show();
//                coinSelected = coin.getName();
//                Intent intent = new Intent(view.getContext(), DetailActivity.class);
//                //what is get context used for
//                view.getContext().startActivity(intent);
//                intent.putExtra("Message", coinSelected);
//                startActivity(intent);
//
//            }
//
//            @Override
//            public void onLongClick(View view, int position) {
//            }
//        }));
//        prepareCoin();
//    }
    }

//    private void prepareCoin() {
//        for (Coin c : Coin.getCoins()) {
//            Coin coins = new Coin(c.getName(), c.getSymbol(), c.getValue(), c.getChange1h(), c.getChange24h(), c.getChange7d(), c.getMarketcap(), c.getVolume(), c.getThumbNail());
//            coinList.add(coins);
//            mAdapter.notifyDataSetChanged();
//
//        }

//    }


}
