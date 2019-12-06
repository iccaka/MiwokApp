package com.dev.iccaka.androidtestsite;

import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public abstract class BaseActivity extends AppCompatActivity implements SetViews {

    protected GridView mainGridView;
    protected List<Dictionary> dictionaryList;
    protected int stringArrayDefault;
    protected int stringArrayTranslated;

    public void setStringArrayDefault(int stringArrayDefault) {
        this.stringArrayDefault = stringArrayDefault;
    }

    public void setStringArrayTranslated(int stringArrayTranslated) {
        this.stringArrayTranslated = stringArrayTranslated;
    }

    protected void putWordsIntoList(){
        String[] numbersDefault = getResources().getStringArray(this.stringArrayDefault);
        String[] numbersTranslated = getResources().getStringArray(this.stringArrayTranslated);

        for (int i = 0; i < numbersDefault.length; i++) {
            this.dictionaryList.add(new CustomDictionary(numbersDefault[i], numbersTranslated[i]));
        }
    }
}
