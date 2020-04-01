package com.example.cryptobag.Entities;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinLoreResponse {

    @SerializedName("data")
    @Expose
    private List<Coin> data = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public static String json = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"id\": \"90\",\n" +
            "      \"symbol\": \"BTC\",\n" +
            "      \"name\": \"Bitcoin\",\n" +
            "      \"nameid\": \"bitcoin\",\n" +
            "      \"rank\": 1,\n" +
            "      \"price_usd\": \"6329.96\",\n" +
            "      \"percent_change_24h\": \"-1.84\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"-4.53\",\n" +
            "      \"price_btc\": \"1.00\",\n" +
            "      \"market_cap_usd\": \"115718997333.88\",\n" +
            "      \"volume24\": 24911784448.215862,\n" +
            "      \"volume24a\": 27658443111.607597,\n" +
            "      \"csupply\": \"18281159.00\",\n" +
            "      \"tsupply\": \"18281159\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"80\",\n" +
            "      \"symbol\": \"ETH\",\n" +
            "      \"name\": \"Ethereum\",\n" +
            "      \"nameid\": \"ethereum\",\n" +
            "      \"rank\": 2,\n" +
            "      \"price_usd\": \"132.47\",\n" +
            "      \"percent_change_24h\": \"0.52\",\n" +
            "      \"percent_change_1h\": \"0.07\",\n" +
            "      \"percent_change_7d\": \"-3.32\",\n" +
            "      \"price_btc\": \"0.020869\",\n" +
            "      \"market_cap_usd\": \"14597648663.45\",\n" +
            "      \"volume24\": 8898104968.851814,\n" +
            "      \"volume24a\": 9468568199.998266,\n" +
            "      \"csupply\": \"110196485.00\",\n" +
            "      \"tsupply\": \"110196485\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"58\",\n" +
            "      \"symbol\": \"XRP\",\n" +
            "      \"name\": \"XRP\",\n" +
            "      \"nameid\": \"ripple\",\n" +
            "      \"rank\": 3,\n" +
            "      \"price_usd\": \"0.173111\",\n" +
            "      \"percent_change_24h\": \"0.38\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"7.92\",\n" +
            "      \"price_btc\": \"0.000027\",\n" +
            "      \"market_cap_usd\": \"7428109899.42\",\n" +
            "      \"volume24\": 1572253745.194373,\n" +
            "      \"volume24a\": 1546389872.0463612,\n" +
            "      \"csupply\": \"42909539227.00\",\n" +
            "      \"tsupply\": \"99991841593\",\n" +
            "      \"msupply\": \"100000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"518\",\n" +
            "      \"symbol\": \"USDT\",\n" +
            "      \"name\": \"Tether\",\n" +
            "      \"nameid\": \"tether\",\n" +
            "      \"rank\": 4,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"-0.05\",\n" +
            "      \"percent_change_1h\": \"0.02\",\n" +
            "      \"percent_change_7d\": \"0.41\",\n" +
            "      \"price_btc\": \"0.000158\",\n" +
            "      \"market_cap_usd\": \"4069227928.21\",\n" +
            "      \"volume24\": 30329964506.02005,\n" +
            "      \"volume24a\": 33886229133.851135,\n" +
            "      \"csupply\": \"4049107372.00\",\n" +
            "      \"tsupply\": \"4049107372\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2321\",\n" +
            "      \"symbol\": \"BCH\",\n" +
            "      \"name\": \"Bitcoin Cash\",\n" +
            "      \"nameid\": \"bitcoin-cash\",\n" +
            "      \"rank\": 5,\n" +
            "      \"price_usd\": \"216.82\",\n" +
            "      \"percent_change_24h\": \"-0.84\",\n" +
            "      \"percent_change_1h\": \"0.12\",\n" +
            "      \"percent_change_7d\": \"-3.52\",\n" +
            "      \"price_btc\": \"0.034157\",\n" +
            "      \"market_cap_usd\": \"3977336911.26\",\n" +
            "      \"volume24\": 1932889609.904187,\n" +
            "      \"volume24a\": 2195459595.5618725,\n" +
            "      \"csupply\": \"18343840.00\",\n" +
            "      \"tsupply\": \"18343840\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33234\",\n" +
            "      \"symbol\": \"BCHSV\",\n" +
            "      \"name\": \"Bitcoin SV\",\n" +
            "      \"nameid\": \"bitcoin-cash-sv\",\n" +
            "      \"rank\": 6,\n" +
            "      \"price_usd\": \"163.56\",\n" +
            "      \"percent_change_24h\": \"-0.72\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"-6.69\",\n" +
            "      \"price_btc\": \"0.025766\",\n" +
            "      \"market_cap_usd\": \"2999828565.35\",\n" +
            "      \"volume24\": 1517685187.3278832,\n" +
            "      \"volume24a\": 1804952874.1484172,\n" +
            "      \"csupply\": \"18341277.00\",\n" +
            "      \"tsupply\": \"21000000\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"1\",\n" +
            "      \"symbol\": \"LTC\",\n" +
            "      \"name\": \"Litecoin\",\n" +
            "      \"nameid\": \"litecoin\",\n" +
            "      \"rank\": 7,\n" +
            "      \"price_usd\": \"38.69\",\n" +
            "      \"percent_change_24h\": \"0.11\",\n" +
            "      \"percent_change_1h\": \"0.24\",\n" +
            "      \"percent_change_7d\": \"-2.73\",\n" +
            "      \"price_btc\": \"0.006095\",\n" +
            "      \"market_cap_usd\": \"2500192028.94\",\n" +
            "      \"volume24\": 2573036222.251212,\n" +
            "      \"volume24a\": 2926543297.939322,\n" +
            "      \"csupply\": \"64619858.00\",\n" +
            "      \"tsupply\": \"64619858\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2679\",\n" +
            "      \"symbol\": \"EOS\",\n" +
            "      \"name\": \"EOS\",\n" +
            "      \"nameid\": \"eos\",\n" +
            "      \"rank\": 8,\n" +
            "      \"price_usd\": \"2.21\",\n" +
            "      \"percent_change_24h\": \"0.06\",\n" +
            "      \"percent_change_1h\": \"0.22\",\n" +
            "      \"percent_change_7d\": \"-5.11\",\n" +
            "      \"price_btc\": \"0.000348\",\n" +
            "      \"market_cap_usd\": \"2052217237.98\",\n" +
            "      \"volume24\": 1954565216.3473394,\n" +
            "      \"volume24a\": 2214803043.9918523,\n" +
            "      \"csupply\": \"929000281.00\",\n" +
            "      \"tsupply\": \"1006245120\",\n" +
            "      \"msupply\": \"1006245120\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2710\",\n" +
            "      \"symbol\": \"BNB\",\n" +
            "      \"name\": \"Binance Coin\",\n" +
            "      \"nameid\": \"binance-coin\",\n" +
            "      \"rank\": 9,\n" +
            "      \"price_usd\": \"12.41\",\n" +
            "      \"percent_change_24h\": \"-0.21\",\n" +
            "      \"percent_change_1h\": \"0.35\",\n" +
            "      \"percent_change_7d\": \"1.23\",\n" +
            "      \"price_btc\": \"0.001955\",\n" +
            "      \"market_cap_usd\": \"1929793777.22\",\n" +
            "      \"volume24\": 316502711.63647497,\n" +
            "      \"volume24a\": 241568965.02296484,\n" +
            "      \"csupply\": \"155536713.00\",\n" +
            "      \"tsupply\": \"192443301\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3682\",\n" +
            "      \"symbol\": \"XTZ\",\n" +
            "      \"name\": \"Tezos\",\n" +
            "      \"nameid\": \"tezos\",\n" +
            "      \"rank\": 10,\n" +
            "      \"price_usd\": \"1.59\",\n" +
            "      \"percent_change_24h\": \"-0.30\",\n" +
            "      \"percent_change_1h\": \"0.44\",\n" +
            "      \"percent_change_7d\": \"-9.06\",\n" +
            "      \"price_btc\": \"0.000250\",\n" +
            "      \"market_cap_usd\": \"1049506332.53\",\n" +
            "      \"volume24\": 63302985.077397354,\n" +
            "      \"volume24a\": 71953465.58410287,\n" +
            "      \"csupply\": \"660373612.00\",\n" +
            "      \"tsupply\": \"763306930\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33833\",\n" +
            "      \"symbol\": \"LEO\",\n" +
            "      \"name\": \"UNUS SED LEO\",\n" +
            "      \"nameid\": \"unus-sed-leo\",\n" +
            "      \"rank\": 11,\n" +
            "      \"price_usd\": \"1.04\",\n" +
            "      \"percent_change_24h\": \"0.52\",\n" +
            "      \"percent_change_1h\": \"-0.20\",\n" +
            "      \"percent_change_7d\": \"2.98\",\n" +
            "      \"price_btc\": \"0.000164\",\n" +
            "      \"market_cap_usd\": \"1043000228.96\",\n" +
            "      \"volume24\": 1571688.6341021,\n" +
            "      \"volume24a\": 2321093.3346888805,\n" +
            "      \"csupply\": \"999498893.00\",\n" +
            "      \"tsupply\": \"999498893\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"89\",\n" +
            "      \"symbol\": \"XLM\",\n" +
            "      \"name\": \"Stellar\",\n" +
            "      \"nameid\": \"stellar\",\n" +
            "      \"rank\": 12,\n" +
            "      \"price_usd\": \"0.040315\",\n" +
            "      \"percent_change_24h\": \"-0.27\",\n" +
            "      \"percent_change_1h\": \"0.18\",\n" +
            "      \"percent_change_7d\": \"0.66\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"817721266.51\",\n" +
            "      \"volume24\": 274058170.82526636,\n" +
            "      \"volume24a\": 266533957.90868193,\n" +
            "      \"csupply\": \"20283516588.00\",\n" +
            "      \"tsupply\": \"104303927518\",\n" +
            "      \"msupply\": \"104303927518\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"28\",\n" +
            "      \"symbol\": \"XMR\",\n" +
            "      \"name\": \"Monero\",\n" +
            "      \"nameid\": \"monero\",\n" +
            "      \"rank\": 13,\n" +
            "      \"price_usd\": \"47.00\",\n" +
            "      \"percent_change_24h\": \"-0.34\",\n" +
            "      \"percent_change_1h\": \"0.31\",\n" +
            "      \"percent_change_7d\": \"0.37\",\n" +
            "      \"price_btc\": \"0.007404\",\n" +
            "      \"market_cap_usd\": \"807116232.73\",\n" +
            "      \"volume24\": 108103654.44466358,\n" +
            "      \"volume24a\": 120265354.0315032,\n" +
            "      \"csupply\": \"17174299.00\",\n" +
            "      \"tsupply\": \"17174299\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"257\",\n" +
            "      \"symbol\": \"ADA\",\n" +
            "      \"name\": \"Cardano\",\n" +
            "      \"nameid\": \"cardano\",\n" +
            "      \"rank\": 14,\n" +
            "      \"price_usd\": \"0.030608\",\n" +
            "      \"percent_change_24h\": \"2.62\",\n" +
            "      \"percent_change_1h\": \"0.24\",\n" +
            "      \"percent_change_7d\": \"3.24\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"793577642.65\",\n" +
            "      \"volume24\": 68664926.34122506,\n" +
            "      \"volume24a\": 68698470.924365,\n" +
            "      \"csupply\": \"25927070538.00\",\n" +
            "      \"tsupply\": \"31112483745\",\n" +
            "      \"msupply\": \"45000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2751\",\n" +
            "      \"symbol\": \"LINK\",\n" +
            "      \"name\": \"ChainLink\",\n" +
            "      \"nameid\": \"chainlink\",\n" +
            "      \"rank\": 15,\n" +
            "      \"price_usd\": \"2.24\",\n" +
            "      \"percent_change_24h\": \"4.52\",\n" +
            "      \"percent_change_1h\": \"0.37\",\n" +
            "      \"percent_change_7d\": \"-2.71\",\n" +
            "      \"price_btc\": \"0.000353\",\n" +
            "      \"market_cap_usd\": \"783916603.01\",\n" +
            "      \"volume24\": 203892732.224978,\n" +
            "      \"volume24a\": 173285526.59998596,\n" +
            "      \"csupply\": \"350000000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000 \"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2713\",\n" +
            "      \"symbol\": \"TRX\",\n" +
            "      \"name\": \"TRON\",\n" +
            "      \"nameid\": \"tron\",\n" +
            "      \"rank\": 16,\n" +
            "      \"price_usd\": \"0.011511\",\n" +
            "      \"percent_change_24h\": \"0.52\",\n" +
            "      \"percent_change_1h\": \"0.33\",\n" +
            "      \"percent_change_7d\": \"1.29\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"767563598.38\",\n" +
            "      \"volume24\": 550065831.732378,\n" +
            "      \"volume24a\": 771945469.1887265,\n" +
            "      \"csupply\": \"66682072191.00\",\n" +
            "      \"tsupply\": \"99000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"8\",\n" +
            "      \"symbol\": \"DASH\",\n" +
            "      \"name\": \"Dash\",\n" +
            "      \"nameid\": \"dash\",\n" +
            "      \"rank\": 17,\n" +
            "      \"price_usd\": \"64.75\",\n" +
            "      \"percent_change_24h\": \"-0.67\",\n" +
            "      \"percent_change_1h\": \"0.36\",\n" +
            "      \"percent_change_7d\": \"-6.19\",\n" +
            "      \"price_btc\": \"0.010200\",\n" +
            "      \"market_cap_usd\": \"608186129.18\",\n" +
            "      \"volume24\": 452785707.9096341,\n" +
            "      \"volume24a\": 512289365.83551294,\n" +
            "      \"csupply\": \"9393253.00\",\n" +
            "      \"tsupply\": \"9393253\",\n" +
            "      \"msupply\": \"18900000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"118\",\n" +
            "      \"symbol\": \"ETC\",\n" +
            "      \"name\": \"Ethereum Classic\",\n" +
            "      \"nameid\": \"ethereum-classic\",\n" +
            "      \"rank\": 18,\n" +
            "      \"price_usd\": \"4.89\",\n" +
            "      \"percent_change_24h\": \"-0.65\",\n" +
            "      \"percent_change_1h\": \"0.41\",\n" +
            "      \"percent_change_7d\": \"-1.78\",\n" +
            "      \"price_btc\": \"0.000771\",\n" +
            "      \"market_cap_usd\": \"552985480.94\",\n" +
            "      \"volume24\": 1352422656.4294672,\n" +
            "      \"volume24a\": 1504496654.9351604,\n" +
            "      \"csupply\": \"112980348.00\",\n" +
            "      \"tsupply\": \"112980348\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33538\",\n" +
            "      \"symbol\": \"MIN\",\n" +
            "      \"name\": \"MINDOL\",\n" +
            "      \"nameid\": \"mindol\",\n" +
            "      \"rank\": 19,\n" +
            "      \"price_usd\": \"3.16\",\n" +
            "      \"percent_change_24h\": \"7.75\",\n" +
            "      \"percent_change_1h\": \"4.74\",\n" +
            "      \"percent_change_7d\": \"17.05\",\n" +
            "      \"price_btc\": \"0.000498\",\n" +
            "      \"market_cap_usd\": \"491657021.36\",\n" +
            "      \"volume24\": 571925.6611547654,\n" +
            "      \"volume24a\": 792240.6726077613,\n" +
            "      \"csupply\": \"155379617.00\",\n" +
            "      \"tsupply\": \"240000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"133\",\n" +
            "      \"symbol\": \"NEO\",\n" +
            "      \"name\": \"Neo\",\n" +
            "      \"nameid\": \"neo\",\n" +
            "      \"rank\": 20,\n" +
            "      \"price_usd\": \"6.70\",\n" +
            "      \"percent_change_24h\": \"1.09\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"-1.89\",\n" +
            "      \"price_btc\": \"0.001055\",\n" +
            "      \"market_cap_usd\": \"472426750.85\",\n" +
            "      \"volume24\": 425043296.58636487,\n" +
            "      \"volume24a\": 400541614.10503036,\n" +
            "      \"csupply\": \"70538831.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33608\",\n" +
            "      \"symbol\": \"HEDG\",\n" +
            "      \"name\": \"HedgeTrade\",\n" +
            "      \"nameid\": \"hedgetrade\",\n" +
            "      \"rank\": 21,\n" +
            "      \"price_usd\": \"1.57\",\n" +
            "      \"percent_change_24h\": \"-3.87\",\n" +
            "      \"percent_change_1h\": \"-1.40\",\n" +
            "      \"percent_change_7d\": \"-5.10\",\n" +
            "      \"price_btc\": \"0.000248\",\n" +
            "      \"market_cap_usd\": \"453969316.79\",\n" +
            "      \"volume24\": 420482.69873865467,\n" +
            "      \"volume24a\": 451781.7586727281,\n" +
            "      \"csupply\": \"288393355.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33285\",\n" +
            "      \"symbol\": \"USDC\",\n" +
            "      \"name\": \"USD Coin\",\n" +
            "      \"nameid\": \"usd-coin\",\n" +
            "      \"rank\": 22,\n" +
            "      \"price_usd\": \"0.998323\",\n" +
            "      \"percent_change_24h\": \"-0.10\",\n" +
            "      \"percent_change_1h\": \"-0.01\",\n" +
            "      \"percent_change_7d\": \"-0.02\",\n" +
            "      \"price_btc\": \"0.000157\",\n" +
            "      \"market_cap_usd\": \"434302597.34\",\n" +
            "      \"volume24\": 197708135.31302875,\n" +
            "      \"volume24a\": 222200506.69280937,\n" +
            "      \"csupply\": \"435032301.00\",\n" +
            "      \"tsupply\": \"435032301\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33819\",\n" +
            "      \"symbol\": \"CRO\",\n" +
            "      \"name\": \"Crypto.com Chain\",\n" +
            "      \"nameid\": \"crypto-com-chain\",\n" +
            "      \"rank\": 23,\n" +
            "      \"price_usd\": \"0.044236\",\n" +
            "      \"percent_change_24h\": \"1.99\",\n" +
            "      \"percent_change_1h\": \"0.64\",\n" +
            "      \"percent_change_7d\": \"3.19\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"410543363.52\",\n" +
            "      \"volume24\": 4875931.709844389,\n" +
            "      \"volume24a\": 4876629.109147991,\n" +
            "      \"csupply\": \"9280821918.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"447\",\n" +
            "      \"symbol\": \"IOTA\",\n" +
            "      \"name\": \"IOTA\",\n" +
            "      \"nameid\": \"iota\",\n" +
            "      \"rank\": 24,\n" +
            "      \"price_usd\": \"0.142261\",\n" +
            "      \"percent_change_24h\": \"0.14\",\n" +
            "      \"percent_change_1h\": \"0.27\",\n" +
            "      \"percent_change_7d\": \"-0.34\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"395419956.87\",\n" +
            "      \"volume24\": 11189648.175197298,\n" +
            "      \"volume24a\": 11109950.76976919,\n" +
            "      \"csupply\": \"2779530283.00\",\n" +
            "      \"tsupply\": \"2779530283\",\n" +
            "      \"msupply\": \"2779530283\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33830\",\n" +
            "      \"symbol\": \"ATOM\",\n" +
            "      \"name\": \"Cosmos\",\n" +
            "      \"nameid\": \"cosmos\",\n" +
            "      \"rank\": 25,\n" +
            "      \"price_usd\": \"1.94\",\n" +
            "      \"percent_change_24h\": \"-0.37\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"-8.06\",\n" +
            "      \"price_btc\": \"0.000306\",\n" +
            "      \"market_cap_usd\": \"370574045.18\",\n" +
            "      \"volume24\": 83978771.23881151,\n" +
            "      \"volume24a\": 101185171.05459888,\n" +
            "      \"csupply\": \"190688439.00\",\n" +
            "      \"tsupply\": \"237928231\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70\",\n" +
            "      \"symbol\": \"NEM\",\n" +
            "      \"name\": \"NEM\",\n" +
            "      \"nameid\": \"nem\",\n" +
            "      \"rank\": 26,\n" +
            "      \"price_usd\": \"0.036246\",\n" +
            "      \"percent_change_24h\": \"-1.56\",\n" +
            "      \"percent_change_1h\": \"-0.03\",\n" +
            "      \"percent_change_7d\": \"-6.57\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"326210250.96\",\n" +
            "      \"volume24\": 10255785.490050795,\n" +
            "      \"volume24a\": 28272358.506826483,\n" +
            "      \"csupply\": \"8999999999.00\",\n" +
            "      \"tsupply\": \"8999999999\",\n" +
            "      \"msupply\": \"8999999999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"12377\",\n" +
            "      \"symbol\": \"MKR\",\n" +
            "      \"name\": \"Maker\",\n" +
            "      \"nameid\": \"maker\",\n" +
            "      \"rank\": 27,\n" +
            "      \"price_usd\": \"292.58\",\n" +
            "      \"percent_change_24h\": \"0.78\",\n" +
            "      \"percent_change_1h\": \"-0.86\",\n" +
            "      \"percent_change_7d\": \"11.63\",\n" +
            "      \"price_btc\": \"0.046092\",\n" +
            "      \"market_cap_usd\": \"292576779.53\",\n" +
            "      \"volume24\": 2859558.7815509667,\n" +
            "      \"volume24a\": 3680854.970811523,\n" +
            "      \"csupply\": \"1000000.00\",\n" +
            "      \"tsupply\": \"1000000\",\n" +
            "      \"msupply\": \"1000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"134\",\n" +
            "      \"symbol\": \"ZEC\",\n" +
            "      \"name\": \"Zcash\",\n" +
            "      \"nameid\": \"zcash\",\n" +
            "      \"rank\": 28,\n" +
            "      \"price_usd\": \"30.81\",\n" +
            "      \"percent_change_24h\": \"1.04\",\n" +
            "      \"percent_change_1h\": \"0.68\",\n" +
            "      \"percent_change_7d\": \"-5.16\",\n" +
            "      \"price_btc\": \"0.004853\",\n" +
            "      \"market_cap_usd\": \"292538610.58\",\n" +
            "      \"volume24\": 316093843.2103225,\n" +
            "      \"volume24a\": 345298340.07006705,\n" +
            "      \"csupply\": \"9496456.00\",\n" +
            "      \"tsupply\": \"9496456\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33061\",\n" +
            "      \"symbol\": \"INB\",\n" +
            "      \"name\": \"Insight Chain\",\n" +
            "      \"nameid\": \"insight-chain\",\n" +
            "      \"rank\": 29,\n" +
            "      \"price_usd\": \"0.762500\",\n" +
            "      \"percent_change_24h\": \"-1.20\",\n" +
            "      \"percent_change_1h\": \"-0.01\",\n" +
            "      \"percent_change_7d\": \"1.63\",\n" +
            "      \"price_btc\": \"0.000120\",\n" +
            "      \"market_cap_usd\": \"266800800.36\",\n" +
            "      \"volume24\": 19390291.29011556,\n" +
            "      \"volume24a\": 18532640.024547257,\n" +
            "      \"csupply\": \"349902689.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2\",\n" +
            "      \"symbol\": \"DOGE\",\n" +
            "      \"name\": \"Dogecoin\",\n" +
            "      \"nameid\": \"dogecoin\",\n" +
            "      \"rank\": 30,\n" +
            "      \"price_usd\": \"0.001801\",\n" +
            "      \"percent_change_24h\": \"-1.19\",\n" +
            "      \"percent_change_1h\": \"-0.32\",\n" +
            "      \"percent_change_7d\": \"-3.18\",\n" +
            "      \"price_btc\": \"2.84E-7\",\n" +
            "      \"market_cap_usd\": \"222889783.10\",\n" +
            "      \"volume24\": 118146169.79724811,\n" +
            "      \"volume24a\": 124868345.57687697,\n" +
            "      \"csupply\": \"123727126384.00\",\n" +
            "      \"tsupply\": \"123727126384\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32331\",\n" +
            "      \"symbol\": \"ONT\",\n" +
            "      \"name\": \"Ontology\",\n" +
            "      \"nameid\": \"ontology\",\n" +
            "      \"rank\": 31,\n" +
            "      \"price_usd\": \"0.368393\",\n" +
            "      \"percent_change_24h\": \"0.97\",\n" +
            "      \"percent_change_1h\": \"0.26\",\n" +
            "      \"percent_change_7d\": \"-4.08\",\n" +
            "      \"price_btc\": \"0.000058\",\n" +
            "      \"market_cap_usd\": \"196531585.21\",\n" +
            "      \"volume24\": 43921855.519802734,\n" +
            "      \"volume24a\": 41999982.817159824,\n" +
            "      \"csupply\": \"533483170.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32479\",\n" +
            "      \"symbol\": \"TUSD\",\n" +
            "      \"name\": \"TrueUSD\",\n" +
            "      \"nameid\": \"trueusd\",\n" +
            "      \"rank\": 32,\n" +
            "      \"price_usd\": \"0.996522\",\n" +
            "      \"percent_change_24h\": \"-0.13\",\n" +
            "      \"percent_change_1h\": \"0.02\",\n" +
            "      \"percent_change_7d\": \"0.03\",\n" +
            "      \"price_btc\": \"0.000157\",\n" +
            "      \"market_cap_usd\": \"194803276.68\",\n" +
            "      \"volume24\": 282364960.2607341,\n" +
            "      \"volume24a\": 379066720.3582707,\n" +
            "      \"csupply\": \"195483256.00\",\n" +
            "      \"tsupply\": \"195483256\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33820\",\n" +
            "      \"symbol\": \"PAX\",\n" +
            "      \"name\": \"Paxos Standard Token\",\n" +
            "      \"nameid\": \"paxos-standard-token\",\n" +
            "      \"rank\": 33,\n" +
            "      \"price_usd\": \"0.998634\",\n" +
            "      \"percent_change_24h\": \"0.02\",\n" +
            "      \"percent_change_1h\": \"0.04\",\n" +
            "      \"percent_change_7d\": \"0.13\",\n" +
            "      \"price_btc\": \"0.000157\",\n" +
            "      \"market_cap_usd\": \"194101452.38\",\n" +
            "      \"volume24\": 418131688.2809785,\n" +
            "      \"volume24a\": 414952393.1955623,\n" +
            "      \"csupply\": \"194366961.00\",\n" +
            "      \"tsupply\": \"194366961\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"184\",\n" +
            "      \"symbol\": \"BAT\",\n" +
            "      \"name\": \"Basic Attention Token\",\n" +
            "      \"nameid\": \"basic-attention-token\",\n" +
            "      \"rank\": 34,\n" +
            "      \"price_usd\": \"0.140156\",\n" +
            "      \"percent_change_24h\": \"1.10\",\n" +
            "      \"percent_change_1h\": \"0.49\",\n" +
            "      \"percent_change_7d\": \"-6.03\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"179291050.44\",\n" +
            "      \"volume24\": 49264619.936835736,\n" +
            "      \"volume24a\": 58001473.36064002,\n" +
            "      \"csupply\": \"1279225522.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2741\",\n" +
            "      \"symbol\": \"VET\",\n" +
            "      \"name\": \"VeChain\",\n" +
            "      \"nameid\": \"vechain\",\n" +
            "      \"rank\": 35,\n" +
            "      \"price_usd\": \"0.003048\",\n" +
            "      \"percent_change_24h\": \"2.33\",\n" +
            "      \"percent_change_1h\": \"0.16\",\n" +
            "      \"percent_change_7d\": \"4.52\",\n" +
            "      \"price_btc\": \"4.80E-7\",\n" +
            "      \"market_cap_usd\": \"169024867.53\",\n" +
            "      \"volume24\": 101219298.55848959,\n" +
            "      \"volume24a\": 80605491.18333955,\n" +
            "      \"csupply\": \"55454734800.00\",\n" +
            "      \"tsupply\": \"86712634466\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32351\",\n" +
            "      \"symbol\": \"HT\",\n" +
            "      \"name\": \"Huobi Token\",\n" +
            "      \"nameid\": \"huobi-token\",\n" +
            "      \"rank\": 36,\n" +
            "      \"price_usd\": \"3.30\",\n" +
            "      \"percent_change_24h\": \"0.84\",\n" +
            "      \"percent_change_1h\": \"0.60\",\n" +
            "      \"percent_change_7d\": \"-3.20\",\n" +
            "      \"price_btc\": \"0.000520\",\n" +
            "      \"market_cap_usd\": \"164886058.42\",\n" +
            "      \"volume24\": 99922606.31990255,\n" +
            "      \"volume24a\": 106508520.25939746,\n" +
            "      \"csupply\": \"50000200.00\",\n" +
            "      \"tsupply\": \"500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"99\",\n" +
            "      \"symbol\": \"DCR\",\n" +
            "      \"name\": \"Decred\",\n" +
            "      \"nameid\": \"decred\",\n" +
            "      \"rank\": 37,\n" +
            "      \"price_usd\": \"11.29\",\n" +
            "      \"percent_change_24h\": \"0.45\",\n" +
            "      \"percent_change_1h\": \"0.01\",\n" +
            "      \"percent_change_7d\": \"-2.65\",\n" +
            "      \"price_btc\": \"0.001778\",\n" +
            "      \"market_cap_usd\": \"127069063.77\",\n" +
            "      \"volume24\": 66456272.14179085,\n" +
            "      \"volume24a\": 76011635.75430474,\n" +
            "      \"csupply\": \"11255663.00\",\n" +
            "      \"tsupply\": \"11255663\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"285\",\n" +
            "      \"symbol\": \"BTG\",\n" +
            "      \"name\": \"Bitcoin Gold\",\n" +
            "      \"nameid\": \"bitcoingold\",\n" +
            "      \"rank\": 38,\n" +
            "      \"price_usd\": \"7.07\",\n" +
            "      \"percent_change_24h\": \"-1.54\",\n" +
            "      \"percent_change_1h\": \"-0.28\",\n" +
            "      \"percent_change_7d\": \"-7.69\",\n" +
            "      \"price_btc\": \"0.001114\",\n" +
            "      \"market_cap_usd\": \"121958219.56\",\n" +
            "      \"volume24\": 16612268.171968793,\n" +
            "      \"volume24a\": 17628077.4476646,\n" +
            "      \"csupply\": \"17248611.00\",\n" +
            "      \"tsupply\": \"17348611\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3708\",\n" +
            "      \"symbol\": \"ICX\",\n" +
            "      \"name\": \"ICON\",\n" +
            "      \"nameid\": \"icon\",\n" +
            "      \"rank\": 39,\n" +
            "      \"price_usd\": \"0.241696\",\n" +
            "      \"percent_change_24h\": \"16.52\",\n" +
            "      \"percent_change_1h\": \"0.10\",\n" +
            "      \"percent_change_7d\": \"19.83\",\n" +
            "      \"price_btc\": \"0.000038\",\n" +
            "      \"market_cap_usd\": \"118540482.24\",\n" +
            "      \"volume24\": 44725516.66434374,\n" +
            "      \"volume24a\": 22876206.023446385,\n" +
            "      \"csupply\": \"490453303.00\",\n" +
            "      \"tsupply\": \"800460000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"237\",\n" +
            "      \"symbol\": \"QTUM\",\n" +
            "      \"name\": \"Qtum\",\n" +
            "      \"nameid\": \"qtum\",\n" +
            "      \"rank\": 40,\n" +
            "      \"price_usd\": \"1.21\",\n" +
            "      \"percent_change_24h\": \"0.70\",\n" +
            "      \"percent_change_1h\": \"-0.04\",\n" +
            "      \"percent_change_7d\": \"-3.83\",\n" +
            "      \"price_btc\": \"0.000190\",\n" +
            "      \"market_cap_usd\": \"115972730.14\",\n" +
            "      \"volume24\": 325773547.19043964,\n" +
            "      \"volume24a\": 336813591.36193043,\n" +
            "      \"csupply\": \"95969372.00\",\n" +
            "      \"tsupply\": \"100909224\",\n" +
            "      \"msupply\": \"100909224\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"108\",\n" +
            "      \"symbol\": \"LSK\",\n" +
            "      \"name\": \"Lisk\",\n" +
            "      \"nameid\": \"lisk\",\n" +
            "      \"rank\": 41,\n" +
            "      \"price_usd\": \"0.969462\",\n" +
            "      \"percent_change_24h\": \"0.54\",\n" +
            "      \"percent_change_1h\": \"0.63\",\n" +
            "      \"percent_change_7d\": \"-5.95\",\n" +
            "      \"price_btc\": \"0.000153\",\n" +
            "      \"market_cap_usd\": \"115960487.35\",\n" +
            "      \"volume24\": 2663916.8819879172,\n" +
            "      \"volume24a\": 2455933.3376246234,\n" +
            "      \"csupply\": \"119613215.00\",\n" +
            "      \"tsupply\": \"125643660\",\n" +
            "      \"msupply\": \"159918400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"129\",\n" +
            "      \"symbol\": \"REP\",\n" +
            "      \"name\": \"Augur\",\n" +
            "      \"nameid\": \"augur\",\n" +
            "      \"rank\": 42,\n" +
            "      \"price_usd\": \"9.97\",\n" +
            "      \"percent_change_24h\": \"-4.67\",\n" +
            "      \"percent_change_1h\": \"-0.08\",\n" +
            "      \"percent_change_7d\": \"17.91\",\n" +
            "      \"price_btc\": \"0.001571\",\n" +
            "      \"market_cap_usd\": \"109715776.53\",\n" +
            "      \"volume24\": 9292696.174786424,\n" +
            "      \"volume24a\": 10883288.560580296,\n" +
            "      \"csupply\": \"11000000.00\",\n" +
            "      \"tsupply\": \"11000000\",\n" +
            "      \"msupply\": \"11000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"113\",\n" +
            "      \"symbol\": \"WAVES\",\n" +
            "      \"name\": \"Waves\",\n" +
            "      \"nameid\": \"waves\",\n" +
            "      \"rank\": 43,\n" +
            "      \"price_usd\": \"0.984933\",\n" +
            "      \"percent_change_24h\": \"19.94\",\n" +
            "      \"percent_change_1h\": \"3.97\",\n" +
            "      \"percent_change_7d\": \"6.83\",\n" +
            "      \"price_btc\": \"0.000155\",\n" +
            "      \"market_cap_usd\": \"98493252.39\",\n" +
            "      \"volume24\": 124850521.53457253,\n" +
            "      \"volume24a\": 39033213.68537573,\n" +
            "      \"csupply\": \"100000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33821\",\n" +
            "      \"symbol\": \"ABBC\",\n" +
            "      \"name\": \"ABBC Coin\",\n" +
            "      \"nameid\": \"abbc-coin\",\n" +
            "      \"rank\": 44,\n" +
            "      \"price_usd\": \"0.090464\",\n" +
            "      \"percent_change_24h\": \"-1.65\",\n" +
            "      \"percent_change_1h\": \"0.15\",\n" +
            "      \"percent_change_7d\": \"-6.54\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"90823919.21\",\n" +
            "      \"volume24\": 18060837.441359017,\n" +
            "      \"volume24a\": 20148155.448538736,\n" +
            "      \"csupply\": \"1003981087.00\",\n" +
            "      \"tsupply\": \"1003981087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2729\",\n" +
            "      \"symbol\": \"ZRX\",\n" +
            "      \"name\": \"0x\",\n" +
            "      \"nameid\": \"0x\",\n" +
            "      \"rank\": 45,\n" +
            "      \"price_usd\": \"0.150819\",\n" +
            "      \"percent_change_24h\": \"-0.98\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"-3.47\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"90563429.97\",\n" +
            "      \"volume24\": 10039386.841968995,\n" +
            "      \"volume24a\": 11531331.97909268,\n" +
            "      \"csupply\": \"600475853.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32073\",\n" +
            "      \"symbol\": \"BCD\",\n" +
            "      \"name\": \"Bitcoin Diamond\",\n" +
            "      \"nameid\": \"bitcoin-diamond\",\n" +
            "      \"rank\": 46,\n" +
            "      \"price_usd\": \"0.471184\",\n" +
            "      \"percent_change_24h\": \"-1.60\",\n" +
            "      \"percent_change_1h\": \"0.13\",\n" +
            "      \"percent_change_7d\": \"-5.14\",\n" +
            "      \"price_btc\": \"0.000074\",\n" +
            "      \"market_cap_usd\": \"87872478.42\",\n" +
            "      \"volume24\": 5114521.240782954,\n" +
            "      \"volume24a\": 5983934.162301678,\n" +
            "      \"csupply\": \"186492898.00\",\n" +
            "      \"tsupply\": \"186492898\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33531\",\n" +
            "      \"symbol\": \"OKB\",\n" +
            "      \"name\": \"OKB\",\n" +
            "      \"nameid\": \"okb\",\n" +
            "      \"rank\": 47,\n" +
            "      \"price_usd\": \"4.26\",\n" +
            "      \"percent_change_24h\": \"0.18\",\n" +
            "      \"percent_change_1h\": \"0.60\",\n" +
            "      \"percent_change_7d\": \"-1.75\",\n" +
            "      \"price_btc\": \"0.000671\",\n" +
            "      \"market_cap_usd\": \"85155672.31\",\n" +
            "      \"volume24\": 225753582.80925685,\n" +
            "      \"volume24a\": 229718436.63592857,\n" +
            "      \"csupply\": \"20000000.00\",\n" +
            "      \"tsupply\": \"300000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2750\",\n" +
            "      \"symbol\": \"KCS\",\n" +
            "      \"name\": \"KuCoin Shares\",\n" +
            "      \"nameid\": \"kucoin-shares\",\n" +
            "      \"rank\": 48,\n" +
            "      \"price_usd\": \"0.913893\",\n" +
            "      \"percent_change_24h\": \"-3.66\",\n" +
            "      \"percent_change_1h\": \"-0.16\",\n" +
            "      \"percent_change_7d\": \"-19.09\",\n" +
            "      \"price_btc\": \"0.000144\",\n" +
            "      \"market_cap_usd\": \"81104029.46\",\n" +
            "      \"volume24\": 5523337.512181034,\n" +
            "      \"volume24a\": 7001686.151744279,\n" +
            "      \"csupply\": \"88745681.00\",\n" +
            "      \"tsupply\": \"180730576\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32417\",\n" +
            "      \"symbol\": \"DAI\",\n" +
            "      \"name\": \"Dai\",\n" +
            "      \"nameid\": \"dai\",\n" +
            "      \"rank\": 49,\n" +
            "      \"price_usd\": \"1.02\",\n" +
            "      \"percent_change_24h\": \"0.26\",\n" +
            "      \"percent_change_1h\": \"0.12\",\n" +
            "      \"percent_change_7d\": \"-0.71\",\n" +
            "      \"price_btc\": \"0.000161\",\n" +
            "      \"market_cap_usd\": \"80188702.33\",\n" +
            "      \"volume24\": 10346458.611164361,\n" +
            "      \"volume24a\": 10564602.34447495,\n" +
            "      \"csupply\": \"78262606.00\",\n" +
            "      \"tsupply\": \"78262606\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33723\",\n" +
            "      \"symbol\": \"SNX\",\n" +
            "      \"name\": \"Synthetix Network Token\",\n" +
            "      \"nameid\": \"synthetix-network-token\",\n" +
            "      \"rank\": 50,\n" +
            "      \"price_usd\": \"0.620858\",\n" +
            "      \"percent_change_24h\": \"3.43\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"26.89\",\n" +
            "      \"price_btc\": \"0.000098\",\n" +
            "      \"market_cap_usd\": \"78202488.40\",\n" +
            "      \"volume24\": 1474161.0439602714,\n" +
            "      \"volume24a\": 1184611.4714975543,\n" +
            "      \"csupply\": \"125958830.00\",\n" +
            "      \"tsupply\": \"125958830\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"22\",\n" +
            "      \"symbol\": \"MONA\",\n" +
            "      \"name\": \"MonaCoin\",\n" +
            "      \"nameid\": \"monacoin\",\n" +
            "      \"rank\": 51,\n" +
            "      \"price_usd\": \"1.17\",\n" +
            "      \"percent_change_24h\": \"-2.70\",\n" +
            "      \"percent_change_1h\": \"0.97\",\n" +
            "      \"percent_change_7d\": \"-5.69\",\n" +
            "      \"price_btc\": \"0.000185\",\n" +
            "      \"market_cap_usd\": \"77169124.91\",\n" +
            "      \"volume24\": 5790540.80771032,\n" +
            "      \"volume24a\": 3790269.8280866984,\n" +
            "      \"csupply\": \"65729675.00\",\n" +
            "      \"tsupply\": \"65729675\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"211\",\n" +
            "      \"symbol\": \"MCO\",\n" +
            "      \"name\": \"Crypto.com\",\n" +
            "      \"nameid\": \"monaco\",\n" +
            "      \"rank\": 52,\n" +
            "      \"price_usd\": \"4.79\",\n" +
            "      \"percent_change_24h\": \"-0.72\",\n" +
            "      \"percent_change_1h\": \"0.28\",\n" +
            "      \"percent_change_7d\": \"3.75\",\n" +
            "      \"price_btc\": \"0.000754\",\n" +
            "      \"market_cap_usd\": \"75623976.35\",\n" +
            "      \"volume24\": 33273192.164224215,\n" +
            "      \"volume24a\": 32426085.446649075,\n" +
            "      \"csupply\": \"15793831.00\",\n" +
            "      \"tsupply\": \"31587682\",\n" +
            "      \"msupply\": \"31587682.3632061\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2515\",\n" +
            "      \"symbol\": \"KNC\",\n" +
            "      \"name\": \"Kyber Network\",\n" +
            "      \"nameid\": \"kyber-network\",\n" +
            "      \"rank\": 53,\n" +
            "      \"price_usd\": \"0.431137\",\n" +
            "      \"percent_change_24h\": \"-1.27\",\n" +
            "      \"percent_change_1h\": \"0.31\",\n" +
            "      \"percent_change_7d\": \"-8.44\",\n" +
            "      \"price_btc\": \"0.000068\",\n" +
            "      \"market_cap_usd\": \"72372693.37\",\n" +
            "      \"volume24\": 34907381.50185663,\n" +
            "      \"volume24a\": 37943636.88151347,\n" +
            "      \"csupply\": \"167864614.00\",\n" +
            "      \"tsupply\": \"215625349\",\n" +
            "      \"msupply\": \"226000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"232\",\n" +
            "      \"symbol\": \"OMG\",\n" +
            "      \"name\": \"OmiseGO\",\n" +
            "      \"nameid\": \"omisego\",\n" +
            "      \"rank\": 54,\n" +
            "      \"price_usd\": \"0.514085\",\n" +
            "      \"percent_change_24h\": \"0.42\",\n" +
            "      \"percent_change_1h\": \"0.21\",\n" +
            "      \"percent_change_7d\": \"-1.18\",\n" +
            "      \"price_btc\": \"0.000081\",\n" +
            "      \"market_cap_usd\": \"72098027.53\",\n" +
            "      \"volume24\": 96377504.62693208,\n" +
            "      \"volume24a\": 106332233.9531609,\n" +
            "      \"csupply\": \"140245398.00\",\n" +
            "      \"tsupply\": \"140245398\",\n" +
            "      \"msupply\": \"140245398\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2581\",\n" +
            "      \"symbol\": \"ENJ\",\n" +
            "      \"name\": \"Enjin Coin\",\n" +
            "      \"nameid\": \"enjin-coin\",\n" +
            "      \"rank\": 55,\n" +
            "      \"price_usd\": \"0.091218\",\n" +
            "      \"percent_change_24h\": \"-1.88\",\n" +
            "      \"percent_change_1h\": \"0.08\",\n" +
            "      \"percent_change_7d\": \"16.27\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"70810474.47\",\n" +
            "      \"volume24\": 4379656.98386367,\n" +
            "      \"volume24a\": 7875707.688065256,\n" +
            "      \"csupply\": \"776278713.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32386\",\n" +
            "      \"symbol\": \"RVN\",\n" +
            "      \"name\": \"Ravencoin\",\n" +
            "      \"nameid\": \"ravencoin\",\n" +
            "      \"rank\": 56,\n" +
            "      \"price_usd\": \"0.015235\",\n" +
            "      \"percent_change_24h\": \"2.72\",\n" +
            "      \"percent_change_1h\": \"0.14\",\n" +
            "      \"percent_change_7d\": \"0.85\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"65150376.65\",\n" +
            "      \"volume24\": 11648621.553420272,\n" +
            "      \"volume24a\": 9190242.199393762,\n" +
            "      \"csupply\": \"4276480000.00\",\n" +
            "      \"tsupply\": \"4276480000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2835\",\n" +
            "      \"symbol\": \"NANO\",\n" +
            "      \"name\": \"Nano\",\n" +
            "      \"nameid\": \"nano\",\n" +
            "      \"rank\": 57,\n" +
            "      \"price_usd\": \"0.487670\",\n" +
            "      \"percent_change_24h\": \"5.00\",\n" +
            "      \"percent_change_1h\": \"0.29\",\n" +
            "      \"percent_change_7d\": \"-2.77\",\n" +
            "      \"price_btc\": \"0.000077\",\n" +
            "      \"market_cap_usd\": \"64981227.30\",\n" +
            "      \"volume24\": 2691344.2004220863,\n" +
            "      \"volume24a\": 2382347.6836208384,\n" +
            "      \"csupply\": \"133248297.00\",\n" +
            "      \"tsupply\": \"133248297\",\n" +
            "      \"msupply\": \"133248297\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32604\",\n" +
            "      \"symbol\": \"NEXO\",\n" +
            "      \"name\": \"Nexo\",\n" +
            "      \"nameid\": \"nexo\",\n" +
            "      \"rank\": 58,\n" +
            "      \"price_usd\": \"0.108354\",\n" +
            "      \"percent_change_24h\": \"1.57\",\n" +
            "      \"percent_change_1h\": \"0.18\",\n" +
            "      \"percent_change_7d\": \"0.44\",\n" +
            "      \"price_btc\": \"0.000017\",\n" +
            "      \"market_cap_usd\": \"60678158.33\",\n" +
            "      \"volume24\": 9394400.304397915,\n" +
            "      \"volume24a\": 9714738.937476074,\n" +
            "      \"csupply\": \"560000011.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"207\",\n" +
            "      \"symbol\": \"SNT\",\n" +
            "      \"name\": \"Status Network Token\",\n" +
            "      \"nameid\": \"status\",\n" +
            "      \"rank\": 59,\n" +
            "      \"price_usd\": \"0.017328\",\n" +
            "      \"percent_change_24h\": \"-3.28\",\n" +
            "      \"percent_change_1h\": \"1.18\",\n" +
            "      \"percent_change_7d\": \"15.90\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"60137031.38\",\n" +
            "      \"volume24\": 32734056.43953628,\n" +
            "      \"volume24a\": 39568487.99449652,\n" +
            "      \"csupply\": \"3470483788.00\",\n" +
            "      \"tsupply\": \"6804870174\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33071\",\n" +
            "      \"symbol\": \"DX\",\n" +
            "      \"name\": \"DxChain Token\",\n" +
            "      \"nameid\": \"dxchain-token\",\n" +
            "      \"rank\": 60,\n" +
            "      \"price_usd\": \"0.001269\",\n" +
            "      \"percent_change_24h\": \"-0.89\",\n" +
            "      \"percent_change_1h\": \"-0.88\",\n" +
            "      \"percent_change_7d\": \"1.34\",\n" +
            "      \"price_btc\": \"2.00E-7\",\n" +
            "      \"market_cap_usd\": \"58711502.29\",\n" +
            "      \"volume24\": 1478619.959109311,\n" +
            "      \"volume24a\": 1423230.1072178676,\n" +
            "      \"csupply\": \"46250000000.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"43\",\n" +
            "      \"symbol\": \"DGB\",\n" +
            "      \"name\": \"Digibyte\",\n" +
            "      \"nameid\": \"digibyte\",\n" +
            "      \"rank\": 61,\n" +
            "      \"price_usd\": \"0.004327\",\n" +
            "      \"percent_change_24h\": \"-2.60\",\n" +
            "      \"percent_change_1h\": \"-0.96\",\n" +
            "      \"percent_change_7d\": \"19.47\",\n" +
            "      \"price_btc\": \"6.82E-7\",\n" +
            "      \"market_cap_usd\": \"56038343.28\",\n" +
            "      \"volume24\": 713204.5444164944,\n" +
            "      \"volume24a\": 892593.714286643,\n" +
            "      \"csupply\": \"12950710845.00\",\n" +
            "      \"tsupply\": \"12950710845\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2482\",\n" +
            "      \"symbol\": \"BTM\",\n" +
            "      \"name\": \"Bytom\",\n" +
            "      \"nameid\": \"bytom\",\n" +
            "      \"rank\": 62,\n" +
            "      \"price_usd\": \"0.055449\",\n" +
            "      \"percent_change_24h\": \"-1.96\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"-6.50\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"55587345.56\",\n" +
            "      \"volume24\": 132480053.56535494,\n" +
            "      \"volume24a\": 152520225.8222969,\n" +
            "      \"csupply\": \"1002499275.00\",\n" +
            "      \"tsupply\": \"1407000000\",\n" +
            "      \"msupply\": \"1407000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"183\",\n" +
            "      \"symbol\": \"SC\",\n" +
            "      \"name\": \"Siacoin\",\n" +
            "      \"nameid\": \"siacoin\",\n" +
            "      \"rank\": 63,\n" +
            "      \"price_usd\": \"0.001260\",\n" +
            "      \"percent_change_24h\": \"0.46\",\n" +
            "      \"percent_change_1h\": \"0.48\",\n" +
            "      \"percent_change_7d\": \"-4.02\",\n" +
            "      \"price_btc\": \"1.99E-7\",\n" +
            "      \"market_cap_usd\": \"52700121.31\",\n" +
            "      \"volume24\": 2100204.814471852,\n" +
            "      \"volume24a\": 2437003.953079207,\n" +
            "      \"csupply\": \"41817047634.00\",\n" +
            "      \"tsupply\": \"41817047634\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32360\",\n" +
            "      \"symbol\": \"THETA\",\n" +
            "      \"name\": \"Theta Token\",\n" +
            "      \"nameid\": \"theta-token\",\n" +
            "      \"rank\": 64,\n" +
            "      \"price_usd\": \"0.072764\",\n" +
            "      \"percent_change_24h\": \"-0.18\",\n" +
            "      \"percent_change_1h\": \"0.35\",\n" +
            "      \"percent_change_7d\": \"4.65\",\n" +
            "      \"price_btc\": \"0.000011\",\n" +
            "      \"market_cap_usd\": \"51407909.07\",\n" +
            "      \"volume24\": 2313441.746332237,\n" +
            "      \"volume24a\": 2078787.5719066937,\n" +
            "      \"csupply\": \"706502689.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"111\",\n" +
            "      \"symbol\": \"DGD\",\n" +
            "      \"name\": \"DigixDAO\",\n" +
            "      \"nameid\": \"digixdao\",\n" +
            "      \"rank\": 65,\n" +
            "      \"price_usd\": \"25.29\",\n" +
            "      \"percent_change_24h\": \"-1.00\",\n" +
            "      \"percent_change_1h\": \"0.23\",\n" +
            "      \"percent_change_7d\": \"-3.73\",\n" +
            "      \"price_btc\": \"0.003984\",\n" +
            "      \"market_cap_usd\": \"50576386.72\",\n" +
            "      \"volume24\": 947639.5763978987,\n" +
            "      \"volume24a\": 958557.826897928,\n" +
            "      \"csupply\": \"2000000.00\",\n" +
            "      \"tsupply\": \"2000000\",\n" +
            "      \"msupply\": \"2000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"106\",\n" +
            "      \"symbol\": \"STEEM\",\n" +
            "      \"name\": \"STEEM\",\n" +
            "      \"nameid\": \"steem\",\n" +
            "      \"rank\": 66,\n" +
            "      \"price_usd\": \"0.142706\",\n" +
            "      \"percent_change_24h\": \"0.63\",\n" +
            "      \"percent_change_1h\": \"0.23\",\n" +
            "      \"percent_change_7d\": \"-20.94\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"48856159.81\",\n" +
            "      \"volume24\": 1299093.7722196754,\n" +
            "      \"volume24a\": 1519583.4896222812,\n" +
            "      \"csupply\": \"342356149.00\",\n" +
            "      \"tsupply\": \"342356149\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33085\",\n" +
            "      \"symbol\": \"QNT\",\n" +
            "      \"name\": \"Quant\",\n" +
            "      \"nameid\": \"quant\",\n" +
            "      \"rank\": 67,\n" +
            "      \"price_usd\": \"3.93\",\n" +
            "      \"percent_change_24h\": \"4.96\",\n" +
            "      \"percent_change_1h\": \"-1.45\",\n" +
            "      \"percent_change_7d\": \"56.90\",\n" +
            "      \"price_btc\": \"0.000619\",\n" +
            "      \"market_cap_usd\": \"47416819.54\",\n" +
            "      \"volume24\": 3379987.293453563,\n" +
            "      \"volume24a\": 3112174.7610197263,\n" +
            "      \"csupply\": \"12072738.00\",\n" +
            "      \"tsupply\": \"45467000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33391\",\n" +
            "      \"symbol\": \"BTT\",\n" +
            "      \"name\": \"BitTorrent\",\n" +
            "      \"nameid\": \"bittorrent\",\n" +
            "      \"rank\": 68,\n" +
            "      \"price_usd\": \"0.000220\",\n" +
            "      \"percent_change_24h\": \"-0.75\",\n" +
            "      \"percent_change_1h\": \"-0.15\",\n" +
            "      \"percent_change_7d\": \"0.21\",\n" +
            "      \"price_btc\": \"3.46E-8\",\n" +
            "      \"market_cap_usd\": \"46584426.63\",\n" +
            "      \"volume24\": 3824409.075201902,\n" +
            "      \"volume24a\": 4782168.159982651,\n" +
            "      \"csupply\": \"212116500000.00\",\n" +
            "      \"tsupply\": \"990000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"54\",\n" +
            "      \"symbol\": \"BTS\",\n" +
            "      \"name\": \"BitShares\",\n" +
            "      \"nameid\": \"bitshares\",\n" +
            "      \"rank\": 69,\n" +
            "      \"price_usd\": \"0.016033\",\n" +
            "      \"percent_change_24h\": \"-0.81\",\n" +
            "      \"percent_change_1h\": \"0.13\",\n" +
            "      \"percent_change_7d\": \"-4.89\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"43946250.50\",\n" +
            "      \"volume24\": 1980236.6604911603,\n" +
            "      \"volume24a\": 2868361.182487686,\n" +
            "      \"csupply\": \"2740910000.00\",\n" +
            "      \"tsupply\": \"2740910000\",\n" +
            "      \"msupply\": \"3600570502\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32686\",\n" +
            "      \"symbol\": \"HOT\",\n" +
            "      \"name\": \"Holo\",\n" +
            "      \"nameid\": \"holo\",\n" +
            "      \"rank\": 70,\n" +
            "      \"price_usd\": \"0.000315\",\n" +
            "      \"percent_change_24h\": \"-4.86\",\n" +
            "      \"percent_change_1h\": \"-3.44\",\n" +
            "      \"percent_change_7d\": \"-4.90\",\n" +
            "      \"price_btc\": \"4.97E-8\",\n" +
            "      \"market_cap_usd\": \"42005957.17\",\n" +
            "      \"volume24\": 3491741.6609783373,\n" +
            "      \"volume24a\": 3060321.4807474455,\n" +
            "      \"csupply\": \"133214575156.00\",\n" +
            "      \"tsupply\": \"177619433541\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33228\",\n" +
            "      \"symbol\": \"HC\",\n" +
            "      \"name\": \"HyperCash\",\n" +
            "      \"nameid\": \"hypercash\",\n" +
            "      \"rank\": 71,\n" +
            "      \"price_usd\": \"0.957735\",\n" +
            "      \"percent_change_24h\": \"-1.37\",\n" +
            "      \"percent_change_1h\": \"0.21\",\n" +
            "      \"percent_change_7d\": \"-6.48\",\n" +
            "      \"price_btc\": \"0.000151\",\n" +
            "      \"market_cap_usd\": \"41689981.06\",\n" +
            "      \"volume24\": 406890.40087793156,\n" +
            "      \"volume24a\": 669723.4770205528,\n" +
            "      \"csupply\": \"43529781.00\",\n" +
            "      \"tsupply\": \"43529781\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"139\",\n" +
            "      \"symbol\": \"KMD\",\n" +
            "      \"name\": \"Komodo\",\n" +
            "      \"nameid\": \"komodo\",\n" +
            "      \"rank\": 72,\n" +
            "      \"price_usd\": \"0.360043\",\n" +
            "      \"percent_change_24h\": \"0.56\",\n" +
            "      \"percent_change_1h\": \"0.86\",\n" +
            "      \"percent_change_7d\": \"-5.52\",\n" +
            "      \"price_btc\": \"0.000057\",\n" +
            "      \"market_cap_usd\": \"41636300.56\",\n" +
            "      \"volume24\": 1450372.059661089,\n" +
            "      \"volume24a\": 1502632.0545245071,\n" +
            "      \"csupply\": \"115642437.00\",\n" +
            "      \"tsupply\": \"115642437\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33535\",\n" +
            "      \"symbol\": \"VSYS\",\n" +
            "      \"name\": \"V Systems\",\n" +
            "      \"nameid\": \"v-systems\",\n" +
            "      \"rank\": 73,\n" +
            "      \"price_usd\": \"0.022588\",\n" +
            "      \"percent_change_24h\": \"2.38\",\n" +
            "      \"percent_change_1h\": \"0.76\",\n" +
            "      \"percent_change_7d\": \"-7.60\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"40406478.40\",\n" +
            "      \"volume24\": 3550545.911197387,\n" +
            "      \"volume24a\": 4137657.4382380843,\n" +
            "      \"csupply\": \"1788818695.00\",\n" +
            "      \"tsupply\": \"5217805440\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"186\",\n" +
            "      \"symbol\": \"ZEN\",\n" +
            "      \"name\": \"Horizen\",\n" +
            "      \"nameid\": \"zencash\",\n" +
            "      \"rank\": 74,\n" +
            "      \"price_usd\": \"5.57\",\n" +
            "      \"percent_change_24h\": \"-2.51\",\n" +
            "      \"percent_change_1h\": \"0.30\",\n" +
            "      \"percent_change_7d\": \"3.77\",\n" +
            "      \"price_btc\": \"0.000877\",\n" +
            "      \"market_cap_usd\": \"40008093.42\",\n" +
            "      \"volume24\": 1530162.105448336,\n" +
            "      \"volume24a\": 1572579.4669778997,\n" +
            "      \"csupply\": \"7185725.00\",\n" +
            "      \"tsupply\": \"7185725\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34406\",\n" +
            "      \"symbol\": \"ALGO\",\n" +
            "      \"name\": \"Algorand\",\n" +
            "      \"nameid\": \"algorand\",\n" +
            "      \"rank\": 75,\n" +
            "      \"price_usd\": \"0.153427\",\n" +
            "      \"percent_change_24h\": \"-0.13\",\n" +
            "      \"percent_change_1h\": \"0.35\",\n" +
            "      \"percent_change_7d\": \"-3.96\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"39777072.39\",\n" +
            "      \"volume24\": 42005077.37736064,\n" +
            "      \"volume24a\": 36091016.19860451,\n" +
            "      \"csupply\": \"259256762.00\",\n" +
            "      \"tsupply\": \"2588969743\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"102\",\n" +
            "      \"symbol\": \"XVG\",\n" +
            "      \"name\": \"Verge\",\n" +
            "      \"nameid\": \"verge\",\n" +
            "      \"rank\": 76,\n" +
            "      \"price_usd\": \"0.002427\",\n" +
            "      \"percent_change_24h\": \"-1.96\",\n" +
            "      \"percent_change_1h\": \"0.48\",\n" +
            "      \"percent_change_7d\": \"-1.55\",\n" +
            "      \"price_btc\": \"3.82E-7\",\n" +
            "      \"market_cap_usd\": \"38588515.17\",\n" +
            "      \"volume24\": 600357.1981100666,\n" +
            "      \"volume24a\": 1089187.0936692283,\n" +
            "      \"csupply\": \"15900663549.00\",\n" +
            "      \"tsupply\": \"15900663549\",\n" +
            "      \"msupply\": \"16555000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33529\",\n" +
            "      \"symbol\": \"ZB\",\n" +
            "      \"name\": \"ZB\",\n" +
            "      \"nameid\": \"zb\",\n" +
            "      \"rank\": 77,\n" +
            "      \"price_usd\": \"0.222538\",\n" +
            "      \"percent_change_24h\": \"0.29\",\n" +
            "      \"percent_change_1h\": \"-0.33\",\n" +
            "      \"percent_change_7d\": \"-5.67\",\n" +
            "      \"price_btc\": \"0.000035\",\n" +
            "      \"market_cap_usd\": \"36317952.85\",\n" +
            "      \"volume24\": 38086228.52880338,\n" +
            "      \"volume24a\": 14753966.600991264,\n" +
            "      \"csupply\": \"163198810.00\",\n" +
            "      \"tsupply\": \"2100000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32229\",\n" +
            "      \"symbol\": \"IOST\",\n" +
            "      \"name\": \"IOStoken\",\n" +
            "      \"nameid\": \"iostoken\",\n" +
            "      \"rank\": 78,\n" +
            "      \"price_usd\": \"0.002982\",\n" +
            "      \"percent_change_24h\": \"0.72\",\n" +
            "      \"percent_change_1h\": \"0.44\",\n" +
            "      \"percent_change_7d\": \"-9.01\",\n" +
            "      \"price_btc\": \"4.70E-7\",\n" +
            "      \"market_cap_usd\": \"35824007.64\",\n" +
            "      \"volume24\": 24552915.159155,\n" +
            "      \"volume24a\": 22327347.940957453,\n" +
            "      \"csupply\": \"12013965609.00\",\n" +
            "      \"tsupply\": \"21000000000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32764\",\n" +
            "      \"symbol\": \"SEELE\",\n" +
            "      \"name\": \"Seele\",\n" +
            "      \"nameid\": \"seele\",\n" +
            "      \"rank\": 79,\n" +
            "      \"price_usd\": \"0.049578\",\n" +
            "      \"percent_change_24h\": \"1.81\",\n" +
            "      \"percent_change_1h\": \"-0.17\",\n" +
            "      \"percent_change_7d\": \"-3.41\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"34346612.79\",\n" +
            "      \"volume24\": 11860740.524389392,\n" +
            "      \"volume24a\": 11384003.54987418,\n" +
            "      \"csupply\": \"692776387.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32334\",\n" +
            "      \"symbol\": \"ZIL\",\n" +
            "      \"name\": \"Zilliqa\",\n" +
            "      \"nameid\": \"zilliqa\",\n" +
            "      \"rank\": 80,\n" +
            "      \"price_usd\": \"0.003798\",\n" +
            "      \"percent_change_24h\": \"1.27\",\n" +
            "      \"percent_change_1h\": \"-0.35\",\n" +
            "      \"percent_change_7d\": \"-2.18\",\n" +
            "      \"price_btc\": \"5.98E-7\",\n" +
            "      \"market_cap_usd\": \"32997118.78\",\n" +
            "      \"volume24\": 5641879.388863812,\n" +
            "      \"volume24a\": 6537778.060064329,\n" +
            "      \"csupply\": \"8687360058.00\",\n" +
            "      \"tsupply\": \"12600000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"131\",\n" +
            "      \"symbol\": \"ARDR\",\n" +
            "      \"name\": \"Ardor\",\n" +
            "      \"nameid\": \"ardor\",\n" +
            "      \"rank\": 81,\n" +
            "      \"price_usd\": \"0.032478\",\n" +
            "      \"percent_change_24h\": \"-0.34\",\n" +
            "      \"percent_change_1h\": \"1.08\",\n" +
            "      \"percent_change_7d\": \"-2.87\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32445855.19\",\n" +
            "      \"volume24\": 522203.37052564736,\n" +
            "      \"volume24a\": 553952.7730414734,\n" +
            "      \"csupply\": \"998999495.00\",\n" +
            "      \"tsupply\": \"998999495\",\n" +
            "      \"msupply\": \"998999495\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"156\",\n" +
            "      \"symbol\": \"GNT\",\n" +
            "      \"name\": \"Golem\",\n" +
            "      \"nameid\": \"golem-network-tokens\",\n" +
            "      \"rank\": 82,\n" +
            "      \"price_usd\": \"0.033542\",\n" +
            "      \"percent_change_24h\": \"0.52\",\n" +
            "      \"percent_change_1h\": \"0.80\",\n" +
            "      \"percent_change_7d\": \"-3.35\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32349275.79\",\n" +
            "      \"volume24\": 2331459.419408021,\n" +
            "      \"volume24a\": 2357599.9279144737,\n" +
            "      \"csupply\": \"964450000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32226\",\n" +
            "      \"symbol\": \"ELF\",\n" +
            "      \"name\": \"aelf\",\n" +
            "      \"nameid\": \"aelf\",\n" +
            "      \"rank\": 83,\n" +
            "      \"price_usd\": \"0.058507\",\n" +
            "      \"percent_change_24h\": \"-4.64\",\n" +
            "      \"percent_change_1h\": \"-0.46\",\n" +
            "      \"percent_change_7d\": \"4.84\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"29240704.96\",\n" +
            "      \"volume24\": 28455291.837304905,\n" +
            "      \"volume24a\": 43763488.02857318,\n" +
            "      \"csupply\": \"499780000.00\",\n" +
            "      \"tsupply\": \"499780000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2732\",\n" +
            "      \"symbol\": \"GXS\",\n" +
            "      \"name\": \"GXChain\",\n" +
            "      \"nameid\": \"gxchain\",\n" +
            "      \"rank\": 84,\n" +
            "      \"price_usd\": \"0.445824\",\n" +
            "      \"percent_change_24h\": \"-4.24\",\n" +
            "      \"percent_change_1h\": \"-0.27\",\n" +
            "      \"percent_change_7d\": \"6.81\",\n" +
            "      \"price_btc\": \"0.000070\",\n" +
            "      \"market_cap_usd\": \"28978554.87\",\n" +
            "      \"volume24\": 1231967.8841868746,\n" +
            "      \"volume24a\": 487366.8519917526,\n" +
            "      \"csupply\": \"65000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2765\",\n" +
            "      \"symbol\": \"DATA\",\n" +
            "      \"name\": \"Streamr DATAcoin\",\n" +
            "      \"nameid\": \"streamr-datacoin\",\n" +
            "      \"rank\": 85,\n" +
            "      \"price_usd\": \"0.042661\",\n" +
            "      \"percent_change_24h\": \"-8.01\",\n" +
            "      \"percent_change_1h\": \"0.29\",\n" +
            "      \"percent_change_7d\": \"38.61\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"28888154.66\",\n" +
            "      \"volume24\": 2829520.9897156074,\n" +
            "      \"volume24a\": 4664716.226376771,\n" +
            "      \"csupply\": \"677154514.00\",\n" +
            "      \"tsupply\": \"987154514\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32238\",\n" +
            "      \"symbol\": \"WAX\",\n" +
            "      \"name\": \"WAX\",\n" +
            "      \"nameid\": \"wax\",\n" +
            "      \"rank\": 86,\n" +
            "      \"price_usd\": \"0.029263\",\n" +
            "      \"percent_change_24h\": \"-0.39\",\n" +
            "      \"percent_change_1h\": \"0.32\",\n" +
            "      \"percent_change_7d\": \"-6.44\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"27589808.76\",\n" +
            "      \"volume24\": 100938.09046427302,\n" +
            "      \"volume24a\": 98980.55211317338,\n" +
            "      \"csupply\": \"942821662.00\",\n" +
            "      \"tsupply\": \"1850000000\",\n" +
            "      \"msupply\": \"1850000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"258\",\n" +
            "      \"symbol\": \"MANA\",\n" +
            "      \"name\": \"Decentraland\",\n" +
            "      \"nameid\": \"decentraland\",\n" +
            "      \"rank\": 87,\n" +
            "      \"price_usd\": \"0.026012\",\n" +
            "      \"percent_change_24h\": \"4.95\",\n" +
            "      \"percent_change_1h\": \"0.73\",\n" +
            "      \"percent_change_7d\": \"-0.77\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"27316087.36\",\n" +
            "      \"volume24\": 19958037.262378596,\n" +
            "      \"volume24a\": 19528608.490757413,\n" +
            "      \"csupply\": \"1050141509.00\",\n" +
            "      \"tsupply\": \"2644403343\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32390\",\n" +
            "      \"symbol\": \"REN\",\n" +
            "      \"name\": \"Republic Protocol\",\n" +
            "      \"nameid\": \"republic-protocol\",\n" +
            "      \"rank\": 88,\n" +
            "      \"price_usd\": \"0.045608\",\n" +
            "      \"percent_change_24h\": \"2.30\",\n" +
            "      \"percent_change_1h\": \"-0.03\",\n" +
            "      \"percent_change_7d\": \"11.14\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"26829672.13\",\n" +
            "      \"volume24\": 1094422.787078234,\n" +
            "      \"volume24a\": 977941.9443577374,\n" +
            "      \"csupply\": \"588261205.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2731\",\n" +
            "      \"symbol\": \"AE\",\n" +
            "      \"name\": \"Aeternity\",\n" +
            "      \"nameid\": \"aeternity\",\n" +
            "      \"rank\": 89,\n" +
            "      \"price_usd\": \"0.094958\",\n" +
            "      \"percent_change_24h\": \"-2.27\",\n" +
            "      \"percent_change_1h\": \"0.48\",\n" +
            "      \"percent_change_7d\": \"-8.59\",\n" +
            "      \"price_btc\": \"0.000015\",\n" +
            "      \"market_cap_usd\": \"26619897.12\",\n" +
            "      \"volume24\": 7449373.115271245,\n" +
            "      \"volume24a\": 9198825.202604504,\n" +
            "      \"csupply\": \"280333087.00\",\n" +
            "      \"tsupply\": \"280333087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33548\",\n" +
            "      \"symbol\": \"NEX\",\n" +
            "      \"name\": \"Nash Exchange\",\n" +
            "      \"nameid\": \"nash-exchange\",\n" +
            "      \"rank\": 90,\n" +
            "      \"price_usd\": \"0.726197\",\n" +
            "      \"percent_change_24h\": \"-6.41\",\n" +
            "      \"percent_change_1h\": \"0.18\",\n" +
            "      \"percent_change_7d\": \"12.10\",\n" +
            "      \"price_btc\": \"0.000114\",\n" +
            "      \"market_cap_usd\": \"26285903.59\",\n" +
            "      \"volume24\": 2863184.4305600086,\n" +
            "      \"volume24a\": 3150859.0748043573,\n" +
            "      \"csupply\": \"36196678.00\",\n" +
            "      \"tsupply\": \"56296100\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"120\",\n" +
            "      \"symbol\": \"STRAT\",\n" +
            "      \"name\": \"Stratis\",\n" +
            "      \"nameid\": \"stratis\",\n" +
            "      \"rank\": 91,\n" +
            "      \"price_usd\": \"0.260935\",\n" +
            "      \"percent_change_24h\": \"9.00\",\n" +
            "      \"percent_change_1h\": \"-0.47\",\n" +
            "      \"percent_change_7d\": \"3.89\",\n" +
            "      \"price_btc\": \"0.000041\",\n" +
            "      \"market_cap_usd\": \"26022842.47\",\n" +
            "      \"volume24\": 1962118.8246871517,\n" +
            "      \"volume24a\": 312037.36028218473,\n" +
            "      \"csupply\": \"99729045.00\",\n" +
            "      \"tsupply\": \"99729045\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32342\",\n" +
            "      \"symbol\": \"NPXS\",\n" +
            "      \"name\": \"Pundi X\",\n" +
            "      \"nameid\": \"pundi-x\",\n" +
            "      \"rank\": 92,\n" +
            "      \"price_usd\": \"0.000110\",\n" +
            "      \"percent_change_24h\": \"-0.90\",\n" +
            "      \"percent_change_1h\": \"-0.15\",\n" +
            "      \"percent_change_7d\": \"-1.43\",\n" +
            "      \"price_btc\": \"1.73E-8\",\n" +
            "      \"market_cap_usd\": \"25776277.90\",\n" +
            "      \"volume24\": 595134.8868446073,\n" +
            "      \"volume24a\": 741326.2952822031,\n" +
            "      \"csupply\": \"235171468515.00\",\n" +
            "      \"tsupply\": \"280255193861\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"269\",\n" +
            "      \"symbol\": \"POWR\",\n" +
            "      \"name\": \"Power Ledger\",\n" +
            "      \"nameid\": \"power-ledger\",\n" +
            "      \"rank\": 93,\n" +
            "      \"price_usd\": \"0.061317\",\n" +
            "      \"percent_change_24h\": \"16.51\",\n" +
            "      \"percent_change_1h\": \"8.54\",\n" +
            "      \"percent_change_7d\": \"13.20\",\n" +
            "      \"price_btc\": \"0.000010\",\n" +
            "      \"market_cap_usd\": \"25568344.09\",\n" +
            "      \"volume24\": 2485518.7651978503,\n" +
            "      \"volume24a\": 957538.3168540436,\n" +
            "      \"csupply\": \"416986285.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32338\",\n" +
            "      \"symbol\": \"WICC\",\n" +
            "      \"name\": \"WaykiChain\",\n" +
            "      \"nameid\": \"waykichain\",\n" +
            "      \"rank\": 94,\n" +
            "      \"price_usd\": \"0.135072\",\n" +
            "      \"percent_change_24h\": \"-0.06\",\n" +
            "      \"percent_change_1h\": \"-0.63\",\n" +
            "      \"percent_change_7d\": \"-9.32\",\n" +
            "      \"price_btc\": \"0.000021\",\n" +
            "      \"market_cap_usd\": \"25528566.88\",\n" +
            "      \"volume24\": 567067.8148676453,\n" +
            "      \"volume24a\": 665763.8856113544,\n" +
            "      \"csupply\": \"189000000.00\",\n" +
            "      \"tsupply\": \"210000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"264\",\n" +
            "      \"symbol\": \"RCN\",\n" +
            "      \"name\": \"Ripio Credit Network\",\n" +
            "      \"nameid\": \"ripiocreditnetwork\",\n" +
            "      \"rank\": 95,\n" +
            "      \"price_usd\": \"0.051247\",\n" +
            "      \"percent_change_24h\": \"5.78\",\n" +
            "      \"percent_change_1h\": \"0.12\",\n" +
            "      \"percent_change_7d\": \"15.02\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"25281654.25\",\n" +
            "      \"volume24\": 364488.5834288044,\n" +
            "      \"volume24a\": 368233.26940366806,\n" +
            "      \"csupply\": \"493330791.00\",\n" +
            "      \"tsupply\": \"999942647\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"36419\",\n" +
            "      \"symbol\": \"CVCC\",\n" +
            "      \"name\": \"CryptoVerificationCoin\",\n" +
            "      \"nameid\": \"cryptoverificationcoin\",\n" +
            "      \"rank\": 96,\n" +
            "      \"price_usd\": \"21.60\",\n" +
            "      \"percent_change_24h\": \"-1.68\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"-5.11\",\n" +
            "      \"price_btc\": \"0.003402\",\n" +
            "      \"market_cap_usd\": \"24895661.23\",\n" +
            "      \"volume24\": 54919.02334851633,\n" +
            "      \"volume24a\": 24.582409725240836,\n" +
            "      \"csupply\": \"1152727.00\",\n" +
            "      \"tsupply\": \"1152727\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33764\",\n" +
            "      \"symbol\": \"RIF\",\n" +
            "      \"name\": \"RIF Token\",\n" +
            "      \"nameid\": \"rif-token\",\n" +
            "      \"rank\": 97,\n" +
            "      \"price_usd\": \"0.050804\",\n" +
            "      \"percent_change_24h\": \"1.82\",\n" +
            "      \"percent_change_1h\": \"0.99\",\n" +
            "      \"percent_change_7d\": \"5.64\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"24283337.28\",\n" +
            "      \"volume24\": 10129730.052173717,\n" +
            "      \"volume24a\": 10571488.177869465,\n" +
            "      \"csupply\": \"477980957.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33536\",\n" +
            "      \"symbol\": \"MATIC\",\n" +
            "      \"name\": \"Matic Network\",\n" +
            "      \"nameid\": \"matic-network\",\n" +
            "      \"rank\": 98,\n" +
            "      \"price_usd\": \"0.011108\",\n" +
            "      \"percent_change_24h\": \"2.50\",\n" +
            "      \"percent_change_1h\": \"0.37\",\n" +
            "      \"percent_change_7d\": \"-1.41\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"24161042.94\",\n" +
            "      \"volume24\": 11364532.366146563,\n" +
            "      \"volume24a\": 8025494.186163905,\n" +
            "      \"csupply\": \"2175190262.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"166\",\n" +
            "      \"symbol\": \"RLC\",\n" +
            "      \"name\": \"iExec RLC\",\n" +
            "      \"nameid\": \"rlc\",\n" +
            "      \"rank\": 99,\n" +
            "      \"price_usd\": \"0.296410\",\n" +
            "      \"percent_change_24h\": \"-1.49\",\n" +
            "      \"percent_change_1h\": \"0.01\",\n" +
            "      \"percent_change_7d\": \"0.52\",\n" +
            "      \"price_btc\": \"0.000047\",\n" +
            "      \"market_cap_usd\": \"23733777.81\",\n" +
            "      \"volume24\": 214715.21936554034,\n" +
            "      \"volume24a\": 401987.76950163004,\n" +
            "      \"csupply\": \"80070793.00\",\n" +
            "      \"tsupply\": \"86999785\",\n" +
            "      \"msupply\": \" 87000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2781\",\n" +
            "      \"symbol\": \"LRC\",\n" +
            "      \"name\": \"Loopring\",\n" +
            "      \"nameid\": \"loopring\",\n" +
            "      \"rank\": 100,\n" +
            "      \"price_usd\": \"0.026340\",\n" +
            "      \"percent_change_24h\": \"0.24\",\n" +
            "      \"percent_change_1h\": \"0.52\",\n" +
            "      \"percent_change_7d\": \"-4.78\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"23661683.84\",\n" +
            "      \"volume24\": 2179205.2258201563,\n" +
            "      \"volume24a\": 2178448.60189312,\n" +
            "      \"csupply\": \"898304697.00\",\n" +
            "      \"tsupply\": \"1374956262\",\n" +
            "      \"msupply\": \"1395076055\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"info\": {\n" +
            "    \"coins_num\": 3987,\n" +
            "    \"time\": 1585726697\n" +
            "  }\n" +
            "}";

}
