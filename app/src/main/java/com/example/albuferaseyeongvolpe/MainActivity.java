package com.example.albuferaseyeongvolpe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchCuisList_onClick(View v) {
        Intent intent = new Intent(this, CuisineListActivity.class);
        startActivity(intent);
    }
}