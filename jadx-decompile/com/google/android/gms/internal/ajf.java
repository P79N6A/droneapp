package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.ahl.b;

public final class ajf implements aje {

    private static class a extends ajc {
        private final b<Status> a;

        public a(b<Status> bVar) {
            this.a = bVar;
        }

        public void a(int i) {
            this.a.a(new Status(i));
        }
    }

    public i<Status> a(g gVar) {
        return gVar.b(new a(this, gVar) {
            final /* synthetic */ ajf a;

            protected void a(aji com_google_android_gms_internal_aji) {
                ((ajk) com_google_android_gms_internal_aji.G()).a(new a(this));
            }
        });
    }
}
