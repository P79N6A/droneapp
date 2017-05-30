package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.m.c;

public final class aa implements m {

    private static final class a extends ba<Status> {
        private com.google.android.gms.wearable.m.b a;
        private ail<com.google.android.gms.wearable.m.b> b;
        private IntentFilter[] c;

        private a(g gVar, com.google.android.gms.wearable.m.b bVar, ail<com.google.android.gms.wearable.m.b> com_google_android_gms_internal_ail_com_google_android_gms_wearable_m_b, IntentFilter[] intentFilterArr) {
            super(gVar);
            this.a = (com.google.android.gms.wearable.m.b) d.a(bVar);
            this.b = (ail) d.a(com_google_android_gms_internal_ail_com_google_android_gms_wearable_m_b);
            this.c = (IntentFilter[]) d.a(intentFilterArr);
        }

        public Status a(Status status) {
            this.a = null;
            this.b = null;
            this.c = null;
            return status;
        }

        protected void a(ar arVar) {
            arVar.a((com.google.android.gms.internal.ahl.b) this, this.a, this.b, this.c);
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    public static class b implements c {
        private final Status a;
        private final int b;

        public b(Status status, int i) {
            this.a = status;
            this.b = i;
        }

        public Status a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    private i<Status> a(g gVar, com.google.android.gms.wearable.m.b bVar, IntentFilter[] intentFilterArr) {
        return gVar.a(new a(gVar, bVar, gVar.a(bVar), intentFilterArr));
    }

    public i<Status> a(g gVar, com.google.android.gms.wearable.m.b bVar) {
        return a(gVar, bVar, new IntentFilter[]{ap.a(m.a)});
    }

    public i<Status> a(g gVar, com.google.android.gms.wearable.m.b bVar, Uri uri, int i) {
        d.b(uri != null, "uri must not be null");
        boolean z = i == 0 || i == 1;
        d.b(z, "invalid filter type");
        return a(gVar, bVar, new IntentFilter[]{ap.a(m.a, uri, i)});
    }

    public i<c> a(g gVar, String str, String str2, byte[] bArr) {
        final String str3 = str;
        final String str4 = str2;
        final byte[] bArr2 = bArr;
        return gVar.a(new ba<c>(this, gVar) {
            final /* synthetic */ aa d;

            protected c a(Status status) {
                return new b(status, -1);
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, str3, str4, bArr2);
            }

            protected /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(g gVar, final com.google.android.gms.wearable.m.b bVar) {
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ aa b;

            public Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, bVar);
            }

            public /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
                return a(status);
            }
        });
    }
}
