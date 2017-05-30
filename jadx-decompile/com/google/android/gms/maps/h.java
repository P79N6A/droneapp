package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.a.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.j;

public final class h {
    private final f a;

    h(f fVar) {
        this.a = fVar;
    }

    public Point a(LatLng latLng) {
        try {
            return (Point) com.google.android.gms.c.f.a(this.a.a(latLng));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public LatLng a(Point point) {
        try {
            return this.a.a(com.google.android.gms.c.f.a(point));
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    public VisibleRegion a() {
        try {
            return this.a.a();
        } catch (RemoteException e) {
            throw new j(e);
        }
    }
}
