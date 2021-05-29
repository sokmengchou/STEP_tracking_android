package com.example.androidauthenticationapp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface API {

    @POST("customers")
    Call<ResponseBody> createUser(
            @Body User user
    );

    @POST("auth/login")
    Call<ResponseBody> checkUser(
            @Body User user
    );

    @GET("users/{username}/username")
    Call<User> getUsersByUsername(
            @Path("username") String username,
            @Header("Authorization") String authHeader
    );

    @GET("packages/{originId}/originTrackingNumber")
    Call<PackageOrigin> getOrigin(
            @Path("originId") String originId,
            @Header("Authorization") String authHeader
    );
}
