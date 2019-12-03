package com.dev.iccaka.androidtestsite;

import android.os.Bundle;


import java.util.ArrayList;

public class FamilyActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        this.setViews();

        this.dictionaryList = new ArrayList<>();
        this.dictionaryList.add(new CustomDictionary("father", "әpә"));
        this.dictionaryList.add(new CustomDictionary("mother", "әṭa"));
        this.dictionaryList.add(new CustomDictionary("son", "angsi"));
        this.dictionaryList.add(new CustomDictionary("daughter", "tune"));
        this.dictionaryList.add(new CustomDictionary("older brother", "taachi"));
        this.dictionaryList.add(new CustomDictionary("younger brother", "chalitti"));
        this.dictionaryList.add(new CustomDictionary("older sister", "teṭe"));
        this.dictionaryList.add(new CustomDictionary("younger sister", "kolliti"));
        this.dictionaryList.add(new CustomDictionary("grandmother", "ama"));
        this.dictionaryList.add(new CustomDictionary("grandfather", "paapa"));

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.colorActivityMainGridView);
    }
}
