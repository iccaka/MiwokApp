package com.dev.iccaka.androidtestsite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

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

        Dictionary first = new CustomDictionary("one", "edno");
        Dictionary second = new CustomDictionary("two", "dve");
        Dictionary third = new CustomDictionary("three", "tri");

        this.dictionaryList.add(first);
        this.dictionaryList.add(second);
        this.dictionaryList.add(third);

        CustomAdapter customAdapter = new CustomAdapter(this, this.dictionaryList);

        GridView gridView = findViewById(R.id.mainGridView);
        gridView.setAdapter(customAdapter);
    }

    @Override
    public void setViews() {
        this.mainGridView = findViewById(R.id.mainGridView);
    }
}
