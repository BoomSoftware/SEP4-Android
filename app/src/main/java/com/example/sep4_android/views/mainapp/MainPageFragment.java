package com.example.sep4_android.views.mainapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sep4_android.R;

public class MainPageFragment extends Fragment {

    Button buttonAddGarden;
    Button buttonViewGarden;
    Button buttonSettings;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main_page, container, false);
        prepareUI();
        return view;
    }

    private void prepareUI() {

        buttonAddGarden = view.findViewById(R.id.button_main_add_garden);
        buttonViewGarden = view.findViewById(R.id.button_main_view_garden);
        buttonSettings = view.findViewById(R.id.button_main_settings);
    }

}