package com.google.firebase.appindexing;

import com.google.firebase.appindexing.internal.e;
import com.google.firebase.b;
import java.lang.ref.WeakReference;

public abstract class f {
    public static final String a = "FirebaseUserActions";
    private static WeakReference<f> b;

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            fVar = b == null ? null : (f) b.get();
            if (fVar == null) {
                fVar = new e(b.d().a());
                b = new WeakReference(fVar);
            }
        }
        return fVar;
    }

    public abstract com.google.android.gms.g.f<Void> a(a aVar);

    public abstract com.google.android.gms.g.f<Void> b(a aVar);
}
