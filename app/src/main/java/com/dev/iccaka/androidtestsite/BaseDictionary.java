package com.dev.iccaka.androidtestsite;

public abstract class BaseDictionary implements Dictionary {

    protected String defaultWord;
    protected String translatedWord;
    protected String wordImageString;

    public BaseDictionary(String defaultWord, String translatedWord, String wordImageString) {
        this.setDefaultWord(defaultWord);
        this.setTranslatedWord(translatedWord);
    }

    @Override
    public String getDefaultWord() {
        return this.defaultWord;
    }

    @Override
    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    @Override
    public String getTranslatedWord() {
        return this.translatedWord;
    }

    @Override
    public void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }

    @Override
    public String getWordImageString() {
        return this.wordImageString;
    }

    @Override
    public void setWordImageString(String wordImageString) {
        this.wordImageString = wordImageString;
    }
}
