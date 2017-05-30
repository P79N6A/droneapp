package com.fimi.soul.drone.g;

import android.content.Context;
import com.fimi.soul.drone.c.a.a.bn;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class d {
    public static Queue<bn> a = new LinkedList();

    public static Queue<bn> a() {
        return a;
    }

    public static void a(Queue<bn> queue) {
        queue.removeAll(queue);
    }

    public static byte[] a(InputStream inputStream, long j, Context context) {
        if (a.size() > 1) {
            a(a);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Opcodes.GETFIELD];
        int i = 1;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                bn bnVar = new bn();
                bnVar.d = (short) i;
                if (bArr.length == Opcodes.GETFIELD) {
                    bnVar.a(bArr.length);
                    bnVar.b(bArr.length + 2);
                    for (read = 0; read < bArr.length; read++) {
                        bnVar.f[read] = bArr[read];
                    }
                    a.offer(bnVar);
                } else {
                    bnVar.a(bArr.length);
                    bnVar.b(bArr.length + 2);
                    for (read = 0; read < bArr.length; read++) {
                        bnVar.f[read] = bArr[read];
                    }
                    a.offer(bnVar);
                }
                bArr = ((long) i) == j / 180 ? new byte[((int) (j % 180))] : new byte[Opcodes.GETFIELD];
                i++;
            } else {
                inputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
