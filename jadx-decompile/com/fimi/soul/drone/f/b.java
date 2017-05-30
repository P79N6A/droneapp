package com.fimi.soul.drone.f;

import com.fimi.soul.drone.c.a.a.bn;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;

public class b {
    public static final int a = 176;
    public static Queue<bn> b = new LinkedList();

    public static Queue<bn> a() {
        return b;
    }

    public static void a(Queue<bn> queue) {
        queue.removeAll(queue);
    }

    public static byte[] a(int i, InputStream inputStream, long j) {
        int i2 = 1;
        if (b.size() > 1) {
            a(b);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[176];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                bn bnVar = new bn();
                bnVar.e = (byte) i;
                bnVar.d = (short) i2;
                if (bArr.length == 176) {
                    bnVar.a(bArr.length);
                    bnVar.b(bArr.length + 3);
                    for (read = 0; read < bArr.length; read++) {
                        bnVar.f[read] = bArr[read];
                    }
                    b.offer(bnVar);
                } else {
                    bnVar.a(bArr.length);
                    bnVar.b(bArr.length + 3);
                    for (read = 0; read < bArr.length; read++) {
                        bnVar.f[read] = bArr[read];
                    }
                    b.offer(bnVar);
                }
                bArr = new byte[176];
                i2++;
            } else {
                inputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
