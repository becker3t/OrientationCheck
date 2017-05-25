package com.example.android.orientationcheck;

import android.content.res.Configuration;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.d(TAG, "onConfigurationChanged: Landscape");
        }
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.d(TAG, "onConfigurationChanged: Portrait");
        }
    }
}
