package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

private TextView shortName, longName, textViewVal, textViewChange1, textViewChange24, textViewChange7, textViewMark, textViewVol;

private static final String TAG = "Detail";

private ImageView myImage;

private String searchCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");
        Coin c = Coin.searchCoin(message);

        searchCoin = c.getName();

        longName = findViewById(R.id.longName);
        longName.setText(c.getName());

        shortName = findViewById(R.id.shortName);
        shortName.setText(c.getSymbol());


        String change1 = Double.toString(c.getChange1h());

        textViewChange1 = findViewById(R.id.textViewChange1);
        textViewChange1.setText(change1 + " %");

        String change24 = Double.toString(c.getChange24h());

        textViewChange24 = findViewById(R.id.textViewChange24);
        textViewChange24.setText(change24 + " %");

        String change7 = Double.toString(c.getChange7d());

        textViewChange7 = findViewById(R.id.textViewChange7);
        textViewChange7.setText(change7 + " %");

        String value = Double.toString(c.getValue());

        textViewVal = findViewById(R.id.textViewValue);
        textViewVal.setText("$" + value);

        textViewMark = findViewById(R.id.textViewMark);
        textViewMark.setText("$" + String.format("%.2f", c.getMarketcap()));

        textViewVol = findViewById(R.id.textViewVol);
        textViewVol.setText("$" + String.format("%.2f", c.getVolume()));

        myImage = findViewById(R.id.myImage);

        if (searchCoin.equals("BinanceCoin")){
            myImage.setImageResource(R.drawable.binancecoin);
        } else if (searchCoin.equals("Bitcoin")){
            myImage.setImageResource(R.drawable.bitcoin);
        } else if (searchCoin.equals("Bitcoin Cash")) {
            myImage.setImageResource(R.drawable.bitcoincash);
        } else if (searchCoin.equals("Bitcoin SV")){
            myImage.setImageResource(R.drawable.bitcoinsv);
        } else if (searchCoin.equals("EOS")){
            myImage.setImageResource(R.drawable.eos);
        } else if (searchCoin.equals("Ethereum")){
            myImage.setImageResource(R.drawable.ethereum);
        } else if (searchCoin.equals("Litecoin")){
            myImage.setImageResource(R.drawable.lifecoin);
        } else if (searchCoin.equals("Stellar")){
            myImage.setImageResource(R.drawable.stellar);
        } else if (searchCoin.equals("Tether")){
            myImage.setImageResource(R.drawable.tether);
        } else if (searchCoin.equals("XRP")){
            myImage.setImageResource(R.drawable.xrp);
        } else {

        }

    }



    public void googleCoin(View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/#q=" + searchCoin));
        startActivity(implicit);
    }



}
