package com.swaliya.hellowcashback.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestPojo {
    @SerializedName("BanerId")
    @Expose
    private String banerId;
    @SerializedName("BanerTitle")
    @Expose
    private String banerTitle;
    @SerializedName("BanerImage")
    @Expose
    private String banerImage;

    public String getBanerId() {
        return banerId;
    }

    public void setBanerId(String banerId) {
        this.banerId = banerId;
    }

    public String getBanerTitle() {
        return banerTitle;
    }

    public void setBanerTitle(String banerTitle) {
        this.banerTitle = banerTitle;
    }

    public String getBanerImage() {
        return banerImage;
    }

    public void setBanerImage(String banerImage) {
        this.banerImage = banerImage;
    }

}
