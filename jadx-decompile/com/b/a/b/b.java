package com.b.a.b;

import android.graphics.Bitmap;
import com.b.a.b.a.f;
import com.b.a.b.e.a;
import com.b.a.c.d;

final class b implements Runnable {
    private static final String a = "Display image in ImageAware (loaded from %1$s) [%2$s]";
    private static final String b = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private static final String c = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private final Bitmap d;
    private final String e;
    private final a f;
    private final String g;
    private final com.b.a.b.c.a h;
    private final com.b.a.b.f.a i;
    private final f j;
    private final f k;

    public b(Bitmap bitmap, g gVar, f fVar, f fVar2) {
        this.d = bitmap;
        this.e = gVar.a;
        this.f = gVar.c;
        this.g = gVar.b;
        this.h = gVar.e.q();
        this.i = gVar.f;
        this.j = fVar;
        this.k = fVar2;
    }

    private boolean a() {
        return !this.g.equals(this.j.a(this.f));
    }

    public void run() {
        if (this.f.e()) {
            d.a(c, this.g);
            this.i.b(this.e, this.f.d());
        } else if (a()) {
            d.a(b, this.g);
            this.i.b(this.e, this.f.d());
        } else {
            d.a(a, this.k, this.g);
            this.h.a(this.d, this.f, this.k);
            this.j.b(this.f);
            this.i.a(this.e, this.f.d(), this.d);
        }
    }
}
