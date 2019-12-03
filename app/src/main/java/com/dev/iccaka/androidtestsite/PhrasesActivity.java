package com.dev.iccaka.androidtestsite;

import android.os.Bundle;

import java.util.ArrayList;

public class PhrasesActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        this.setViews();

        this.dictionaryList = new ArrayList<>();
        this.dictionaryList.add(new CustomDictionary("Where are you going?", "minto wuksus"));
        this.dictionaryList.add(new CustomDictionary("What is your name?", "tinnә oyaase'nә"));
        this.dictionaryList.add(new CustomDictionary("My name is...", "oyaaset..."));
        this.dictionaryList.add(new CustomDictionary("How are you feeling", "michәksәs?"));
        this.dictionaryList.add(new CustomDictionary("I'm feeling good.", "kuchi achit"));
        this.dictionaryList.add(new CustomDictionary("Are you coming?", "әәnәs'aa?"));
        this.dictionaryList.add(new CustomDictionary("Yes, I'm coming.", "hәә’ әәnәm"));
        this.dictionaryList.add(new CustomDictionary("I'm coming", "әәnәm"));
        this.dictionaryList.add(new CustomDictionary("Let's go.", "yoowutis"));
        this.dictionaryList.add(new CustomDictionary("Come here.", "әnni'nem'aacha"));

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.phrasesActivityMainGridView);
    }
}
