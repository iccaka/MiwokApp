package com.dev.iccaka.androidtestsite;

import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public abstract class BaseActivity extends AppCompatActivity implements SetViews, Activity {

    protected ListView mainListView;
    protected List<CustomActivityField> dictionaryList;
    protected int stringArrayDefault;
    protected int stringArrayTranslated;
    protected String wordImage;

    @Override
    public void setStringArrayDefault(int stringArrayDefault) {
        this.stringArrayDefault = stringArrayDefault;
    }

    @Override
    public void setStringArrayTranslated(int stringArrayTranslated) {
        this.stringArrayTranslated = stringArrayTranslated;
    }

    @Override
    public void putWordsIntoList() {
        String[] numbersDefault = getResources().getStringArray(this.stringArrayDefault);
        String[] numbersTranslated = getResources().getStringArray(this.stringArrayTranslated);
//        Drawable wordImageDrawable = getResources().getDrawable(R.drawable.numbers2);
//        ImageView wordImage = new ImageView(this.getApplicationContext());
//        wordImage.setImageDrawable(wordImageDrawable);

        for (int i = 0; i < numbersDefault.length; i++) {
            ImageView imageView = new ImageView(this.getApplicationContext());
            imageView.setImageResource(
                    this.getApplicationContext().getResources().getIdentifier(
                            (this.wordImage + i + 1), "drawable", this.getApplicationContext().getPackageName()
                    )
            );
            this.dictionaryList.add(
                    new CustomActivityField(new CustomDictionary(numbersDefault[i], numbersTranslated[i]), imageView)
            );
        }
    }
}
