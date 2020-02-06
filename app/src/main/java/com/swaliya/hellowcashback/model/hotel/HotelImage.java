package com.swaliya.hellowcashback.model.hotel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelImage {

    @SerializedName("Imagedesc")
    @Expose
    private String imagedesc;
    @SerializedName("Imagepath")
    @Expose
    private String imagepath;

    public String getImagedesc() {
        return imagedesc;
    }

    public void setImagedesc(String imagedesc) {
        this.imagedesc = imagedesc;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

}
