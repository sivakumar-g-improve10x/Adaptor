package com.improve10x.adaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class LuckyNumberActivity extends AppCompatActivity {
    public String [] numbers = { "select","1" ,"2", "3", "4", "5", "6" ,"7" ,"8", "9", "10"};
    Spinner spinnerSp;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        initView();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {

        spinnerSp.setAdapter(adapter);
    }

    private void setupAdapter() {
   adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,numbers);
    }

    private void initView() {
        spinnerSp = findViewById(R.id.spinner_sp);
    }
}