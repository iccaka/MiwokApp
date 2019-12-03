package com.dev.iccaka.androidtestsite;

import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public abstract class BaseActivity extends AppCompatActivity implements SetViews {

    protected GridView mainGridView;
    protected List<Dictionary> dictionaryList;
}
