/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.category_numbers);




        setContentView(R.layout.word_list);



        //ArrayList to hold the name of the districts in mauritius
        ArrayList<Word> numbersList = new ArrayList<Word>();
        numbersList.add(new Word("One","Enn",R.drawable.number_one));
        numbersList.add(new Word("Two","de",R.drawable.number_two));
        numbersList.add(new Word("Three","trwa", R.drawable.number_three));
        numbersList.add(new Word("Four", "Kat", R.drawable.number_four));
        numbersList.add(new Word("Five", "Sink", R.drawable.number_five));
        numbersList.add(new Word("Six","Sis", R.drawable.number_six));
        numbersList.add(new Word("Seven", "Set",R.drawable.number_seven));
        numbersList.add(new Word("Eight", "Wit", R.drawable.number_eight));
        numbersList.add(new Word("Nine","Nef", R.drawable.number_nine ));
        numbersList.add(new Word("Ten","Dis", R.drawable.number_ten ));




        /* log that districts are correctly being added
        for (int i=0;i<numbersList.size();i++){
            Log.v("PlacesActivity " ,"district ["+i+"] is " + numbersList.get(i));
        }
        */

        /* create an {@link WordAdapter}, whose data source is a list item of {@link Word}s. the
        * adapter knows how to create list items for each item in the list. */
        WordAdapter adapter = new WordAdapter(this, numbersList, R.color.category_numbers);

        //get a reference to the ListView and attach the adapter to the ListView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
