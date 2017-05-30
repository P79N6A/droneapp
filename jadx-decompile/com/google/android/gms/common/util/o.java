package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class o {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        return a(inputStream, outputStream, false);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return a(inputStream, outputStream, z, 1024);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    a((Closeable) inputStream);
                    a((Closeable) outputStream);
                }
            }
        }
        return j;
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static byte[] a(InputStream inputStream) {
        return a(inputStream, true);
    }

    public static byte[] a(InputStream inputStream, boolean z) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
