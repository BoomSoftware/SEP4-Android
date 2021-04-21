package com.example.sep4_android.viewmodels;

import androidx.lifecycle.ViewModel;

import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.repositories.UserRepository;

public class SignUpViewModel extends ViewModel {
    private UserRepository userRepository;

    public SignUpViewModel(){
        userRepository.getInstance();
    }

    public void createAccount(Gardener gardener){
        userRepository.createUser(gardener);
    }

}
