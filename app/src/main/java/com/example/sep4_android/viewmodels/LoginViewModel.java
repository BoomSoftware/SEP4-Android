package com.example.sep4_android.viewmodels;
import androidx.lifecycle.ViewModel;

import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.repositories.UserRepository;

public class LoginViewModel extends ViewModel {
    private UserRepository userRepository;

    public LoginViewModel(){
        userRepository = UserRepository.getInstance();
    }

    public boolean searchForUser(String userUID){
        return userRepository.searchForUser(userUID);
    }

    public boolean createNewUser(Gardener gardener){
        return userRepository.createUser(gardener);
    }
}
