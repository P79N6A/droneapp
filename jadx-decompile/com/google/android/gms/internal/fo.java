package com.google.android.gms.internal;

import android.view.animation.Interpolator;

public class fo implements Interpolator {
    private float[] a;
    private float[] b;

    public fo(float f, float f2, float f3, float f4) {
        fp fpVar = new fp();
        fpVar.a(0.0f, 0.0f);
        fpVar.a(f, f2, f3, f4, 1.0f, 1.0f);
        a(fpVar);
    }

    private void a(fp fpVar) {
        int i = 0;
        float[] a = fpVar.a(0.002f);
        int length = a.length / 3;
        if (a[1] == 0.0f && a[2] == 0.0f && a[a.length - 2] == 1.0f && a[a.length - 1] == 1.0f) {
            this.a = new float[length];
            this.b = new float[length];
            float f = 0.0f;
            float f2 = 0.0f;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                float f3 = a[i2];
                int i4 = i3 + 1;
                float f4 = a[i3];
                i2 = i4 + 1;
                float f5 = a[i4];
                if (f3 == f && f4 != f2) {
                    throw new IllegalArgumentException("The Path cannot have discontinuity in the X axis.");
                } else if (f4 < f2) {
                    throw new IllegalArgumentException("The Path cannot loop back on itself.");
                } else {
                    this.a[i] = f4;
                    this.b[i] = f5;
                    i++;
                    f = f3;
                    f2 = f4;
                }
            }
            return;
        }
        throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1)");
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i;
            } else {
                int i3 = length;
                length = i2;
                i2 = i3;
            }
            i = length;
            length = i2;
        }
        float f2 = this.a[length] - this.a[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        f2 = (f - this.a[i]) / f2;
        float f3 = this.b[i];
        return (f2 * (this.b[length] - f3)) + f3;
    }
}
