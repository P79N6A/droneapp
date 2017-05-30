package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aee;
import com.google.android.gms.internal.aeh;

public final class a {
    public static final g<aee> a = new g();
    public static final com.google.android.gms.common.api.a<b> b = new com.google.android.gms.common.api.a("AppDataSearch.LIGHTWEIGHT_API", d, a);
    public static final k c = new aeh();
    private static final com.google.android.gms.common.api.a.b<aee, b> d = new com.google.android.gms.common.api.a.b<aee, b>() {
        public aee a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new aee(context, looper, sVar, bVar2, cVar);
        }
    };
}
