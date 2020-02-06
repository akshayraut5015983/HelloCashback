package com.swaliya.hellowcashback.model.mobile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaidPlans {

    @SerializedName("provider_id")
    @Expose
    private String providerId;
    @SerializedName("provider_name")
    @Expose
    private String providerName;
    @SerializedName("state_code")
    @Expose
    private String stateCode;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("state_short")
    @Expose
    private String stateShort;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateShort() {
        return stateShort;
    }

    public void setStateShort(String stateShort) {
        this.stateShort = stateShort;
    }

}
