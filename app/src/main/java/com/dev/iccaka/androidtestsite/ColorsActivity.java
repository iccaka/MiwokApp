package com.dev.iccaka.androidtestsite;

import android.os.Bundle;

import java.util.ArrayList;


public class ColorsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        this.setViews();

        this.dictionaryList = new ArrayList<>();
        this.dictionaryList.add(new CustomDictionary("red", "weṭeṭṭi"));
        this.dictionaryList.add(new CustomDictionary("green", "chokokki"));
        this.dictionaryList.add(new CustomDictionary("brown", "ṭakaakki"));
        this.dictionaryList.add(new CustomDictionary("gray", "ṭopoppi"));
        this.dictionaryList.add(new CustomDictionary("black", "kululli"));
        this.dictionaryList.add(new CustomDictionary("white", "kelelli"));
        this.dictionaryList.add(new CustomDictionary("dusty yellow", "ṭopiisә"));
        this.dictionaryList.add(new CustomDictionary("mustard yellow", "chiwiiṭә"));

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.colorActivityMainGridView);
    }
}
