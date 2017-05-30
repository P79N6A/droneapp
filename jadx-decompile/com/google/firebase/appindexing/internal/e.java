package com.google.firebase.appindexing.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.g.g;
import com.google.android.gms.g.i;
import com.google.android.gms.internal.aeb;
import com.google.android.gms.internal.aee;
import com.google.android.gms.internal.aeh;
import com.google.android.gms.internal.aiv;
import com.google.firebase.appindexing.f;

public final class e extends f {
    private a b;

    private static abstract class b extends aiv<aee, Void> implements com.google.android.gms.internal.ahl.b<Status> {
        protected g<Void> c;

        private b() {
        }

        public void a(Status status) {
            if (status.f()) {
                this.c.a(null);
            } else {
                this.c.a(k.a(status, "User Action indexing error, please try again."));
            }
        }

        protected /* synthetic */ void a(c cVar, g gVar) {
            a((aee) cVar, gVar);
        }

        protected abstract void a(aeb com_google_android_gms_internal_aeb);

        protected final void a(aee com_google_android_gms_internal_aee, g<Void> gVar) {
            this.c = gVar;
            a((aeb) com_google_android_gms_internal_aee.G());
        }

        public /* synthetic */ void a(Object obj) {
            a((Status) obj);
        }

        public void c(Status status) {
            d.b(!status.f(), "Failed result must not be success.");
            a(status);
        }
    }

    private static class a extends u<com.google.android.gms.common.api.a.a.b> {
        a(Context context) {
            super(context, com.google.android.gms.appdatasearch.a.b, null);
        }
    }

    public e(Context context) {
        this.b = new a(context);
    }

    private com.google.android.gms.g.f<Void> a(int i, com.google.firebase.appindexing.a aVar) {
        if (!(aVar instanceof ActionImpl)) {
            return i.a(new com.google.firebase.appindexing.d("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
        }
        final ActionImpl[] actionImplArr = new ActionImpl[]{(ActionImpl) aVar};
        actionImplArr[0].e().a(i);
        return this.b.b(new b(this) {
            final /* synthetic */ e b;

            protected void a(aeb com_google_android_gms_internal_aeb) {
                com_google_android_gms_internal_aeb.a(new aeh.d(this), actionImplArr);
            }
        });
    }

    public com.google.android.gms.g.f<Void> a(com.google.firebase.appindexing.a aVar) {
        return a(1, aVar);
    }

    public com.google.android.gms.g.f<Void> b(com.google.firebase.appindexing.a aVar) {
        return a(2, aVar);
    }
}
