package com.fimi.soul.drone.f;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class c {
    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
