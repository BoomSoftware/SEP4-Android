package com.example.sep4_android.views.login;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.sep4_android.R;

public class SignUpFragment extends Fragment {

    EditText editTextUsername;
    EditText editTextPassword;
    EditText editTextPassword2;
    EditText editTextName;

    Button button;

    RadioButton radioButton;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        prepareUI();
        prepareOnClickEvents();
        return view;
    }

    private void prepareUI() {

        editTextUsername = view.findViewById(R.id.input_register_username);
        editTextPassword = view.findViewById(R.id.input_register_password);
        editTextPassword2 = view.findViewById(R.id.input_register_password2);
        editTextName = view.findViewById(R.id.input_register_name);

        button = view.findViewById(R.id.button_login1);
        button = view.findViewById(R.id.button_sign_up_next);
        button = view.findViewById(R.id.button_sign_up);

        radioButton = view.findViewById(R.id.radio_female);
        radioButton = view.findViewById(R.id.radio_male);
    }

    private void prepareOnClickEvents() {

        button.setOnClickListener(v -> {

        });
    }

}