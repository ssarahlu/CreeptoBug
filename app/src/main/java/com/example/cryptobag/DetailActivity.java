package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString(DetailFragment.ARG_ITEM_ID, getIntent().getStringExtra(DetailFragment.ARG_ITEM_ID));

            DetailFragment fragment = new DetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detailContainer, fragment)
                    .commit();
        }


//        fragmentManager = getSupportFragmentManager();
//        Fragment fragment = fragmentManager.findFragmentById(R.id.container);
//        if (savedInstanceState == null) {
//            fragmentManager.beginTransaction()
//                    .add(R.id.container, new CoinListFragment())
//                    .commit();
//        }
//
//
//        intent = getIntent();
//        String message = intent.getStringExtra("Message");
//        Coin c = Coin.searchCoin(message);
//        DecimalFormat formatter = new DecimalFormat("#,###.00");
//
//        coinSelected = c.getName();
//        longName = findViewById(R.id.longName);
//        longName.setText(c.getName());
//        shortName = findViewById(R.id.shortName);
//        shortName.setText(c.getSymbol());
//
//        String change1 = Double.toString(c.getChange1h());
//
//        textViewChange1 = findViewById(R.id.textViewChange1);
//        textViewChange1.setText(change1 + " %");
//
//        String change24 = Double.toString(c.getChange24h());
//
//        textViewChange24 = findViewById(R.id.textViewChange24);
//        textViewChange24.setText(change24 + " %");
//
//        String change7 = Double.toString(c.getChange7d());
//
//        textViewChange7 = findViewById(R.id.textViewChange7);
//        textViewChange7.setText(change7 + " %");
//
//        textViewVal = findViewById(R.id.textViewValue);
//        textViewVal.setText("$" + String.valueOf(formatter.format(c.getValue())));
//
//        textViewMark = findViewById(R.id.textViewMark);
//        textViewMark.setText("$" + String.valueOf(formatter.format(c.getMarketcap())));
//
//        textViewVol = findViewById(R.id.textViewVol);
//        textViewVol.setText("$" + formatter.format(c.getVolume()));
//
//        imageView = findViewById(R.id.myImage);
//
//        setImage(coinSelected);


    }


//    public void setImage(String coinSelected) {
//        System.out.println(coinSelected);
//        if (coinSelected != null) {
//            if (coinSelected.equals("BinanceCoin")) {
//                imageView.setImageResource(R.drawable.bnb);
//            } else if (coinSelected.equals("Bitcoin")) {
//                imageView.setImageResource(R.drawable.btc);
//            } else if (coinSelected.equals("Bitcoin Cash")) {
//                imageView.setImageResource(R.drawable.bch);
//            } else if (coinSelected.equals("Bitcoin SV")) {
//                imageView.setImageResource(R.drawable.bchsv);
//            } else if (coinSelected.equals("EOS")) {
//                imageView.setImageResource(R.drawable.eos);
//            } else if (coinSelected.equals("Ethereum")) {
//                imageView.setImageResource(R.drawable.eth);
//            } else if (coinSelected.equals("Litecoin")) {
//                imageView.setImageResource(R.drawable.ltc);
//            } else if (coinSelected.equals("Stellar")) {
//                imageView.setImageResource(R.drawable.xlm);
//            } else if (coinSelected.equals("Tether")) {
//                imageView.setImageResource(R.drawable.usdt);
//            } else if (coinSelected.equals("XRP")) {
//                imageView.setImageResource(R.drawable.xrp);
//            } else {
//
//            }
//        } else {
//            //ask akhil why i need this unless it loads blank activity when back button is pressed
//            Intent intent2 = new Intent(this, MainActivity.class);
//            startActivity(intent2);
//
//        }
//    }
//
//
//    public void googleCoin(View view) {
//        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/#q=" + coinSelected));
//        startActivity(implicit);
//    }


}
