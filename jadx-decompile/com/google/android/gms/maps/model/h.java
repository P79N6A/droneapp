package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import java.util.List;

public final class h {
    private final com.google.android.gms.maps.model.a.h a;

    public h(com.google.android.gms.maps.model.a.h hVar) {
        this.a = (com.google.android.gms.maps.model.a.h) d.a(hVar);
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

    public void a(int i) {
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(List<LatLng> list) {
        try {
            this.a.a((List) list);
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

    public void b(int i) {
        try {
            this.a.b(i);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(List<? extends List<LatLng>> list) {
        try {
            this.a.b((List) list);
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

    public List<LatLng> c() {
        try {
            return this.a.c();
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

    public List<List<LatLng>> d() {
        try {
            return this.a.d();
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
        if (!(obj instanceof h)) {
            return false;
        }
        try {
            return this.a.a(((h) obj).a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int f() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int g() {
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
            return this.a.j();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean k() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
