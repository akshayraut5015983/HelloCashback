package com.swaliya.hellowcashback.model.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PartnerFareDatails {

    @SerializedName("NetFares")
    @Expose
    private String netFares;
    @SerializedName("Commission")
    @Expose
    private String commission;
    @SerializedName("CommissionType")
    @Expose
    private Integer commissionType;

    public String getNetFares() {
        return netFares;
    }

    public void setNetFares(String netFares) {
        this.netFares = netFares;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public Integer getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Integer commissionType) {
        this.commissionType = commissionType;
    }

}