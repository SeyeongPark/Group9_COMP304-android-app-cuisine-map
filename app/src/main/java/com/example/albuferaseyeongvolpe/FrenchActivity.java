package com.example.albuferaseyeongvolpe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FrenchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);
    }
    public void switchShowRestaurant_onClick(View v) {
        Intent intent= new Intent(this, MapsActivity.class);

        switch (v.getId()) {
            case R.id.btn_fr1:
                intent.putExtra("map_restaurant", "Le Sélect Bistro");
                intent.putExtra("latitude", 43.6438894);
                intent.putExtra("longitude", -79.4056011);
                break;
            case R.id.btn_fr2:
                intent.putExtra("map_restaurant", "Pompette");
                intent.putExtra("latitude", 43.6550376);
                intent.putExtra("longitude", -79.4226843);
                break;
            case R.id.btn_fr3:
                intent.putExtra("map_restaurant", "La Palette");
                intent.putExtra("latitude", 43.647954);
                intent.putExtra("longitude", -79.4097297);
                break;
            case R.id.btn_fr4:
                intent.putExtra("map_restaurant", "Jules Bistro");
                intent.putExtra("latitude", 43.647954);
                intent.putExtra("longitude", -79.4097297);
                break;
        }
        startActivity(intent);
        finish();
    }
}