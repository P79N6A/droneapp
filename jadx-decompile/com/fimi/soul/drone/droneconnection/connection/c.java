package com.fimi.soul.drone.droneconnection.connection;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.r;
import com.fimi.soul.utils.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map.Entry;

public class c {
    private static final String c = com.fimi.soul.biz.h.c.a().b();
    HandlerThread a;
    StringBuffer b;
    private Handler d;
    private SimpleDateFormat e;
    private SimpleDateFormat f;
    private SimpleDateFormat g;
    private BufferedWriter h;
    private File i;
    private File j;
    private StringBuilder k;
    private boolean l;
    private boolean m;
    private Runnable n;

    static class a {
        private static final c a = new c();

        a() {
        }
    }

    private c() {
        this.b = new StringBuffer();
        this.k = new StringBuilder();
        this.l = false;
        this.n = new Runnable(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.l = false;
                this.a.d.postDelayed(this, 400);
            }
        };
        if (this.a == null && this.d == null) {
            this.a = new HandlerThread("LogHandler");
            this.a.start();
            this.d = new Handler(this.a.getLooper());
        }
    }

    public static c a() {
        return a.a;
    }

    private void a(com.fimi.soul.drone.c.a.c cVar, String str) {
        byte[] e = cVar.e();
        this.b.append(str).append("    ");
        for (int i = 0; i < e.length; i++) {
            this.b.append(Character.forDigit((e[i] & 240) >> 4, 16));
            this.b.append(Character.forDigit(e[i] & 15, 16));
            this.b.append(" ");
        }
        this.k.append(r.b(this.b.toString(), c));
        this.k.append("\n");
        this.b = this.b.delete(0, this.b.length());
        if (this.m && this.i != null) {
            a(this.k, this.i);
        } else if (!this.m && this.j != null) {
            a(this.k, this.j);
        }
    }

    private void a(StringBuilder stringBuilder, File file) {
        try {
            this.h.write(stringBuilder.toString());
            this.h.flush();
            stringBuilder.delete(0, stringBuilder.length());
            this.l = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(com.fimi.soul.drone.c.a.c cVar) {
        if (cVar.c != 105 || this.l) {
            a(cVar, j());
        } else {
            this.l = true;
        }
    }

    public void a(String str) {
        IOException e;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(j.l() + "log.txt");
            if (file == null || !file.exists()) {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
            try {
                fileOutputStream2.write((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " : " + str).getBytes());
                fileOutputStream2.write("\r\n".getBytes());
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                e2 = e3;
                fileOutputStream = fileOutputStream2;
                try {
                    e2.printStackTrace();
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                fileOutputStream.flush();
                fileOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            e22 = e5;
            e22.printStackTrace();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }

    public void a(boolean z) {
        if (this.m != z) {
            this.m = z;
        }
    }

    public void b() {
        String format = h().format(Long.valueOf(System.currentTimeMillis()));
        File file = new File(j.a() + "/LOGDOWN/" + i() + "/AirFly");
        file.mkdirs();
        if (this.i == null || !this.i.exists()) {
            this.i = new File(file, format + ".txt");
        }
        if (this.h == null) {
            try {
                this.h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.i, true)));
                for (Entry value : com.fimi.soul.biz.h.a.a().b().entrySet()) {
                    a((com.fimi.soul.drone.c.a.c) value.getValue(), j());
                }
                if (Looper.myQueue() != null) {
                    this.d.postDelayed(this.n, 200);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        String format = h().format(new Date());
        File file = new File(j.a() + "/LOGDOWN/" + i() + "/NoFly");
        file.mkdirs();
        if (this.j == null || !this.j.exists()) {
            this.j = new File(file, format + ".txt");
        }
        if (this.h == null) {
            try {
                this.h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.j, true)));
                for (Entry value : com.fimi.soul.biz.h.a.a().b().entrySet()) {
                    a((com.fimi.soul.drone.c.a.c) value.getValue(), j());
                }
                if (Looper.myQueue() != null) {
                    this.d.postDelayed(this.n, 200);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void d() {
        if (this.h != null) {
            try {
                this.h.close();
                this.h = null;
                this.i = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean e() {
        return (this.h == null || this.i == null) ? false : true;
    }

    public boolean f() {
        return (this.h == null || this.j == null) ? false : true;
    }

    public void g() {
        if (this.h != null) {
            try {
                this.h.close();
                this.h = null;
                this.j = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public SimpleDateFormat h() {
        if (this.e == null) {
            this.e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }
        return this.e;
    }

    public String i() {
        if (this.f == null) {
            this.f = new SimpleDateFormat(f.b, Locale.US);
        }
        return this.f.format(Long.valueOf(System.currentTimeMillis()));
    }

    public String j() {
        if (this.g == null) {
            this.g = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS", Locale.US);
        }
        return this.g.format(Long.valueOf(System.currentTimeMillis()));
    }

    public boolean k() {
        return this.j != null && this.j.length() > 10485760;
    }
}
