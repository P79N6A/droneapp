package com.google.android.gms.contextmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.awareness.b;
import com.google.android.gms.awareness.e;
import com.google.android.gms.awareness.snapshot.internal.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.contextmanager.internal.d;

public final class c {
    public static final g<d> a = new g();
    public static final com.google.android.gms.awareness.d b = new com.google.android.gms.contextmanager.fence.internal.c();
    public static final e c = new j();
    public static final a<b> d = new a("ContextManager.API", e, a);
    private static final a.b<d, b> e = new a.b<d, b>() {
        public d a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, com.google.android.gms.common.api.g.c cVar) {
            return new d(context, looper, sVar, bVar, bVar2, cVar);
        }
    };
}
