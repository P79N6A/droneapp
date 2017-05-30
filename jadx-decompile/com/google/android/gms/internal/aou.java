package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.a.a.c.c.h;
import org.a.a.c.c.l;

public class aou implements aoz {
    private static aou a;
    private static final Object b = new Object();
    private static final Set<String> e = new HashSet(Arrays.asList(new String[]{"GET", h.a, "POST", l.a}));
    private apo c;
    private apa d;

    private aou(Context context) {
        this(apb.a(context), new aps());
    }

    aou(apa com_google_android_gms_internal_apa, apo com_google_android_gms_internal_apo) {
        this.d = com_google_android_gms_internal_apa;
        this.c = com_google_android_gms_internal_apo;
    }

    public static aoz a(Context context) {
        aoz com_google_android_gms_internal_aoz;
        synchronized (b) {
            if (a == null) {
                a = new aou(context);
            }
            com_google_android_gms_internal_aoz = a;
        }
        return com_google_android_gms_internal_aoz;
    }

    public void a() {
        apu.b().d();
    }

    public boolean a(String str) {
        return a(str, null, null, null, null);
    }

    public boolean a(String str, String str2) {
        return a(str, null, str2, null, null);
    }

    public boolean a(String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        if (str2 != null && !e.contains(str2)) {
            aph.b(String.format("Unsupport http method %s. Drop the hit.", new Object[]{str2}));
            return false;
        } else if (apn.a().b() || this.c.a()) {
            this.d.a(str, str2, str3, map, str4);
            return true;
        } else {
            aph.b("Too many hits sent too quickly (rate throttled).");
            return false;
        }
    }
}
