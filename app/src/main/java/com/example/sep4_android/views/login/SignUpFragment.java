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

    Button buttonNext;
    Button buttonSignUp;

    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    RadioButton radioButtonNotSpecified;
    RadioButton radioButtonOwnerYes;
    RadioButton radioButtonOwnerNo;

    View view;
    View view2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up2, container, false);
        view2 = inflater.inflate(R.layout.fragment_sign_up2, container, false);
        prepareUI();
        prepareOnClickEvents();
        return view;
    }

    private void prepareUI() {

        editTextUsername = view.findViewById(R.id.input_register_username);
        editTextPassword = view.findViewById(R.id.input_register_password);
        editTextPassword2 = view.findViewById(R.id.input_register_password2);
        editTextName = view2.findViewById(R.id.input_register_name);

        buttonNext = view.findViewById(R.id.button_sign_up_next);
        buttonSignUp = view2.findViewById(R.id.button_sign_up);

        radioButtonMale = view2.findViewById(R.id.radio_female);
        radioButtonFemale = view2.findViewById(R.id.radio_male);
        radioButtonNotSpecified = view2.findViewById(R.id.radio_not_specified);
        radioButtonOwnerYes = view2.findViewById(R.id.radio_owner_yes);
        radioButtonOwnerNo = view2.findViewById(R.id.radio_owner_no);
    }

    private void prepareOnClickEvents() {

        buttonNext.setOnClickListener(v -> {

        });

        buttonSignUp.setOnClickListener(v -> {

        });
    }

}