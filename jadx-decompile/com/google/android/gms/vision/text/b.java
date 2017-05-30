package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;

public class b implements c {
    private LineBoxParcel a;
    private List<a> b;

    b(LineBoxParcel lineBoxParcel) {
        this.a = lineBoxParcel;
    }

    List<a> a() {
        if (this.a.b.length == 0) {
            return new ArrayList(0);
        }
        if (this.b == null) {
            this.b = new ArrayList(this.a.b.length);
            for (WordBoxParcel aVar : this.a.b) {
                this.b.add(new a(aVar));
            }
        }
        return this.b;
    }

    public String b() {
        return this.a.f;
    }

    public Rect c() {
        return f.a((c) this);
    }

    public Point[] d() {
        return f.a(this.a.c);
    }

    public List<? extends c> e() {
        return a();
    }

    public String f() {
        return this.a.h;
    }

    public float g() {
        return this.a.c.f;
    }

    public boolean h() {
        return this.a.j;
    }
}
