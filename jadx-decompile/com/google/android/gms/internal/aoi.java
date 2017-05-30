package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.search.GoogleNowAuthState;

public class aoi implements com.google.android.gms.search.b {

    static abstract class a extends com.google.android.gms.internal.aof.a {
        a() {
        }

        public void a(Status status) {
            throw new UnsupportedOperationException();
        }

        public void a(Status status, GoogleNowAuthState googleNowAuthState) {
            throw new UnsupportedOperationException();
        }
    }

    static class b extends com.google.android.gms.internal.ahl.a<Status, aoh> {
        private final String a;
        private final String b;
        private final boolean c = Log.isLoggable("SearchAuth", 3);

        protected b(g gVar, String str) {
            super(com.google.android.gms.search.a.b, gVar);
            this.b = str;
            this.a = gVar.b().getPackageName();
        }

        protected Status a(Status status) {
            if (this.c) {
                String str = "SearchAuth";
                String str2 = "ClearTokenImpl received failure: ";
                String valueOf = String.valueOf(status.c());
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return status;
        }

        protected void a(aoh com_google_android_gms_internal_aoh) {
            if (this.c) {
                Log.d("SearchAuth", "ClearTokenImpl started");
            }
            ((aog) com_google_android_gms_internal_aoh.G()).b(new a(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void a(Status status) {
                    if (this.a.c) {
                        Log.d("SearchAuth", "ClearTokenImpl success");
                    }
                    this.a.b(status);
                }
            }, this.a, this.b);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static class c extends com.google.android.gms.internal.ahl.a<com.google.android.gms.search.b.a, aoh> {
        private final String a;
        private final String b;
        private final boolean c = Log.isLoggable("SearchAuth", 3);

        protected c(g gVar, String str) {
            super(com.google.android.gms.search.a.b, gVar);
            this.a = str;
            this.b = gVar.b().getPackageName();
        }

        protected com.google.android.gms.search.b.a a(Status status) {
            if (this.c) {
                String str = "SearchAuth";
                String str2 = "GetGoogleNowAuthImpl received failure: ";
                String valueOf = String.valueOf(status.c());
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return new d(status, null);
        }

        protected void a(aoh com_google_android_gms_internal_aoh) {
            if (this.c) {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            }
            ((aog) com_google_android_gms_internal_aoh.G()).a(new a(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void a(Status status, GoogleNowAuthState googleNowAuthState) {
                    if (this.a.c) {
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    }
                    this.a.b(new d(status, googleNowAuthState));
                }
            }, this.b, this.a);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    static class d implements com.google.android.gms.search.b.a {
        private final Status a;
        private final GoogleNowAuthState b;

        d(Status status, GoogleNowAuthState googleNowAuthState) {
            this.a = status;
            this.b = googleNowAuthState;
        }

        public Status a() {
            return this.a;
        }

        public GoogleNowAuthState b() {
            return this.b;
        }
    }

    public i<com.google.android.gms.search.b.a> a(g gVar, String str) {
        return gVar.a(new c(gVar, str));
    }

    public i<Status> b(g gVar, String str) {
        return gVar.a(new b(gVar, str));
    }
}
