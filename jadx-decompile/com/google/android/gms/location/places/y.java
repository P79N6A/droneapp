package com.google.android.gms.location.places;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.u;
import com.google.android.gms.location.places.personalized.e;

public class y extends com.google.android.gms.location.places.internal.i.a {
    private static final String a = y.class.getSimpleName();
    private final d b;
    private final a c;
    private final e d;
    private final f e;
    private final c f;

    public static abstract class b<R extends m, A extends com.google.android.gms.common.api.a.f> extends com.google.android.gms.internal.ahl.a<R, A> {
        public b(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }
    }

    public static abstract class c<A extends com.google.android.gms.common.api.a.f> extends b<e, A> {
        public c(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }

        protected e a(Status status) {
            return new e(DataHolder.b(status.i()));
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static abstract class a<A extends com.google.android.gms.common.api.a.f> extends b<b, A> {
        public a(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }

        protected b a(Status status) {
            return new b(DataHolder.b(status.i()));
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static abstract class d<A extends com.google.android.gms.common.api.a.f> extends b<h, A> {
        public d(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }

        protected h a(Status status) {
            return new h(DataHolder.b(status.i()), 100);
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public static abstract class f<A extends com.google.android.gms.common.api.a.f> extends b<Status, A> {
        public f(com.google.android.gms.common.api.a aVar, g gVar) {
            super(aVar, gVar);
        }

        protected Status a(Status status) {
            return status;
        }

        protected /* synthetic */ m b(Status status) {
            return a(status);
        }
    }

    public y(a aVar) {
        this.b = null;
        this.c = aVar;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public y(c cVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = cVar;
    }

    public y(d dVar) {
        this.b = dVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public y(f fVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = fVar;
        this.f = null;
    }

    public void a(Status status) {
        this.e.b(status);
    }

    public void a(DataHolder dataHolder) {
        com.google.android.gms.common.internal.d.a(this.b != null, "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                String str = a;
                String str2 = "onPlaceEstimated received null DataHolder: ";
                String valueOf = String.valueOf(u.a());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.b.c(Status.c);
            return;
        }
        Bundle f = dataHolder.f();
        this.b.b(new h(dataHolder, f == null ? 100 : h.a(f)));
    }

    public void b(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                String str = a;
                String str2 = "onAutocompletePrediction received null DataHolder: ";
                String valueOf = String.valueOf(u.a());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.c.c(Status.c);
            return;
        }
        this.c.b(new b(dataHolder));
    }

    public void c(DataHolder dataHolder) {
        e eVar = null;
        if (dataHolder == null) {
            if (Log.isLoggable(a, 6)) {
                String str = a;
                String str2 = "onPlaceUserDataFetched received null DataHolder: ";
                String valueOf = String.valueOf(u.a());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            eVar.c(Status.c);
            return;
        }
        eVar.b(new e(dataHolder));
    }

    public void d(DataHolder dataHolder) {
        this.f.b(new e(dataHolder));
    }
}
