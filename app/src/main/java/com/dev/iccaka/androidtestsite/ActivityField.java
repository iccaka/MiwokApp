package com.dev.iccaka.androidtestsite;

import android.view.View;
import android.widget.ImageView;

public interface ActivityField {

    void setDictionary(Dictionary dictionary);

    void setWordImage(ImageView wordImage);

    Dictionary getDictionary();

    View getWordImage();
}
