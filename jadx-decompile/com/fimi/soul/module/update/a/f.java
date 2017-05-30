package com.fimi.soul.module.update.a;

import android.text.TextUtils;
import com.fimi.kernel.c;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.c.a.a.bn;
import com.fimi.soul.drone.f.a;
import com.fimi.soul.module.update.b;
import com.fimi.soul.utils.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.Queue;

public class f implements c {
    private int a;
    private Queue<bn> b;

    public int a() {
        return this.a;
    }

    public long a(int i) {
        return new File(b(i)).length();
    }

    public void a(int i, int i2) {
        Object obj = (b) c.c().a(b.w, b.class);
        if (obj == null) {
            obj = new b();
        }
        obj.i().put(Integer.valueOf(i), Integer.valueOf(i2));
        switch (i) {
            case 0:
                obj.a(i2);
                break;
            case 1:
                obj.b(i2);
                break;
            case 3:
                obj.c(i2);
                break;
            case 4:
                obj.d(i2);
                obj.l(i2);
                break;
            case 5:
                obj.j(i2);
                break;
            case 6:
                obj.h(i2);
                break;
            case 9:
                obj.f(i2);
                break;
            case 10:
                obj.g(i2);
                break;
            case 11:
                obj.e(i2);
                break;
            case 13:
                obj.k(i2);
                obj.l(i2);
                break;
            case 14:
                obj.i(i2);
                break;
            case 15:
                obj.e(i2);
                break;
            case 253:
                obj.m(i2);
                break;
        }
        c.c().a(b.w, obj);
    }

    public void a(int i, byte[] bArr, byte[] bArr2) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i + i2] = bArr[i2];
        }
    }

    public void a(e eVar) {
        if (eVar != null) {
            File file = new File(c(eVar.d()));
            if (!file.exists()) {
                file.mkdir();
            }
            int d = eVar.d();
            eVar.a();
            long e = eVar.e();
            long f = eVar.f();
            long g = eVar.g();
            long h = eVar.h();
            InputStream inputStream = null;
            try {
                File file2 = new File(c(eVar.d()));
                if (file2.exists()) {
                    inputStream = new FileInputStream(file2);
                }
                file2 = new File(b(d));
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                byte[] a = com.fimi.soul.drone.g.b.a(e);
                byte[] a2 = com.fimi.soul.drone.g.b.a(f);
                byte[] a3 = com.fimi.soul.drone.g.b.a(g);
                byte[] a4 = com.fimi.soul.drone.g.b.a(h);
                byte[] a5 = com.fimi.soul.drone.f.c.a(inputStream);
                OutputStream fileOutputStream = new FileOutputStream(file2);
                a(16, a, a5);
                a(20, a2, a5);
                a(24, a3, a5);
                a(28, a4, a5);
                a(48, com.fimi.soul.drone.g.b.a((int) com.fimi.soul.drone.g.b.a(a.a(a5), 12)), a5);
                int[] a6 = a.a(a5);
                a(a5.length - 4, com.fimi.soul.drone.g.b.a((int) com.fimi.soul.drone.g.b.a(a6, a6.length - 1)), a5);
                fileOutputStream.write(a5);
                fileOutputStream.flush();
                inputStream.close();
                fileOutputStream.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public String b(int i) {
        return String.format("%s", new Object[]{c(i) + ".crc"});
    }

    public Queue<bn> b() {
        return this.b;
    }

    public String c(int i) {
        boolean i2 = d.a().i();
        boolean j = d.a().j();
        Object obj = null;
        if (i == 0 && j) {
            obj = b.x;
        } else if (i == 3 && j) {
            obj = b.A;
        } else if (i == 1 && j) {
            obj = b.y;
        } else if (i == 2 && j) {
            obj = b.z;
        } else if (i == 10 && j) {
            obj = b.B;
        } else if (i == 9 && j) {
            obj = b.D;
        } else if (i == 6 && j) {
            obj = b.C;
        } else if (i == 11 && j) {
            obj = b.F;
        } else if (i == 4 && j) {
            obj = "firmware.zip";
        } else if (i == 0 && i2) {
            obj = b.N;
        } else if (i == 1 && i2) {
            obj = b.O;
        } else if (i == 3 && i2) {
            obj = b.P;
        } else if (i == 13 && i2) {
            obj = b.Q;
        } else if (i == 10 && i2) {
            obj = b.I;
        } else if (i == 9 && i2) {
            obj = b.J;
        } else if (i == 6 && i2) {
            obj = b.K;
        } else if (i == 253 && j) {
            obj = b.M;
        } else if (i == 5 && j) {
            obj = b.L;
        }
        return TextUtils.isEmpty(obj) ? "" : j.p() + obj;
    }

    public Queue<bn> d(int i) {
        File file = new File(b(i));
        this.b = new LinkedList();
        if (file.exists()) {
            try {
                com.fimi.soul.drone.f.b.a(i, new FileInputStream(file), file.length());
                this.b = com.fimi.soul.drone.f.b.a();
                this.a = this.b.size();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.b;
    }

    public void e(int i) {
    }
}
