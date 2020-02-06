package com.swaliya.hellowcashback.retrofit;

import com.swaliya.hellowcashback.model.MultipleResource;
import com.swaliya.hellowcashback.model.RequestPojo;
import com.swaliya.hellowcashback.model.User;
import com.swaliya.hellowcashback.model.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {

    // http://dblcapp.com/api/customer.aspx?msg=GetBaner
    @GET("customer.aspx?msg=GetBaner")
    Call<RequestPojo> doGetList();

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name,
                                         @Field("job") String job);
}
