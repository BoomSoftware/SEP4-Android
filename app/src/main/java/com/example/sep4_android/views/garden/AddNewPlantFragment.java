package com.example.sep4_android.views.garden;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sep4_android.R;

public class AddNewPlantFragment extends Fragment {
  private EditText name;
  private EditText landArea;
  private EditText city;
  private EditText street;
  private EditText streetNumber;
  private Button addGardenBtn;
  private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_garden, container, false);
        prepareUI();
    }

    private void prepareUI() {
        name = view.findViewById(R.id.input_garden_name);
        landArea =view.findViewById(R.id.input_land_area);
        city = view.findViewById(R.id.input_city);
        street = view.findViewById(R.id.input_street);
        streetNumber = view.findViewById(R.id.input_street_number);
    }
    
    }
}