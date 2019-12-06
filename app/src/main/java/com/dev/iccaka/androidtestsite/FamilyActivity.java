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

        this.setStringArrayDefault(R.array.familyArrayDefault);
        this.setStringArrayTranslated(R.array.familyArrayTranslated);
        this.putWordsIntoList();

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainListView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainListView = findViewById(R.id.familyActivityMainListView);
    }
}
