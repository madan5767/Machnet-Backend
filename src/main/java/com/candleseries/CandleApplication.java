package com.candleseries;

import java.time.LocalDateTime;
import java.util.List;

public class CandleApplication {

    public static void main(String[] args) {
        
        //Creating an instance of a candleService.
        CandleService candleService = new CandleService();
        
        //Creating a candles list using a candleService
        List<CandleDto> candles = candleService.getCandles("NPR", LocalDateTime.now().minusHours(5), LocalDateTime.now(), 3600);

        System.out.println("--- DONE PRINTING ---");
    }
}
