package com.swaliya.hellowcashback.model.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BusBookingMain {
    @SerializedName("apiAvailableBuses")
    @Expose
    private List<ApiAvailableBus> apiAvailableBuses = null;

    public List<ApiAvailableBus> getApiAvailableBuses() {
        return apiAvailableBuses;
    }

    public void setApiAvailableBuses(List<ApiAvailableBus> apiAvailableBuses) {
        this.apiAvailableBuses = apiAvailableBuses;
    }
}
