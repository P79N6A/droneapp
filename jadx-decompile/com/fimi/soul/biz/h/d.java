package com.fimi.soul.biz.h;

import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.r;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.utils.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class d {
    private static final String j = c.a().b();
    private BufferedWriter a;
    private BufferedWriter b;
    private SimpleDateFormat c;
    private SimpleDateFormat d;
    private SimpleDateFormat e;
    private File f;
    private File g;
    private StringBuffer h;
    private StringBuilder i;

    public static class a {
        private static final d a = new d();
    }

    private d() {
        this.h = new StringBuffer();
        this.i = new StringBuilder();
    }

    public static d a() {
        return a.a;
    }

    private void a(StringBuilder stringBuilder, File file) {
        try {
            if (this.a != null) {
                this.a.write(stringBuilder.toString());
                this.a.flush();
                stringBuilder.delete(0, stringBuilder.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private StringBuilder c(c cVar) {
        byte[] e = cVar.e();
        for (int i = 0; i < e.length; i++) {
            this.h.append(Character.forDigit((e[i] & 240) >> 4, 16));
            this.h.append(Character.forDigit(e[i] & 15, 16));
        }
        this.i.append(r.b(this.h.toString(), j));
        this.i.append("\n");
        this.h = this.h.delete(0, this.h.length());
        return this.i;
    }

    public void a(c cVar) {
        a(c(cVar), this.f);
    }

    public void b() {
        String format = g().format(new Date());
        File file = new File(j.a() + "/LOGDOWN/" + h() + "/DroneData");
        file.mkdirs();
        if (this.f == null || !this.f.exists()) {
            this.f = new File(file, format + ".sf");
        }
        if (this.a == null) {
            try {
                this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void b(c cVar) {
        a(c(cVar), this.g);
    }

    public void c() {
        String format = g().format(Long.valueOf(System.currentTimeMillis()));
        File file = new File(j.a() + "/LOGDOWN/" + h() + "/DroneData");
        file.mkdirs();
        if (this.g == null || !this.g.exists()) {
            this.g = new File(file, format + ".sf");
        }
        if (this.b == null) {
            try {
                this.b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g, true)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean d() {
        return (this.g == null || this.b == null) ? false : true;
    }

    public void e() {
        try {
            if (this.b != null) {
                this.b.close();
                this.b = null;
            }
        } catch (Exception e) {
        }
    }

    public void f() {
        if (this.g != null) {
            this.g.delete();
            this.g = null;
        }
    }

    public SimpleDateFormat g() {
        if (this.c == null) {
            this.c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }
        return this.c;
    }

    public String h() {
        if (this.d == null) {
            this.d = new SimpleDateFormat(f.b, Locale.US);
        }
        return this.d.format(new Date());
    }

    public String i() {
        if (this.e == null) {
            this.e = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS", Locale.US);
        }
        return this.e.format(new Date());
    }

    public boolean j() {
        return (this.a == null || this.f == null) ? false : true;
    }

    public void k() {
        if (this.a != null) {
            try {
                this.a.close();
                this.a = null;
                this.f = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
