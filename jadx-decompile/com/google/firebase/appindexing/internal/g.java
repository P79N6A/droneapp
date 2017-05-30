package com.google.firebase.appindexing.internal;

import android.util.Log;
import com.google.firebase.appindexing.b;

public class g {
    public static int a(String str) {
        return a(3) ? Log.d(b.b, str) : 0;
    }

    private static boolean a(int i) {
        return Log.isLoggable(b.b, i) || Log.isLoggable(b.b, i);
    }
}
