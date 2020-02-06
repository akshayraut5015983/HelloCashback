package com.swaliya.hellowcashback.model.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailabilityOutput {

    @SerializedName("AvailableFlights")
    @Expose
    private AvailableFlights availableFlights;

    public AvailableFlights getAvailableFlights() {
        return availableFlights;
    }

    public void setAvailableFlights(AvailableFlights availableFlights) {
        this.availableFlights = availableFlights;
    }

}