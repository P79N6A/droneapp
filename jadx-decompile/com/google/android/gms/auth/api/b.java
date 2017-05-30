package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aev;

public final class b {
    public static final g<aev> a = new g();
    public static final a<c> b = new a("Auth.PROXY_API", c, a);
    private static final com.google.android.gms.common.api.a.b<aev, c> c = new com.google.android.gms.common.api.a.b<aev, c>() {
        public aev a(Context context, Looper looper, s sVar, c cVar, com.google.android.gms.common.api.g.b bVar, c cVar2) {
            return new aev(context, looper, sVar, cVar, bVar, cVar2);
        }
    };
}
