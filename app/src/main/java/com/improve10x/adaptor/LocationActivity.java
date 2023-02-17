package com.improve10x.adaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LocationActivity extends AppCompatActivity {
    public String [] states = {"andhra pradesh","telangana","karnataka","arunachal pradesh","tamil nadu"};
    Spinner spinnerLocationSp;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        initView();
        setupAdapter();
        connectAdapter();
    }

    private void initView() {
        spinnerLocationSp = findViewById(R.id.spinner_location_sp);
    }

    private void connectAdapter() {
        spinnerLocationSp.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,states);
    }
}