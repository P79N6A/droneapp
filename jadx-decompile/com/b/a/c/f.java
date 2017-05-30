package com.b.a.c;

import android.content.Context;
import android.os.Environment;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.a;
import java.io.File;
import java.io.IOException;

public final class f {
    private static final String a = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String b = "uil-images";

    private f() {
    }

    public static File a(Context context) {
        return a(context, true);
    }

    public static File a(Context context, String str) {
        File a = a(context);
        File file = new File(a, str);
        return (file.exists() || file.mkdir()) ? file : a;
    }

    public static File a(Context context, String str, boolean z) {
        File file = null;
        if (z && "mounted".equals(Environment.getExternalStorageState()) && d(context)) {
            file = new File(Environment.getExternalStorageDirectory(), str);
        }
        return (file == null || !(file.exists() || file.mkdirs())) ? context.getCacheDir() : file;
    }

    public static File a(Context context, boolean z) {
        File file = null;
        Object externalStorageState;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (NullPointerException e) {
            externalStorageState = "";
        } catch (IncompatibleClassChangeError e2) {
            externalStorageState = "";
        }
        if (z && "mounted".equals(r1) && d(context)) {
            file = c(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        d.c("Can't define system cache directory! '%s' will be used.", "/data/data/" + context.getPackageName() + "/cache/");
        return new File("/data/data/" + context.getPackageName() + "/cache/");
    }

    public static File b(Context context) {
        return a(context, b);
    }

    public static File b(Context context, String str) {
        File file = null;
        if ("mounted".equals(Environment.getExternalStorageState()) && d(context)) {
            file = new File(Environment.getExternalStorageDirectory(), str);
        }
        return (file == null || !(file.exists() || file.mkdirs())) ? context.getCacheDir() : file;
    }

    private static File c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), UriUtil.DATA_SCHEME), context.getPackageName()), a.d);
        if (file.exists()) {
            return file;
        }
        if (file.mkdirs()) {
            try {
                new File(file, ".nomedia").createNewFile();
                return file;
            } catch (IOException e) {
                d.b("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
                return file;
            }
        }
        d.c("Unable to create external cache directory", new Object[0]);
        return null;
    }

    private static boolean d(Context context) {
        return context.checkCallingOrSelfPermission(a) == 0;
    }
}
