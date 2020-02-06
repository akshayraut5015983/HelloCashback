package com.swaliya.hellowcashback.model.mobile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MobileOperatorMain {
    @SerializedName("recharge_details")
    @Expose
    private RechargeDetails rechargeDetails;
    @SerializedName("plan_details")
    @Expose
    private PlanDetails planDetails;
    @SerializedName("paid_plans")
    @Expose
    private PaidPlans paidPlans;

    public RechargeDetails getRechargeDetails() {
        return rechargeDetails;
    }

    public void setRechargeDetails(RechargeDetails rechargeDetails) {
        this.rechargeDetails = rechargeDetails;
    }

    public PlanDetails getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(PlanDetails planDetails) {
        this.planDetails = planDetails;
    }

    public PaidPlans getPaidPlans() {
        return paidPlans;
    }

    public void setPaidPlans(PaidPlans paidPlans) {
        this.paidPlans = paidPlans;
    }

}
