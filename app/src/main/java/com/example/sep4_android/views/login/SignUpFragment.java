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

    Button buttonGardener;
    Button buttonAssistant;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up3, container, false);
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

        });

        buttonAssistant.setOnClickListener(v -> {

        });
    }

}