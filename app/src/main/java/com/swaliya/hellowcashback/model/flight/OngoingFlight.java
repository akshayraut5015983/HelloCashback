package com.swaliya.hellowcashback.model.flight;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OngoingFlight {

    @SerializedName("AvailSegments")
    @Expose
    private List<AvailSegment> availSegments = null;

    public List<AvailSegment> getAvailSegments() {
        return availSegments;
    }

    public void setAvailSegments(List<AvailSegment> availSegments) {
        this.availSegments = availSegments;
    }

}