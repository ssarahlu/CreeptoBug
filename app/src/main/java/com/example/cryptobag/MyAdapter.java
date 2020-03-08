package com.example.cryptobag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//this is where my recycler view adapter is defined
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Coin> myList;
    private Context mContext;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView name, value, change1h;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            value = view.findViewById(R.id.value);
            change1h = view.findViewById(R.id.change1h);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Coin> coinList) {
        myList = Coin.getCoins();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coin_list_row, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Coin coin = myList.get(position);
        holder.name.setText(coin.getName());
        holder.value.setText("$" + String.format("%.2f", coin.getValue()));
        holder.change1h.setText(String.valueOf(coin.getChange1h()) + " %");


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return myList.size();
    }



}