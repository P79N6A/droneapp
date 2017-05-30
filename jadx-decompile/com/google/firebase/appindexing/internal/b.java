package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;

public class b extends w<f> {
    static final a<com.google.android.gms.common.api.a.a.b> a = new a("AppIndexing.API", f, e);
    private static final g<b> e = new g();
    private static final com.google.android.gms.common.api.a.b<b, com.google.android.gms.common.api.a.a.b> f = new com.google.android.gms.common.api.a.b<b, com.google.android.gms.common.api.a.a.b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (com.google.android.gms.common.api.a.a.b) obj, bVar, cVar);
        }

        public b a(Context context, Looper looper, s sVar, com.google.android.gms.common.api.a.a.b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new b(context, looper, sVar, bVar2, cVar);
        }
    };

    public b(Context context, Looper looper, s sVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
        super(context, looper, 113, sVar, bVar, cVar);
    }

    protected f a(IBinder iBinder) {
        return f.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }
}
