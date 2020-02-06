package com.swaliya.hellowcashback.model.flight;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailSegment {

    @SerializedName("FlightId")
    @Expose
    private String flightId;
    @SerializedName("AirlineCode")
    @Expose
    private String airlineCode;
    @SerializedName("FlightNumber")
    @Expose
    private String flightNumber;
    @SerializedName("AirCraftType")
    @Expose
    private String airCraftType;
    @SerializedName("Origin")
    @Expose
    private String origin;
    @SerializedName("OriginAirportTerminal")
    @Expose
    private String originAirportTerminal;
    @SerializedName("Destination")
    @Expose
    private String destination;
    @SerializedName("DestinationAirportTerminal")
    @Expose
    private String destinationAirportTerminal;
    @SerializedName("DepartureDateTime")
    @Expose
    private String departureDateTime;
    @SerializedName("ArrivalDateTime")
    @Expose
    private String arrivalDateTime;
    @SerializedName("Duration")
    @Expose
    private String duration;
    @SerializedName("NumberofStops")
    @Expose
    private Integer numberofStops;
    @SerializedName("Via")
    @Expose
    private String via;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("Currency_Conversion_Rate")
    @Expose
    private String currencyConversionRate;
    @SerializedName("AvailPaxFareDetails")
    @Expose
    private List<AvailPaxFareDetail> availPaxFareDetails = null;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirCraftType() {
        return airCraftType;
    }

    public void setAirCraftType(String airCraftType) {
        this.airCraftType = airCraftType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginAirportTerminal() {
        return originAirportTerminal;
    }

    public void setOriginAirportTerminal(String originAirportTerminal) {
        this.originAirportTerminal = originAirportTerminal;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationAirportTerminal() {
        return destinationAirportTerminal;
    }

    public void setDestinationAirportTerminal(String destinationAirportTerminal) {
        this.destinationAirportTerminal = destinationAirportTerminal;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getNumberofStops() {
        return numberofStops;
    }

    public void setNumberofStops(Integer numberofStops) {
        this.numberofStops = numberofStops;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    public void setCurrencyConversionRate(String currencyConversionRate) {
        this.currencyConversionRate = currencyConversionRate;
    }

    public List<AvailPaxFareDetail> getAvailPaxFareDetails() {
        return availPaxFareDetails;
    }

    public void setAvailPaxFareDetails(List<AvailPaxFareDetail> availPaxFareDetails) {
        this.availPaxFareDetails = availPaxFareDetails;
    }

}