package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.aml;
import java.util.concurrent.Callable;

public class b {
    private static SharedPreferences a = null;

    class AnonymousClass1 implements Callable<SharedPreferences> {
        final /* synthetic */ Context a;

        AnonymousClass1(Context context) {
            this.a = context;
        }

        public SharedPreferences a() {
            return this.a.getSharedPreferences("google_sdk_flags", 1);
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) aml.a(new AnonymousClass1(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
