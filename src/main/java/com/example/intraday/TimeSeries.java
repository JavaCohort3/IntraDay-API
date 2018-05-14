package com.example.intraday;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Map;

@JsonRootName("Time Series (1min)")
public class TimeSeries<Time> {

    private Map<String, Time> time;



    public TimeSeries(){}

    public Map<String, Time> getTime() {
        return time;
    }


    public void setTime(Map<String, Time> time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TimeSeries{" +
            "time=" + time +
            '}';
    }
}
