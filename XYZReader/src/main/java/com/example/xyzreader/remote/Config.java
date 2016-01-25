package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class that contains the information of the URL
 * which is gonna be used to perform the request to get
 * information.
 */
public class Config {
    public static final URL BASE_URL;
    private static final String TAG = Config.class.getSimpleName();
    static {
        URL url = null;
        try {
            url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
        } catch (MalformedURLException e) {
            Log.e(TAG,"Error accessing the url",e);
        }

        BASE_URL = url;
    }
}
