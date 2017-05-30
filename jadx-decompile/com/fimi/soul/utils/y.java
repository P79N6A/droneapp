package com.fimi.soul.utils;

import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.i;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class y {
    private static final double b = 6372797.560856d;
    public List<LatLng> a;

    public static LatLng a(LatLng latLng, double d, double d2) {
        double d3 = latLng.a;
        double d4 = latLng.b;
        d3 = Math.toRadians(d3);
        d4 = Math.toRadians(d4);
        double toRadians = Math.toRadians(d);
        double d5 = d2 / b;
        double asin = Math.asin((Math.sin(d3) * Math.cos(d5)) + ((Math.cos(d3) * Math.sin(d5)) * Math.cos(toRadians)));
        return new LatLng(Math.toDegrees(asin), Math.toDegrees(Math.atan2((Math.sin(toRadians) * Math.sin(d5)) * Math.cos(d3), Math.cos(d5) - (Math.sin(d3) * Math.sin(asin))) + d4));
    }

    public static Double a(double d) {
        return Double.valueOf(Math.toDegrees(d / 6378100.0d));
    }

    public static Double a(LatLng latLng, LatLng latLng2) {
        return Double.valueOf(Math.hypot(latLng.a - latLng2.a, latLng.b - latLng2.b));
    }

    public static List<i> a(c cVar, ArrayList<LatLng> arrayList, int i) {
        List<i> arrayList2 = new ArrayList();
        int i2 = 0;
        Object obj = null;
        while (i2 < arrayList.size() - 1) {
            Object obj2;
            double e = e((LatLng) arrayList.get(i2), (LatLng) arrayList.get(i2 + 1));
            if (e >= 0.02d) {
                int i3 = (int) (e / 0.02d);
                double d = (((LatLng) arrayList.get(i2 + 1)).a - ((LatLng) arrayList.get(i2)).a) / ((double) i3);
                double d2 = (((LatLng) arrayList.get(i2 + 1)).b - ((LatLng) arrayList.get(i2)).b) / ((double) i3);
                obj2 = obj;
                LatLng latLng = new LatLng(((LatLng) arrayList.get(i2)).a, ((LatLng) arrayList.get(i2)).b);
                int i4 = 0;
                while (i4 < i3) {
                    LatLng latLng2 = new LatLng(latLng.a + d, latLng.b + d2);
                    if (obj2 == null) {
                        arrayList2.add(cVar.a(new PolylineOptions().a(latLng).a(latLng2).a(i)));
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    i4++;
                    latLng = latLng2;
                }
            } else if (obj == null) {
                arrayList2.add(cVar.a(new PolylineOptions().a((LatLng) arrayList.get(i2)).a((LatLng) arrayList.get(i2 + 1)).a(i)));
                obj2 = 1;
            } else {
                obj2 = null;
            }
            i2++;
            obj = obj2;
        }
        return arrayList2;
    }

    public static double b(LatLng latLng, LatLng latLng2) {
        double toRadians = Math.toRadians(latLng.a - latLng2.a);
        double toRadians2 = Math.toRadians(latLng.b - latLng2.b);
        toRadians = Math.sin(toRadians * 0.5d);
        toRadians *= toRadians;
        toRadians2 = Math.sin(toRadians2 * 0.5d);
        return Math.toDegrees(Math.asin(Math.sqrt(toRadians + ((toRadians2 * toRadians2) * (Math.cos(Math.toRadians(latLng.a)) * Math.cos(Math.toRadians(latLng2.a)))))) * 2.0d);
    }

    public static Double b(double d) {
        return Double.valueOf(6378100.0d * Math.toRadians(d));
    }

    public static ag c(LatLng latLng, LatLng latLng2) {
        return new ag(b * Math.toRadians(b(latLng, latLng2)));
    }

    public static double d(LatLng latLng, LatLng latLng2) {
        double toRadians = Math.toRadians(latLng.a);
        double toRadians2 = Math.toRadians(latLng.b);
        double toRadians3 = Math.toRadians(latLng2.a);
        double toRadians4 = Math.toRadians(latLng2.b);
        toRadians = Math.toDegrees(Math.atan2(Math.sin(toRadians4 - toRadians2) * Math.cos(toRadians3), (Math.cos(toRadians) * Math.sin(toRadians3)) - ((Math.sin(toRadians) * Math.cos(toRadians3)) * Math.cos(toRadians4 - toRadians2))));
        return toRadians >= 0.0d ? toRadians : toRadians + 360.0d;
    }

    private static double e(LatLng latLng, LatLng latLng2) {
        return new BigDecimal(c(latLng, latLng2).a()).setScale(3, RoundingMode.DOWN).doubleValue();
    }
}
