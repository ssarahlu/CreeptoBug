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

import java.text.DecimalFormat;


public class DetailFragment extends Fragment {
    //    private Intent intent;
    private TextView shortName, longName, textViewVal, textViewChange1, textViewChange24, textViewChange7, textViewMark, textViewVol;
    private ImageView imageView;
    private String coinSelected;
    private Coin coin;
    public static final String ARG_ITEM_ID = "item_id";


    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            coin = coin.searchCoin(getArguments().getString(ARG_ITEM_ID));
            this.getActivity().setTitle(coin.getName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        if (coin != null) {
            DecimalFormat formatter = new DecimalFormat("#,###.00");

            coinSelected = coin.getName();
            longName = rootView.findViewById(R.id.longName);
            longName.setText(coin.getName());
            shortName = rootView.findViewById(R.id.shortName);
            shortName.setText(coin.getSymbol());

            String change1 = Double.toString(coin.getChange1h());

            textViewChange1 = rootView.findViewById(R.id.textViewChange1);
            textViewChange1.setText(change1 + " %");

            String change24 = Double.toString(coin.getChange24h());
            textViewChange24 = rootView.findViewById(R.id.textViewChange24);
            textViewChange24.setText(change24 + " %");

            String change7 = Double.toString(coin.getChange7d());
            textViewChange7 = rootView.findViewById(R.id.textViewChange7);
            textViewChange7.setText(change7 + " %");

            textViewVal = rootView.findViewById(R.id.textViewValue);
            textViewVal.setText("$" + String.valueOf(formatter.format(coin.getValue())));

            textViewMark = rootView.findViewById(R.id.markCap);
            textViewMark.setText("$" + String.valueOf(formatter.format(coin.getMarketcap())));

            textViewVol = rootView.findViewById(R.id.textViewVol);
            textViewVol.setText("$" + formatter.format(coin.getVolume()));

            imageView = rootView.findViewById(R.id.myImage);

            setImage(coinSelected);

            rootView.findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    googleCoin(coin.getName());
                }
            });
        }

        return rootView;


    }


//    private void updateUi() {
//        View rootView = getView();
//        Intent intent = getActivity().getIntent();
//        if(coin != null) {
//            String message = intent.getStringExtra("Message");
//            System.out.println(message + "updateUi");
//            Coin c = Coin.searchCoin(message);
//            DecimalFormat formatter = new DecimalFormat("#,###.00");
//
//            coinSelected = c.getName();
//            longName = rootView.findViewById(R.id.longName);
//            longName.setText(c.getName());
//            shortName = rootView.findViewById(R.id.shortName);
//            shortName.setText(c.getSymbol());
//
//            String change1 = Double.toString(c.getChange1h());
//
//            textViewChange1 = rootView.findViewById(R.id.textViewChange1);
//            textViewChange1.setText(change1 + " %");
//
//            String change24 = Double.toString(c.getChange24h());
//            textViewChange24 = rootView.findViewById(R.id.textViewChange24);
//            textViewChange24.setText(change24 + " %");
//
//            String change7 = Double.toString(c.getChange7d());
//
//            textViewChange7 = rootView.findViewById(R.id.textViewChange7);
//            textViewChange7.setText(change7 + " %");
//
//            textViewVal = rootView.findViewById(R.id.textViewValue);
//            textViewVal.setText("$" + String.valueOf(formatter.format(c.getValue())));
//
//            textViewMark = rootView.findViewById(R.id.textViewMark);
//            textViewMark.setText("$" + String.valueOf(formatter.format(c.getMarketcap())));
//
//            textViewVol = rootView.findViewById(R.id.textViewVol);
//            textViewVol.setText("$" + formatter.format(c.getVolume()));
//
//            imageView = rootView.findViewById(R.id.myImage);
//
//            setImage(coinSelected);
//
//            rootView.findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    googleCoin(coin.getName());
//                }
//            });
//
//        }
//    }

    public void googleCoin(String name) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/#q=" + name));
        startActivity(implicit);
    }

    public void setImage(String coinSelected) {
        System.out.println(coinSelected);
        if (coinSelected != null) {
            if (coinSelected.equals("BinanceCoin")) {
                imageView.setImageResource(R.drawable.binancecoin);
            } else if (coinSelected.equals("Bitcoin")) {
                imageView.setImageResource(R.drawable.bitcoin);
            } else if (coinSelected.equals("Bitcoin Cash")) {
                imageView.setImageResource(R.drawable.bitcoincash);
            } else if (coinSelected.equals("Bitcoin SV")) {
                imageView.setImageResource(R.drawable.bitcoinsv);
            } else if (coinSelected.equals("EOS")) {
                imageView.setImageResource(R.drawable.eos);
            } else if (coinSelected.equals("Ethereum")) {
                imageView.setImageResource(R.drawable.ethereum);
            } else if (coinSelected.equals("Litecoin")) {
                imageView.setImageResource(R.drawable.lifecoin);
            } else if (coinSelected.equals("Stellar")) {
                imageView.setImageResource(R.drawable.stellar);
            } else if (coinSelected.equals("Tether")) {
                imageView.setImageResource(R.drawable.tether);
            } else if (coinSelected.equals("XRP")) {
                imageView.setImageResource(R.drawable.xrp);
            } else {

            }
        } else {
            Intent intent2 = new Intent(getActivity(), MainActivity.class);
            startActivity(intent2);

        }
    }


}
