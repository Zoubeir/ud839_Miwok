package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Custom constructor
     * The context is used to inflate the layout file, and the list is the data source
     * @param context The current context. Used to inflate the layout file.
     * @param wordList A list of Word objects to display in a list
     */
    public WordAdapter( Context context, ArrayList<Word> wordList) {
        //the adapter is not going to use the second argument because the second argument is used
        //when the ArrayAdapter is poupulating a single TextView
        //Here in our custome Adapter we have 2 TextViews.
        //so, the second argument can be any value, here we use 0 for the layout resource ID.
        //because we don't need to rely on the superclass array adapter inflating or creating a
        //list item view for us.  Instead our GetView method will manually inflate the layout from
        //the layout resource ID ourselves.
        super(context, 0, wordList);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The AdapterView position that is requesting a view
     * @param convertView The recycled view to populate
     * @param parent The parent ViewGroup that is used for inflation
     * @return The View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView; //to make it clear what type of view we're working with

        //null means there is no view we can re-use, e.g. when you first open the activity
        //and creating items in the list for the first time to fill up the screen.
        //once screen is filled up then there's likely that there will be a valid view we can re use
        //
        //null means there's no view to reuse, we'll need to inflate one from the list_item.xml
        //layout from scratch.  we use the LayoutInflator from Android and call the inflate method,
        //passing in the layout resource ID, the parent view (which is the list view) and false
        //here means we don't want to attach the list item view to the parent list view yet.
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView =  listItemView.findViewById(R.id.creole_word);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getCreoleTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = listItemView.findViewById(R.id.english_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getDefaultTranslation());


        //Return the whole list item layout (containing 2 views) so that it can be shown in the
        //ListView
        return listItemView;
    }
}
