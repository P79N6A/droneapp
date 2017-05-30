package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.model.a.i;

public final class k {
    private final i a;

    public k(i iVar) {
        this.a = (i) d.a(iVar);
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

    public void a(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public void b() {
        try {
            this.a.b();
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

    public String c() {
        try {
            return this.a.c();
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

    public boolean e() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        try {
            return this.a.a(((k) obj).a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean f() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public float g() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
