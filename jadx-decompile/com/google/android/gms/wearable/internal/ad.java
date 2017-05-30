package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.o;
import com.google.android.gms.wearable.p;
import com.google.android.gms.wearable.p$a;
import com.google.android.gms.wearable.p$b;
import com.google.android.gms.wearable.p.c;
import java.util.ArrayList;
import java.util.List;

public final class ad implements p {

    class AnonymousClass3 implements a<c> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass3(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(ar arVar, com.google.android.gms.internal.ahl.b<Status> bVar, c cVar, ail<c> com_google_android_gms_internal_ail_com_google_android_gms_wearable_p_c) {
            arVar.a((com.google.android.gms.internal.ahl.b) bVar, cVar, (ail) com_google_android_gms_internal_ail_com_google_android_gms_wearable_p_c, this.a);
        }
    }

    public static class a implements p$a {
        private final Status a;
        private final List<o> b;

        public a(Status status, List<o> list) {
            this.a = status;
            this.b = list;
        }

        public Status a() {
            return this.a;
        }

        public List<o> b() {
            return this.b;
        }
    }

    public static class b implements p$b {
        private final Status a;
        private final o b;

        public b(Status status, o oVar) {
            this.a = status;
            this.b = oVar;
        }

        public Status a() {
            return this.a;
        }

        public o b() {
            return this.b;
        }
    }

    private static a<c> a(IntentFilter[] intentFilterArr) {
        return new AnonymousClass3(intentFilterArr);
    }

    public i<p$b> a(g gVar) {
        return gVar.a(new ba<p$b>(this, gVar) {
            final /* synthetic */ ad a;

            protected p$b a(Status status) {
                return new b(status, null);
            }

            protected void a(ar arVar) {
                arVar.b((com.google.android.gms.internal.ahl.b) this);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> a(g gVar, c cVar) {
        return ab.a(gVar, a(new IntentFilter[]{ap.a("com.google.android.gms.wearable.NODE_CHANGED")}), cVar);
    }

    public i<p$a> b(g gVar) {
        return gVar.a(new ba<p$a>(this, gVar) {
            final /* synthetic */ ad a;

            protected p$a a(Status status) {
                return new a(status, new ArrayList());
            }

            protected void a(ar arVar) {
                arVar.c(this);
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<Status> b(g gVar, final c cVar) {
        return gVar.a(new ba<Status>(this, gVar) {
            final /* synthetic */ ad b;

            public Status a(Status status) {
                return status;
            }

            protected void a(ar arVar) {
                arVar.a((com.google.android.gms.internal.ahl.b) this, cVar);
            }

            public /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
