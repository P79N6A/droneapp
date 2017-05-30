package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.maps.a.g;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.j;

public class i {
    private final g a;

    public interface a {
        void a(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface b {
        void a(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface c {
        void a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface d {
        void a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    protected i(g gVar) {
        this.a = (g) com.google.android.gms.common.internal.d.a(gVar);
    }

    public Point a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            e a = this.a.a(streetViewPanoramaOrientation);
            return a == null ? null : (Point) f.a(a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    g a() {
        return this.a;
    }

    public StreetViewPanoramaOrientation a(Point point) {
        try {
            return this.a.a(f.a(point));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public final void a(final a aVar) {
        if (aVar == null) {
            try {
                this.a.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.a.a(new com.google.android.gms.maps.a.o.a(this) {
            final /* synthetic */ i b;

            public void a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                aVar.a(streetViewPanoramaCamera);
            }
        });
    }

    public final void a(final b bVar) {
        if (bVar == null) {
            try {
                this.a.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.a.a(new com.google.android.gms.maps.a.p.a(this) {
            final /* synthetic */ i b;

            public void a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                bVar.a(streetViewPanoramaLocation);
            }
        });
    }

    public final void a(final c cVar) {
        if (cVar == null) {
            try {
                this.a.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.a.a(new com.google.android.gms.maps.a.q.a(this) {
            final /* synthetic */ i b;

            public void a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                cVar.a(streetViewPanoramaOrientation);
            }
        });
    }

    public final void a(final d dVar) {
        if (dVar == null) {
            try {
                this.a.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.a.a(new com.google.android.gms.maps.a.r.a(this) {
            final /* synthetic */ i b;

            public void a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                dVar.a(streetViewPanoramaOrientation);
            }
        });
    }

    public void a(LatLng latLng) {
        try {
            this.a.a(latLng);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(LatLng latLng, int i) {
        try {
            this.a.a(latLng, i);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        try {
            this.a.a(streetViewPanoramaCamera, j);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean b() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void c(boolean z) {
        try {
            this.a.c(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean c() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void d(boolean z) {
        try {
            this.a.d(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean d() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean e() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public StreetViewPanoramaCamera f() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public StreetViewPanoramaLocation g() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
