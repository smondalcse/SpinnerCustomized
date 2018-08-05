package com.ntrackmoto.nitolniloy.spinnercustomized;

/**
 * Created by 20170546 on 8/5/2018.
 */

public class CountryItem {

    private String mCountryName;
    private int mFlagImage;

    public CountryItem(String countryName, int flagImage) {
        mCountryName = countryName;
        mFlagImage = flagImage;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public int getFlagImage() {
        return mFlagImage;
    }

}
