package com.fimi.soul.module.droneTrack.a;

import android.os.Looper;
import com.fimi.kernel.utils.x;
import com.fimi.soul.module.droneTrack.e;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static final String c = com.fimi.soul.biz.h.c.a().b();
    long a = 0;
    int b = 0;
    private volatile String d;
    private List<Object> e = new ArrayList();
    private volatile Object f;

    private static class a {
        private static c a = new c();

        private a() {
        }
    }

    public static c a() {
        return a.a;
    }

    private static Object[] b(String[] strArr, int i) {
        int length = strArr.length % i == 0 ? strArr.length / i : strArr.length / i;
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * i;
            List arrayList2 = new ArrayList();
            int i4 = i3;
            i3 = 0;
            while (i3 < i && i4 < strArr.length) {
                int i5 = i4 + 1;
                arrayList2.add(strArr[i4]);
                i3++;
                i4 = i5;
            }
            arrayList.add(arrayList2);
        }
        Object[] objArr = new Object[arrayList.size()];
        for (i4 = 0; i4 < arrayList.size(); i4++) {
            List list = (List) arrayList.get(i4);
            String[] strArr2 = new String[list.size()];
            for (i5 = 0; i5 < list.size(); i5++) {
                strArr2[i5] = (String) list.get(i5);
            }
            objArr[i4] = strArr2;
        }
        return objArr;
    }

    public void a(final String str, final e eVar) {
        x.b(new Runnable(this) {
            final /* synthetic */ c c;

            public void run() {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                this.c.a = System.currentTimeMillis();
                if (str != null) {
                    File file = new File(str);
                    if (file.exists()) {
                        try {
                            byte[] bArr = new byte[((int) file.length())];
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                            randomAccessFile.read(bArr);
                            String[] split = new String(bArr).split("\n");
                            this.c.b();
                            int length = split.length;
                            Object[] a = c.b(split, split.length / 4);
                            if (a.length >= 4) {
                                d dVar = new d(eVar);
                                dVar.d().a((String[]) a[0]);
                                dVar.c().a((String[]) a[1]);
                                dVar.b().a((String[]) a[2]);
                                dVar.a().a((String[]) a[3]);
                                dVar.e();
                                Looper.loop();
                            }
                            randomAccessFile.close();
                        } catch (Exception e) {
                            if (eVar != null) {
                                eVar.a(e.toString());
                            }
                        }
                    }
                }
            }
        });
    }

    public void b() {
        b.a().d();
        this.b = 0;
        this.e.clear();
    }
}
