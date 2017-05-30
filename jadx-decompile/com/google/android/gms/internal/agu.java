package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.hardware.display.VirtualDisplay;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public class agu implements e {
    private static final m a = new m("CastRemoteDisplayApiImpl");
    private com.google.android.gms.common.api.a<?> b;
    private VirtualDisplay c;
    private final agy d = new com.google.android.gms.internal.agy.a(this) {
        final /* synthetic */ agu a;

        {
            this.a = r1;
        }

        public void a(int i) {
            agu.a.b("onRemoteDisplayEnded", new Object[0]);
            this.a.b();
        }
    };

    abstract class b extends com.google.android.gms.internal.ahl.a<com.google.android.gms.cast.d.c, agv> {
        final /* synthetic */ agu c;

        public b(agu com_google_android_gms_internal_agu, g gVar) {
            this.c = com_google_android_gms_internal_agu;
            super(com_google_android_gms_internal_agu.b, gVar);
        }

        protected com.google.android.gms.cast.d.c a(Status status) {
            return new c(status);
        }

        public void a(agv com_google_android_gms_internal_agv) {
        }

        protected /* synthetic */ com.google.android.gms.common.api.m b(Status status) {
            return a(status);
        }
    }

    abstract class a extends com.google.android.gms.internal.agw.a {
        final /* synthetic */ agu a;

        a(agu com_google_android_gms_internal_agu) {
            this.a = com_google_android_gms_internal_agu;
        }

        public void a() {
            throw new UnsupportedOperationException();
        }

        public void a(int i) {
            throw new UnsupportedOperationException();
        }

        public void a(int i, int i2, Surface surface) {
            throw new UnsupportedOperationException();
        }

        public void b() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class c implements com.google.android.gms.cast.d.c {
        private final Status a;
        private final Display b;

        public c(Display display) {
            this.a = Status.a;
            this.b = display;
        }

        public c(Status status) {
            this.a = status;
            this.b = null;
        }

        public Status a() {
            return this.a;
        }

        public Display b() {
            return this.b;
        }
    }

    public agu(com.google.android.gms.common.api.a aVar) {
        this.b = aVar;
    }

    @TargetApi(19)
    private void b() {
        if (this.c != null) {
            if (this.c.getDisplay() != null) {
                a.b("releasing virtual display: " + this.c.getDisplay().getDisplayId(), new Object[0]);
            }
            this.c.release();
            this.c = null;
        }
    }

    public i<com.google.android.gms.cast.d.c> a(g gVar) {
        a.b("stopRemoteDisplay", new Object[0]);
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ agu a;

            public void a(agv com_google_android_gms_internal_agv) {
                com_google_android_gms_internal_agv.a(new b(this));
            }
        });
    }

    public i<com.google.android.gms.cast.d.c> a(g gVar, final String str) {
        a.b("startRemoteDisplay", new Object[0]);
        return gVar.b(new b(this, gVar) {
            final /* synthetic */ agu b;

            public void a(agv com_google_android_gms_internal_agv) {
                com_google_android_gms_internal_agv.a(new a(this, com_google_android_gms_internal_agv), this.b.d, str);
            }
        });
    }
}
