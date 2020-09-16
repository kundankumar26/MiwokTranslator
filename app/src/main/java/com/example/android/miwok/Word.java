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

    //Declare R.drawable.id variable
    private int mAudioResourceId;

    //Declare 2 argument Constructors
    Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    //Declare 3 arguments constructrs
    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    //Get Method for mImageResourceId
    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
