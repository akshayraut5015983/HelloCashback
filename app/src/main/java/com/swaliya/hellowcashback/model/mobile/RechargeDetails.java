package com.swaliya.hellowcashback.model.mobile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RechargeDetails {

    @SerializedName("provider_name")
    @Expose
    private String providerName;
    @SerializedName("provider_code")
    @Expose
    private String providerCode;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

}