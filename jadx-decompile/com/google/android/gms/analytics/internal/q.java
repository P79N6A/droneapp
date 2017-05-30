package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.xiaomi.market.sdk.j;

public class q extends t {
    protected String a;
    protected String b;
    protected int c;
    protected boolean d;
    protected int e;
    protected boolean f;
    protected boolean g;

    public q(v vVar) {
        super(vVar);
    }

    private static int a(String str) {
        String toLowerCase = str.toLowerCase();
        return "verbose".equals(toLowerCase) ? 0 : j.ag.equals(toLowerCase) ? 1 : "warning".equals(toLowerCase) ? 2 : "error".equals(toLowerCase) ? 3 : -1;
    }

    protected void a() {
        j();
    }

    void a(b bVar) {
        int a;
        q("Loading global XML config values");
        if (bVar.a()) {
            String b = bVar.b();
            this.b = b;
            b("XML config - app name", b);
        }
        if (bVar.c()) {
            b = bVar.d();
            this.a = b;
            b("XML config - app version", b);
        }
        if (bVar.e()) {
            a = a(bVar.f());
            if (a >= 0) {
                this.c = a;
                a("XML config - log level", Integer.valueOf(a));
            }
        }
        if (bVar.g()) {
            a = bVar.h();
            this.e = a;
            this.d = true;
            b("XML config - dispatch period (sec)", Integer.valueOf(a));
        }
        if (bVar.i()) {
            boolean j = bVar.j();
            this.g = j;
            this.f = true;
            b("XML config - dry run", Boolean.valueOf(j));
        }
    }

    public String b() {
        D();
        return this.a;
    }

    public String c() {
        D();
        return this.b;
    }

    public boolean d() {
        D();
        return false;
    }

    public int e() {
        D();
        return this.c;
    }

    public boolean f() {
        D();
        return this.d;
    }

    public int g() {
        D();
        return this.e;
    }

    public boolean h() {
        D();
        return this.f;
    }

    public boolean i() {
        D();
        return this.g;
    }

    protected void j() {
        ApplicationInfo applicationInfo;
        Context o = o();
        try {
            applicationInfo = o.getPackageManager().getApplicationInfo(o.getPackageName(), 129);
        } catch (NameNotFoundException e) {
            d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            t("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                b bVar = (b) new ap(k()).a(i);
                if (bVar != null) {
                    a(bVar);
                }
            }
        }
    }
}
