package com.example.intraday;


import java.util.Map;

public class TimeSeries {

    private Map<String, Time> time;


    public TimeSeries() {
    }

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