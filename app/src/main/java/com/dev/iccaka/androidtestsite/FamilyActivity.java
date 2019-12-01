package com.dev.iccaka.androidtestsite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FamilyActivity extends AppCompatActivity implements SetViews{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }

    @Override
    public void setViews() {

    }
}
