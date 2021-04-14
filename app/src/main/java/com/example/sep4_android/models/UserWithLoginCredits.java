package com.example.sep4_android.models;

public class UserWithLoginCredits {
    private User user;
    private LoginCredits loginCredits;

    public UserWithLoginCredits(User user, LoginCredits loginCredits) {
        this.user = user;
        this.loginCredits = loginCredits;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LoginCredits getLoginCredits() {
        return loginCredits;
    }

    public void setLoginCredits(LoginCredits loginCredits) {
        this.loginCredits = loginCredits;
    }
}
