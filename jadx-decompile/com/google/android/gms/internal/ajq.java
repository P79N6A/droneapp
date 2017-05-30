package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.config.internal.e;

public final class ajq {
    public static final g<e> a = new g();
    static final b<e, a.b> b = new b<e, a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (a.b) obj, bVar, cVar);
        }

        public e a(Context context, Looper looper, s sVar, a.b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new e(context, looper, sVar, bVar2, cVar);
        }
    };
    public static final com.google.android.gms.common.api.a<a.b> c = new com.google.android.gms.common.api.a("Config.API", b, a);
    public static final ajr d = new com.google.android.gms.config.internal.c();
}
