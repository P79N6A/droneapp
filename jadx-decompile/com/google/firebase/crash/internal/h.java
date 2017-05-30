package com.google.firebase.crash.internal;

import android.util.Log;
import com.google.firebase.crash.FirebaseCrash;
import java.lang.Thread.UncaughtExceptionHandler;

public class h implements UncaughtExceptionHandler {
    private final FirebaseCrash a;
    private final UncaughtExceptionHandler b;

    public h(UncaughtExceptionHandler uncaughtExceptionHandler, FirebaseCrash firebaseCrash) {
        this.a = firebaseCrash;
        this.b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Log.e("UncaughtException", "", th);
        try {
            this.a.c(th);
        } catch (b e) {
            try {
                Log.v("UncaughtException", e.getMessage());
            } catch (Throwable e2) {
                Log.e("UncaughtException", "Ouch!  My own exception handler threw an exception.", e2);
            }
        }
        if (this.b != null) {
            this.b.uncaughtException(thread, th);
        }
    }
}
