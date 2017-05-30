package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ahn;
import com.google.android.gms.internal.aio;
import com.google.android.gms.internal.aiu;

public final class j {

    private static final class a<R extends m> extends ahn<R> {
        private final R a;

        public a(R r) {
            super(Looper.getMainLooper());
            this.a = r;
        }

        protected R b(Status status) {
            if (status.i() == this.a.a().i()) {
                return this.a;
            }
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    private static final class b<R extends m> extends ahn<R> {
        private final R a;

        public b(g gVar, R r) {
            super(gVar);
            this.a = r;
        }

        protected R b(Status status) {
            return this.a;
        }
    }

    private static final class c<R extends m> extends ahn<R> {
        public c(g gVar) {
            super(gVar);
        }

        protected R b(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    private j() {
    }

    public static <R extends m> h<R> a(R r) {
        d.a((Object) r, (Object) "Result must not be null");
        i cVar = new c(null);
        cVar.b((m) r);
        return new aio(cVar);
    }

    public static i<Status> a() {
        i com_google_android_gms_internal_aiu = new aiu(Looper.getMainLooper());
        com_google_android_gms_internal_aiu.a();
        return com_google_android_gms_internal_aiu;
    }

    public static i<Status> a(Status status) {
        d.a((Object) status, (Object) "Result must not be null");
        i com_google_android_gms_internal_aiu = new aiu(Looper.getMainLooper());
        com_google_android_gms_internal_aiu.b((m) status);
        return com_google_android_gms_internal_aiu;
    }

    public static i<Status> a(Status status, g gVar) {
        d.a((Object) status, (Object) "Result must not be null");
        i com_google_android_gms_internal_aiu = new aiu(gVar);
        com_google_android_gms_internal_aiu.b((m) status);
        return com_google_android_gms_internal_aiu;
    }

    public static <R extends m> i<R> a(R r, g gVar) {
        d.a((Object) r, (Object) "Result must not be null");
        d.b(!r.a().f(), "Status code must not be SUCCESS");
        i bVar = new b(gVar, r);
        bVar.b((m) r);
        return bVar;
    }

    public static <R extends m> h<R> b(R r, g gVar) {
        d.a((Object) r, (Object) "Result must not be null");
        i cVar = new c(gVar);
        cVar.b((m) r);
        return new aio(cVar);
    }

    public static <R extends m> i<R> b(R r) {
        d.a((Object) r, (Object) "Result must not be null");
        d.b(r.a().i() == 16, "Status code must be CommonStatusCodes.CANCELED");
        i aVar = new a(r);
        aVar.a();
        return aVar;
    }
}
