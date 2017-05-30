package com.fimi.soul.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class f {
    private static f d = new f();
    private BufferedWriter a;
    private File b;
    private StringBuffer c = new StringBuffer();

    private f() {
    }

    public static f a() {
        if (d == null) {
            d = new f();
        }
        return d;
    }

    public void a(String str) {
        this.c.append(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSSS", Locale.US).format(new Date())).append("   ");
        this.c.append(str);
        this.c.append("\n");
        try {
            this.a.write(this.c.toString());
            this.a.flush();
            this.c = this.c.delete(0, this.c.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void b() {
        this.b = new File(j.q());
        if (!this.b.exists()) {
            this.b.getParentFile().mkdirs();
            try {
                this.b.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.a == null) {
            try {
                this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true)));
                this.a.flush();
                this.c = this.c.delete(0, this.c.length());
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    public boolean c() {
        if (!(this.b == null || this.b.exists())) {
            try {
                this.a.close();
                this.a = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return (this.a == null || this.b == null || !this.b.exists()) ? false : true;
    }
}
