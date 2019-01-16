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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an ArrayList<Word> of colors
        ArrayList<Word> phrasesList = new ArrayList<Word>();

        phrasesList.add(new Word("Whatsup?","Siloy la?"));
        phrasesList.add(new Word("What's your name?","Kuma to apeler?"));
        phrasesList.add(new Word("My name is ... ","Mo apel ... "));

        phrasesList.add(new Word("Which bus to take to go to ... ?","Ki bis pou pran pou al ... ?"));
        phrasesList.add(new Word("How much is this?","Comien sa?"));

        phrasesList.add(new Word("Please help!","Sil vou plai aid moi!"));
        phrasesList.add(new Word("How are you?","Ki manyer?"));
        phrasesList.add(new Word("Am very well, thank you!","Mo bien, mersi!"));

        phrasesList.add(new Word("Where do you live?","Kot to habiter?"));
        phrasesList.add(new Word("I live in Port-Louis.","Mo habit Porlwi."));




        //pass the colorsList to an WordAdapter object
        WordAdapter adapter = new WordAdapter(this, phrasesList, R.color.category_phrases);

        //get a reference to the ListView and attach the adapter to the ListView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
