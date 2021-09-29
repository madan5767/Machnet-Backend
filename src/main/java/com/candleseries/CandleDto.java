package com.candleseries;
import java.time.LocalDateTime;

public class CandleDto {
    private LocalDateTime time; //timestamp in millisecond
    private double low; // min price
    private double high; // max price
    private double open; // first price
    private double close; //last price
    private double volume; //total txn amount

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Candle { " +
                "time= " + time +
                ", low= " + low +
                ", high= " + high +
                ", open= " + open +
                ", close= " + close +
                ", Volume= " + volume +
                '}';
    }
}
