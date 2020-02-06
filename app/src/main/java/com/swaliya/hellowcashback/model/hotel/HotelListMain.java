package com.swaliya.hellowcashback.model.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HotelListMain {
    @SerializedName("AvailableHotels")
    @Expose
    private List<AvailableHotel> availableHotels = null;
    @SerializedName("ProvidersCount")
    @Expose
    private Integer providersCount;
    @SerializedName("ResponseStatus")
    @Expose
    private Integer responseStatus;
    @SerializedName("Message")
    @Expose
    private Object message;

    public List<AvailableHotel> getAvailableHotels() {
        return availableHotels;
    }

    public void setAvailableHotels(List<AvailableHotel> availableHotels) {
        this.availableHotels = availableHotels;
    }

    public Integer getProvidersCount() {
        return providersCount;
    }

    public void setProvidersCount(Integer providersCount) {
        this.providersCount = providersCount;
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
