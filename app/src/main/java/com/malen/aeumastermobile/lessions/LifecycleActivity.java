package com.malen.aeumastermobile.lessions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.malen.aeumastermobile.R;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        loggers.print("On Create");
    }
    @Override
    protected void onStart() {
        super.onStart();
        loggers.print("On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        loggers.print("On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        loggers.print("on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        loggers.print("On Stop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        loggers.print("On Destroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        loggers.print("On Restart");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", "value");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
       // String value = savedInstanceState.getString("key");
    }
}