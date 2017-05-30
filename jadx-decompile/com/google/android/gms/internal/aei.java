package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public class aei implements com.google.android.gms.appinvite.b {

    static class a extends com.google.android.gms.internal.ael.a {
        a() {
        }

        public void a(Status status) {
            throw new UnsupportedOperationException();
        }

        public void a(Status status, Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    static abstract class b<R extends m> extends com.google.android.gms.internal.ahl.a<R, aej> {
        public b(g gVar) {
            super(com.google.android.gms.appinvite.a.b, gVar);
        }
    }

    final class c extends b<Status> {
        final /* synthetic */ aei a;
        private final String b;

        public c(aei com_google_android_gms_internal_aei, g gVar, String str) {
            this.a = com_google_android_gms_internal_aei;
            super(gVar);
            this.b = str;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(aej com_google_android_gms_internal_aej) {
            com_google_android_gms_internal_aej.b(new a(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void a(Status status) {
                    this.a.b(status);
                }
            }, this.b);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    final class d extends b<Status> {
        final /* synthetic */ aei a;
        private final String b;

        public d(aei com_google_android_gms_internal_aei, g gVar, String str) {
            this.a = com_google_android_gms_internal_aei;
            super(gVar);
            this.b = str;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(aej com_google_android_gms_internal_aej) {
            com_google_android_gms_internal_aej.a(new a(this) {
                final /* synthetic */ d a;

                {
                    this.a = r1;
                }

                public void a(Status status) {
                    this.a.b(status);
                }
            }, this.b);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    final class e extends b<com.google.android.gms.appinvite.d> {
        final /* synthetic */ aei a;
        private final Activity b;
        private final boolean c;
        private final Intent d;

        public e(aei com_google_android_gms_internal_aei, g gVar, Activity activity, boolean z) {
            this.a = com_google_android_gms_internal_aei;
            super(gVar);
            this.b = activity;
            this.c = z;
            this.d = this.b != null ? this.b.getIntent() : null;
        }

        protected com.google.android.gms.appinvite.d a(Status status) {
            return new aek(status, new Intent());
        }

        protected void a(aej com_google_android_gms_internal_aej) {
            if (com.google.android.gms.appinvite.e.a(this.d)) {
                b(new aek(Status.a, this.d));
                com_google_android_gms_internal_aej.a(null);
                return;
            }
            com_google_android_gms_internal_aej.a(new a(this) {
                final /* synthetic */ e a;

                {
                    this.a = r1;
                }

                public void a(Status status, Intent intent) {
                    this.a.b(new aek(status, intent));
                    if (com.google.android.gms.appinvite.e.a(intent) && this.a.c && this.a.b != null) {
                        this.a.b.startActivity(intent);
                    }
                }
            });
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public i<com.google.android.gms.appinvite.d> a(g gVar, Activity activity, boolean z) {
        return gVar.a(new e(this, gVar, activity, z));
    }

    public i<Status> a(g gVar, String str) {
        return gVar.a(new c(this, gVar, str));
    }

    public i<Status> b(g gVar, String str) {
        return gVar.a(new d(this, gVar, str));
    }
}
