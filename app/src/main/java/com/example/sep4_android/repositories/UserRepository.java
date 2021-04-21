package com.example.sep4_android.repositories;

import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.networking.ServiceGenerator;
import com.example.sep4_android.networking.UserApi;
import retrofit2.Call;

public class UserRepository {
    private static UserRepository instance;

    private UserRepository(){
    }

    public static synchronized UserRepository getInstance(){
        if(instance == null){
            instance = new UserRepository();
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
}
