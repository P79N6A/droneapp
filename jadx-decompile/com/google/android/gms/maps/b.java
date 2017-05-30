package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.j;

public final class b {
    private static a a;

    private b() {
    }

    public static a a() {
        try {
            return new a(c().a());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(float f) {
        try {
            return new a(c().a(f));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(float f, float f2) {
        try {
            return new a(c().a(f, f2));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(float f, Point point) {
        try {
            return new a(c().a(f, point.x, point.y));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(CameraPosition cameraPosition) {
        try {
            return new a(c().a(cameraPosition));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(LatLng latLng) {
        try {
            return new a(c().a(latLng));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(LatLng latLng, float f) {
        try {
            return new a(c().a(latLng, f));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(LatLngBounds latLngBounds, int i) {
        try {
            return new a(c().a(latLngBounds, i));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        try {
            return new a(c().a(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static void a(a aVar) {
        a = (a) d.a(aVar);
    }

    public static a b() {
        try {
            return new a(c().b());
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public static a b(float f) {
        try {
            return new a(c().b(f));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    private static a c() {
        return (a) d.a(a, "CameraUpdateFactory is not initialized");
    }
}
