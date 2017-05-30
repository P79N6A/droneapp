package com.fimi.soul.module.dronemanage;

import android.graphics.Point;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.List;

public class e {
    private c a;
    private List<i> b = new ArrayList();
    private i c;

    public e(c cVar) {
        this.a = cVar;
    }

    public void a() {
        for (i a : this.b) {
            a.a();
        }
    }

    public void a(LatLng latLng, LatLng latLng2) {
        a();
        int i = this.a.n().a(latLng).x;
        int i2 = this.a.n().a(latLng).y;
        int i3 = this.a.n().a(latLng2).x;
        int i4 = this.a.n().a(latLng2).y;
        double atan = Math.atan(10.0d / 20.0d);
        double sqrt = Math.sqrt((20.0d * 20.0d) + (10.0d * 10.0d));
        double[] a = a(i3 - i, i4 - i2, atan, sqrt);
        double[] a2 = a(i3 - i, i4 - i2, -atan, sqrt);
        sqrt = ((double) i3) - a2[0];
        double d = ((double) i4) - a2[1];
        Point point = new Point((int) (((double) i3) - a[0]), (int) (((double) i4) - a[1]));
        Point point2 = new Point((int) sqrt, (int) d);
        LatLng a3 = this.a.n().a(point);
        LatLng a4 = this.a.n().a(point2);
        this.c = this.a.a(new PolylineOptions().a(new LatLng[]{latLng2, a3}).a(-256).a(5.0f));
        if (!this.b.contains(this.c)) {
            this.b.add(this.c);
        }
        this.c = this.a.a(new PolylineOptions().a(new LatLng[]{latLng2, a4}).a(-256).a(5.0f));
        if (!this.b.contains(this.c)) {
            this.b.add(this.c);
        }
    }

    public double[] a(int i, int i2, double d, double d2) {
        double[] dArr = new double[2];
        double cos = (((double) i) * Math.cos(d)) - (((double) i2) * Math.sin(d));
        double sin = (((double) i) * Math.sin(d)) + (((double) i2) * Math.cos(d));
        double sqrt = Math.sqrt((cos * cos) + (sin * sin));
        sin = (sin / sqrt) * d2;
        dArr[0] = (cos / sqrt) * d2;
        dArr[1] = sin;
        return dArr;
    }
}
