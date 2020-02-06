package com.swaliya.hellowcashback.model.electricity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ElectricityMain {

    @SerializedName("payid")
    @Expose
    private Integer payid;
    @SerializedName("operator_ref")
    @Expose
    private String operatorRef;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("txstatus_desc")
    @Expose
    private String txstatusDesc;
    @SerializedName("message")
    @Expose
    private String message;

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public String getOperatorRef() {
        return operatorRef;
    }

    public void setOperatorRef(String operatorRef) {
        this.operatorRef = operatorRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTxstatusDesc() {
        return txstatusDesc;
    }

    public void setTxstatusDesc(String txstatusDesc) {
        this.txstatusDesc = txstatusDesc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
