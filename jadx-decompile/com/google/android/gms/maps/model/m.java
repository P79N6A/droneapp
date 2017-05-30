package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public abstract class m implements l {
    private final int a;
    private final int c;

    public m(int i, int i2) {
        this.a = i;
        this.c = i2;
    }

    private static long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private static byte[] a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final Tile a(int i, int i2, int i3) {
        URL b = b(i, i2, i3);
        if (b == null) {
            return b;
        }
        try {
            return new Tile(this.a, this.c, a(b.openStream()));
        } catch (IOException e) {
            return null;
        }
    }

    public abstract URL b(int i, int i2, int i3);
}
