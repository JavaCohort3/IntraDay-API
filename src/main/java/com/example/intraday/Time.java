package com.example.intraday;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Time {
    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;

    public Time() {
    }

    @JsonGetter("1. open")
    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    @JsonGetter("2. high")
    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @JsonGetter("3. high")
    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    @JsonGetter("4. close")
    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    @JsonGetter("5. volume")
    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }
}
