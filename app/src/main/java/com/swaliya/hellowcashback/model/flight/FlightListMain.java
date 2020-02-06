package com.swaliya.hellowcashback.model.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightListMain {

    @SerializedName("ResponseStatus")
    @Expose
    private Integer responseStatus;
    @SerializedName("UserTrackId")
    @Expose
    private String userTrackId;
    @SerializedName("AvailabilityOutput")
    @Expose
    private AvailabilityOutput availabilityOutput;

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getUserTrackId() {
        return userTrackId;
    }

    public void setUserTrackId(String userTrackId) {
        this.userTrackId = userTrackId;
    }

    public AvailabilityOutput getAvailabilityOutput() {
        return availabilityOutput;
    }

    public void setAvailabilityOutput(AvailabilityOutput availabilityOutput) {
        this.availabilityOutput = availabilityOutput;
    }

}

