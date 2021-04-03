package com.example.albuferaseyeongvolpe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CuisineListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisinelist);
    }

    public void switchActivities_onClick(View v){
        Intent switchActivityIntent;
        switch (v.getId()){
            case R.id.switchToChineseActivity:
                switchActivityIntent = new Intent(this, ChineseActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.switchToFrenchActivity:
                switchActivityIntent = new Intent(this, FrenchActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.switchToGreekActivity:
                switchActivityIntent = new Intent(this, GreekActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.switchToItalianActivity:
                switchActivityIntent = new Intent(this, ItalianActivity.class);
                startActivity(switchActivityIntent);
                break;
            case R.id.switchToJapaneseActivity:
                switchActivityIntent = new Intent(this, JapaneseActivity.class);
                startActivity(switchActivityIntent);
                break;

        }
    }
}
