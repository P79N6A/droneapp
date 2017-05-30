package com.fimi.soul.service;

import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.utils.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public class b {
    BufferedWriter a;
    BufferedWriter b;
    SimpleDateFormat c;

    private static class a {
        private static b a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.a;
    }

    private void a(c cVar) {
        if (cVar != null) {
            byte[] e = cVar.e();
            try {
                if (this.b == null) {
                    this.b = b();
                }
                this.b.write(c());
                this.b.write("    ");
                StringBuffer stringBuffer = new StringBuffer(e.length * 2);
                for (int i = 0; i < e.length; i++) {
                    stringBuffer.append(Character.forDigit((e[i] & 240) >> 4, 16));
                    stringBuffer.append(Character.forDigit(e[i] & 15, 16));
                    stringBuffer.append(" ");
                }
                this.b.write(stringBuffer.toString());
                this.b.write("\n");
                this.b.flush();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private String c() {
        if (this.c == null) {
            this.c = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US);
        }
        return this.c.format(Long.valueOf(System.currentTimeMillis()));
    }

    public void a(ConcurrentHashMap<String, c> concurrentHashMap) {
        if (concurrentHashMap != null) {
            synchronized (this) {
                for (Object obj : concurrentHashMap.keySet()) {
                    a((c) concurrentHashMap.get(obj));
                }
            }
        }
    }

    public BufferedWriter b() {
        com.fimi.soul.drone.e.a aVar = (com.fimi.soul.drone.e.a) com.fimi.kernel.c.c().a("0", com.fimi.soul.drone.e.a.class);
        String str = aVar != null ? aVar.d() + "" + aVar.e() + "" + aVar.g() : null;
        try {
            File file = new File(j.a() + "/" + "SAVEDRONEINFO/");
            file.mkdirs();
            if (str == null) {
                str = "savedrone.txt";
            }
            File file2 = new File(file, str);
            if (!file2.exists() && this.a != null) {
                this.a.close();
                file2.createNewFile();
                this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
                return this.a;
            } else if (file2.exists() || this.a != null) {
                if (file2.exists() && this.a == null) {
                    this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
                }
                return this.a;
            } else {
                file2.createNewFile();
                this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
                return this.a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
