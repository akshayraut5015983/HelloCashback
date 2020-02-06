package com.swaliya.hellowcashback.model.bus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiAvailableBus {

    @SerializedName("droppingPoints")
    @Expose
    private Object droppingPoints;
    @SerializedName("availableSeats")
    @Expose
    private Integer availableSeats;
    @SerializedName("partialCancellationAllowed")
    @Expose
    private Boolean partialCancellationAllowed;
    @SerializedName("arrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("cancellationPolicy")
    @Expose
    private String cancellationPolicy;
    @SerializedName("boardingPoints")
    @Expose
    private List<BoardingPoint> boardingPoints = null;
    @SerializedName("operatorName")
    @Expose
    private String operatorName;
    @SerializedName("departureTime")
    @Expose
    private String departureTime;
    @SerializedName("mTicketAllowed")
    @Expose
    private Boolean mTicketAllowed;
    @SerializedName("idProofRequired")
    @Expose
    private Boolean idProofRequired;
    @SerializedName("serviceId")
    @Expose
    private String serviceId;
    @SerializedName("fare")
    @Expose
    private String fare;
    @SerializedName("busType")
    @Expose
    private String busType;
    @SerializedName("routeScheduleId")
    @Expose
    private String routeScheduleId;
    @SerializedName("commPCT")
    @Expose
    private Double commPCT;
    @SerializedName("operatorId")
    @Expose
    private Integer operatorId;
    @SerializedName("inventoryType")
    @Expose
    private Integer inventoryType;

    public Object getDroppingPoints() {
        return droppingPoints;
    }

    public void setDroppingPoints(Object droppingPoints) {
        this.droppingPoints = droppingPoints;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Boolean getPartialCancellationAllowed() {
        return partialCancellationAllowed;
    }

    public void setPartialCancellationAllowed(Boolean partialCancellationAllowed) {
        this.partialCancellationAllowed = partialCancellationAllowed;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public List<BoardingPoint> getBoardingPoints() {
        return boardingPoints;
    }

    public void setBoardingPoints(List<BoardingPoint> boardingPoints) {
        this.boardingPoints = boardingPoints;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Boolean getMTicketAllowed() {
        return mTicketAllowed;
    }

    public void setMTicketAllowed(Boolean mTicketAllowed) {
        this.mTicketAllowed = mTicketAllowed;
    }

    public Boolean getIdProofRequired() {
        return idProofRequired;
    }

    public void setIdProofRequired(Boolean idProofRequired) {
        this.idProofRequired = idProofRequired;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getRouteScheduleId() {
        return routeScheduleId;
    }

    public void setRouteScheduleId(String routeScheduleId) {
        this.routeScheduleId = routeScheduleId;
    }

    public Double getCommPCT() {
        return commPCT;
    }

    public void setCommPCT(Double commPCT) {
        this.commPCT = commPCT;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(Integer inventoryType) {
        this.inventoryType = inventoryType;
    }
}
