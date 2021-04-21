package com.example.sep4_android.views.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sep4_android.MainAppActivity;
import com.example.sep4_android.R;
import com.example.sep4_android.models.Gardener;
import com.example.sep4_android.viewmodels.LoginViewModel;
import com.google.firebase.auth.FirebaseAuth;

import es.dmoral.toasty.Toasty;

public class SignUpFragment extends Fragment {
    private View view;
    private LoginViewModel loginViewModel;

    private FirebaseAuth mAuth;

    private Button buttonGardener;
    private Button buttonAssistant;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        mAuth = FirebaseAuth.getInstance();
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        prepareUI();
        prepareOnClickEvents();
        return view;
    }

    private void prepareUI() {
        buttonGardener = view.findViewById(R.id.button_sign_up_gardener);
        buttonAssistant = view.findViewById(R.id.button_sign_up_assistant);
    }

    private void prepareOnClickEvents() {
        buttonGardener.setOnClickListener(v -> {
            if(loginViewModel.createNewUser(new Gardener(mAuth.getCurrentUser().getDisplayName(), mAuth.getCurrentUser().getUid(), true))){
                Intent intent = new Intent(getContext(), MainAppActivity.class);
                startActivity(intent);
                return;
            }
            Toasty.error(getContext(), getContext().getString(R.string.server_error), Toasty.LENGTH_SHORT).show();
        });
        buttonAssistant.setOnClickListener(v -> {
            if(loginViewModel.createNewUser(new Gardener(mAuth.getCurrentUser().getDisplayName(), mAuth.getCurrentUser().getUid(), false))){
                Intent intent = new Intent(getContext(), MainAppActivity.class);
                startActivity(intent);
                return;
            }
            Toasty.error(getContext(), getContext().getString(R.string.server_error), Toasty.LENGTH_SHORT).show();
        });
    }

}