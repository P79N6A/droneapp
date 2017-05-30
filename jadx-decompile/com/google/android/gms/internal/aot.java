package com.google.android.gms.internal;

import android.util.Log;

public class aot implements api {
    private boolean a = true;
    private int b = 5;

    public void a(String str) {
        if (a(6)) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void a(String str, Throwable th) {
        if (a(6)) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    public boolean a(int i) {
        return (this.a && Log.isLoggable("GoogleTagManager", i)) || (!this.a && this.b <= i);
    }

    public void b(String str) {
        if (a(5)) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void b(String str, Throwable th) {
        if (a(5)) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    public void c(String str) {
        if (a(4)) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void d(String str) {
        if (a(2)) {
            Log.v("GoogleTagManager", str);
        }
    }
}
