package com.dev.iccaka.androidtestsite;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FamilyActivity extends AppCompatActivity implements SetViews {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }

    @Override
    public void setViews() {

    }
}
