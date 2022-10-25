package com.example.lab6;



import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.collection.ArraySet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

public class CatImages<NameValuePair, TAG_PROFILE_IMG> extends AsyncTask<String, Integer, String> {


    private static final String TAG= "";
    private static final String TAG_PROFILE_IMG="";

    @Override
    protected String doInBackground(String... strings) {
        List<CatImages> params = new ArrayList<CatImages>();
        String url="https://cataas.com/cat?json=true ";

        Object userFunctions = new Object();
        JSONObject json = null;
        try {
            userFunctions.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e("Data", json.toString());

        // Check your log cat for JSON reponse
        Log.d("Inbox JSON: ", json.toString());

        try {
            JSONArray data = json.getJSONArray(TAG);
            Log.d("inbox array: ", data.toString());
            // looping through All messages
            for (int i = 0; i < data.length(); i++) {
                JSONObject c = data.getJSONObject(i);

                // Storing each json item in variable
                String profile_img = c.getString(TAG_PROFILE_IMG);

                // creating new HashMap
                HashMap<String, String> map = new HashMap<String, String>();

                // adding each child node to HashMap key => value
                map.put(TAG_PROFILE_IMG, profile_img);

                // adding HashList to ArrayList
                ArraySet<HashMap<String, String>> inboxList = null;
                inboxList.add(map);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;

    }
}