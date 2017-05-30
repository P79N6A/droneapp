package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.internal.d;
import com.google.android.gms.location.internal.f;
import com.google.android.gms.location.internal.l;
import com.google.android.gms.location.internal.q;

public class n {
    public static final com.google.android.gms.common.api.a<b> a = new com.google.android.gms.common.api.a("LocationServices.API", f, e);
    public static final e b = new d();
    public static final h c = new f();
    public static final q d = new q();
    private static final g<l> e = new g();
    private static final com.google.android.gms.common.api.a.b<l, b> f = new com.google.android.gms.common.api.a.b<l, b>() {
        public /* synthetic */ com.google.android.gms.common.api.a.f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public l a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, c cVar) {
            return new l(context, looper, bVar2, cVar, "locationServices", sVar);
        }
    };

    public static abstract class a<R extends m> extends com.google.android.gms.internal.ahl.a<R, l> {
        public a(com.google.android.gms.common.api.g gVar) {
            super(n.a, gVar);
        }
    }

    private n() {
    }

    public static l a(com.google.android.gms.common.api.g gVar) {
        boolean z = true;
        com.google.android.gms.common.internal.d.b(gVar != null, "GoogleApiClient parameter is required.");
        l lVar = (l) gVar.a(e);
        if (lVar == null) {
            z = false;
        }
        com.google.android.gms.common.internal.d.a(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return lVar;
    }
}
