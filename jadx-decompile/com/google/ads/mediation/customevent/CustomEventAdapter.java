package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.c;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import com.google.ads.mediation.h;
import com.google.android.gms.ads.mediation.customevent.d;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter implements e<d, g>, g<d, g> {
    b a;
    d b;
    private View c;

    static final class a implements c {
        private final CustomEventAdapter a;
        private final f b;

        public a(CustomEventAdapter customEventAdapter, f fVar) {
            this.a = customEventAdapter;
            this.b = fVar;
        }

        public void a() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.b.a(this.a, com.google.ads.a.a.NO_FILL);
        }

        public void a(View view) {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onReceivedAd.");
            this.a.a(view);
            this.b.a(this.a);
        }

        public void b() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.b.e(this.a);
        }

        public void c() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.b.b(this.a);
        }

        public void d() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.b.c(this.a);
        }

        public void e() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.b.d(this.a);
        }
    }

    class b implements e {
        final /* synthetic */ CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final h c;

        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, h hVar) {
            this.a = customEventAdapter;
            this.b = customEventAdapter2;
            this.c = hVar;
        }

        public void a() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onFailedToReceiveAd.");
            this.c.a(this.b, com.google.ads.a.a.NO_FILL);
        }

        public void b() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onReceivedAd.");
            this.c.a(this.a);
        }

        public void c() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onPresentScreen.");
            this.c.b(this.b);
        }

        public void d() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onDismissScreen.");
            this.c.c(this.b);
        }

        public void e() {
            com.google.android.gms.ads.internal.util.client.b.a("Custom event adapter called onLeaveApplication.");
            this.c.d(this.b);
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    private void a(View view) {
        this.c = view;
    }

    b a(h hVar) {
        return new b(this, this, hVar);
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    public void a(f fVar, Activity activity, g gVar, com.google.ads.b bVar, c cVar, d dVar) {
        this.a = (b) a(gVar.b);
        if (this.a == null) {
            fVar.a(this, com.google.ads.a.a.INTERNAL_ERROR);
        } else {
            this.a.a(new a(this, fVar), activity, gVar.a, gVar.c, bVar, cVar, dVar == null ? null : dVar.a(gVar.a));
        }
    }

    public void a(h hVar, Activity activity, g gVar, c cVar, d dVar) {
        this.b = (d) a(gVar.b);
        if (this.b == null) {
            hVar.a(this, com.google.ads.a.a.INTERNAL_ERROR);
        } else {
            this.b.a(a(hVar), activity, gVar.a, gVar.c, cVar, dVar == null ? null : dVar.a(gVar.a));
        }
    }

    public Class<d> b() {
        return d.class;
    }

    public Class<g> c() {
        return g.class;
    }

    public View d() {
        return this.c;
    }

    public void e() {
        this.b.b();
    }
}
