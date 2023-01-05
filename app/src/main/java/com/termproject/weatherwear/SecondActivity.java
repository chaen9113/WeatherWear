package com.termproject.weatherwear;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView tCity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        tCity = findViewById(R.id.tCity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("city");
        //String strUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + str + "&appid=/idnum/&lang=kr";

        tCity.setText(str);
    }

}
