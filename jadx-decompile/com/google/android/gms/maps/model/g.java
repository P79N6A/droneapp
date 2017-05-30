package com.google.android.gms.maps.model;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;

public final class g {
    private final com.google.android.gms.maps.model.a.g a;

    public g(com.google.android.gms.maps.model.a.g gVar) {
        this.a = (com.google.android.gms.maps.model.a.g) d.a(gVar);
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
            this.a.c(f);
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

    public void a(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.a.a(latLng);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(@Nullable a aVar) {
        if (aVar == null) {
            try {
                this.a.a(null);
                return;
            } catch (RemoteException e) {
                throw new j(e);
            }
        }
        this.a.a(aVar.a());
    }

    public void a(Object obj) {
        try {
            this.a.b(f.a(obj));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void a(@Nullable String str) {
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

    public String b() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(float f, float f2) {
        try {
            this.a.b(f, f2);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b(@Nullable String str) {
        try {
            this.a.b(str);
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
            this.a.b(f);
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

    public float d() {
        try {
            return this.a.o();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public String e() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        try {
            return this.a.a(((g) obj).a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public String f() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean g() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void h() {
        try {
            this.a.g();
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

    public void i() {
        try {
            this.a.h();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean j() {
        try {
            return this.a.i();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean k() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean l() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float m() {
        try {
            return this.a.m();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float n() {
        try {
            return this.a.n();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public Object o() {
        try {
            return f.a(this.a.p());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
