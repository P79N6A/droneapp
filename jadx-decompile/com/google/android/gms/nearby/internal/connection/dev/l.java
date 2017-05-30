package com.google.android.gms.nearby.internal.connection.dev;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.nearby.connection.dev.d;

public final class l implements d {
    public static final g<k> a = new g();
    public static final b<k, a.b> b = new b<k, a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (a.b) obj, bVar, cVar);
        }

        public k a(Context context, Looper looper, s sVar, a.b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new k(context, looper, sVar, bVar2, cVar);
        }
    };
}
