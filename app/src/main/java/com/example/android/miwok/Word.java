package com.example.android.miwok;

/**
 * {@link Word} Represents a vocabulary word that the user wants to learn.
 * It contains a default and Creole translation of that word.
 */
public class Word {
    //Default translation for the Word
    private String mDefaultTranslation;

    //Creole Translation for the Word
    private String mCreoleTranslation;

    /**
     * Construct a new Word with its default and Creole translation
     * @param defaultTranslation of Word
     * @param creoleTranslation of Word
     */
    public Word(String defaultTranslation, String creoleTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mCreoleTranslation = creoleTranslation;
    }

    /**
     * Gets the default translation value of the Word
     *
     * @return default translation of the Word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Set the default translation of the Word
     *
     * @param defaultTranslation of the Word
     */
    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    /**
     * Gets the Creole translation value of the Word
     *
     * @return Creole translation of the Word
     */
    public String getCreoleTranslation() {
        return mCreoleTranslation;
    }

    /**
     * Set the Creole translation of the Word
     *
     * @param creoleTranslation of the Word
     */
    public void setCreoleTranslation(String creoleTranslation) {
        this.mCreoleTranslation = creoleTranslation;
    }




}
