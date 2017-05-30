package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class TagManagerService extends Service {
    @WorkerThread
    @KeepName
    public static void initialize(Context context) {
        l.b(context);
    }

    public IBinder onBind(Intent intent) {
        initialize(this);
        return l.a(this);
    }
}
