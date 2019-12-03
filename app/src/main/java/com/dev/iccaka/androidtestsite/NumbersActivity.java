package com.dev.iccaka.androidtestsite;

import android.os.Bundle;

import java.util.ArrayList;

public class NumbersActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        this.setViews();

        this.dictionaryList = new ArrayList<>();
        this.dictionaryList.add(new CustomDictionary("one", "lutti"));
        this.dictionaryList.add(new CustomDictionary("two", "otiiko"));
        this.dictionaryList.add(new CustomDictionary("three", "tolookosu"));
        this.dictionaryList.add(new CustomDictionary("four", "oyyisa"));
        this.dictionaryList.add(new CustomDictionary("five", "massokka"));
        this.dictionaryList.add(new CustomDictionary("six", "temmokka"));
        this.dictionaryList.add(new CustomDictionary("seven", "kenekaku"));
        this.dictionaryList.add(new CustomDictionary("eight", "kawinta"));
        this.dictionaryList.add(new CustomDictionary("nine", "wo'e"));
        this.dictionaryList.add(new CustomDictionary("ten", "na'aacha"));


        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.numbersActivityMainGridView);
    }
}
