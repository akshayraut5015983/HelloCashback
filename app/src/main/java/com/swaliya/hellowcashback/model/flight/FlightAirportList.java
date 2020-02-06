package com.swaliya.hellowcashback.model.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightAirportList {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("fcity")
    @Expose
    private String fcity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFcity() {
        return fcity;
    }

    public void setFcity(String fcity) {
        this.fcity = fcity;
    }

}