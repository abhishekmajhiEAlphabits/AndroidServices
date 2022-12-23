package com.example.androidservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;


/*
* MyService class containing the Service class lifecycle methods
* */
public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("TAG","Service stopped");
    }

    //method called when startService() function invoked from MainActivity and contains the tasks which we can perform using services
    public int onStartCommand(Intent intent, int flags, int startId) {

        //all the tasks which is to be performed in service is put here

        Log.d("TAG","Service Started");

        stopSelf(); //command to self stop service after all the tasks are done

        return super.onStartCommand(intent, flags, startId);
    }
}
