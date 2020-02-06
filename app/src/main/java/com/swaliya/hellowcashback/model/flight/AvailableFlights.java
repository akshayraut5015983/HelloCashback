package com.swaliya.hellowcashback.model.flight;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailableFlights {

    @SerializedName("OngoingFlights")
    @Expose
    private List<OngoingFlight> ongoingFlights = null;

    public List<OngoingFlight> getOngoingFlights() {
        return ongoingFlights;
    }

    public void setOngoingFlights(List<OngoingFlight> ongoingFlights) {
        this.ongoingFlights = ongoingFlights;
    }

}