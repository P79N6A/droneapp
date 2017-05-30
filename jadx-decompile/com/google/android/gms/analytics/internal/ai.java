package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

class ai implements e {
    private int a = 2;
    private boolean b;

    ai() {
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
        if (!this.b) {
            String str = (String) ao.c.a();
            Log.i((String) ao.c.a(), new StringBuilder(String.valueOf(str).length() + 91).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(str).append(" DEBUG").toString());
            this.b = true;
        }
    }

    public void a(Exception exception) {
    }

    public void a(String str) {
    }

    public void b(String str) {
    }

    public void c(String str) {
    }

    public void d(String str) {
    }
}
