package com.google.android.gms.internal;

import android.content.Context;

public class ajp {
    private static ajp b = new ajp();
    private ajo a = null;

    public static ajo b(Context context) {
        return b.a(context);
    }

    public synchronized ajo a(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new ajo(context);
        }
        return this.a;
    }
}
