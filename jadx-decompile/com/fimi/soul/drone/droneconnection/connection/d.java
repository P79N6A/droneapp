package com.fimi.soul.drone.droneconnection.connection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fimi.soul.biz.h.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.q;
import it.a.a.e;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d {
    private static final String a = d.class.getSimpleName();
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private static final int i = 4096;
    private static final int q = 1;
    protected volatile boolean e = false;
    BufferedWriter f;
    boolean g = true;
    private File h;
    private List<Integer> j = new ArrayList();
    private final ConcurrentHashMap<String, e> k = new ConcurrentHashMap();
    private b l = b.a();
    private final AtomicInteger m = new AtomicInteger(0);
    private final Runnable n = new Runnable(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        private void a(com.fimi.soul.drone.c.b bVar, int i, byte[] bArr) {
            if (i >= 1) {
                for (int i2 = 0; i2 < i; i2++) {
                    c a = bVar.a(bArr[i2] & 255);
                    if (a != null) {
                        c a2 = c.a();
                        a2.a(this.a.e);
                        this.a.l.b(this.a.e);
                        if (a.c == e.v) {
                            this.a.l.a(a);
                        } else {
                            this.a.j.add(Integer.valueOf(a.c));
                            if (this.a.e) {
                                if (a2.f()) {
                                    a2.g();
                                }
                                if (a2.e()) {
                                    a2.a(a);
                                } else {
                                    a2.b();
                                }
                            } else {
                                if (!a2.f()) {
                                    a2.c();
                                } else if (a2.k()) {
                                    a2.g();
                                    return;
                                } else {
                                    a2.a(a);
                                }
                                if (a2.e()) {
                                    a2.d();
                                }
                            }
                            this.a.a(a.f());
                        }
                    }
                }
            }
        }

        public void run() {
            Looper.prepare();
            Thread thread = null;
            try {
                this.a.d();
                this.a.m.set(2);
                this.a.a();
                com.fimi.soul.drone.c.b bVar = new com.fimi.soul.drone.c.b();
                bVar.c.b();
                byte[] bArr = new byte[4096];
                while (this.a.m.get() == 2) {
                    int b = this.a.b(bArr);
                    if (b > 0) {
                        a(bVar, b, bArr);
                    }
                }
                if (thread != null && thread.isAlive()) {
                    thread.interrupt();
                }
                this.a.h();
            } catch (IOException e) {
                if (this.a.m.get() != 0) {
                    this.a.b(e.getMessage());
                }
                if (thread != null && thread.isAlive()) {
                    thread.interrupt();
                }
                this.a.h();
            } catch (Throwable th) {
                if (thread != null && thread.isAlive()) {
                    thread.interrupt();
                }
                this.a.h();
            }
            Looper.loop();
        }
    };
    private Thread o;
    private Handler p = new Handler(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                this.a.p.removeCallbacks(this.a.r);
                this.a.g = true;
            }
        }
    };
    private final Runnable r = new Runnable(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.j.size() < 1) {
                if (!this.a.k.isEmpty()) {
                    for (e eVar : this.a.k.values()) {
                        eVar.a(false);
                        eVar.b(false);
                    }
                    this.a.p.sendEmptyMessageDelayed(1, 1500);
                } else {
                    return;
                }
            }
            if (this.a.j.contains(Integer.valueOf(2)) || this.a.j.contains(Integer.valueOf(3)) || this.a.j.contains(Integer.valueOf(4)) || this.a.j.contains(Integer.valueOf(5)) || this.a.j.contains(Integer.valueOf(11))) {
                if (!this.a.k.isEmpty()) {
                    for (e eVar2 : this.a.k.values()) {
                        eVar2.a(true);
                        eVar2.b(true);
                    }
                } else {
                    return;
                }
            } else if (!this.a.k.isEmpty()) {
                if (this.a.j.contains(Integer.valueOf(99)) || this.a.j.contains(Integer.valueOf(98)) || this.a.j.contains(Integer.valueOf(100)) || this.a.j.contains(Integer.valueOf(105))) {
                    for (e eVar22 : this.a.k.values()) {
                        eVar22.b(true);
                        eVar22.a(false);
                    }
                }
            } else {
                return;
            }
            this.a.j.clear();
            this.a.p.postDelayed(this, 1500);
        }
    };

    private void a() {
        for (e a : this.k.values()) {
            a.a();
        }
    }

    private void a(com.fimi.soul.drone.c.a.b bVar) {
        if (!this.k.isEmpty()) {
            if (this.g) {
                this.g = false;
                this.p.postDelayed(this.r, 1500);
            }
            for (e a : this.k.values()) {
                a.a(bVar);
            }
        }
    }

    private void b() {
        if (!this.k.isEmpty()) {
            for (e b : this.k.values()) {
                b.b();
                this.g = true;
            }
        }
    }

    private void b(String str) {
        if (!this.k.isEmpty()) {
            for (e a : this.k.values()) {
                a.a(str);
            }
        }
    }

    public void a(c cVar) {
        byte[] d = cVar.d();
        try {
            if (cVar.c != 18) {
                if (this.f == null) {
                    this.f = f();
                }
                if (this.f != null) {
                    this.f.write(q.a());
                    this.f.write("    ");
                    StringBuffer stringBuffer = new StringBuffer(d.length * 2);
                    for (int i = 0; i < d.length; i++) {
                        stringBuffer.append(Character.forDigit((d[i] & 240) >> 4, 16));
                        stringBuffer.append(Character.forDigit(d[i] & 15, 16));
                        stringBuffer.append(" ");
                    }
                    this.f.write(stringBuffer.toString());
                    this.f.write("\n");
                    this.f.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void a(String str) {
        this.k.remove(str);
    }

    public void a(String str, e eVar) {
        this.k.put(str, eVar);
        if (i() == 2) {
            eVar.a();
        }
    }

    protected abstract int b(byte[] bArr);

    public void b(c cVar) {
        if (cVar != null) {
            byte[] d = cVar.d();
            if (d != null) {
                try {
                    d(d);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void c(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                d(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract void d();

    protected abstract void d(byte[] bArr);

    protected abstract void e();

    public BufferedWriter f() {
        File file = new File(j.a() + "/updateLog/");
        file.mkdirs();
        File file2 = new File(file, q.a() + ".txt");
        if (file2.exists()) {
            file2.delete();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
    }

    public void g() {
        if (this.m.compareAndSet(0, 1)) {
            this.o = new Thread(this.n, "MiLinkConnection-Connecting Thread");
            this.o.start();
        }
    }

    public void h() {
        if (this.m.get() != 0 && this.o != null) {
            try {
                this.m.set(0);
                if (this.o.isAlive() && !this.o.isInterrupted()) {
                    this.o.interrupt();
                }
                e();
                b();
            } catch (IOException e) {
                b(e.getMessage());
            }
        }
    }

    public int i() {
        return this.m.get();
    }

    public abstract int j();
}
