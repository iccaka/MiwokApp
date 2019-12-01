package com.dev.iccaka.androidtestsite;

public class Word {

    private String englishWord;
    private String miwokWord;

    public Word(String englishWord, String miwokWord) {
        this.setEnglishWord(englishWord);
        this.setMiwokWord(miwokWord);
    }

    public String getEnglishWord() {
        return this.englishWord;
    }

    public String getMiwokWord() {
        return this.miwokWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }
}
