package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.model.a.f.a;
import java.util.ArrayList;
import java.util.List;

public final class e {
    private final com.google.android.gms.maps.model.a.e a;

    public e(com.google.android.gms.maps.model.a.e eVar) {
        this.a = (com.google.android.gms.maps.model.a.e) d.a(eVar);
    }

    public int a() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int b() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public List<f> c() {
        try {
            List<IBinder> c = this.a.c();
            List<f> arrayList = new ArrayList(c.size());
            for (IBinder a : c) {
                arrayList.add(new f(a.a(a)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean d() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.a.a(((e) obj).a);
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
