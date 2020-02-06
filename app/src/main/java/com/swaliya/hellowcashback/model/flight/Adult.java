package com.swaliya.hellowcashback.model.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Adult {

    @SerializedName("FareBasis")
    @Expose
    private String fareBasis;
    @SerializedName("FareType")
    @Expose
    private String fareType;
    @SerializedName("BasicAmount")
    @Expose
    private Integer basicAmount;
    @SerializedName("YQ")
    @Expose
    private Integer yQ;
    @SerializedName("TaxDetails")
    @Expose
    private Object taxDetails;
    @SerializedName("TotalTaxAmount")
    @Expose
    private Integer totalTaxAmount;
    @SerializedName("GrossAmount")
    @Expose
    private Integer grossAmount;
    @SerializedName("Commission")
    @Expose
    private String commission;

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public Integer getBasicAmount() {
        return basicAmount;
    }

    public void setBasicAmount(Integer basicAmount) {
        this.basicAmount = basicAmount;
    }

    public Integer getYQ() {
        return yQ;
    }

    public void setYQ(Integer yQ) {
        this.yQ = yQ;
    }

    public Object getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(Object taxDetails) {
        this.taxDetails = taxDetails;
    }

    public Integer getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(Integer totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public Integer getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Integer grossAmount) {
        this.grossAmount = grossAmount;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

}