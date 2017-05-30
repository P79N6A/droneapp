package com.b.a.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class c {
    public static final int a = 32768;
    public static final int b = 512000;
    public static final int c = 75;

    public interface a {
        boolean a(int i, int i2);
    }

    private c() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }

    public static void a(InputStream inputStream) {
        while (true) {
            try {
                if (inputStream.read(new byte[32768], 0, 32768) == -1) {
                    break;
                }
            } catch (IOException e) {
            } finally {
                a((Closeable) inputStream);
            }
        }
    }

    private static boolean a(a aVar, int i, int i2) {
        return (aVar == null || aVar.a(i, i2) || (i * 100) / i2 >= 75) ? false : true;
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream, a aVar) {
        return a(inputStream, outputStream, aVar, 32768);
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream, a aVar, int i) {
        int available = inputStream.available();
        if (available <= 0) {
            available = 512000;
        }
        byte[] bArr = new byte[i];
        if (a(aVar, 0, available)) {
            return false;
        }
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, 0, i);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                i2 += read;
            } else {
                outputStream.flush();
                return true;
            }
        } while (!a(aVar, i2, available));
        return false;
    }
}
