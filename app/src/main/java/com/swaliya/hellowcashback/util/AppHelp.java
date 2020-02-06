package com.swaliya.hellowcashback.util;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.activity.HotelActivity;

import java.util.Calendar;

public class AppHelp extends AppCompatActivity {

    public static String forMobileOpratore = "{\n" +
            "\n" +
            "\"recharge_details\":{\n" +
            "\n" +
            "\"provider_name\": \"VODAFONE\",\n" +
            "\n" +
            "\"provider_code\": \"2\"\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\"plan_details\":{\n" +
            "\n" +
            "\"operator_code\": \"22\",\n" +
            "\n" +
            "\"circle_code\": \"3\"\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\"paid_plans\":{\n" +
            "\n" +
            "\"provider_id\": \"2\",\n" +
            "\n" +
            "\"provider_name\": \"VODAFONE\",\n" +
            "\n" +
            "\"state_code\": \"3\",\n" +
            "\n" +
            "\"state\": \"KOLKATA\",\n" +
            "\n" +
            "\"state_short\": \"KO\"\n" +
            "\n" +
            "}\n" +
            "\n" +
            "}";
    public static String getHotelCityList = "[\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Agartala,Tripura,India\",\n" +
            "\n" +
            "    \"id\": \"1\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Agra,UttarPradesh,India\",\n" +
            "\n" +
            "    \"id\": \"2\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Ahmadnagar,Maharashtra,India\",\n" +
            "\n" +
            "    \"id\": \"3\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Ahmedabad,Gujarat,India\",\n" +
            "\n" +
            "    \"id\": \"4\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Ajmer,Rajasthan,India\",\n" +
            "\n" +
            "    \"id\": \"5\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Alleppey,Kerala,India\",\n" +
            "\n" +
            "    \"id\": \"6\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"hcity\": \"Allahabad,UttarPradesh,India\",\n" +
            "\n" +
            "    \"id\": \"7\"\n" +
            "\n" +
            "  }\n" +
            "\n" +
            "  \n" +
            "\n" +
            "  ]";
    public static String getBusCityList = "[{\n" +
            "\n" +
            "      \"stationName\": \"Agra Package\",\n" +
            "\n" +
            "      \"stationId\": 6868\n" +
            "\n" +
            "    },\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "      \"stationName\": \"Agra Sight Seen\",\n" +
            "\n" +
            "      \"stationId\": -1\n" +
            "\n" +
            "    },\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "      \"stationName\": \"Agra Sightseen(One Day Tour)\",\n" +
            "\n" +
            "      \"stationId\": -1\n" +
            "\n" +
            "    },\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "      \"stationName\": \"Agumbe\",\n" +
            "\n" +
            "      \"stationId\": 12283\n" +
            "\n" +
            "    },\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "      \"stationName\": \"Ahmedabad\",\n" +
            "\n" +
            "      \"stationId\": 2434\n" +
            "\n" +
            "    }\n" +
            " ]";
    public static String forElectyricityBill = "{\n" +
            "\n" +
            "        \"payid\":109,\n" +
            "\n" +
            "        \"operator_ref\":\"MU1278889225767754\",\n" +
            "\n" +
            "        \"status\":\"success\",\n" +
            "\n" +
            "        \"txstatus_desc\":\"Initiated\",\n" +
            "\n" +
            "        \"message\":\"Transaction Submitted Successfully Done, Check Status in Transaction Report, Thanks\"\n" +
            "\n" +
            "        }";
    public static String forCarlist="[\n" +
            "  {\n" +
            "    \"vehicle\": \"Tata Indigo\",\n" +
            "    \"seatingCapacity\": 4,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"9.75\",\n" +
            "    \"extraHourRate\": 100,\n" +
            "    \"localBasicRate\": 1400,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"tata-indigo.jpg\",\n" +
            "    \"VehicleCategory\": \"Sedan\",\n" +
            "    \"serviceTaxAmount\": 70,\n" +
            "    \"totalAmount\": 1470,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"responseCode\": 1,\n" +
            "    \"advancepayment\": 294,\n" +
            "    \"balanceamount\": 1176\n" +
            "  },\n" +
            "  {\n" +
            "    \"vehicle\": \"Toyota Innova\",\n" +
            "    \"seatingCapacity\": 6,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"13.00\",\n" +
            "    \"extraHourRate\": 120,\n" +
            "    \"localBasicRate\": 2050,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"toyota-innova.jpg\",\n" +
            "    \"VehicleCategory\": \"SUV\",\n" +
            "    \"serviceTaxAmount\": 102.5,\n" +
            "    \"totalAmount\": 2153,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"advancepayment\": 431,\n" +
            "    \"balanceamount\": 1722\n" +
            "  },\n" +
            "  {\n" +
            "    \"vehicle\": \"Mahindra Xylo\",\n" +
            "    \"seatingCapacity\": 6,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"13.00\",\n" +
            "    \"extraHourRate\": 120,\n" +
            "    \"localBasicRate\": 2050,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"mahindra-xylo.jpg\",\n" +
            "    \"VehicleCategory\": \"SUV\",\n" +
            "    \"serviceTaxAmount\": 102.5,\n" +
            "    \"totalAmount\": 2153,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"advancepayment\": 431,\n" +
            "    \"balanceamount\": 1722\n" +
            "  },\n" +
            "  {\n" +
            "    \"vehicle\": \"Honda City\",\n" +
            "    \"seatingCapacity\": 4,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"30.00\",\n" +
            "    \"extraHourRate\": 200,\n" +
            "    \"localBasicRate\": 2800,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"honda-city.jpg\",\n" +
            "    \"VehicleCategory\": \"Premium\",\n" +
            "    \"serviceTaxAmount\": 140,\n" +
            "    \"totalAmount\": 2940,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"advancepayment\": 588,\n" +
            "    \"balanceamount\": 2352\n" +
            "  },\n" +
            "  {\n" +
            "    \"vehicle\": \"Tata Indica\",\n" +
            "    \"seatingCapacity\": 4,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"9.75\",\n" +
            "    \"extraHourRate\": 100,\n" +
            "    \"localBasicRate\": 1400,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"tata-indica.jpg\",\n" +
            "    \"VehicleCategory\": \"Hatchback\",\n" +
            "    \"serviceTaxAmount\": 70,\n" +
            "    \"totalAmount\": 1470,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"advancepayment\": 294,\n" +
            "    \"balanceamount\": 1176\n" +
            "  },\n" +
            "  {\n" +
            "    \"vehicle\": \"Swift Dzire\",\n" +
            "    \"seatingCapacity\": 4,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"9.75\",\n" +
            "    \"extraHourRate\": 100,\n" +
            "    \"localBasicRate\": 1400,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"swift-dzire.jpg\",\n" +
            "    \"VehicleCategory\": \"Sedan\",\n" +
            "    \"serviceTaxAmount\": 70,\n" +
            "    \"totalAmount\": 1470,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"advancepayment\": 294,\n" +
            "    \"balanceamount\": 1176\n" +
            "  },\n" +
            "  {\n" +
            "    \"vehicle\": \"Maruti WagonR\",\n" +
            "    \"seatingCapacity\": 4,\n" +
            "    \"sourceCity\": \"Delhi\",\n" +
            "    \"perKm\": \"9.75\",\n" +
            "    \"extraHourRate\": 100,\n" +
            "    \"localBasicRate\": 1400,\n" +
            "    \"nightCharges\": 0,\n" +
            "    \"vpic\": \"maruti-wagonr.jpg\",\n" +
            "    \"VehicleCategory\": \"Hatchback\",\n" +
            "    \"serviceTaxAmount\": 70,\n" +
            "    \"totalAmount\": 1470,\n" +
            "    \"days\": \"1\",\n" +
            "    \"ServiceTax\": \"5.00\",\n" +
            "    \"hostUrl\": \"216.10.243.197\",\n" +
            "    \"advancepayment\": 294,\n" +
            "    \"balanceamount\": 1176\n" +
            "  }\n" +
            "]\n";
    public static String forDthOperatore="{\"operator_code\":\"97\",\"circle_code\":\"1\"}";
    public static String forDthPlans="[\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"DISH99 SD - 145+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"99\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"SUPER FAMILY SD - 277+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"270\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"MAXI SPORTS SD - 282+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"315\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"ALL SPORTS SD - 321+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"365\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"WORLD SPORTS SD - 341+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"435\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"NEW TITANIUM SD - 360+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"535\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"GAME ON HD - 22 Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"165\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"FULL ON HD - 45 Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"220\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"South Joy Pack SD - 185+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"99\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"South KHUSHI SD - 155+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"99\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  }\n" +
            "\n" +
            "]";
    static int day, month, year;
    public String forHotellist = " {\n" +
            "  \"AvailableHotels\": [\n" +
            "    {\n" +
            "      \"HotelId\": \"1366784\",\n" +
            "      \"HotelName\": \"Hotel Bhola\",\n" +
            "      \"Description\": \"Property Location When you stay at Hotel Bhola in Pimpri - Chinchwad, youll be within a 5-minute drive of Auto Cluster Exhibition Center. This hotel is 8.4 mi (13.5 km) from Sahara S \",\n" +
            "      \"HotelChain\": null,\n" +
            "      \"StarRating\": \"2\",\n" +
            "      \"Rooms\": 0,\n" +
            "      \"MinRate\": 0,\n" +
            "      \"RPH\": null,\n" +
            "      \"WebService\": \"5b343cc1-2240-4240-b33b-ea3d720f564d~1\",\n" +
            "      \"HotelAddress\": \"Block D2 Telco Road 64 Chinchwad Station , \",\n" +
            "      \"PostalCode\": null,\n" +
            "      \"City\": null,\n" +
            "      \"LocationInfo\": \",,\",\n" +
            "      \"PhoneNumber\": \"\",\n" +
            "      \"Fax\": null,\n" +
            "      \"Email\": null,\n" +
            "      \"Website\": null,\n" +
            "      \"Checkintime\": \"\",\n" +
            "      \"Checkouttime\": \"\",\n" +
            "      \"CreditCards\": null,\n" +
            "      \"HotelServices\": null,\n" +
            "      \"RoomServices\": null,\n" +
            "      \"Facilities\": null,\n" +
            "      \"CountryCode\": null,\n" +
            "      \"AirportCode\": null,\n" +
            "      \"SupplierType\": \"\",\n" +
            "      \"PropertyCategory\": null,\n" +
            "      \"Provider\": \"R+dOBiJvGb/pCccrWhkebA==\",\n" +
            "      \"RoomDetails\": [\n" +
            "        {\n" +
            "          \"RoomIndex\": null,\n" +
            "          \"RateType\": null,\n" +
            "          \"HotelPackage\": null,\n" +
            "          \"RoomType\": null,\n" +
            "          \"RoomBasis\": \"\",\n" +
            "          \"RoomTypeCode\": null,\n" +
            "          \"RatePlanCode\": \"\",\n" +
            "          \"Validdays\": null,\n" +
            "          \"WsKey\": null,\n" +
            "          \"ExtGuestTotal\": 0,\n" +
            "          \"RoomTotal\": 861.04,\n" +
            "          \"RoomNetTotal\": 861.04,\n" +
            "          \"PartnerFareDatails\": {\n" +
            "            \"NetFares\": \"861.04\",\n" +
            "            \"Commission\": \"0\",\n" +
            "            \"CommissionType\": 0\n" +
            "          },\n" +
            "          \"ServicetaxTotal\": 0,\n" +
            "          \"Discount\": 0,\n" +
            "          \"Commission\": 0,\n" +
            "          \"expediaPropertyId\": null,\n" +
            "          \"RoomCancellationPolicy\": null,\n" +
            "          \"NoOfPax\": 0,\n" +
            "          \"RefundRule\": null,\n" +
            "          \"Inclusions\": null,\n" +
            "          \"Exclusions\": null,\n" +
            "          \"RoomCount\": 0,\n" +
            "          \"MaxAdultOccupancy\": 0,\n" +
            "          \"MaxChildOccupancy\": 0,\n" +
            "          \"BedType\": null,\n" +
            "          \"RoomView\": null,\n" +
            "          \"RoomDescription\": null,\n" +
            "          \"RoomAmenities\": null,\n" +
            "          \"IncExcCondition\": null,\n" +
            "          \"IsInclusion\": false,\n" +
            "          \"Images\": null\n" +
            "        }\n" +
            "      ],\n" +
            "      \"HotelImages\": [\n" +
            "        {\n" +
            "          \"Imagedesc\": \"Hotel Images\",\n" +
            "          \"Imagepath\": \"http://api.GoalltripTechnology.in/imageresource.aspx?img=FbrGPTrju5e5v0qrAGTD8pPBsj8/wYA5lPqBj/Ape0/CGIZLmjIo0kK786lYiHhxpOU+e2UYSZ6+ipW5yPiOrnnSgMBJylWNg93qX68tAxNXAFBG+ghw9A==\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"HotelPolicy\": null,\n" +
            "      \"ConvenienceFee\": 0,\n" +
            "      \"ConvenienceFeeType\": 1,\n" +
            "      \"ConvenienceFeeTotal\": 0,\n" +
            "      \"AffiliateId\": null,\n" +
            "      \"RoomCombination\": null,\n" +
            "      \"RoomChain\": null,\n" +
            "      \"Latitude\": null,\n" +
            "      \"Longitude\": null,\n" +
            "      \"Floors\": 0,\n" +
            "      \"Alias\": null,\n" +
            "      \"Punchline\": null,\n" +
            "      \"MapURL\": \"\",\n" +
            "      \"VideoURL\": null,\n" +
            "      \"PromoTitle\": null,\n" +
            "      \"PromoDetail\": null,\n" +
            "      \"Distances\": null,\n" +
            "      \"AdditionalInfo\": null,\n" +
            "      \"Awards\": null,\n" +
            "      \"Events\": null,\n" +
            "      \"OtherFees\": null,\n" +
            "      \"Facebook\": null,\n" +
            "      \"Twitter\": null,\n" +
            "      \"Linkedin\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"HotelId\": \"1366784\",\n" +
            "      \"HotelName\": \"Hotel Bhola\",\n" +
            "      \"Description\": \"Property Location When you stay at Hotel Bhola in Pimpri - Chinchwad, youll be within a 5-minute drive of Auto Cluster Exhibition Center. This hotel is 8.4 mi (13.5 km) from Sahara S \",\n" +
            "      \"HotelChain\": null,\n" +
            "      \"StarRating\": \"2\",\n" +
            "      \"Rooms\": 0,\n" +
            "      \"MinRate\": 0,\n" +
            "      \"RPH\": null,\n" +
            "      \"WebService\": \"5b343cc1-2240-4240-b33b-ea3d720f564d~1\",\n" +
            "      \"HotelAddress\": \"Block D2 Telco Road 64 Chinchwad Station , \",\n" +
            "      \"PostalCode\": null,\n" +
            "      \"City\": null,\n" +
            "      \"LocationInfo\": \",,\",\n" +
            "      \"PhoneNumber\": \"\",\n" +
            "      \"Fax\": null,\n" +
            "      \"Email\": null,\n" +
            "      \"Website\": null,\n" +
            "      \"Checkintime\": \"\",\n" +
            "      \"Checkouttime\": \"\",\n" +
            "      \"CreditCards\": null,\n" +
            "      \"HotelServices\": null,\n" +
            "      \"RoomServices\": null,\n" +
            "      \"Facilities\": null,\n" +
            "      \"CountryCode\": null,\n" +
            "      \"AirportCode\": null,\n" +
            "      \"SupplierType\": \"\",\n" +
            "      \"PropertyCategory\": null,\n" +
            "      \"Provider\": \"R+dOBiJvGb/pCccrWhkebA==\",\n" +
            "      \"RoomDetails\": [\n" +
            "        {\n" +
            "          \"RoomIndex\": null,\n" +
            "          \"RateType\": null,\n" +
            "          \"HotelPackage\": null,\n" +
            "          \"RoomType\": null,\n" +
            "          \"RoomBasis\": \"\",\n" +
            "          \"RoomTypeCode\": null,\n" +
            "          \"RatePlanCode\": \"\",\n" +
            "          \"Validdays\": null,\n" +
            "          \"WsKey\": null,\n" +
            "          \"ExtGuestTotal\": 0,\n" +
            "          \"RoomTotal\": 861.04,\n" +
            "          \"RoomNetTotal\": 861.04,\n" +
            "          \"PartnerFareDatails\": {\n" +
            "            \"NetFares\": \"861.04\",\n" +
            "            \"Commission\": \"0\",\n" +
            "            \"CommissionType\": 0\n" +
            "          },\n" +
            "          \"ServicetaxTotal\": 0,\n" +
            "          \"Discount\": 0,\n" +
            "          \"Commission\": 0,\n" +
            "          \"expediaPropertyId\": null,\n" +
            "          \"RoomCancellationPolicy\": null,\n" +
            "          \"NoOfPax\": 0,\n" +
            "          \"RefundRule\": null,\n" +
            "          \"Inclusions\": null,\n" +
            "          \"Exclusions\": null,\n" +
            "          \"RoomCount\": 0,\n" +
            "          \"MaxAdultOccupancy\": 0,\n" +
            "          \"MaxChildOccupancy\": 0,\n" +
            "          \"BedType\": null,\n" +
            "          \"RoomView\": null,\n" +
            "          \"RoomDescription\": null,\n" +
            "          \"RoomAmenities\": null,\n" +
            "          \"IncExcCondition\": null,\n" +
            "          \"IsInclusion\": false,\n" +
            "          \"Images\": null\n" +
            "        }\n" +
            "      ],\n" +
            "      \"HotelImages\": [\n" +
            "        {\n" +
            "          \"Imagedesc\": \"Hotel Images\",\n" +
            "          \"Imagepath\": \"http://api.GoalltripTechnology.in/imageresource.aspx?img=FbrGPTrju5e5v0qrAGTD8pPBsj8/wYA5lPqBj/Ape0/CGIZLmjIo0kK786lYiHhxpOU+e2UYSZ6+ipW5yPiOrnnSgMBJylWNg93qX68tAxNXAFBG+ghw9A==\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"HotelPolicy\": null,\n" +
            "      \"ConvenienceFee\": 0,\n" +
            "      \"ConvenienceFeeType\": 1,\n" +
            "      \"ConvenienceFeeTotal\": 0,\n" +
            "      \"AffiliateId\": null,\n" +
            "      \"RoomCombination\": null,\n" +
            "      \"RoomChain\": null,\n" +
            "      \"Latitude\": null,\n" +
            "      \"Longitude\": null,\n" +
            "      \"Floors\": 0,\n" +
            "      \"Alias\": null,\n" +
            "      \"Punchline\": null,\n" +
            "      \"MapURL\": \"\",\n" +
            "      \"VideoURL\": null,\n" +
            "      \"PromoTitle\": null,\n" +
            "      \"PromoDetail\": null,\n" +
            "      \"Distances\": null,\n" +
            "      \"AdditionalInfo\": null,\n" +
            "      \"Awards\": null,\n" +
            "      \"Events\": null,\n" +
            "      \"OtherFees\": null,\n" +
            "      \"Facebook\": null,\n" +
            "      \"Twitter\": null,\n" +
            "      \"Linkedin\": null\n" +
            "    }\n" +
            "  ],\n" +
            "  \"ProvidersCount\": 2,\n" +
            "  \"ResponseStatus\": 200,\n" +
            "  \"Message\": null\n" +
            "}";
    public String forBusList = "{\n" +
            "  \"apiAvailableBuses\": \n" +
            "[\n" +
            "\n" +
            "    {\n" +
            "\n" +
            "      \"droppingPoints\": null,\n" +
            "\n" +
            "      \"availableSeats\": 41,\n" +
            "\n" +
            "      \"partialCancellationAllowed\": false,\n" +
            "\n" +
            "      \"arrivalTime\": \"10:30 PM\",\n" +
            "\n" +
            "      \"cancellationPolicy\": \"\",\n" +
            "\n" +
            "      \"boardingPoints\":\n" +
            "\n" +
            " [       \n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"01:30PM\",\n" +
            "\n" +
            "          \"location\": \"Miyapur (Near More Supermarket),Kallada Travels, Hema Durga Plaza,9347455500\",\n" +
            "\n" +
            "          \"id\": \"3878\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"01:40PM\",\n" +
            "\n" +
            "          \"location\": \"Kondapur,infront of RT office,9347455500, 040-30425500\",\n" +
            "\n" +
            "          \"id\": \"3880\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"01:45PM\",\n" +
            "\n" +
            "          \"location\": \"Gachibowli,09392125500\",\n" +
            "\n" +
            "          \"id\": \"3881\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"02:00PM\",\n" +
            "\n" +
            "          \"location\": \"Lakdi-ka-pool ( van pickup ),Neeta travels ,9391555000,040-30585500\",\n" +
            "\n" +
            "          \"id\": \"3883\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "      \n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"12:45PM\",\n" +
            "\n" +
            "          \"location\": \"Ameerpet ( van pickup ),9392055500,040-30585500\",\n" +
            "\n" +
            "          \"id\": \"3888\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"03:15PM\",\n" +
            "\n" +
            "          \"location\": \"Kottoor Busbay,9392555500,040-30585500\",\n" +
            "\n" +
            "          \"id\": \"4311\"\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "       \n" +
            "\n" +
            "      ],\n" +
            "\n" +
            "      \"operatorName\": \"KALLADA TOURS & TRAVELS\",\n" +
            "\n" +
            "      \"departureTime\": \"1:15 PM\",\n" +
            "\n" +
            "      \"mTicketAllowed\": false,\n" +
            "\n" +
            "      \"idProofRequired\": false,\n" +
            "\n" +
            "      \"serviceId\": \"20145\",\n" +
            "\n" +
            "      \"fare\": \"1000\",\n" +
            "\n" +
            "      \"busType\": \"Scania Metrolink A/C\",\n" +
            "\n" +
            "      \"routeScheduleId\": \"20145\",\n" +
            "\n" +
            "      \"commPCT\": 5.2,\n" +
            "\n" +
            "      \"operatorId\": 3,\n" +
            "\n" +
            "      \"inventoryType\": 0\n" +
            "\n" +
            "    }, {\n" +
            "\n" +
            "      \"droppingPoints\": null,\n" +
            "\n" +
            "      \"availableSeats\": 41,\n" +
            "\n" +
            "      \"partialCancellationAllowed\": false,\n" +
            "\n" +
            "      \"arrivalTime\": \"10:30 PM\",\n" +
            "\n" +
            "      \"cancellationPolicy\": \"\",\n" +
            "\n" +
            "      \"boardingPoints\":\n" +
            "\n" +
            " [       \n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"01:30PM\",\n" +
            "\n" +
            "          \"location\": \"Miyapur (Near More Supermarket),Kallada Travels, Hema Durga Plaza,9347455500\",\n" +
            "\n" +
            "          \"id\": \"3878\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"01:40PM\",\n" +
            "\n" +
            "          \"location\": \"Kondapur,infront of RT office,9347455500, 040-30425500\",\n" +
            "\n" +
            "          \"id\": \"3880\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"01:45PM\",\n" +
            "\n" +
            "          \"location\": \"Gachibowli,09392125500\",\n" +
            "\n" +
            "          \"id\": \"3881\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"02:00PM\",\n" +
            "\n" +
            "          \"location\": \"Lakdi-ka-pool ( van pickup ),Neeta travels ,9391555000,040-30585500\",\n" +
            "\n" +
            "          \"id\": \"3883\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "      \n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"12:45PM\",\n" +
            "\n" +
            "          \"location\": \"Ameerpet ( van pickup ),9392055500,040-30585500\",\n" +
            "\n" +
            "          \"id\": \"3888\"\n" +
            "\n" +
            "        },\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"time\": \"03:15PM\",\n" +
            "\n" +
            "          \"location\": \"Kottoor Busbay,9392555500,040-30585500\",\n" +
            "\n" +
            "          \"id\": \"4311\"\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "       \n" +
            "\n" +
            "      ],\n" +
            "\n" +
            "      \"operatorName\": \"KALLADA TOURS & TRAVELS\",\n" +
            "\n" +
            "      \"departureTime\": \"1:15 PM\",\n" +
            "\n" +
            "      \"mTicketAllowed\": false,\n" +
            "\n" +
            "      \"idProofRequired\": false,\n" +
            "\n" +
            "      \"serviceId\": \"20145\",\n" +
            "\n" +
            "      \"fare\": \"1000\",\n" +
            "\n" +
            "      \"busType\": \"Scania Metrolink A/C\",\n" +
            "\n" +
            "      \"routeScheduleId\": \"20145\",\n" +
            "\n" +
            "      \"commPCT\": 5.2,\n" +
            "\n" +
            "      \"operatorId\": 3,\n" +
            "\n" +
            "      \"inventoryType\": 0\n" +
            "\n" +
            "    }]}";
    public static String forDthPlanList="[\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"DISH99 SD - 145+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"99\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"SUPER FAMILY SD - 277+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"270\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"MAXI SPORTS SD - 282+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"315\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"ALL SPORTS SD - 321+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"365\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"WORLD SPORTS SD - 341+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"435\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"NEW TITANIUM SD - 360+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"535\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"GAME ON HD - 22 Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"165\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"FULL ON HD - 45 Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"220\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"South Joy Pack SD - 185+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"99\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"Detail\": \"South KHUSHI SD - 155+ Channels & Services\",\n" +
            "\n" +
            "    \"Amount\": \"99\",\n" +
            "\n" +
            "    \"Validity\": \"1 month\"\n" +
            "\n" +
            "  }\n" +
            "\n" +
            "]";
    Context context;
    public static String getFilightAirportName = "[\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"1\",\n" +
            "\n" +
            "    \"fcity\": \"Agra (Kheria), AGR\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"2\",\n" +
            "\n" +
            "    \"fcity\": \"Agatti Island (Agatti Island), AGX\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"3\",\n" +
            "\n" +
            "    \"fcity\": \"Aizawl (Aizawl), AJL\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"4\",\n" +
            "\n" +
            "    \"fcity\": \"Akola (Akola), AKD\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"5\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "    \"fcity\": \"Ahmedabad (Ahmedabad), AMD\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"6\",\n" +
            "\n" +
            "    \"fcity\": \"Amritsar (Amritsar), ATQ\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"7\",\n" +
            "\n" +
            "    \"fcity\": \"Bhubaneshwar (Bhubaneshwar), BBI\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"8\",\n" +
            "\n" +
            "    \"fcity\": \"Vadodara (Vadodara), BDQ\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"9\",\n" +
            "\n" +
            "    \"fcity\": \"Bellary (Bellary), BEP\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"10\",\n" +
            "\n" +
            "    \"fcity\": \"Bhuj (Rudra Mata), BHJ\"\n" +
            "\n" +
            "  },\n" +
            "\n" +
            "  {\n" +
            "\n" +
            "    \"id\": \"11\",\n" +
            "\n" +
            "    \"fcity\": \"Bhopal (Bhopal), BHO\"\n" +
            "\n" +
            "  }\n" +
            "\n" +
            "  \n" +
            "\n" +
            "  ]";

    public static String forFlightlist = "[    \n" +
            "\n" +
            "     {\n" +
            "\n" +
            "  \"ResponseStatus\": 1,\n" +
            "\n" +
            "  \"UserTrackId\": \"RMXXF97099989986937983949978028705041027\",\n" +
            "\n" +
            "  \"AvailabilityOutput\": {\n" +
            "\n" +
            "    \"AvailableFlights\": {\n" +
            "\n" +
            "      \"OngoingFlights\": [\n" +
            "\n" +
            "        {\n" +
            "\n" +
            "          \"AvailSegments\": [\n" +
            "\n" +
            "            {\n" +
            "\n" +
            "              \"FlightId\": \"11\",\n" +
            "\n" +
            "              \"AirlineCode\": \"SG\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "              \"FlightNumber\": \"3302\",\n" +
            "\n" +
            "              \"AirCraftType\": \"DH8\",\n" +
            "\n" +
            "              \"Origin\": \"BLR\",\n" +
            "\n" +
            "              \"OriginAirportTerminal\": \"\",\n" +
            "\n" +
            "              \"Destination\": \"MAA\",\n" +
            "\n" +
            "              \"DestinationAirportTerminal\": \"\",\n" +
            "\n" +
            "              \"DepartureDateTime\": \"22/06/2016 07:35:00\",\n" +
            "\n" +
            "              \"ArrivalDateTime\": \"22/06/2016 08:25:00\",\n" +
            "\n" +
            "              \"Duration\": \"0hrs 50mins\",\n" +
            "\n" +
            "              \"NumberofStops\": 0,\n" +
            "\n" +
            "              \"Via\": \"\",\n" +
            "\n" +
            "              \"CurrencyCode\": \"INR\",\n" +
            "\n" +
            "              \"Currency_Conversion_Rate\": \"\",\n" +
            "\n" +
            "              \"AvailPaxFareDetails\": [\n" +
            "\n" +
            "                {\n" +
            "\n" +
            "                  \"ClassCode\": \"HHSAVERRS\",\n" +
            "\n" +
            "                  \"ClassCodeDesc\": \"HHSAVERRS\",\n" +
            "\n" +
            "                  \"BaggageAllowed\": null,\n" +
            "\n" +
            "                  \"Adult\": {\n" +
            "\n" +
            "                    \"FareBasis\": \"HSAVER\",\n" +
            "\n" +
            "                    \"FareType\": \"\",\n" +
            "\n" +
            "                    \"BasicAmount\": 0,\n" +
            "\n" +
            "                    \"YQ\": 0,\n" +
            "\n" +
            "                    \"TaxDetails\": null,\n" +
            "\n" +
            "                    \"TotalTaxAmount\": 0,\n" +
            "\n" +
            "                    \"GrossAmount\": 0,\n" +
            "\n" +
            "                    \"Commission\": \"0\"\n" +
            "\n" +
            "                  },\n" +
            "\n" +
            "                  \"Child\": null,\n" +
            "\n" +
            "                  \"Infant\": null\n" +
            "\n" +
            "                }\n" +
            "\n" +
            "              ]}]}]}}}]";

    public AppHelp(Context context) {
        this.context = context;
    }

    public String forDate(int strday, int strmonth, int stryear) {
        Calendar call = Calendar.getInstance();
        call.set(stryear, strmonth, strday);


        day = call.get(Calendar.DAY_OF_MONTH);
        month = call.get(Calendar.MONTH);
        year = call.get(Calendar.YEAR);

        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                int nMonth = monthOfYear + 1;
                day = dayOfMonth;
                month = nMonth;
                AppHelp.year = year;

                //  ((TextView) findViewById(R.id.tvCheckoutDate)).setText(dayOfMonth + "/" + nMonth + "/" + year);
            }
        };

        DatePickerDialog dpDialogg = new DatePickerDialog(context, listener, year, month, day);

        Calendar currentDate = Calendar.getInstance();
        currentDate.set(stryear, strmonth, strday);
        dpDialogg.getDatePicker().setMinDate(currentDate.getTimeInMillis());

        dpDialogg.getDatePicker().setMinDate(System.currentTimeMillis());
        long maxDate = call.getTime().getTime();
        dpDialogg.getDatePicker().setMaxDate(maxDate);
        dpDialogg.show();
        return String.valueOf(day + month + year);
    }
}
