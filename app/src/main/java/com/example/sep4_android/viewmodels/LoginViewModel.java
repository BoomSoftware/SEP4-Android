package com.example.sep4_android.viewmodels;
import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.repositories.UserRepository;
import com.google.firebase.auth.FirebaseUser;

public class LoginViewModel extends AndroidViewModel {
    private UserRepository userRepository;

    public LoginViewModel(Application application){
        super(application);
        userRepository = UserRepository.getInstance(application);
    }

    public boolean searchForUser(String userUID){
        return userRepository.searchForUser(userUID);
    }

    public boolean createNewUser(Gardener gardener){
        return userRepository.createUser(gardener);
    }

    public LiveData<FirebaseUser> getCurrentUser(){
        return userRepository.getCurrentUser();
    }
}
