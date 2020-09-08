package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    //Declare the mBackgroundColor for changing bg color dynamically
    private int mBackgroundColor;

    //Default Constructors
    public WordAdapter(Context context, int resource, ArrayList<Word> words, int bgColor) {
        super(context, 0, words);
        mBackgroundColor = bgColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);
        assert currentWord != null;

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on it.
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on it.
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image_view.
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if(currentWord.hasImage()){
            // Get the default translation from the currentWord object and set this text on it.
            defaultImageView.setImageResource(currentWord.getImageResourceId());

            //RESET the image view to VISIBLE for next image
            defaultImageView.setVisibility(View.VISIBLE);
        }
        else{
            //When currentWord has no Image
            defaultImageView.setVisibility(View.GONE);
        }

        //Find the ID for the List Item
        View containerColor = listItemView.findViewById(R.id.text_container);
        //Find the Resource Color for the Background
        int bgColor = ContextCompat.getColor(getContext(), mBackgroundColor);
        //Set the Background Color for that list
        containerColor.setBackgroundColor(bgColor);

        // Return the whole list item layout (containing 2 TextViews).
        return listItemView;
    }
}
