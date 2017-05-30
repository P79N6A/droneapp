package com.google.android.gms.analytics.internal;

import android.os.Build.VERSION;
import java.io.File;

public class an {
    public static int a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            f.a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }

    public static boolean a(String str) {
        if (a() < 9) {
            return false;
        }
        File file = new File(str);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
        return true;
    }
}
