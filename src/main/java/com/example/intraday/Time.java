package com.example.intraday;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {
    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;

    public Time() {
    }

    @JsonProperty("1. open")
    public double getOpen() {
        return open;
    }

    @JsonProperty("1. open")
    public void setOpen(double open) {
        this.open = open;
    }

    @JsonProperty("2. high")
    public double getHigh() {
        return high;
    }

    @JsonProperty("2. open")
    public void setHigh(double high) {
        this.high = high;
    }

    @JsonProperty("3. low")
    public double getLow() {
        return low;
    }

    @JsonProperty("3. low")
    public void setLow(double low) {
        this.low = low;
    }

    @JsonProperty("4. close")
    public double getClose() {
        return close;
    }

    @JsonProperty("4. close")
    public void setClose(double close) {
        this.close = close;
    }

    @JsonProperty("5. volume")
    public long getVolume() {
        return volume;
    }

    @JsonProperty("5. volume")
    public void setVolume(long volume) {
        this.volume = volume;
    }
}
