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
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an ArrayList<Word> of colors
        ArrayList<Word> colorsList = new ArrayList<Word>();

        colorsList.add(new Word("Red","Rouz", R.drawable.color_red));
        colorsList.add(new Word("Blue","Ble",R.drawable.color_white));
        colorsList.add(new Word("Yellow","Zonn", R.drawable.color_mustard_yellow));
        colorsList.add(new Word("Green","Ver", R.drawable.color_green));
        colorsList.add(new Word("Orange","Zoranz", R.drawable.color_white));
        colorsList.add(new Word("Purple","Mauv", R.drawable.color_white));

        colorsList.add(new Word("White","Blan", R.drawable.color_white));
        colorsList.add(new Word("Black","Noir", R.drawable.color_black));
        colorsList.add(new Word("Brown","Maron", R.drawable.color_brown));
        colorsList.add(new Word("Grey","Gri", R.drawable.color_gray));

        colorsList.add(new Word("Beige","Beiz", R.drawable.color_white));
        colorsList.add(new Word("Turquoise","Tirkwaz", R.drawable.color_white));
        colorsList.add(new Word("Creme","Crem", R.drawable.color_white));
        colorsList.add(new Word("Fussia","Fisia", R.drawable.color_white));
        colorsList.add(new Word("Gold","Lor", R.drawable.color_white));
        colorsList.add(new Word("Silver","Larzan", R.drawable.color_white));
        colorsList.add(new Word("Bronze","Bronz", R.drawable.color_white));
        colorsList.add(new Word("Ivory","Ivoir", R.drawable.color_white));


        //pass the colorsList to an WordAdapter object
        WordAdapter adapter = new WordAdapter(this, colorsList, R.color.category_colors);

        //get a reference to the ListView and attach the adapter to the ListView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);







    }
}
