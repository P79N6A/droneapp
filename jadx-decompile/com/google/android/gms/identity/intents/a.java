package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.amn;

public final class a {
    static final g<amn> a = new g();
    public static final com.google.android.gms.common.api.a<a> b = new com.google.android.gms.common.api.a("Address.API", c, a);
    private static final com.google.android.gms.common.api.a.b<amn, a> c = new com.google.android.gms.common.api.a.b<amn, a>() {
        public amn a(Context context, Looper looper, s sVar, a aVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
            d.b(context instanceof Activity, "An Activity must be used for Address APIs");
            if (aVar == null) {
                aVar = new a();
            }
            return new amn((Activity) context, looper, sVar, aVar.a, bVar, cVar);
        }
    };

    private static abstract class b extends com.google.android.gms.internal.ahl.a<Status, amn> {
        public b(com.google.android.gms.common.api.g gVar) {
            super(a.b, gVar);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    class AnonymousClass2 extends b {
        final /* synthetic */ UserAddressRequest a;
        final /* synthetic */ int b;

        AnonymousClass2(com.google.android.gms.common.api.g gVar, UserAddressRequest userAddressRequest, int i) {
            this.a = userAddressRequest;
            this.b = i;
            super(gVar);
        }

        protected void a(amn com_google_android_gms_internal_amn) {
            com_google_android_gms_internal_amn.a(this.a, this.b);
            b(Status.a);
        }
    }

    public static final class a implements com.google.android.gms.common.api.a.a.a {
        public final int a;

        public a() {
            this.a = 0;
        }

        public a(int i) {
            this.a = i;
        }
    }

    public static void a(com.google.android.gms.common.api.g gVar, UserAddressRequest userAddressRequest, int i) {
        gVar.a(new AnonymousClass2(gVar, userAddressRequest, i));
    }
}
