package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class ar extends t {
    private static final String a = eg.LANGUAGE.toString();

    public ar() {
        super(a, new String[0]);
    }

    public a a(Map<String, a> map) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return cw.g();
        }
        String language = locale.getLanguage();
        return language == null ? cw.g() : cw.f(language.toLowerCase());
    }

    public boolean a() {
        return false;
    }

    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }
}
