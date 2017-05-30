package com.mining.app.zxing.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v4.view.ViewCompat;
import com.google.zxing.LuminanceSource;

public final class e extends LuminanceSource {
    private final byte[] a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public e(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public Bitmap c() {
        int width = getWidth();
        int height = getHeight();
        int[] iArr = new int[(width * height)];
        byte[] bArr = this.a;
        int i = (this.e * this.b) + this.d;
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = i2 * width;
            for (int i4 = 0; i4 < width; i4++) {
                iArr[i3 + i4] = ((bArr[i + i4] & 255) * 65793) | ViewCompat.MEASURED_STATE_MASK;
            }
            i += this.b;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    public byte[] getMatrix() {
        int i = 0;
        int width = getWidth();
        int height = getHeight();
        if (width == this.b && height == this.c) {
            return this.a;
        }
        int i2 = width * height;
        Object obj = new byte[i2];
        int i3 = (this.e * this.b) + this.d;
        if (width == this.b) {
            System.arraycopy(this.a, i3, obj, 0, i2);
            return obj;
        }
        Object obj2 = this.a;
        while (i < height) {
            System.arraycopy(obj2, i3, obj, i * width, width);
            i3 += this.b;
            i++;
        }
        return obj;
    }

    public byte[] getRow(int i, byte[] bArr) {
        if (i < 0 || i >= getHeight()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        Object obj;
        int width = getWidth();
        if (bArr == null || bArr.length < width) {
            obj = new byte[width];
        }
        System.arraycopy(this.a, ((this.e + i) * this.b) + this.d, obj, 0, width);
        return obj;
    }

    public boolean isCropSupported() {
        return true;
    }
}
