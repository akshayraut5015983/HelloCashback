package com.swaliya.hellowcashback.model.car;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarListMain {
    @SerializedName("vehicle")
    @Expose
    private String vehicle;
    @SerializedName("seatingCapacity")
    @Expose
    private Integer seatingCapacity;
    @SerializedName("sourceCity")
    @Expose
    private String sourceCity;
    @SerializedName("perKm")
    @Expose
    private String perKm;
    @SerializedName("extraHourRate")
    @Expose
    private Integer extraHourRate;
    @SerializedName("localBasicRate")
    @Expose
    private Integer localBasicRate;
    @SerializedName("nightCharges")
    @Expose
    private Integer nightCharges;
    @SerializedName("vpic")
    @Expose
    private String vpic;
    @SerializedName("VehicleCategory")
    @Expose
    private String vehicleCategory;
    @SerializedName("serviceTaxAmount")
    @Expose
    private Integer serviceTaxAmount;
    @SerializedName("totalAmount")
    @Expose
    private Integer totalAmount;
    @SerializedName("days")
    @Expose
    private String days;
    @SerializedName("ServiceTax")
    @Expose
    private String serviceTax;
    @SerializedName("hostUrl")
    @Expose
    private String hostUrl;
    @SerializedName("responseCode")
    @Expose
    private Integer responseCode;
    @SerializedName("advancepayment")
    @Expose
    private Integer advancepayment;
    @SerializedName("balanceamount")
    @Expose
    private Integer balanceamount;

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getPerKm() {
        return perKm;
    }

    public void setPerKm(String perKm) {
        this.perKm = perKm;
    }

    public Integer getExtraHourRate() {
        return extraHourRate;
    }

    public void setExtraHourRate(Integer extraHourRate) {
        this.extraHourRate = extraHourRate;
    }

    public Integer getLocalBasicRate() {
        return localBasicRate;
    }

    public void setLocalBasicRate(Integer localBasicRate) {
        this.localBasicRate = localBasicRate;
    }

    public Integer getNightCharges() {
        return nightCharges;
    }

    public void setNightCharges(Integer nightCharges) {
        this.nightCharges = nightCharges;
    }

    public String getVpic() {
        return vpic;
    }

    public void setVpic(String vpic) {
        this.vpic = vpic;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public Integer getServiceTaxAmount() {
        return serviceTaxAmount;
    }

    public void setServiceTaxAmount(Integer serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(String serviceTax) {
        this.serviceTax = serviceTax;
    }

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getAdvancepayment() {
        return advancepayment;
    }

    public void setAdvancepayment(Integer advancepayment) {
        this.advancepayment = advancepayment;
    }

    public Integer getBalanceamount() {
        return balanceamount;
    }

    public void setBalanceamount(Integer balanceamount) {
        this.balanceamount = balanceamount;
    }
}
