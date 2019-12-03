package com.dev.iccaka.androidtestsite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends BaseAdapter {

    private Context context;
    private List<Dictionary> dictionaryList;

    public WordAdapter(Context context, List<Dictionary> dictionaryList) {
        this.context = context;
        this.dictionaryList = dictionaryList;
    }

    @Override
    public int getCount() {
        return this.dictionaryList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.dictionaryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Dictionary dictionary = this.dictionaryList.get(position);

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(R.layout.linear_layout_numbers, null);
        }

        final TextView defaultWordTextView = convertView.findViewById(R.id.defaultWord);
        final TextView translatedWordTextView = convertView.findViewById(R.id.translatedWord);

        defaultWordTextView.setText(dictionary.getDefaultWord());
        translatedWordTextView.setText(dictionary.getTranslatedWord());

        return convertView;
    }
}
