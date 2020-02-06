package com.swaliya.hellowcashback.model.mobile;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlanDetails {

    @SerializedName("operator_code")
    @Expose
    private String operatorCode;
    @SerializedName("circle_code")
    @Expose
    private String circleCode;

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getCircleCode() {
        return circleCode;
    }

    public void setCircleCode(String circleCode) {
        this.circleCode = circleCode;
    }

}