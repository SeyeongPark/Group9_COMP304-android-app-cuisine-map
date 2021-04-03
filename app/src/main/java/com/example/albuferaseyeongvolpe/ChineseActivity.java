package com.example.albuferaseyeongvolpe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChineseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
    }
    public void switchShowRestaurant_onClick(View v) {
        Intent intent= new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btn_ch1:
                intent.putExtra("map_restaurant", "Lai Wah Heen");
                intent.putExtra("latitude", 43.65485);
                intent.putExtra("longitude", -79.3881855);
                break;
            case R.id.btn_ch2:
                intent.putExtra("map_restaurant", "Dumpling House");
                intent.putExtra("latitude", 43.665530);
                intent.putExtra("longitude", -79.351090);
                break;
            case R.id.btn_ch3:
                intent.putExtra("map_restaurant", "King’s Cafe");
                intent.putExtra("latitude", 43.6542372);
                intent.putExtra("longitude", -79.4042553);
                break;
            case R.id.btn_ch4:
                intent.putExtra("map_restaurant", "DaiLO");
                intent.putExtra("latitude", 43.655849);
                intent.putExtra("longitude", -79.4120664);
                break;
        }
            startActivity(intent);
            finish();
        }
}