package com.dev.iccaka.androidtestsite;

public abstract class BaseDictionary implements Dictionary {

    protected String defaultWord;
    protected String translatedWord;

    public BaseDictionary(String defaultWord, String translatedWord) {
        this.setDefaultWord(defaultWord);
        this.setTranslatedWord(translatedWord);
    }

    private void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    private void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }

    @Override
    public String getDefaultWord() {
        return this.defaultWord;
    }

    @Override
    public String getTranslatedWord() {
        return this.translatedWord;
    }
}
