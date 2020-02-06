package com.swaliya.hellowcashback.model.hotel;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailableHotel {

    @SerializedName("HotelId")
    @Expose
    private String hotelId;
    @SerializedName("HotelName")
    @Expose
    private String hotelName;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("HotelChain")
    @Expose
    private Object hotelChain;
    @SerializedName("StarRating")
    @Expose
    private String starRating;
    @SerializedName("Rooms")
    @Expose
    private Integer rooms;
    @SerializedName("MinRate")
    @Expose
    private Integer minRate;
    @SerializedName("RPH")
    @Expose
    private Object rPH;
    @SerializedName("WebService")
    @Expose
    private String webService;
    @SerializedName("HotelAddress")
    @Expose
    private String hotelAddress;
    @SerializedName("PostalCode")
    @Expose
    private Object postalCode;
    @SerializedName("City")
    @Expose
    private Object city;
    @SerializedName("LocationInfo")
    @Expose
    private String locationInfo;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("Fax")
    @Expose
    private Object fax;
    @SerializedName("Email")
    @Expose
    private Object email;
    @SerializedName("Website")
    @Expose
    private Object website;
    @SerializedName("Checkintime")
    @Expose
    private String checkintime;
    @SerializedName("Checkouttime")
    @Expose
    private String checkouttime;
    @SerializedName("CreditCards")
    @Expose
    private Object creditCards;
    @SerializedName("HotelServices")
    @Expose
    private Object hotelServices;
    @SerializedName("RoomServices")
    @Expose
    private Object roomServices;
    @SerializedName("Facilities")
    @Expose
    private Object facilities;
    @SerializedName("CountryCode")
    @Expose
    private Object countryCode;
    @SerializedName("AirportCode")
    @Expose
    private Object airportCode;
    @SerializedName("SupplierType")
    @Expose
    private String supplierType;
    @SerializedName("PropertyCategory")
    @Expose
    private Object propertyCategory;
    @SerializedName("Provider")
    @Expose
    private String provider;
    @SerializedName("RoomDetails")
    @Expose
    private List<RoomDetail> roomDetails = null;
    @SerializedName("HotelImages")
    @Expose
    private List<HotelImage> hotelImages = null;
    @SerializedName("HotelPolicy")
    @Expose
    private Object hotelPolicy;
    @SerializedName("ConvenienceFee")
    @Expose
    private Integer convenienceFee;
    @SerializedName("ConvenienceFeeType")
    @Expose
    private Integer convenienceFeeType;
    @SerializedName("ConvenienceFeeTotal")
    @Expose
    private Integer convenienceFeeTotal;
    @SerializedName("AffiliateId")
    @Expose
    private Object affiliateId;
    @SerializedName("RoomCombination")
    @Expose
    private Object roomCombination;
    @SerializedName("RoomChain")
    @Expose
    private Object roomChain;
    @SerializedName("Latitude")
    @Expose
    private Object latitude;
    @SerializedName("Longitude")
    @Expose
    private Object longitude;
    @SerializedName("Floors")
    @Expose
    private Integer floors;
    @SerializedName("Alias")
    @Expose
    private Object alias;
    @SerializedName("Punchline")
    @Expose
    private Object punchline;
    @SerializedName("MapURL")
    @Expose
    private String mapURL;
    @SerializedName("VideoURL")
    @Expose
    private Object videoURL;
    @SerializedName("PromoTitle")
    @Expose
    private Object promoTitle;
    @SerializedName("PromoDetail")
    @Expose
    private Object promoDetail;
    @SerializedName("Distances")
    @Expose
    private Object distances;
    @SerializedName("AdditionalInfo")
    @Expose
    private Object additionalInfo;
    @SerializedName("Awards")
    @Expose
    private Object awards;
    @SerializedName("Events")
    @Expose
    private Object events;
    @SerializedName("OtherFees")
    @Expose
    private Object otherFees;
    @SerializedName("Facebook")
    @Expose
    private Object facebook;
    @SerializedName("Twitter")
    @Expose
    private Object twitter;
    @SerializedName("Linkedin")
    @Expose
    private Object linkedin;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getHotelChain() {
        return hotelChain;
    }

    public void setHotelChain(Object hotelChain) {
        this.hotelChain = hotelChain;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getMinRate() {
        return minRate;
    }

    public void setMinRate(Integer minRate) {
        this.minRate = minRate;
    }

    public Object getRPH() {
        return rPH;
    }

    public void setRPH(Object rPH) {
        this.rPH = rPH;
    }

    public String getWebService() {
        return webService;
    }

    public void setWebService(String webService) {
        this.webService = webService;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public Object getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    public Object getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Object creditCards) {
        this.creditCards = creditCards;
    }

    public Object getHotelServices() {
        return hotelServices;
    }

    public void setHotelServices(Object hotelServices) {
        this.hotelServices = hotelServices;
    }

    public Object getRoomServices() {
        return roomServices;
    }

    public void setRoomServices(Object roomServices) {
        this.roomServices = roomServices;
    }

    public Object getFacilities() {
        return facilities;
    }

    public void setFacilities(Object facilities) {
        this.facilities = facilities;
    }

    public Object getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public Object getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(Object airportCode) {
        this.airportCode = airportCode;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public Object getPropertyCategory() {
        return propertyCategory;
    }

    public void setPropertyCategory(Object propertyCategory) {
        this.propertyCategory = propertyCategory;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<RoomDetail> getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(List<RoomDetail> roomDetails) {
        this.roomDetails = roomDetails;
    }

    public List<HotelImage> getHotelImages() {
        return hotelImages;
    }

    public void setHotelImages(List<HotelImage> hotelImages) {
        this.hotelImages = hotelImages;
    }

    public Object getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(Object hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    public Integer getConvenienceFee() {
        return convenienceFee;
    }

    public void setConvenienceFee(Integer convenienceFee) {
        this.convenienceFee = convenienceFee;
    }

    public Integer getConvenienceFeeType() {
        return convenienceFeeType;
    }

    public void setConvenienceFeeType(Integer convenienceFeeType) {
        this.convenienceFeeType = convenienceFeeType;
    }

    public Integer getConvenienceFeeTotal() {
        return convenienceFeeTotal;
    }

    public void setConvenienceFeeTotal(Integer convenienceFeeTotal) {
        this.convenienceFeeTotal = convenienceFeeTotal;
    }

    public Object getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(Object affiliateId) {
        this.affiliateId = affiliateId;
    }

    public Object getRoomCombination() {
        return roomCombination;
    }

    public void setRoomCombination(Object roomCombination) {
        this.roomCombination = roomCombination;
    }

    public Object getRoomChain() {
        return roomChain;
    }

    public void setRoomChain(Object roomChain) {
        this.roomChain = roomChain;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Object getAlias() {
        return alias;
    }

    public void setAlias(Object alias) {
        this.alias = alias;
    }

    public Object getPunchline() {
        return punchline;
    }

    public void setPunchline(Object punchline) {
        this.punchline = punchline;
    }

    public String getMapURL() {
        return mapURL;
    }

    public void setMapURL(String mapURL) {
        this.mapURL = mapURL;
    }

    public Object getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(Object videoURL) {
        this.videoURL = videoURL;
    }

    public Object getPromoTitle() {
        return promoTitle;
    }

    public void setPromoTitle(Object promoTitle) {
        this.promoTitle = promoTitle;
    }

    public Object getPromoDetail() {
        return promoDetail;
    }

    public void setPromoDetail(Object promoDetail) {
        this.promoDetail = promoDetail;
    }

    public Object getDistances() {
        return distances;
    }

    public void setDistances(Object distances) {
        this.distances = distances;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Object getAwards() {
        return awards;
    }

    public void setAwards(Object awards) {
        this.awards = awards;
    }

    public Object getEvents() {
        return events;
    }

    public void setEvents(Object events) {
        this.events = events;
    }

    public Object getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(Object otherFees) {
        this.otherFees = otherFees;
    }

    public Object getFacebook() {
        return facebook;
    }

    public void setFacebook(Object facebook) {
        this.facebook = facebook;
    }

    public Object getTwitter() {
        return twitter;
    }

    public void setTwitter(Object twitter) {
        this.twitter = twitter;
    }

    public Object getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(Object linkedin) {
        this.linkedin = linkedin;
    }

}
