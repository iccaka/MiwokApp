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
            convertView = LayoutInflater.from(this.context).inflate(R.layout.words_list_view, null);

            final TextView defaultWord = convertView.findViewById(R.id.defaultWord);
            final TextView translatedWord = convertView.findViewById(R.id.translatedWord);
            final ViewHolder viewHolder = new ViewHolder(defaultWord, translatedWord);

            convertView.setTag(viewHolder);
        }

        final ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.getDefaultWord().setText(dictionary.getDefaultWord());
        viewHolder.getTranslatedWord().setText(dictionary.getTranslatedWord());

        return convertView;
    }

    private class ViewHolder {
        private final TextView defaultWord;
        private final TextView translatedWord;

        public ViewHolder(TextView defaultWord, TextView translatedWord) {
            this.defaultWord = defaultWord;
            this.translatedWord = translatedWord;
        }

        public TextView getDefaultWord() {
            return this.defaultWord;
        }

        public TextView getTranslatedWord() {
            return this.translatedWord;
        }
    }
}
