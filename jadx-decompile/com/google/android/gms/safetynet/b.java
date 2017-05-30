package com.google.android.gms.safetynet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.anx;
import com.google.android.gms.internal.any;
import com.google.android.gms.internal.anz;

public final class b {
    public static final g<any> a = new g();
    public static final com.google.android.gms.common.api.a.b<any, com.google.android.gms.common.api.a.a.b> b = new com.google.android.gms.common.api.a.b<any, com.google.android.gms.common.api.a.a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public any a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new any(context, looper, sVar, bVar2, cVar);
        }
    };
    public static final a<com.google.android.gms.common.api.a.a.b> c = new a("SafetyNet.API", b, a);
    public static final c d = new anx();
    public static final h e = new anz();

    private b() {
    }
}
