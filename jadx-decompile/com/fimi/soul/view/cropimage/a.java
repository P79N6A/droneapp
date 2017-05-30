package com.fimi.soul.view.cropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class a {
    public static final String a = "RotateBitmap";
    private Bitmap b;
    private int c;

    public a(Bitmap bitmap) {
        this.b = bitmap;
        this.c = 0;
    }

    public a(Bitmap bitmap, int i) {
        this.b = bitmap;
        this.c = i % 360;
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(Bitmap bitmap) {
        this.b = bitmap;
    }

    public Bitmap b() {
        return this.b;
    }

    public Matrix c() {
        Matrix matrix = new Matrix();
        if (this.c != 0) {
            matrix.preTranslate((float) (-(this.b.getWidth() / 2)), (float) (-(this.b.getHeight() / 2)));
            matrix.postRotate((float) this.c);
            matrix.postTranslate((float) (f() / 2), (float) (e() / 2));
        }
        return matrix;
    }

    public boolean d() {
        return (this.c / 90) % 2 != 0;
    }

    public int e() {
        return d() ? this.b.getWidth() : this.b.getHeight();
    }

    public int f() {
        return d() ? this.b.getHeight() : this.b.getWidth();
    }

    public void g() {
        if (this.b != null) {
            this.b.recycle();
            this.b = null;
        }
    }
}
