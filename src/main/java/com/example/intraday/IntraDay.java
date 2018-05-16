package com.example.intraday;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.TreeMap;

public class IntraDay {
    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonProperty("Time Series (1min)")
    private Map<String, Time> timeSeries = new TreeMap<>();

    private IntraDay() {}

    public MetaData getMetaData() {
        return metaData;
    }
    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Map<String, Time> getTimeSeries() {
        return timeSeries;
    }
    public void setTimeSeries(Map<String, Time> timeSeries) {
        this.timeSeries = timeSeries;
    }

    @Override
    public String toString() {
        return "IntraDay{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }

}
