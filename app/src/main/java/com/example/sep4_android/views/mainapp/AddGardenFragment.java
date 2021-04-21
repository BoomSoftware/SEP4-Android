package com.example.sep4_android.views.mainapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sep4_android.R;
import com.example.sep4_android.viewmodels.AddNewGardenViewModel;

public class AddGardenFragment extends Fragment {
    private AddNewGardenViewModel viewModel;
    private View view;

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

    }

    private void prepareOnClickEvents(){

    }
}