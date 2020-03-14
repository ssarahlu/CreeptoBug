package com.example.cryptobag;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

//this is where my recycler view adapter is defined
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CoinViewHolder> {
    private MainActivity mParentActivity;
    private List<Coin> coinList;
    private boolean mTwoPane;
    public String mCoin;


    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Coin coin = (Coin) v.getTag();
            if (mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(DetailFragment.ARG_ITEM_ID, coin.getName());
                DetailFragment fragment = new DetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.detailContainer, fragment).commit();
            } else {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailFragment.ARG_ITEM_ID, coin.getName());
                context.startActivity(intent);
            }
        }
    };


    public MyAdapter(MainActivity parent, ArrayList<Coin> coins, boolean twoPane) {
        mParentActivity = parent;
        coinList = Coin.getCoins();
        mTwoPane = twoPane;
    }

    public static class CoinViewHolder extends RecyclerView.ViewHolder {
        public TextView name, value, change1h;
        public ImageView imageView;
        public CardView cv;

        //what is my view holder for and where does it accept the view view from
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

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CoinViewHolder holder, int position) {
        Coin coin = coinList.get(position);
        mCoin = coinList.get(position).getName();
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        holder.name.setText(coin.getName());
        holder.value.setText("$" + formatter.format(coin.getValue()));
        holder.change1h.setText(coin.getChange1h() + " %");
        holder.imageView.setImageResource(coin.getThumbNail());
        holder.itemView.setTag(coin);
        holder.itemView.setOnClickListener(mOnClickListener);
//        holder.cv.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Coin coin = (Coin) v.getTag();
//                if (mTwoPane) {
//                    Bundle arguments = new Bundle();
//                    arguments.putString(DetailFragment.ARG_ITEM_ID, coin.getName());
//                    DetailFragment fragment = new DetailFragment();
//                    fragment.setArguments(arguments);
//                    mParentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.detailContainer, fragment).commit();
//                } else {
//                    Context context = v.getContext();
//                    Intent intent = new Intent(context, DetailActivity.class);
//                    intent.putExtra(DetailFragment.ARG_ITEM_ID, coin.getName());
//                    context.startActivity(intent);
//                }
//            }
//        });


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return coinList.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and you provide access to all the views for a data item in a view holder
    //why do we need to extends my view holder?
//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//        public TextView name, value, change1h;
//        public ImageView imageView;
//
//        //what is my view holder for and where does it accept the view view from
//        public MyViewHolder(View view) {
//            super(view);
//            name = view.findViewById(R.id.name);
//            value = view.findViewById(R.id.value);
//            change1h = view.findViewById(R.id.change1h);
//            imageView = view.findViewById(R.id.imageView);
//
//        }
//    }

//    //why do i have a context in my adapter?
//    // Provide a suitable constructor - use whatever dataset is necessary
//    public MyAdapter(Context myContext, List<Coin> coinList) {
//        this.myContext = myContext;
//        this.coinList = coinList;
//    }
//
//    //what does viewgroup and viewtype for
//    // Create new views (invoked by the layout manager)
//    @Override
//    //why is there a static call?
//    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        // create a new view
//        LayoutInflater inflater = LayoutInflater.from(myContext);
//        View v = inflater.inflate(R.layout.coin_list_row, parent, false);
//        MyViewHolder vh = new MyViewHolder(v);
//        return vh;
//
//    }
//
//    //what does this do
//    // Replace the contents of a view (invoked by the layout manager)
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
//        Coin coin = coinList.get(position);
//        DecimalFormat formatter = new DecimalFormat("#,###.00");
//        holder.name.setText(coin.getName());
//        holder.value.setText("$" + formatter.format(coin.getValue()));
//        holder.change1h.setText(coin.getChange1h() + " %");
//        holder.imageView.setImageDrawable(myContext.getResources().getDrawable(coin.getThumbNail()));
//
//
//    }
//
//    //why do we need an item count
//    // Return the size of your dataset (invoked by the layout manager)
//    @Override
//    public int getItemCount() {
//        return coinList.size();
//    }


}