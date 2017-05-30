package com.mining.app.zxing.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;

public final class c {
    static final int a;
    private static final String b = c.class.getSimpleName();
    private static final int c = 240;
    private static final int d = 240;
    private static final int e = 480;
    private static final int f = 360;
    private static c g;
    private final Context h;
    private final b i;
    private Camera j;
    private Rect k;
    private Rect l;
    private Rect m;
    private boolean n;
    private boolean o;
    private final boolean p;
    private final f q;
    private final a r;
    private int s;

    static {
        int parseInt;
        try {
            parseInt = Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            parseInt = 10000;
        }
        a = parseInt;
    }

    private c(Context context) {
        this.h = context;
        this.i = new b(context);
        this.p = Integer.parseInt(VERSION.SDK) > 3;
        this.q = new f(this.i, this.p);
        this.r = new a();
    }

    public static c a() {
        return g;
    }

    public static void a(Context context) {
        if (g == null) {
            g = new c(context);
        }
    }

    public int a(int i) {
        return (i * 58) / 108;
    }

    public e a(byte[] bArr, int i, int i2) {
        Rect f = f();
        int c = this.i.c();
        String d = this.i.d();
        switch (c) {
            case 16:
            case 17:
                return new e(bArr, i, i2, f.left, f.top, f.width(), f.height());
            default:
                if ("yuv420p".equals(d)) {
                    return new e(bArr, i, i2, f.left, f.top, f.width(), f.height());
                }
                throw new IllegalArgumentException("Unsupported picture format: " + c + '/' + d);
        }
    }

    public void a(Handler handler, int i) {
        if (this.j != null && this.o) {
            this.q.a(handler, i);
            if (this.p) {
                this.j.setOneShotPreviewCallback(this.q);
            } else {
                this.j.setPreviewCallback(this.q);
            }
        }
    }

    public void a(SurfaceHolder surfaceHolder) {
        if (this.j == null) {
            this.j = Camera.open();
            if (this.j == null) {
                throw new IOException();
            }
            this.j.setPreviewDisplay(surfaceHolder);
            if (!this.n) {
                this.n = true;
                this.i.a(this.j);
            }
            this.i.b(this.j);
            d.b();
        }
    }

    public int b(int i) {
        return (i * 42) / 192;
    }

    public void b() {
        if (this.j != null) {
            d.b();
            this.j.release();
            this.j = null;
        }
    }

    public void b(Handler handler, int i) {
        if (this.j != null && this.o) {
            this.r.a(handler, i);
            this.j.autoFocus(this.r);
        }
    }

    public void c() {
        if (this.j != null && !this.o) {
            this.j.startPreview();
            this.o = true;
        }
    }

    public void d() {
        if (this.j != null && this.o) {
            if (!this.p) {
                this.j.setPreviewCallback(null);
            }
            this.j.stopPreview();
            this.q.a(null, 0);
            this.r.a(null, 0);
            this.o = false;
        }
    }

    public Rect e() {
        Point b = this.i.b();
        if (this.k == null) {
            if (this.j == null) {
                return null;
            }
            int a = a(b.x);
            this.s = b(b.y);
            int i = (b.x - a) / 2;
            int i2 = ((b.y - this.s) - a) / 2;
            this.k = new Rect(i, i2, i + a, a + i2);
            Log.d(b, "Calculated framing rect: " + this.k);
        }
        return this.k;
    }

    public Rect f() {
        if (this.m == null) {
            Rect rect = new Rect(e());
            Point a = this.i.a();
            Point b = this.i.b();
            rect.left = (rect.left * a.y) / b.x;
            rect.right = (rect.right * a.y) / b.x;
            rect.top = (rect.top * a.x) / b.y;
            rect.bottom = (a.x * rect.bottom) / b.y;
            this.m = rect;
        }
        return this.m;
    }

    public Context g() {
        return this.h;
    }
}
