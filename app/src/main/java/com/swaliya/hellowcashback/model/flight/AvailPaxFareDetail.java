package com.swaliya.hellowcashback.model.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailPaxFareDetail {

    @SerializedName("ClassCode")
    @Expose
    private String classCode;
    @SerializedName("ClassCodeDesc")
    @Expose
    private String classCodeDesc;
    @SerializedName("BaggageAllowed")
    @Expose
    private Object baggageAllowed;
    @SerializedName("Adult")
    @Expose
    private Adult adult;
    @SerializedName("Child")
    @Expose
    private Object child;
    @SerializedName("Infant")
    @Expose
    private Object infant;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassCodeDesc() {
        return classCodeDesc;
    }

    public void setClassCodeDesc(String classCodeDesc) {
        this.classCodeDesc = classCodeDesc;
    }

    public Object getBaggageAllowed() {
        return baggageAllowed;
    }

    public void setBaggageAllowed(Object baggageAllowed) {
        this.baggageAllowed = baggageAllowed;
    }

    public Adult getAdult() {
        return adult;
    }

    public void setAdult(Adult adult) {
        this.adult = adult;
    }

    public Object getChild() {
        return child;
    }

    public void setChild(Object child) {
        this.child = child;
    }

    public Object getInfant() {
        return infant;
    }

    public void setInfant(Object infant) {
        this.infant = infant;
    }

}