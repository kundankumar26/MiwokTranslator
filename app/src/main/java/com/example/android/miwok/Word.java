package com.example.android.miwok;

import java.util.ResourceBundle;

public class Word {
    //Declare mDefaultTranslation
    private String mDefaultTranslation;

    //Declare mMiwokTranslation variable
    private String mMiwokTranslation;

    //Declare R.drawable.id varibale
    private int mImageResourceId = NO_VISIBILITY;

    //Declare R.drawable.id varibale
    private static final int NO_VISIBILITY = -1;

    //Declare 2 argument Constructors
    Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    //Declare 3 arguments constructrs
    Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get method for mDefaultTranslation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get Method for mMiwokTranslation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Get Method for mImageResourceId
    public int getImageResourceId(){
        return mImageResourceId;
    }

    //Get Method for mImageResourceId
    public boolean hasImage(){
        return mImageResourceId != NO_VISIBILITY;
    }
}
