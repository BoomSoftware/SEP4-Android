package com.example.sep4_android.views.mainapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.sep4_android.R;
import com.example.sep4_android.viewmodels.AddNewGardenViewModel;

public class AddGardenFragment extends Fragment {
    private AddNewGardenViewModel viewModel;
    private View view;
    private EditText name;
    private EditText landArea;
    private EditText city;
    private EditText street;
    private EditText streetNumber;
    private Button addGardenBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewModel = new ViewModelProvider(this).get(AddNewGardenViewModel.class);
        view =  inflater.inflate(R.layout.fragment_add_garden, container, false);
        prepareUI();
        prepareOnClickEvents();
        return view;
    }


    private void prepareUI(){
        name = view.findViewById(R.id.input_garden_name);
        landArea = view.findViewById(R.id.input_land_area);
        city = view.findViewById(R.id.input_city);
        street = view.findViewById(R.id.input_street);
        streetNumber = view.findViewById(R.id.input_street_number);
    }

    private void prepareOnClickEvents(){

    }
}