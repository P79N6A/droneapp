package com.b.a.b.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import com.b.a.b.a.d;
import com.b.a.b.a.e;
import com.b.a.c.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class a implements b {
    protected static final String a = "Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]";
    protected static final String b = "Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]";
    protected static final String c = "Rotate image on %1$d° [%2$s]";
    protected static final String d = "Flip image horizontally [%s]";
    protected static final String e = "No stream for image [%s]";
    protected static final String f = "Image can't be decoded [%s]";
    protected final boolean g;

    protected static class a {
        public final int a;
        public final boolean b;

        protected a() {
            this.a = 0;
            this.b = false;
        }

        protected a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    protected static class b {
        public final e a;
        public final a b;

        protected b(e eVar, a aVar) {
            this.a = eVar;
            this.b = aVar;
        }
    }

    public a(boolean z) {
        this.g = z;
    }

    private boolean a(String str, String str2) {
        return "image/jpeg".equalsIgnoreCase(str2) && com.b.a.b.d.b.a.a(str) == com.b.a.b.d.b.a.FILE;
    }

    protected Bitmap a(Bitmap bitmap, c cVar, int i, boolean z) {
        Matrix matrix = new Matrix();
        d e = cVar.e();
        if (e == d.EXACTLY || e == d.EXACTLY_STRETCHED) {
            float b = com.b.a.c.b.b(new e(bitmap.getWidth(), bitmap.getHeight(), i), cVar.d(), cVar.f(), e == d.EXACTLY_STRETCHED);
            if (Float.compare(b, 1.0f) != 0) {
                matrix.setScale(b, b);
                if (this.g) {
                    com.b.a.c.d.a(b, r2, r2.a(b), Float.valueOf(b), cVar.a());
                }
            }
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.g) {
                com.b.a.c.d.a(d, cVar.a());
            }
        }
        if (i != 0) {
            matrix.postRotate((float) i);
            if (this.g) {
                com.b.a.c.d.a(c, Integer.valueOf(i), cVar.a());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public Bitmap a(c cVar) {
        Closeable b = b(cVar);
        if (b == null) {
            com.b.a.c.d.d(e, cVar.a());
            return null;
        }
        try {
            b a = a((InputStream) b, cVar);
            b = b(b, cVar);
            Bitmap decodeStream = BitmapFactory.decodeStream(b, null, a(a.a, cVar));
            if (decodeStream != null) {
                return a(decodeStream, cVar, a.b.a, a.b.b);
            }
            com.b.a.c.d.d(f, cVar.a());
            return decodeStream;
        } finally {
            c.a(b);
        }
    }

    protected Options a(e eVar, c cVar) {
        int i;
        d e = cVar.e();
        if (e == d.NONE) {
            i = 1;
        } else if (e == d.NONE_SAFE) {
            i = com.b.a.c.b.a(eVar);
        } else {
            i = com.b.a.c.b.a(eVar, cVar.d(), cVar.f(), e == d.IN_SAMPLE_POWER_OF_2);
        }
        if (i > 1 && this.g) {
            com.b.a.c.d.a(a, eVar, eVar.a(i), Integer.valueOf(i), cVar.a());
        }
        Options j = cVar.j();
        j.inSampleSize = i;
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.b.a.b.b.a.a a(java.lang.String r6) {
        /*
        r5 = this;
        r1 = 0;
        r0 = 1;
        r2 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x002a }
        r3 = com.b.a.b.d.b.a.FILE;	 Catch:{ IOException -> 0x002a }
        r3 = r3.c(r6);	 Catch:{ IOException -> 0x002a }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002a }
        r3 = "Orientation";
        r4 = 1;
        r2 = r2.getAttributeInt(r3, r4);	 Catch:{ IOException -> 0x002a }
        switch(r2) {
            case 1: goto L_0x0017;
            case 2: goto L_0x0018;
            case 3: goto L_0x0022;
            case 4: goto L_0x0023;
            case 5: goto L_0x0027;
            case 6: goto L_0x001e;
            case 7: goto L_0x001f;
            case 8: goto L_0x0026;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = r1;
    L_0x0018:
        r2 = new com.b.a.b.b.a$a;
        r2.<init>(r1, r0);
        return r2;
    L_0x001e:
        r0 = r1;
    L_0x001f:
        r1 = 90;
        goto L_0x0018;
    L_0x0022:
        r0 = r1;
    L_0x0023:
        r1 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x0018;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x0018;
    L_0x002a:
        r2 = move-exception;
        r2 = "Can't read EXIF tags from file [%s]";
        r0 = new java.lang.Object[r0];
        r0[r1] = r6;
        com.b.a.c.d.c(r2, r0);
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.b.a.a(java.lang.String):com.b.a.b.b.a$a");
    }

    protected b a(InputStream inputStream, c cVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        String b = cVar.b();
        a a = (cVar.i() && a(b, options.outMimeType)) ? a(b) : new a();
        return new b(new e(options.outWidth, options.outHeight, a.a), a);
    }

    protected InputStream b(c cVar) {
        return cVar.g().a(cVar.b(), cVar.h());
    }

    protected InputStream b(InputStream inputStream, c cVar) {
        try {
            inputStream.reset();
            return inputStream;
        } catch (IOException e) {
            c.a((Closeable) inputStream);
            return b(cVar);
        }
    }
}
