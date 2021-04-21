package com.example.sep4_android.networking;

import com.example.sep4_android.models.Gardener;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserApi {
    @GET("/gardener/{id}")
    Call<Boolean> searchForUser(@Path("id") String id);

    @POST("/gardener")
    Call<Boolean> createUser(@Body Gardener gardener);
}
