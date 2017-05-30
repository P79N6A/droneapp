package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;

public class a implements c {
    private WordBoxParcel a;

    a(WordBoxParcel wordBoxParcel) {
        this.a = wordBoxParcel;
    }

    public String a() {
        return this.a.g;
    }

    public String b() {
        return this.a.e;
    }

    public Rect c() {
        return f.a((c) this);
    }

    public Point[] d() {
        return f.a(this.a.c);
    }

    public List<? extends c> e() {
        return new ArrayList();
    }
}
