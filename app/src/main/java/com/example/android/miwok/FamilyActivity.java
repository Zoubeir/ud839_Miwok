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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an ArrayList<Word> of colors
        ArrayList<Word> familyList = new ArrayList<Word>();

        familyList.add(new Word("Mother","Mama"));
        familyList.add(new Word("Father","Papa"));
        familyList.add(new Word("Sister","Ser"));
        familyList.add(new Word("Brother","Frer"));
        familyList.add(new Word("Daughter","Tifi"));
        familyList.add(new Word("Son","Garson"));

        familyList.add(new Word("Grand Father","Granper"));
        familyList.add(new Word("Grand Mother","Granmer"));
        familyList.add(new Word("Grand Parents","Gran Paran"));
        familyList.add(new Word("Grand Son","Ti Zanfan"));
        familyList.add(new Word("Grand Daughter","Ti Zanfan"));

        familyList.add(new Word("Husband","Misie"));
        familyList.add(new Word("Wife","Fam"));

        familyList.add(new Word("Aunt","Matant"));
        familyList.add(new Word("Uncle","Tonton"));
        familyList.add(new Word("Niece","Nies"));
        familyList.add(new Word("Nephew","Neve"));
        familyList.add(new Word("Cousin","Kouzin"));
        familyList.add(new Word("Mother-in-law","Belmer"));
        familyList.add(new Word("Father-in-law","Boper"));
        familyList.add(new Word("Sister-in-law","Belser"));
        familyList.add(new Word("Brother-in-law","Bofrer"));

        familyList.add(new Word("Woman","Fam"));
        familyList.add(new Word("Man","Zom"));


        //pass the colorsList to an WordAdapter object
        WordAdapter adapter = new WordAdapter(this, familyList,R.color.category_family);

        //get a reference to the ListView and attach the adapter to the ListView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
