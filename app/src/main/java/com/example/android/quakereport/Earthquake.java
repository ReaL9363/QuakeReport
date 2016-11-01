package com.example.android.quakereport;

/**
 * Created by ReaL PC on 10/31/2016.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mUrl;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String mUrl) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = mUrl;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setmTimeInMilliseconds(long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
