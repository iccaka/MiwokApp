package com.dev.iccaka.androidtestsite;

import android.widget.ImageView;

abstract class BaseActivityActivityField implements ActivityField {

    protected Dictionary dictionary;
    protected ImageView wordImage;

    protected BaseActivityActivityField(Dictionary dictionary, ImageView wordImage) {
        this.setDictionary(dictionary);
        this.setWordImage(wordImage);
    }

    @Override
    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void setWordImage(ImageView wordImage) {
        this.wordImage = wordImage;
    }
}
