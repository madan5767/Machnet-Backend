package com.candleseries;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CandleService {
    //defining CandleSeriesData type list
    public static List<CandleSeriesData> data = new ArrayList<>();
    public static double closingPriceOfPreviousCandle;

    public CandleService() {
        Random random = new Random();
        // INSERTING 500 Dummy data
        for (int count = 0; count < 500; count++) {
            data.add(new CandleSeriesData(LocalDateTime.now().minusMinutes(15 * count), generateRandomSymbol(),
                    random.nextFloat() * 100));
        }
    }

    private String generateRandomSymbol() {
        String[] symbols = {"USD", "KES", "NPR"};
        Random random = new Random();
        int symbol = random.nextInt(symbols.length);
        return symbols[symbol];
    }

    public List<CandleDto> getCandles(String symbol, LocalDateTime startDate, LocalDateTime endDate, int granularity) {

        //data.forEach(System.out::println); //printing the generated DataList.

        //Creating a candleDtos ArrayList of type candleDto
        List<CandleDto> candleDtos = new ArrayList<>();
        LocalDateTime initialTime = startDate;   //setting initial time t1
        LocalDateTime updatedTime = startDate.plusSeconds(granularity); //setting increment time t2 after adding granularity
        while (updatedTime.isBefore(endDate) || updatedTime.equals(endDate)) {
            System.out.println();
            System.out.println(" ---- FROM " + initialTime + " " + updatedTime + " ---- ");
            List<CandleSeriesData> dataWithInCertainFrequency = new ArrayList<>();
            for (CandleSeriesData candleData : data) {
                if (candleData.getTime().isAfter(initialTime)
                        && (candleData.getTime().isBefore(updatedTime) || candleData.getTime().isEqual(updatedTime))
                        && symbol.equalsIgnoreCase(candleData.getSymbol())) {
                    dataWithInCertainFrequency.add(candleData);
                }
            }

            if (dataWithInCertainFrequency.size() != 0) {
                CandleDto candleDto = prepareCandleDtoFromDataOfThatFrequency(dataWithInCertainFrequency);
                candleDtos.add(candleDto);

            }
            initialTime = initialTime.plusSeconds(granularity);
            updatedTime = updatedTime.plusSeconds(granularity);
        }
        return candleDtos;
    }

    private CandleDto prepareCandleDtoFromDataOfThatFrequency(List<CandleSeriesData> dataWithInCertainFrequency) {
        CandleDto candleDto = new CandleDto();

        dataWithInCertainFrequency.forEach(System.out::println);


        dataWithInCertainFrequency.sort(Comparator.comparing(CandleSeriesData::getTime));

        candleDto.setOpen(closingPriceOfPreviousCandle == 0 ? dataWithInCertainFrequency.get(0).getPrice() : closingPriceOfPreviousCandle); //setting opening price
        candleDto.setClose(dataWithInCertainFrequency.get(dataWithInCertainFrequency.size() - 1).getPrice()); //setting closing price

        candleDto.setTime(dataWithInCertainFrequency.get(0).getTime());

        dataWithInCertainFrequency.sort(Comparator.comparing(CandleSeriesData::getPrice));
        candleDto.setLow(dataWithInCertainFrequency.get(0).getPrice()); //setting low price
        candleDto.setHigh(dataWithInCertainFrequency.get(dataWithInCertainFrequency.size() - 1).getPrice()); //setting high price

        double volume = 0;
        for (CandleSeriesData candleSeriesData : dataWithInCertainFrequency) {
            volume = volume + candleSeriesData.getPrice();
        }
        candleDto.setVolume(volume); // setting transaction volume
        closingPriceOfPreviousCandle = candleDto.getClose();
        System.out.println(candleDto);
        return candleDto;
    }

}
