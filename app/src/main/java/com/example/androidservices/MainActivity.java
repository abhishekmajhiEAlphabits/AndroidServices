package com.example.androidservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/*
* Services Demo containing start and stop service
* */
public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(getApplicationContext(),MyService.class);

    }

    //method called on StartService button click
    public void startService(View view) {
        startService(intent); //command to start service
    }
}