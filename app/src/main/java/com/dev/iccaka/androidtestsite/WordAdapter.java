package com.dev.iccaka.androidtestsite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends BaseAdapter {

    private Context context;
    private List<CustomActivityField> activityFieldList;

    public WordAdapter(Context context, List<CustomActivityField> activityFieldList) {
        this.context = context;
        this.activityFieldList = activityFieldList;
    }

    @Override
    public int getCount() {
        return this.activityFieldList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.activityFieldList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final CustomActivityField activityField = this.activityFieldList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.words_list_view, null);

            final TextView defaultWord = convertView.findViewById(R.id.defaultWord);
            final TextView translatedWord = convertView.findViewById(R.id.translatedWord);
            final ImageView wordImage = convertView.findViewById(R.id.wordImage);
            final ViewHolder viewHolder = new ViewHolder(defaultWord, translatedWord, wordImage);

            convertView.setTag(viewHolder);
        }

        final Dictionary activityFieldDictionary = activityField.getDictionary();
        final ImageView wordImage = activityField.getWordImage();
        final ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.getDefaultWord().setText(activityFieldDictionary.getDefaultWord());
        viewHolder.getTranslatedWord().setText(activityFieldDictionary.getTranslatedWord());
        viewHolder.getWordImage().setImageDrawable(activityField.getWordImage().getDrawable());
//        viewHolder.getWordImage().setImageResource(this.context.getResources().getIdentifier("numbers1", "drawable", this.context.getPackageName()));

        return convertView;
    }

    private class ViewHolder {
        private final TextView defaultWord;
        private final TextView translatedWord;
        private final ImageView wordImage;

        public ViewHolder(TextView defaultWord, TextView translatedWord, ImageView wordImage) {
            this.defaultWord = defaultWord;
            this.translatedWord = translatedWord;
            this.wordImage = wordImage;
        }

        public TextView getDefaultWord() {
            return this.defaultWord;
        }

        public TextView getTranslatedWord() {
            return this.translatedWord;
        }

        public ImageView getWordImage() {
            return this.wordImage;
        }
    }
}
