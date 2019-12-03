package com.dev.iccaka.androidtestsite;

public abstract class BaseDictionary implements Dictionary {

    protected String defaultWord;
    protected String translatedWord;

    public BaseDictionary(String defaultWord, String translatedWord) {
        this.setDefaultWord(defaultWord);
        this.setTranslatedWord(translatedWord);
    }

    @Override
    public String getDefaultWord() {
        return this.defaultWord;
    }

    private void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    @Override
    public String getTranslatedWord() {
        return this.translatedWord;
    }

    private void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }
}
