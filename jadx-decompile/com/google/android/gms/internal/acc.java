package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.util.Map;

@aaa
public class acc {
    public static final a<Void> a = new 1();
    private static ace b;
    private static final Object c = new Object();

    public acc(Context context) {
        a(context);
    }

    private static ace a(Context context) {
        ace com_google_android_gms_internal_ace;
        synchronized (c) {
            if (b == null) {
                b = bd.a(context.getApplicationContext());
            }
            com_google_android_gms_internal_ace = b;
        }
        return com_google_android_gms_internal_ace;
    }

    public aco<String> a(int i, String str, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        Object cVar = new c(this, null);
        b.a(new 3(this, i, str, cVar, new 2(this, str, cVar), bArr, map));
        return cVar;
    }

    public <T> aco<T> a(String str, a<T> aVar) {
        Object cVar = new c(this, null);
        b.a(new b(str, aVar, cVar));
        return cVar;
    }

    public aco<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
