package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.c$a;
import com.google.android.gms.drive.e;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.ail.c;

public class bv extends c implements e {

    private static class a implements com.google.android.gms.drive.e.a {
        private final ail<com.google.android.gms.drive.e.a> a;

        public a(ail<com.google.android.gms.drive.e.a> com_google_android_gms_internal_ail_com_google_android_gms_drive_e_a) {
            this.a = com_google_android_gms_internal_ail_com_google_android_gms_drive_e_a;
        }

        public void a(long j, long j2) {
            final long j3 = j;
            final long j4 = j2;
            this.a.a(new c<com.google.android.gms.drive.e.a>(this) {
                final /* synthetic */ a c;

                public void a() {
                }

                public void a(com.google.android.gms.drive.e.a aVar) {
                    aVar.a(j3, j4);
                }

                public /* synthetic */ void a(Object obj) {
                    a((com.google.android.gms.drive.e.a) obj);
                }
            });
        }
    }

    public bv(DriveId driveId) {
        super(driveId);
    }

    private static com.google.android.gms.drive.e.a a(g gVar, com.google.android.gms.drive.e.a aVar) {
        return aVar == null ? null : new a(gVar.a(aVar));
    }

    public i<c$a> a(g gVar, final int i, com.google.android.gms.drive.e.a aVar) {
        if (i == e.a_ || i == e.c || i == e.b) {
            final com.google.android.gms.drive.e.a a = a(gVar, aVar);
            return gVar.a(new c(this, gVar) {
                final /* synthetic */ bv c;

                protected void a(bt btVar) {
                    a(btVar.i().a(new OpenContentsRequest(this.c.a(), i, 0), new ak(this, a)).a());
                }
            });
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
