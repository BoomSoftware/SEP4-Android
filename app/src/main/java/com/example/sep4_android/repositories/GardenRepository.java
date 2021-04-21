package com.example.sep4_android.repositories;

import com.example.sep4_android.models.Garden;

public class GardenRepository {
    private static GardenRepository instance;

    private GardenRepository(){}

    public static synchronized GardenRepository getInstance(){
        if(instance == null){
            instance = new GardenRepository();
        }
        return instance;
    }

    public void addNewGarden(Garden garden){

    }

}
