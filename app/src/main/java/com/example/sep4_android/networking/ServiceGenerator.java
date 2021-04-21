package com.example.sep4_android.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl("http://localhost:3000")
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();
    private static GardenApi gardenApi = retrofit.create(GardenApi.class);
    private static PlantApi plantApi = retrofit.create(PlantApi.class);
    private static UserApi userApi = retrofit.create(UserApi.class);

    public static GardenApi getGardenApi(){
        return gardenApi;
    }

    public static PlantApi getPlantApi() {
        return  plantApi;
    }
}
