package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.android.volley.d;
import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.v;

public class l extends n<Bitmap> {
    private static final int a = 1000;
    private static final int b = 2;
    private static final float c = 2.0f;
    private static final Object i = new Object();
    private final b<Bitmap> d;
    private final Config e;
    private final int f;
    private final int g;
    private ScaleType h;

    @Deprecated
    public l(String str, b<Bitmap> bVar, int i, int i2, Config config, a aVar) {
        this(str, bVar, i, i2, ScaleType.CENTER_INSIDE, config, aVar);
    }

    public l(String str, b<Bitmap> bVar, int i, int i2, ScaleType scaleType, Config config, a aVar) {
        super(0, str, aVar);
        a(new d(1000, 2, c));
        this.d = bVar;
        this.e = config;
        this.f = i;
        this.g = i2;
        this.h = scaleType;
    }

    static int a(int i, int i2, int i3, int i4) {
        float f = 1.0f;
        while (((double) (f * c)) <= Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4))) {
            f *= c;
        }
        return (int) f;
    }

    private static int a(int i, int i2, int i3, int i4, ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else {
            if (i == 0) {
                return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
            }
            if (i2 == 0) {
                return i;
            }
            double d = ((double) i4) / ((double) i3);
            return scaleType == ScaleType.CENTER_CROP ? ((double) i) * d < ((double) i2) ? (int) (((double) i2) / d) : i : ((double) i) * d > ((double) i2) ? (int) (((double) i2) / d) : i;
        }
    }

    private p<Bitmap> b(j jVar) {
        Object decodeByteArray;
        byte[] bArr = jVar.b;
        Options options = new Options();
        if (this.f == 0 && this.g == 0) {
            options.inPreferredConfig = this.e;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a = a(this.f, this.g, i, i2, this.h);
            int a2 = a(this.g, this.f, i2, i, this.h);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i, i2, a, a2);
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray2 == null || (decodeByteArray2.getWidth() <= a && decodeByteArray2.getHeight() <= a2)) {
                Bitmap bitmap = decodeByteArray2;
            } else {
                decodeByteArray = Bitmap.createScaledBitmap(decodeByteArray2, a, a2, true);
                decodeByteArray2.recycle();
            }
        }
        return decodeByteArray == null ? p.a(new com.android.volley.l(jVar)) : p.a(decodeByteArray, h.a(jVar));
    }

    protected p<Bitmap> a(j jVar) {
        p<Bitmap> b;
        synchronized (i) {
            try {
                b = b(jVar);
            } catch (Throwable e) {
                v.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(jVar.b.length), g());
                b = p.a(new com.android.volley.l(e));
            }
        }
        return b;
    }

    protected void a(Bitmap bitmap) {
        this.d.a(bitmap);
    }

    protected /* synthetic */ void b(Object obj) {
        a((Bitmap) obj);
    }

    public n.b x() {
        return n.b.LOW;
    }
}
