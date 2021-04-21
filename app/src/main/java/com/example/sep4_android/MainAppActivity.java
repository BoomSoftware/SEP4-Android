package com.example.sep4_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainAppActivity extends AppCompatActivity {

    Button buttonAddGarden;
    Button buttonViewGarden;
    Button buttonSettings;

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main);

        buttonAddGarden = findViewById(R.id.button_main_add_garden);
        buttonViewGarden = findViewById(R.id.button_main_view_garden);
        buttonSettings = findViewById(R.id.button_main_settings);
    }
}
