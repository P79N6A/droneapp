package com.google.android.gms.e;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.anm;
import com.google.android.gms.internal.ann;

public final class a {
    public static final g<ann> a = new g();
    static final b<ann, com.google.android.gms.common.api.a.a.b> b = new b<ann, com.google.android.gms.common.api.a.a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public ann a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new ann(context, looper, sVar, bVar2, cVar);
        }
    };
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.a.b> c = new com.google.android.gms.common.api.a("Panorama.API", b, a);
    public static final b d = new anm();

    private a() {
    }
}
