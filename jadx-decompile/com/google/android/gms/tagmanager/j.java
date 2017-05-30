package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class j extends t {
    private static final String a = eg.DEVICE_NAME.toString();

    public j() {
        super(a, new String[0]);
    }

    public a a(Map<String, a> map) {
        String str = Build.MANUFACTURER;
        Object obj = Build.MODEL;
        if (!(obj.startsWith(str) || str.equals("unknown"))) {
            obj = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(obj).length()).append(str).append(" ").append(obj).toString();
        }
        return cw.f(obj);
    }

    public boolean a() {
        return true;
    }
}
