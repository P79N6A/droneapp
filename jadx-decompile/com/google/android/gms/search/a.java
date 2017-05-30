package com.google.android.gms.search;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aoh;
import com.google.android.gms.internal.aoi;

public class a {
    public static final g<aoh> a = new g();
    public static final com.google.android.gms.common.api.a<b> b = new com.google.android.gms.common.api.a("SearchAuth.API", d, a);
    public static final b c = new aoi();
    private static final com.google.android.gms.common.api.a.b<aoh, b> d = new com.google.android.gms.common.api.a.b<aoh, b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public aoh a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new aoh(context, bVar2, cVar, sVar);
        }
    };

    public static class a {
        public static final int a = 0;
        public static final int b = 8;
        public static final int c = 10;
        public static final int d = 10000;
        public static final int e = 10001;
    }

    private a() {
    }
}
