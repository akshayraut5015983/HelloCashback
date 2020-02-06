package com.swaliya.hellowcashback.model.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusCityList {

    @SerializedName("stationName")
    @Expose
    private String stationName;
    @SerializedName("stationId")
    @Expose
    private Integer stationId;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

}

