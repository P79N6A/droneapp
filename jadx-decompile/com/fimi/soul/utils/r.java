package com.fimi.soul.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class r {
    public static FileOutputStream a() {
        File file = new File(j.b());
        file.mkdirs();
        File file2 = new File(file, "Parameters-" + q.a() + ".param");
        if (file2.exists()) {
            file2.delete();
        }
        return new FileOutputStream(file2);
    }

    public static FileOutputStream a(String str) {
        File file = new File(j.c());
        file.mkdirs();
        File file2 = new File(file, str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + q.a() + ".txt");
        if (file2.exists()) {
            file2.delete();
        }
        return new FileOutputStream(file2);
    }

    public static FileOutputStream b() {
        File file = new File(j.h());
        file.mkdirs();
        File file2 = new File(file, q.a() + ".txt");
        if (file2.exists()) {
            file2.delete();
        }
        return new FileOutputStream(file2);
    }

    public static BufferedOutputStream c() {
        File file = new File(j.e());
        file.mkdirs();
        File file2 = new File(file, q.a() + ".tlog");
        if (file2.exists()) {
            file2.delete();
        }
        return new BufferedOutputStream(new FileOutputStream(file2));
    }

    public static void d() {
        File file = new File(j.f());
        file.mkdirs();
        new File(file, ".nomedia").createNewFile();
    }
}
