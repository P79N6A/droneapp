package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.io.File;

class aox {
    public static int a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            String str = "Invalid version number: ";
            String valueOf = String.valueOf(VERSION.SDK);
            aph.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 0;
        }
    }

    @TargetApi(9)
    static boolean a(String str) {
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
