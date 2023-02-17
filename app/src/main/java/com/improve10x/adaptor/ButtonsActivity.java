package com.improve10x.adaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsActivity extends AppCompatActivity {
    Button luckyBtn;
    Button locationBtn;
    Button dateOfBirth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        initView();
        handleLuckyNumberBtn();
        handleLocation();
        handleDateOfBirth();
    }

    private void handleDateOfBirth() {
        dateOfBirth.setOnClickListener(v -> {
            Intent intent = new Intent (this,DateOfBirthActivity.class);
            startActivity(intent);
        });
    }

    private void handleLocation() {
        locationBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,LocationActivity.class);
            startActivity(intent);
        });
    }

    private void initView() {
        luckyBtn = findViewById(R.id.lucky_btn);
        locationBtn = findViewById(R.id.location_btn);
        dateOfBirth = findViewById(R.id.date_btn);
    }

    private void handleLuckyNumberBtn(){
        luckyBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,LuckyNumberActivity.class);
            startActivity(intent);
        });
    }
}