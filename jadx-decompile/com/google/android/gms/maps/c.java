package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.support.annotation.RequiresPermission;
import android.view.View;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.j;

public final class c {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private final com.google.android.gms.maps.a.b f;
    private j g;

    public interface b {
        View a(g gVar);

        View b(g gVar);
    }

    @Deprecated
    public interface c {
        void a(CameraPosition cameraPosition);
    }

    public interface k {
        void c(g gVar);
    }

    public interface n {
        void a(LatLng latLng);
    }

    public interface o {
        void a();
    }

    public interface p {
        void b(LatLng latLng);
    }

    public interface q {
        boolean d(g gVar);
    }

    public interface r {
        void e(g gVar);

        void f(g gVar);

        void g(g gVar);
    }

    @Deprecated
    public interface t {
        void a(Location location);
    }

    protected c(com.google.android.gms.maps.a.b bVar) {
        this.f = (com.google.android.gms.maps.a.b) d.a((Object) bVar);
    }

    public final CameraPosition a() {
        try {
            return this.f.a();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final com.google.android.gms.maps.model.c a(CircleOptions circleOptions) {
        try {
            return new com.google.android.gms.maps.model.c(this.f.a(circleOptions));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final com.google.android.gms.maps.model.d a(GroundOverlayOptions groundOverlayOptions) {
        try {
            com.google.android.gms.maps.model.a.d a = this.f.a(groundOverlayOptions);
            return a != null ? new com.google.android.gms.maps.model.d(a) : null;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final g a(MarkerOptions markerOptions) {
        try {
            com.google.android.gms.maps.model.a.g a = this.f.a(markerOptions);
            return a != null ? new g(a) : null;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final h a(PolygonOptions polygonOptions) {
        try {
            return new h(this.f.a(polygonOptions));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final i a(PolylineOptions polylineOptions) {
        try {
            return new i(this.f.a(polylineOptions));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final com.google.android.gms.maps.model.k a(TileOverlayOptions tileOverlayOptions) {
        try {
            com.google.android.gms.maps.model.a.i a = this.f.a(tileOverlayOptions);
            return a != null ? new com.google.android.gms.maps.model.k(a) : null;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(float f) {
        try {
            this.f.a(f);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(int i) {
        try {
            this.f.a(i);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            this.f.a(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(a aVar) {
        try {
            this.f.a(aVar.a());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(a aVar, int i, a aVar2) {
        try {
            this.f.a(aVar.a(), i, aVar2 == null ? null : new y(aVar2));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(a aVar, a aVar2) {
        try {
            this.f.a(aVar.a(), aVar2 == null ? null : new y(aVar2));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(b bVar) {
        if (bVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 22(this, bVar));
    }

    @Deprecated
    public final void a(c cVar) {
        if (cVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 10(this, cVar));
    }

    public final void a(d dVar) {
        if (dVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 15(this, dVar));
    }

    public final void a(e eVar) {
        if (eVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 14(this, eVar));
    }

    public final void a(f fVar) {
        if (fVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 13(this, fVar));
    }

    public final void a(g gVar) {
        if (gVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 11(this, gVar));
    }

    public final void a(h hVar) {
        if (hVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 5(this, hVar));
    }

    public final void a(i iVar) {
        if (iVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 3(this, iVar));
    }

    public final void a(j jVar) {
        if (jVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 1(this, jVar));
    }

    public final void a(k kVar) {
        if (kVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 19(this, kVar));
    }

    public final void a(l lVar) {
        if (lVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 21(this, lVar));
    }

    public final void a(m mVar) {
        if (mVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 20(this, mVar));
    }

    public final void a(n nVar) {
        if (nVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 16(this, nVar));
    }

    public void a(o oVar) {
        if (oVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 2(this, oVar));
    }

    public final void a(p pVar) {
        if (pVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 17(this, pVar));
    }

    public final void a(q qVar) {
        if (qVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 12(this, qVar));
    }

    public final void a(r rVar) {
        if (rVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 18(this, rVar));
    }

    public final void a(s sVar) {
        if (sVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 24(this, sVar));
    }

    @Deprecated
    public final void a(t tVar) {
        if (tVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 23(this, tVar));
    }

    public final void a(u uVar) {
        if (uVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 9(this, uVar));
    }

    public final void a(v vVar) {
        if (vVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 6(this, vVar));
    }

    public final void a(w wVar) {
        if (wVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 7(this, wVar));
    }

    public final void a(x xVar) {
        a(xVar, null);
    }

    public final void a(x xVar, Bitmap bitmap) {
        try {
            this.f.a(new 8(this, xVar), (f) (bitmap != null ? f.a((Object) bitmap) : null));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(d dVar) {
        if (dVar == null) {
            try {
                this.f.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.f.a(new 4(this, dVar));
    }

    public void a(LatLngBounds latLngBounds) {
        try {
            this.f.a(latLngBounds);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(String str) {
        try {
            this.f.a(str);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(boolean z) {
        try {
            this.f.a(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean a(MapStyleOptions mapStyleOptions) {
        try {
            return this.f.a(mapStyleOptions);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final float b() {
        try {
            return this.f.b();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(float f) {
        try {
            this.f.b(f);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void b(a aVar) {
        try {
            this.f.b(aVar.a());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean b(boolean z) {
        try {
            return this.f.b(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final float c() {
        try {
            return this.f.c();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void c(boolean z) {
        try {
            this.f.d(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void d() {
        try {
            this.f.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final void d(boolean z) {
        try {
            this.f.c(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void e() {
        try {
            this.f.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public e f() {
        try {
            com.google.android.gms.maps.model.a.e n = this.f.n();
            return n != null ? new e(n) : null;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final int g() {
        try {
            return this.f.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean h() {
        try {
            return this.f.g();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean i() {
        try {
            return this.f.h();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean j() {
        try {
            return this.f.m();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final boolean k() {
        try {
            return this.f.i();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    @Deprecated
    public final Location l() {
        try {
            return this.f.j();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final j m() {
        try {
            if (this.g == null) {
                this.g = new j(this.f.k());
            }
            return this.g;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final h n() {
        try {
            return new h(this.f.l());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void o() {
        try {
            this.f.u();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
