package com.google.android.gms.appinvite;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.aej;

public final class a {
    public static final g<aej> a = new g();
    public static final com.google.android.gms.common.api.a<b> b = new com.google.android.gms.common.api.a("AppInvite.API", d, a);
    public static final b c = new aei();
    private static final com.google.android.gms.common.api.a.b<aej, b> d = new com.google.android.gms.common.api.a.b<aej, b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public aej a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new aej(context, looper, bVar2, cVar, sVar);
        }
    };

    private a() {
    }
}
