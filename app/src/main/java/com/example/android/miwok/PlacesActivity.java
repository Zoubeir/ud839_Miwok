package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        //ArrayList to hold the name of the districts in mauritius
        ArrayList<String> districtList = new ArrayList<String>();
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");


        /* log that districts are correctly being added
        for (int i=0;i<districtList.size();i++){
            Log.v("PlacesActivity " ,"district ["+i+"] is " + districtList.get(i));
        }
        */

        //get a ref to the root LinearLayout of PlacesActivity
        LinearLayout PlacesRootView = findViewById(R.id.PlacesRootView);

        for (int i=0;i<districtList.size();i++){
            //create a TextView to add to the PlacesRootView
            TextView tv = new TextView(this); //this refers to the current context, i.e. PlacesActivity class

            //set the text of the TextView to be that from the ith elem of the districtList
            tv.setText(districtList.get(i));

            //dynamically add the TextView to the PlacesRootView
            PlacesRootView.addView(tv);
        }












    }


}
