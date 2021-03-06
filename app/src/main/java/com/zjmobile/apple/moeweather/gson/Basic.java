package com.zjmobile.apple.moeweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by apple on 17/5/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
