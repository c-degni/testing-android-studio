package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class MainActivity extends Activity {
    String msg = "Android: ";

    // Called when activity is first created
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"onCreate() event");
    }

    // Called when activity is about to become visible
    @Override
    public void onStart() {
        super.onStart();
        Log.d(msg,"onStart() event");
    }

    // Called when activity has become visible
    @Override
    public void onResume() {
        super.onResume();
        Log.d(msg,"onResume() event");
    }

    // Called when activity is taking focus
    @Override
    public void onPause() {
        super.onPause();
        Log.d(msg,"onPause() event");
    }

    // Called when activity is no longer visible
    @Override
    public void onStop() {
        super.onStop();
        Log.d(msg,"onStop() event");
    }

    // Called right before activity is destroyed
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg,"onDestroy() event");
    }

}