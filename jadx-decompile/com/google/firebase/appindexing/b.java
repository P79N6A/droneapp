package com.google.firebase.appindexing;

import com.google.android.gms.g.f;
import com.google.firebase.appindexing.internal.c;
import java.lang.ref.WeakReference;

public abstract class b {
    public static final String a = "com.google.firebase.appindexing.UPDATE_INDEX";
    public static final String b = "FirebaseAppIndex";
    private static WeakReference<b> c;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            bVar = c == null ? null : (b) c.get();
            if (bVar == null) {
                bVar = new c(com.google.firebase.b.d().a());
                c = new WeakReference(bVar);
            }
        }
        return bVar;
    }

    public abstract f<Void> a(g... gVarArr);

    public abstract f<Void> a(String... strArr);

    public abstract f<Void> b();
}
