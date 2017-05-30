package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.internal.l;

public class a {
    public static final String a = "activity_recognition";
    public static final com.google.android.gms.common.api.a<b> b = new com.google.android.gms.common.api.a("ActivityRecognition.API", e, d);
    public static final b c = new com.google.android.gms.location.internal.a();
    private static final g<l> d = new g();
    private static final com.google.android.gms.common.api.a.b<l, b> e = new com.google.android.gms.common.api.a.b<l, b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public l a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new l(context, looper, bVar2, cVar, a.a);
        }
    };

    public static abstract class a<R extends m> extends com.google.android.gms.internal.ahl.a<R, l> {
        public a(com.google.android.gms.common.api.g gVar) {
            super(a.b, gVar);
        }
    }

    private a() {
    }
}
