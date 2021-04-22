package com.example.sep4_android.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.models.UserLiveData;
import com.example.sep4_android.networking.ServiceGenerator;
import com.example.sep4_android.networking.UserApi;
import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseUser;

import retrofit2.Call;

public class UserRepository {
    private final Application application;
    private final UserLiveData currentUser;
    private static UserRepository instance;

    private UserRepository(Application application){
        this.application = application;
        this.currentUser = new UserLiveData();
    }

    public static synchronized UserRepository getInstance(Application application){
        if(instance == null){
            instance = new UserRepository(application);
        }
        return instance;
    }

    public boolean searchForUser(String userUID){
        UserApi userApi = ServiceGenerator.getUserApi();
        Call<Boolean> call = userApi.searchForUser(userUID);
        try{
            return true;
//            return call.execute().body().booleanValue();
        }
        catch (Exception exception){
            return false;
        }
    }

    public boolean createUser(Gardener gardener){
        UserApi userApi = ServiceGenerator.getUserApi();
        Call<Boolean> callSync = userApi.createUser(gardener);
        try{
            return true;
//            return callSync.execute().body().booleanValue();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public LiveData<FirebaseUser> getCurrentUser(){
        return currentUser;
    }

    public void signOut(){
        AuthUI.getInstance().signOut(application.getApplicationContext());
    }
}
