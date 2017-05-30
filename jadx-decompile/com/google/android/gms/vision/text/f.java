package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;

final class f {
    static Rect a(c cVar) {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : cVar.d()) {
            i4 = Math.min(i4, point.x);
            i3 = Math.max(i3, point.x);
            i = Math.min(i, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i4, i, i3, i2);
    }

    static Point[] a(BoundingBoxParcel boundingBoxParcel) {
        r0 = new Point[4];
        double sin = Math.sin(Math.toRadians((double) boundingBoxParcel.f));
        double cos = Math.cos(Math.toRadians((double) boundingBoxParcel.f));
        r0[0] = new Point(boundingBoxParcel.b, boundingBoxParcel.c);
        r0[1] = new Point((int) (((double) boundingBoxParcel.b) + (((double) boundingBoxParcel.d) * cos)), (int) (((double) boundingBoxParcel.c) + (((double) boundingBoxParcel.d) * sin)));
        r0[2] = new Point((int) (((double) r0[1].x) - (sin * ((double) boundingBoxParcel.e))), (int) ((cos * ((double) boundingBoxParcel.e)) + ((double) r0[1].y)));
        r0[3] = new Point(r0[0].x + (r0[2].x - r0[1].x), r0[0].y + (r0[2].y - r0[1].y));
        return r0;
    }
}
