package com.example.cryptobag;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cryptobag.Entities.Coin;

import java.text.NumberFormat;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CoinViewHolder> {
    private MainActivity mParentActivity;
    private List<Coin> coinList;
    private boolean mTwoPane;
    public String mCoin;
    private static final String TAG = "MyAdapter";


    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Coin coin = (Coin) v.getTag();
            if (mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(DetailFragment.ARG_ITEM_ID, coin.getId());
                DetailFragment fragment = new DetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.detailContainer, fragment).commit();
            } else {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailFragment.ARG_ITEM_ID, coin.getId());
                System.out.println(coin.getId());
                context.startActivity(intent);
            }
        }
    };


    public MyAdapter(MainActivity parent, List<Coin> coins, boolean twoPane) {
        mParentActivity = parent;
        coinList = coins;
        mTwoPane = twoPane;
    }

    public static class CoinViewHolder extends RecyclerView.ViewHolder {
        public TextView name, value, change1h;
        public ImageView imageView;
        public CardView cv;

        public CoinViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            cv = view.findViewById(R.id.cardView);
            value = view.findViewById(R.id.value);
            change1h = view.findViewById(R.id.change1h);
            imageView = view.findViewById(R.id.imageView);
        }
    }

    @Override
    public MyAdapter.CoinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_list_row, parent, false);
        return new CoinViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CoinViewHolder holder, int position) {
        Coin coin = coinList.get(position);
        mCoin = coinList.get(position).getName();
        holder.name.setText(coin.getName());
        holder.value.setText(NumberFormat.getCurrencyInstance().format(Double.valueOf(coin.getPriceUsd())));
        double change = Double.valueOf(coin.getPercentChange1h());

        if (change > 0) {
            holder.change1h.setText(change + " %");
            holder.change1h.setTextColor(Color.parseColor("#FFCD32"));
        } else {
            holder.change1h.setText(change + " %");
            holder.change1h.setTextColor(Color.parseColor("#FF3C33"));
        }
        Glide.with(mParentActivity).load("https://c1.coinlore.com/img/25x25/" + coin.getNameid().toLowerCase() + ".png").into(holder.imageView);

        holder.itemView.setTag(coin);
        holder.itemView.setOnClickListener(mOnClickListener);

    }

    @Override
    public int getItemCount() {
        return coinList.size();
    }

    public void setCoins(List<Coin> coins) {
        coinList.clear();
        coinList.addAll(coins);
    }


}