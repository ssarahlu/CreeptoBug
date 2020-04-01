package com.example.cryptobag;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cryptobag.Entities.CoinLoreResponse;
import com.example.cryptobag.Entities.Coin;


import com.google.gson.Gson;

import java.text.NumberFormat;
import java.util.List;




public class DetailFragment extends Fragment {
    private TextView shortName, longName, textViewVal, textViewChange1, textViewChange24, textViewChange7, textViewMark, textViewVol;
    private ImageView imageView;
    private Coin mCoin;
    public static final String ARG_ITEM_ID = "item_id";


    public DetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            Gson gson = new Gson();
            CoinLoreResponse response = gson.fromJson(CoinLoreResponse.json, CoinLoreResponse.class);
            List<Coin> coins = response.getData();
            for(Coin coin : coins) {
                if(coin.getId().equals(getArguments().getString(ARG_ITEM_ID))) {
                    mCoin  = coin;
                    this.getActivity().setTitle(coin.getName());
                }
            }

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        if (mCoin != null) {

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            longName = rootView.findViewById(R.id.longName);
            longName.setText(mCoin.getName());
            shortName = rootView.findViewById(R.id.shortName);
            shortName.setText(mCoin.getSymbol());

            String change1 = mCoin.getPercentChange1h();

            textViewChange1 = rootView.findViewById(R.id.textViewChange1);
            textViewChange1.setText(change1 + " %");

            String change24 = mCoin.getPercentChange24h();
            textViewChange24 = rootView.findViewById(R.id.textViewChange24);
            textViewChange24.setText(change24 + " %");

            String change7 = mCoin.getPercentChange7d();
            textViewChange7 = rootView.findViewById(R.id.textViewChange7);
            textViewChange7.setText(change7 + " %");

            textViewVal = rootView.findViewById(R.id.textViewValue);
            textViewVal.setText(formatter.format(Double.valueOf(mCoin.getPriceUsd())));

            textViewMark = rootView.findViewById(R.id.markCap);
            textViewMark.setText(formatter.format(Double.valueOf(mCoin.getMarketCapUsd())));

            textViewVol = rootView.findViewById(R.id.textViewVol);
            textViewVol.setText(formatter.format(Double.valueOf(mCoin.getVolume24())));

            imageView = rootView.findViewById(R.id.myImage);

//no longer have iamges so i can't set it anymore
//            setImage(coinSelected);

            rootView.findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    googleCoin(mCoin.getName());
                }
            });
        }

        return rootView;
    }


    public void googleCoin(String name) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/#q=" + name));
        startActivity(implicit);
    }
//no longer have iamges so i can't set it anymore
//    public void setImage(String coinSelected) {
//        System.out.println(coinSelected);
//        if (coinSelected != null) {
//            int res = getResources().getIdentifier(coinSelected.toLowerCase(), "drawable", "com.example.cryptobag");
//            imageView.setImageResource(res);
//
//        } else {
//            Intent intent2 = new Intent(getActivity(), MainActivity.class);
//            startActivity(intent2);
//
//        }
//    }


}
