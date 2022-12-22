package com.example.androidservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

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

    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("TAG","Service Started");

        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
