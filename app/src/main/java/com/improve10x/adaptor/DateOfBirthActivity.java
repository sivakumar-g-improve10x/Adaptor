package com.improve10x.adaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.time.Month;

public class DateOfBirthActivity extends AppCompatActivity {
    public String [] date  = {"01","02","03","04","05","06","07","08","09","10"};
    public String [] month = {"01","02","03","04","05","06","07","08","09","10"};
    public String [] year = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    Spinner dateSp;
    Spinner monthSp;
    Spinner yearSp;
    ArrayAdapter dateAdapter;
    ArrayAdapter monthAdapter;
    ArrayAdapter yearAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        initView();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        dateSp.setAdapter(dateAdapter);
        monthSp.setAdapter(monthAdapter);
        yearSp.setAdapter(yearAdapter);
    }

    private void setupAdapter() {
        dateAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,date);
        monthAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,month);
        yearAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,year);

    }

    private void initView() {
        dateSp = findViewById(R.id.date_sp);
        monthSp = findViewById(R.id.month_sp);
        yearSp = findViewById(R.id.year_sp);
    }
}