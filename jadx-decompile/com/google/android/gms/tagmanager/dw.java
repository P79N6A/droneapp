package com.google.android.gms.tagmanager;

import android.util.Log;

public class dw implements ax {
    private int a = 5;

    public void a(int i) {
        this.a = i;
    }

    public void a(String str) {
        if (this.a <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void a(String str, Throwable th) {
        if (this.a <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    public void b(String str) {
        if (this.a <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void b(String str, Throwable th) {
        if (this.a <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    public void c(String str) {
        if (this.a <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void d(String str) {
        if (this.a <= 3) {
            Log.d("GoogleTagManager", str);
        }
    }

    public void e(String str) {
        if (this.a <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }
}
