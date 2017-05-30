package com.google.ads;

import android.content.Context;
import com.google.android.gms.ads.d;
import it.a.a.e;

@Deprecated
public final class b {
    public static final int a = -1;
    public static final int b = -2;
    public static final int c = 32;
    public static final int d = 50;
    public static final int e = 90;
    public static final b f = new b(-1, -2, "mb");
    public static final b g = new b(320, 50, "mb");
    public static final b h = new b(300, e.G, "as");
    public static final b i = new b(468, 60, "as");
    public static final b j = new b(728, 90, "as");
    public static final b k = new b(160, 600, "as");
    private final d l;

    public b(int i, int i2) {
        this(new d(i, i2));
    }

    private b(int i, int i2, String str) {
        this(new d(i, i2));
    }

    public b(d dVar) {
        this.l = dVar;
    }

    public int a() {
        return this.l.b();
    }

    public int a(Context context) {
        return this.l.b(context);
    }

    public b a(b... bVarArr) {
        b bVar = null;
        if (bVarArr != null) {
            float f = 0.0f;
            int a = a();
            int b = b();
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                float f2;
                b bVar2;
                b bVar3 = bVarArr[i];
                int a2 = bVar3.a();
                int b2 = bVar3.b();
                if (a(a2, b2)) {
                    f2 = ((float) (a2 * b2)) / ((float) (a * b));
                    if (f2 > 1.0f) {
                        f2 = 1.0f / f2;
                    }
                    if (f2 > f) {
                        bVar2 = bVar3;
                        i++;
                        bVar = bVar2;
                        f = f2;
                    }
                }
                f2 = f;
                bVar2 = bVar;
                i++;
                bVar = bVar2;
                f = f2;
            }
        }
        return bVar;
    }

    public boolean a(int i, int i2) {
        int a = a();
        int b = b();
        return ((float) i) <= ((float) a) * 1.25f && ((float) i) >= ((float) a) * 0.8f && ((float) i2) <= ((float) b) * 1.25f && ((float) i2) >= ((float) b) * 0.8f;
    }

    public int b() {
        return this.l.a();
    }

    public int b(Context context) {
        return this.l.a(context);
    }

    public boolean c() {
        return this.l.d();
    }

    public boolean d() {
        return this.l.c();
    }

    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.l.equals(((b) obj).l);
    }

    public int hashCode() {
        return this.l.hashCode();
    }

    public String toString() {
        return this.l.toString();
    }
}
