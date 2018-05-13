package com.example.intraday;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {

    private String information;
    private String symbol;
    private String lastRefreshed;
    private String interval;
    private String outputSize;
    private String timeZone;

    public MetaData() {
    }
    @JsonProperty("1. Information")
    public String getInformation() {
        return information;
    }
    @JsonProperty("1. Information")
    public void setInformation(String information) {
        this.information = information;
    }
    @JsonProperty("2. Symbol")
    public String getSymbol() {
        return symbol;
    }
    @JsonProperty("2. Symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    @JsonProperty("3. Last Refreshed")
    public String getLastRefreshed() {
        return lastRefreshed;
    }
    @JsonProperty("3. Last Refreshed")
    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }
    @JsonProperty("4. Interval")
    public String getInterval() {
        return interval;
    }
    @JsonProperty("4. Interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }
    @JsonProperty("5. Output Size")
    public String getOutputSize() {
        return outputSize;
    }
    @JsonProperty("5. Output Size")
    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }
    @JsonProperty("6. Time Zone")
    public String getTimeZone() {
        return timeZone;
    }
    @JsonProperty("6. Time Zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "com.example.intraday.MetaData{" +
                "information='" + information + '\'' +
                ", symbol='" + symbol + '\'' +
                ", lastRefreshed='" + lastRefreshed + '\'' +
                ", interval='" + interval + '\'' +
                ", outputSize='" + outputSize + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }
}
