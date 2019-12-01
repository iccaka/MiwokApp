package com.dev.iccaka.androidtestsite;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


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
