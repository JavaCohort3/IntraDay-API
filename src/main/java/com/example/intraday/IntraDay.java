package com.example.intraday;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IntraDay {

    private MetaData metaData;

    private TimeSeries timeSeries;

    private IntraDay() { }

    @JsonProperty("Meta Data")
    public MetaData getMetaData() {
        return metaData;
    }
    @JsonProperty("Meta Data")
    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
  
    @JsonProperty("Time Series (1min)")
    public TimeSeries getTimeSeries() {
        return timeSeries;
    }
    @JsonProperty("Time Series (1min)")
    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }


    @Override
    public String toString() {
        return "com.example.intraday.IntraDay{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }


}
