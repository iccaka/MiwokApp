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

        String[] numbersDefault = getResources().getStringArray(R.array.numbersArrayDefault);
        String[] numbersTranslated = getResources().getStringArray(R.array.numbersArrayTranslated);

        for (int i = 0; i < numbersDefault.length; i++) {
            this.dictionaryList.add(new CustomDictionary(numbersDefault[i], numbersTranslated[i]));
        }

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        this.mainGridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.numbersActivityMainGridView);
    }
}
