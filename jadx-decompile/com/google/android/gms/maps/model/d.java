package com.google.android.gms.maps.model;

import android.os.RemoteException;

public final class d {
    private final com.google.android.gms.maps.model.a.d a;

    public d(com.google.android.gms.maps.model.a.d dVar) {
        this.a = (com.google.android.gms.maps.model.a.d) com.google.android.gms.common.internal.d.a(dVar);
    }

    public void a() {
        try {
            this.a.a();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(float f, float f2) {
        try {
            this.a.a(f, f2);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(LatLng latLng) {
        try {
            this.a.a(latLng);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(LatLngBounds latLngBounds) {
        try {
            this.a.a(latLngBounds);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(a aVar) {
        try {
            this.a.a(aVar.a());
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

    public String b() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(float f) {
        try {
            this.a.b(f);
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

    public LatLng c() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void c(float f) {
        try {
            this.a.c(f);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float d() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void d(float f) {
        try {
            this.a.d(f);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float e() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            return this.a.a(((d) obj).a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public LatLngBounds f() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float g() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float h() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.k();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean i() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean j() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float k() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
