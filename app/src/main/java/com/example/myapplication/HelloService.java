package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

// SERVICES
public class HelloService extends Service {
    /** indicates how to behave if the service is killed */
    int mStartMode;

    /** interface for clients that bind */
    IBinder mBinder;

    /** indicates whether onRebind should be used */
    boolean mAllowRebind;

    /** Called when service is being created */
    @Override
    public void onCreate() {}

    /** Service is starting due to call to startService() */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return mStartMode;
    }

    /** Client is binding to service with bindService() */
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    /** Called when all clients have unbound with unbindService() */
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    /** Called when client is binding to service with bindService() [2+] */
    public void onRebind(Intent intent) {}

    /** Called when service is no longer being used and is being destroyed */
    @Override
    public void onDestroy() {}
}
