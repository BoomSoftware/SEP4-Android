package com.example.sep4_android.viewmodels;
import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.models.UserStatusLiveData;
import com.example.sep4_android.repositories.UserRepository;
import com.google.firebase.auth.FirebaseUser;

public class LoginViewModel extends AndroidViewModel {
    private UserRepository userRepository;

    public LoginViewModel(Application application){
        super(application);
        userRepository = UserRepository.getInstance(application);
    }
    public LiveData<FirebaseUser> getCurrentUser(){
        return userRepository.getCurrentUser();
    }

    public void createUser(boolean isOwner){
        String userId = userRepository.getCurrentUser().getValue().getUid();
        userRepository.createUser(userId,isOwner);
    }

    public UserStatusLiveData getStatus(){
        String userId = userRepository.getCurrentUser().getValue().getUid();
        return userRepository.getStatus(userId);
    }
}
