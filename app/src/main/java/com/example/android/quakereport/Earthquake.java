package com.example.android.quakereport;

/**
 * Created by ReaL PC on 10/31/2016.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(double mMagnitude, String mLocation, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(int mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
