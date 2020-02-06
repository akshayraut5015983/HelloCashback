package com.swaliya.hellowcashback.model.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelCityList {


    @SerializedName("hcity")
    @Expose
    private String hcity;
    @SerializedName("id")
    @Expose
    private String id;

    public String getHcity() {
        return hcity;
    }

    public void setHcity(String hcity) {
        this.hcity = hcity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
