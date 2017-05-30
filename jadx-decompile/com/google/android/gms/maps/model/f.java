package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.d;

public final class f {
    private final com.google.android.gms.maps.model.a.f a;

    public f(com.google.android.gms.maps.model.a.f fVar) {
        this.a = (com.google.android.gms.maps.model.a.f) d.a(fVar);
    }

    public String a() {
        try {
            return this.a.a();
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

    public void c() {
        try {
            this.a.c();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            return this.a.a(((f) obj).a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
