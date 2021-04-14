package com.example.sep4_android.views.login;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sep4_android.R;

public class SignInFragment extends Fragment {

    private View view;

    private EditText username;
    private Button login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_sign_in, container, false);
        prepareUI();
        prepareUIActions();
        return view;
    }

    private void prepareUI(){
        username = view.findViewById(R.id.input_login_username);
        login = view.findViewById(R.id.button_login);
    }

    private void prepareUIActions(){
        login.setOnClickListener(v -> {
            Toast.makeText(view.getContext(), username.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

}