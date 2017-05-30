package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.g;
import com.google.android.gms.drive.k;

public class b implements g {

    private abstract class c extends bs<com.google.android.gms.drive.g.a> {
        final /* synthetic */ b b;

        public c(b bVar, com.google.android.gms.common.api.g gVar) {
            this.b = bVar;
            super(gVar);
        }

        protected com.google.android.gms.drive.g.a a(Status status) {
            return new b(status, null);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    private class a extends bc {
        final /* synthetic */ b a;
        private final com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.g.a> b;

        private a(b bVar, com.google.android.gms.internal.ahl.b<com.google.android.gms.drive.g.a> bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        public void a(Status status) {
            this.b.a(new b(status, null));
        }

        public void a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
            this.b.a(new b(Status.a, onDeviceUsagePreferenceResponse.a()));
        }
    }

    private class b implements com.google.android.gms.drive.g.a {
        final /* synthetic */ b a;
        private final Status b;
        private final k c;

        private b(b bVar, Status status, k kVar) {
            this.a = bVar;
            this.b = status;
            this.c = kVar;
        }

        public Status a() {
            return this.b;
        }

        public k b() {
            return this.c;
        }
    }

    public i<com.google.android.gms.drive.g.a> a(com.google.android.gms.common.api.g gVar) {
        return gVar.a(new c(this, gVar) {
            final /* synthetic */ b a;

            protected void a(bt btVar) {
                btVar.i().d(new a(this));
            }
        });
    }

    public i<Status> a(com.google.android.gms.common.api.g gVar, k kVar) {
        if (kVar instanceof FileUploadPreferencesImpl) {
            final FileUploadPreferencesImpl fileUploadPreferencesImpl = (FileUploadPreferencesImpl) kVar;
            return gVar.b(new com.google.android.gms.drive.internal.bs.a(this, gVar) {
                final /* synthetic */ b b;

                protected void a(bt btVar) {
                    btVar.i().a(new SetFileUploadPreferencesRequest(fileUploadPreferencesImpl), new at(this));
                }
            });
        }
        throw new IllegalArgumentException("Invalid preference value");
    }
}
