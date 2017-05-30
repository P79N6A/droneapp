package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.c;

public final class bd implements c {

    class AnonymousClass2 implements a<com.google.android.gms.wearable.c.a> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass2(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, com.google.android.gms.wearable.c.a aVar, ail<com.google.android.gms.wearable.c.a> com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a) {
            arVar.a((com.google.android.gms.internal.ahl.b) bVar, aVar, (ail) com_google_android_gms_internal_ail_com_google_android_gms_wearable_c_a, null, this.a);
        }
    }

    static final class a implements c.c {
        private final Status a;
        private final Channel b;

        a(Status status, Channel channel) {
            this.a = (Status) d.a(status);
            this.b = channel;
        }

        public Status a() {
            return this.a;
        }

        public Channel b() {
            return this.b;
        }
    }

    static final class b extends ba<Status> {
        private final String a;
        private com.google.android.gms.wearable.c.a b;

        b(g gVar, com.google.android.gms.wearable.c.a aVar, String str) {
            super(gVar);
            this.b = (com.google.android.gms.wearable.c.a) d.a(aVar);
            this.a = str;
        }

        public Status a(Status status) {
            this.b = null;
            return status;
        }

        protected void a(ar arVar) {
            arVar.a((com.google.android.gms.internal.ahl.b) this, this.b, this.a);
            this.b = null;
        }

        public /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private static a<com.google.android.gms.wearable.c.a> a(IntentFilter[] intentFilterArr) {
        return new AnonymousClass2(intentFilterArr);
    }

    public i<Status> a(g gVar, com.google.android.gms.wearable.c.a aVar) {
        d.a(gVar, "client is null");
        d.a(aVar, "listener is null");
        return ab.a(gVar, a(new IntentFilter[]{ap.a(c.a)}), aVar);
    }

    public i<c.c> a(g gVar, final String str, final String str2) {
        d.a(gVar, "client is null");
        d.a(str, "nodeId is null");
        d.a(str2, "path is null");
        return gVar.a(new ba<c.c>(this, gVar) {
            final /* synthetic */ bd c;

            public c.c a(Status status) {
                return new a(status, null);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, str, str2);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(g gVar, com.google.android.gms.wearable.c.a aVar) {
        d.a(gVar, "client is null");
        d.a(aVar, "listener is null");
        return gVar.a(new b(gVar, aVar, null));
    }
}
