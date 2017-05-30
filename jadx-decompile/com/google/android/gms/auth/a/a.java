package com.google.android.gms.auth.a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aen;
import com.google.android.gms.internal.aeo;

public class a {
    public static final com.google.android.gms.common.api.a<b> a = new com.google.android.gms.common.api.a("WorkAccount.API", d, c);
    public static final b b = new aen();
    private static final g<aeo> c = new g();
    private static final com.google.android.gms.common.api.a.b<aeo, b> d = new com.google.android.gms.common.api.a.b<aeo, b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public aeo a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new aeo(context, looper, sVar, bVar2, cVar);
        }
    };

    private a() {
    }
}
