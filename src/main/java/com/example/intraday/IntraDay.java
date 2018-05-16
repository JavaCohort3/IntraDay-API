package com.example.intraday;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TreeMap;

public class IntraDay {
    private MetaData metaData;
    private Map<Integer, Time> timeSeries = new TreeMap<>();

<<<<<<< HEAD



    private IntraDay() { }
=======
    private IntraDay() {}
>>>>>>> 27605743eb6cbc48a46e88f88a4d8ac242c2ca50

    @JsonProperty("Meta Data")
    public MetaData getMetaData() {
        return metaData;
    }

    @JsonProperty("Meta Data")
    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @JsonProperty("Time Series (1min)")
    public Map<Integer, Time> getTimeSeries() {
        return timeSeries;
    }

    @JsonProperty("Time Series (1min)")
    public void setTimeSeries(Map<Integer, Time> timeSeries) {
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
