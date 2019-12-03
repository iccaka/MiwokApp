package com.dev.iccaka.androidtestsite;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity implements SetViews {

    private View mainGridView;
    private List<Dictionary> dictionaryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        this.setViews();

        this.dictionaryList = new ArrayList<>();
        this.dictionaryList.add(new CustomDictionary("one", "edno"));
        this.dictionaryList.add(new CustomDictionary("two", "dve"));
        this.dictionaryList.add(new CustomDictionary("three", "tri"));

        WordAdapter wordAdapter = new WordAdapter(this, this.dictionaryList);
        GridView gridView = findViewById(R.id.mainGridView);
        gridView.setAdapter(wordAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.mainGridView);
    }
}
