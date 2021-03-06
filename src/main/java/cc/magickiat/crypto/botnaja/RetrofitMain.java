package cc.magickiat.crypto.botnaja;

import cc.magickiat.crypto.botnaja.dto.Balance;
import cc.magickiat.crypto.botnaja.dto.Ticker;
import cc.magickiat.crypto.botnaja.service.BitKubService;

import java.util.Map;

public class RetrofitMain {

    public static void main(String[] args) throws Exception {
        BitKubService service = new BitKubService();

        Long serverTime = service.getServerTime();
        System.out.println("===== Server Time =====");
        System.out.println(serverTime);

        Map<String, Balance> balances = service.getBalances();
        System.out.println("===== My Balances =====");
        System.out.println(balances);

        Map<String, Ticker> tickerMap = service.getTickers();
        System.out.println("===== Tickers =====");
        System.out.println(tickerMap);

        tickerMap = service.getTicker("THB_BTC");
        System.out.println("===== Ticker for THB_BTC =====");
        System.out.println(tickerMap);
    }


}
