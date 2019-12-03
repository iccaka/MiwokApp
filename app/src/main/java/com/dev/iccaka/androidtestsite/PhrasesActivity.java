package com.dev.iccaka.androidtestsite;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class PhrasesActivity extends AppCompatActivity implements SetViews {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
    }

    @Override
    public void setViews() {

    }
}
