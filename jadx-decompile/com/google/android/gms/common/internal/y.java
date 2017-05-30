package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class y {
    private static final Object a = new Object();
    private static y b;

    public static y a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new z(context.getApplicationContext());
            }
        }
        return b;
    }

    public abstract boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract boolean a(String str, String str2, ServiceConnection serviceConnection, String str3);

    public abstract void b(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract void b(String str, String str2, ServiceConnection serviceConnection, String str3);
}
