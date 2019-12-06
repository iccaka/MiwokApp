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

        this.setStringArrayDefault(R.array.numbersArrayDefault);
        this.setStringArrayTranslated(R.array.numbersArrayTranslated);
        this.putWordsIntoList();

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.numbersActivityMainGridView);
    }
}
