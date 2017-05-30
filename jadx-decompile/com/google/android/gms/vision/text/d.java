package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class d implements c {
    private LineBoxParcel[] a;
    private Point[] b;
    private List<b> c;
    private String d;
    private Rect e;

    d(SparseArray<LineBoxParcel> sparseArray) {
        this.a = new LineBoxParcel[sparseArray.size()];
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = (LineBoxParcel) sparseArray.valueAt(i);
        }
    }

    private static Point[] a(int i, int i2, int i3, int i4, BoundingBoxParcel boundingBoxParcel) {
        int i5 = boundingBoxParcel.b;
        int i6 = boundingBoxParcel.c;
        double sin = Math.sin(Math.toRadians((double) boundingBoxParcel.f));
        double cos = Math.cos(Math.toRadians((double) boundingBoxParcel.f));
        Point[] pointArr = new Point[]{new Point(i, i2), new Point(i3, i2), new Point(i3, i4), new Point(i, i4)};
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = (int) ((((double) pointArr[i7].x) * sin) + (((double) pointArr[i7].y) * cos));
            pointArr[i7].x = (int) ((((double) pointArr[i7].x) * cos) - (((double) pointArr[i7].y) * sin));
            pointArr[i7].y = i8;
            pointArr[i7].offset(i5, i6);
        }
        return pointArr;
    }

    private static Point[] a(BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2) {
        int i = -boundingBoxParcel2.b;
        int i2 = -boundingBoxParcel2.c;
        double sin = Math.sin(Math.toRadians((double) boundingBoxParcel2.f));
        double cos = Math.cos(Math.toRadians((double) boundingBoxParcel2.f));
        Point[] pointArr = new Point[4];
        pointArr[0] = new Point(boundingBoxParcel.b, boundingBoxParcel.c);
        pointArr[0].offset(i, i2);
        i = (int) ((((double) pointArr[0].x) * cos) + (((double) pointArr[0].y) * sin));
        i2 = (int) ((sin * ((double) (-pointArr[0].x))) + (cos * ((double) pointArr[0].y)));
        pointArr[0].x = i;
        pointArr[0].y = i2;
        pointArr[1] = new Point(boundingBoxParcel.d + i, i2);
        pointArr[2] = new Point(boundingBoxParcel.d + i, boundingBoxParcel.e + i2);
        pointArr[3] = new Point(i, i2 + boundingBoxParcel.e);
        return pointArr;
    }

    public String a() {
        if (this.d != null) {
            return this.d;
        }
        HashMap hashMap = new HashMap();
        for (LineBoxParcel lineBoxParcel : this.a) {
            hashMap.put(lineBoxParcel.h, Integer.valueOf((hashMap.containsKey(lineBoxParcel.h) ? ((Integer) hashMap.get(lineBoxParcel.h)).intValue() : 0) + 1));
        }
        this.d = (String) ((Entry) Collections.max(hashMap.entrySet(), new Comparator<Entry<String, Integer>>(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public int a(Entry<String, Integer> entry, Entry<String, Integer> entry2) {
                return ((Integer) entry.getValue()).compareTo((Integer) entry2.getValue());
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((Entry) obj, (Entry) obj2);
            }
        })).getKey();
        if (this.d == null || this.d.isEmpty()) {
            this.d = "und";
        }
        return this.d;
    }

    public String b() {
        if (this.a.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(this.a[0].f);
        for (int i = 1; i < this.a.length; i++) {
            stringBuilder.append("\n");
            stringBuilder.append(this.a[i].f);
        }
        return stringBuilder.toString();
    }

    public Rect c() {
        if (this.e == null) {
            this.e = f.a((c) this);
        }
        return this.e;
    }

    public Point[] d() {
        if (this.b == null) {
            f();
        }
        return this.b;
    }

    public List<? extends c> e() {
        return g();
    }

    void f() {
        if (this.a.length == 0) {
            this.b = new Point[0];
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (LineBoxParcel lineBoxParcel : this.a) {
            Point[] a = a(lineBoxParcel.c, this.a[0].c);
            int i5 = 0;
            while (i5 < 4) {
                Point point = a[i5];
                int min = Math.min(i3, point.x);
                i3 = Math.max(i2, point.x);
                i2 = Math.min(i, point.y);
                i5++;
                i4 = Math.max(i4, point.y);
                i = i2;
                i2 = i3;
                i3 = min;
            }
        }
        this.b = a(i3, i, i2, i4, this.a[0].c);
    }

    List<b> g() {
        if (this.a.length == 0) {
            return new ArrayList(0);
        }
        if (this.c == null) {
            this.c = new ArrayList(this.a.length);
            for (LineBoxParcel bVar : this.a) {
                this.c.add(new b(bVar));
            }
        }
        return this.c;
    }
}
