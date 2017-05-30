package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;

public final class ajd {
    public static final g<aji> a = new g();
    public static final a<b> b = new a("Common.API", d, a);
    public static final aje c = new ajf();
    private static final a.b<aji, b> d = new a.b<aji, b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public aji a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new aji(context, looper, sVar, bVar2, cVar);
        }
    };
}
