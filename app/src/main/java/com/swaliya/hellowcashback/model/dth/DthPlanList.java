package com.swaliya.hellowcashback.model.dth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DthPlanList {

    @SerializedName("Detail")
    @Expose
    private String detail;
    @SerializedName("Amount")
    @Expose
    private String amount;
    @SerializedName("Validity")
    @Expose
    private String validity;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
