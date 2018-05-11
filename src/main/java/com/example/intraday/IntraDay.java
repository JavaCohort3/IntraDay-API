package com.example.intraday;

public class IntraDay {

    private MetaData metaData;

    private TimeSeries timeSeries;

    private IntraDay() { }


    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

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
