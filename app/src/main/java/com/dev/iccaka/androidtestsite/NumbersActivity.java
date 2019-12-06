package com.dev.iccaka.androidtestsite;

import android.os.Bundle;
import java.util.ArrayList;

public class NumbersActivity extends BaseActivity {

    public final int DEFAULT_STIRNG_ARRAY_DEFAULT = R.array.numbersArrayDefault;
    public final int DEFUALT_STIRNG_ARRAY_TRANSLATED = R.array.numbersArrayTranslated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        this.setViews();
        this.dictionaryList = new ArrayList<>();

        this.setStringArrayDefault(DEFAULT_STIRNG_ARRAY_DEFAULT);
        this.setStringArrayTranslated(DEFUALT_STIRNG_ARRAY_TRANSLATED);
        this.putWordsIntoList();

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.numbersActivityMainGridView);
    }
}
