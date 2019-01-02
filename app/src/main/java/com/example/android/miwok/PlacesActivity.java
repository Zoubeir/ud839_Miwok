package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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

        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
        districtList.add("Port Louis");
        districtList.add("Pamplemouss");
        districtList.add("Rivière du Rempart");
        districtList.add("Moka");
        districtList.add("Flacq");
        districtList.add("Grand Port");
        districtList.add("Savanne");
        districtList.add("Black River");
        districtList.add("Plaines Wilhems");
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




        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, districtList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);











    }


}
