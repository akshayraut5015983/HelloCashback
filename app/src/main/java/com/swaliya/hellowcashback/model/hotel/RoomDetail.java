package com.swaliya.hellowcashback.model.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomDetail {

    @SerializedName("RoomIndex")
    @Expose
    private Object roomIndex;
    @SerializedName("RateType")
    @Expose
    private Object rateType;
    @SerializedName("HotelPackage")
    @Expose
    private Object hotelPackage;
    @SerializedName("RoomType")
    @Expose
    private Object roomType;
    @SerializedName("RoomBasis")
    @Expose
    private String roomBasis;
    @SerializedName("RoomTypeCode")
    @Expose
    private Object roomTypeCode;
    @SerializedName("RatePlanCode")
    @Expose
    private String ratePlanCode;
    @SerializedName("Validdays")
    @Expose
    private Object validdays;
    @SerializedName("WsKey")
    @Expose
    private Object wsKey;
    @SerializedName("ExtGuestTotal")
    @Expose
    private Integer extGuestTotal;
    @SerializedName("RoomTotal")
    @Expose
    private Double roomTotal;
    @SerializedName("RoomNetTotal")
    @Expose
    private Double roomNetTotal;
    @SerializedName("PartnerFareDatails")
    @Expose
    private PartnerFareDatails partnerFareDatails;
    @SerializedName("ServicetaxTotal")
    @Expose
    private Integer servicetaxTotal;
    @SerializedName("Discount")
    @Expose
    private Integer discount;
    @SerializedName("Commission")
    @Expose
    private Integer commission;
    @SerializedName("expediaPropertyId")
    @Expose
    private Object expediaPropertyId;
    @SerializedName("RoomCancellationPolicy")
    @Expose
    private Object roomCancellationPolicy;
    @SerializedName("NoOfPax")
    @Expose
    private Integer noOfPax;
    @SerializedName("RefundRule")
    @Expose
    private Object refundRule;
    @SerializedName("Inclusions")
    @Expose
    private Object inclusions;
    @SerializedName("Exclusions")
    @Expose
    private Object exclusions;
    @SerializedName("RoomCount")
    @Expose
    private Integer roomCount;
    @SerializedName("MaxAdultOccupancy")
    @Expose
    private Integer maxAdultOccupancy;
    @SerializedName("MaxChildOccupancy")
    @Expose
    private Integer maxChildOccupancy;
    @SerializedName("BedType")
    @Expose
    private Object bedType;
    @SerializedName("RoomView")
    @Expose
    private Object roomView;
    @SerializedName("RoomDescription")
    @Expose
    private Object roomDescription;
    @SerializedName("RoomAmenities")
    @Expose
    private Object roomAmenities;
    @SerializedName("IncExcCondition")
    @Expose
    private Object incExcCondition;
    @SerializedName("IsInclusion")
    @Expose
    private Boolean isInclusion;
    @SerializedName("Images")
    @Expose
    private Object images;

    public Object getRoomIndex() {
        return roomIndex;
    }

    public void setRoomIndex(Object roomIndex) {
        this.roomIndex = roomIndex;
    }

    public Object getRateType() {
        return rateType;
    }

    public void setRateType(Object rateType) {
        this.rateType = rateType;
    }

    public Object getHotelPackage() {
        return hotelPackage;
    }

    public void setHotelPackage(Object hotelPackage) {
        this.hotelPackage = hotelPackage;
    }

    public Object getRoomType() {
        return roomType;
    }

    public void setRoomType(Object roomType) {
        this.roomType = roomType;
    }

    public String getRoomBasis() {
        return roomBasis;
    }

    public void setRoomBasis(String roomBasis) {
        this.roomBasis = roomBasis;
    }

    public Object getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(Object roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    public Object getValiddays() {
        return validdays;
    }

    public void setValiddays(Object validdays) {
        this.validdays = validdays;
    }

    public Object getWsKey() {
        return wsKey;
    }

    public void setWsKey(Object wsKey) {
        this.wsKey = wsKey;
    }

    public Integer getExtGuestTotal() {
        return extGuestTotal;
    }

    public void setExtGuestTotal(Integer extGuestTotal) {
        this.extGuestTotal = extGuestTotal;
    }

    public Double getRoomTotal() {
        return roomTotal;
    }

    public void setRoomTotal(Double roomTotal) {
        this.roomTotal = roomTotal;
    }

    public Double getRoomNetTotal() {
        return roomNetTotal;
    }

    public void setRoomNetTotal(Double roomNetTotal) {
        this.roomNetTotal = roomNetTotal;
    }

    public PartnerFareDatails getPartnerFareDatails() {
        return partnerFareDatails;
    }

    public void setPartnerFareDatails(PartnerFareDatails partnerFareDatails) {
        this.partnerFareDatails = partnerFareDatails;
    }

    public Integer getServicetaxTotal() {
        return servicetaxTotal;
    }

    public void setServicetaxTotal(Integer servicetaxTotal) {
        this.servicetaxTotal = servicetaxTotal;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Object getExpediaPropertyId() {
        return expediaPropertyId;
    }

    public void setExpediaPropertyId(Object expediaPropertyId) {
        this.expediaPropertyId = expediaPropertyId;
    }

    public Object getRoomCancellationPolicy() {
        return roomCancellationPolicy;
    }

    public void setRoomCancellationPolicy(Object roomCancellationPolicy) {
        this.roomCancellationPolicy = roomCancellationPolicy;
    }

    public Integer getNoOfPax() {
        return noOfPax;
    }

    public void setNoOfPax(Integer noOfPax) {
        this.noOfPax = noOfPax;
    }

    public Object getRefundRule() {
        return refundRule;
    }

    public void setRefundRule(Object refundRule) {
        this.refundRule = refundRule;
    }

    public Object getInclusions() {
        return inclusions;
    }

    public void setInclusions(Object inclusions) {
        this.inclusions = inclusions;
    }

    public Object getExclusions() {
        return exclusions;
    }

    public void setExclusions(Object exclusions) {
        this.exclusions = exclusions;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getMaxAdultOccupancy() {
        return maxAdultOccupancy;
    }

    public void setMaxAdultOccupancy(Integer maxAdultOccupancy) {
        this.maxAdultOccupancy = maxAdultOccupancy;
    }

    public Integer getMaxChildOccupancy() {
        return maxChildOccupancy;
    }

    public void setMaxChildOccupancy(Integer maxChildOccupancy) {
        this.maxChildOccupancy = maxChildOccupancy;
    }

    public Object getBedType() {
        return bedType;
    }

    public void setBedType(Object bedType) {
        this.bedType = bedType;
    }

    public Object getRoomView() {
        return roomView;
    }

    public void setRoomView(Object roomView) {
        this.roomView = roomView;
    }

    public Object getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(Object roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Object getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities(Object roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    public Object getIncExcCondition() {
        return incExcCondition;
    }

    public void setIncExcCondition(Object incExcCondition) {
        this.incExcCondition = incExcCondition;
    }

    public Boolean getIsInclusion() {
        return isInclusion;
    }

    public void setIsInclusion(Boolean isInclusion) {
        this.isInclusion = isInclusion;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

}
