package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.category_places);

        setContentView(R.layout.word_list);




        //ArrayList to hold the name of the districts in mauritius
        ArrayList<Word> districtList = new ArrayList<Word>();
        districtList.add(new Word("Port Louis","Porlwi"));
        districtList.add(new Word("Pamplemouss", "Pamplemous"));
        districtList.add(new Word("Rivière du Rempart","Rivier di Rampar"));
        districtList.add(new Word("Moka", "Moka"));
        districtList.add(new Word("Flacq", "Flak"));
        districtList.add(new Word("Grand Port","Gran Por"));
        districtList.add(new Word("Savanne", "Savan"));
        districtList.add(new Word("Black River", "Rivier Noir"));
        districtList.add(new Word("Plaines Wilhems","Plaine Wiliem" ));




        /* log that districts are correctly being added
        for (int i=0;i<districtList.size();i++){
            Log.v("PlacesActivity " ,"district ["+i+"] is " + districtList.get(i));
        }
        */

        WordAdapter adapter = new WordAdapter(this, districtList,R.color.category_places);

        //get a reference to the ListView and attach the adapter to the ListView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);











    }


}
