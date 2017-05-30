package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.firebase.crash.internal.f;
import com.google.firebase.crash.internal.g;
import com.google.firebase.crash.internal.g.a;

public final class FirebaseCrashSenderService extends IntentService {
    public static final String a = String.valueOf(d).concat(".SEND");
    public static final String b = String.valueOf(d).concat(".API_KEY");
    private static final String c = FirebaseCrashSenderService.class.getSimpleName();
    private static final String d = FirebaseCrashSenderService.class.getName();
    private f e;

    @Keep
    public FirebaseCrashSenderService() {
        super(FirebaseCrashSenderService.class.getSimpleName());
    }

    public void onCreate() {
        Throwable e;
        super.onCreate();
        try {
            g.a().a(getApplicationContext());
            this.e = g.a().d();
            this.e.a(com.google.android.gms.c.f.a((Object) this));
            return;
        } catch (RemoteException e2) {
            e = e2;
        } catch (a e3) {
            e = e3;
        }
        Log.e(c, "Unexpected failure remoting onCreate()", e);
        this.e = null;
    }

    public void onDestroy() {
        if (this.e != null) {
            try {
                this.e.a();
            } catch (Throwable e) {
                Log.e(c, "Unexpected failure remoting onDestroy()", e);
            }
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        if (this.e != null) {
            try {
                this.e.b(com.google.android.gms.c.f.a((Object) intent));
            } catch (Throwable e) {
                Log.e(c, "Unexpected failure remoting onRunTask()", e);
            }
        }
    }
}
