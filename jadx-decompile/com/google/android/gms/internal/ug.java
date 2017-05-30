package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.u;
import com.xiaomi.market.sdk.j;
import java.util.LinkedHashMap;
import java.util.Map;

@aaa
public class ug {
    private boolean a;
    private String b;
    private Map<String, String> c;
    private Context d = null;
    private String e = null;

    public ug(Context context, String str) {
        this.d = context;
        this.e = str;
        this.a = ((Boolean) uf.N.c()).booleanValue();
        this.b = (String) uf.O.c();
        this.c = new LinkedHashMap();
        this.c.put("s", "gmob_sdk");
        this.c.put("v", "3");
        this.c.put(j.ac, VERSION.RELEASE);
        this.c.put("sdk", VERSION.SDK);
        this.c.put("device", u.e().e());
        this.c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        this.c.put("is_lite_sdk", u.e().l(context) ? "1" : "0");
        aak a = u.n().a(this.d);
        this.c.put("network_coarse", Integer.toString(a.m));
        this.c.put("network_fine", Integer.toString(a.n));
    }

    boolean a() {
        return this.a;
    }

    String b() {
        return this.b;
    }

    Context c() {
        return this.d;
    }

    String d() {
        return this.e;
    }

    Map<String, String> e() {
        return this.c;
    }
}
