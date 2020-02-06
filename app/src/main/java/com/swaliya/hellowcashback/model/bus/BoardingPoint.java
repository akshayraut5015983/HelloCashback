package com.swaliya.hellowcashback.model.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoardingPoint {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("id")
    @Expose
    private String id;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
