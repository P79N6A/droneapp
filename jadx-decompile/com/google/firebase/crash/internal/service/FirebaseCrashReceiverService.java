package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.firebase.crash.internal.e;
import com.google.firebase.crash.internal.g;
import com.google.firebase.crash.internal.g.a;

public final class FirebaseCrashReceiverService extends IntentService {
    public static final String a = String.valueOf(g).concat(".SAVE");
    public static final String b = String.valueOf(g).concat(".CRASH_REPORT");
    public static final String c = String.valueOf(g).concat(".CRASH_TIME");
    public static final String d = String.valueOf(g).concat(".API_KEY");
    public static final String e = String.valueOf(g).concat(".IS_FATAL");
    private static final String f = FirebaseCrashReceiverService.class.getSimpleName();
    private static final String g = FirebaseCrashReceiverService.class.getName();
    private e h;

    @Keep
    public FirebaseCrashReceiverService() {
        super(FirebaseCrashReceiverService.class.getSimpleName());
    }

    public void onCreate() {
        Throwable e;
        super.onCreate();
        try {
            g.a().a(getApplicationContext());
            this.h = g.a().c();
            this.h.a(f.a((Object) this));
            return;
        } catch (RemoteException e2) {
            e = e2;
        } catch (a e3) {
            e = e3;
        }
        Log.e(f, "Unexpected failure remoting onCreate()", e);
        this.h = null;
    }

    public void onDestroy() {
        if (this.h != null) {
            try {
                this.h.a();
            } catch (Throwable e) {
                Log.e(f, "Unexpected failure remoting onDestroy()", e);
            }
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        if (this.h != null) {
            try {
                this.h.b(f.a((Object) intent));
            } catch (Throwable e) {
                Log.e(f, "Unexpected failure remoting onHandleIntent()", e);
            }
        }
    }
}
