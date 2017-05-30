package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vb.a;
import java.util.List;

@aaa
public class e extends a implements i.a {
    private String a;
    private List<c> b;
    private String c;
    private uu d;
    private String e;
    private String f;
    @Nullable
    private a g;
    private Bundle h;
    private Object i = new Object();
    private i j;

    public e(String str, List list, String str2, uu uuVar, String str3, String str4, @Nullable a aVar, Bundle bundle) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = uuVar;
        this.e = str3;
        this.f = str4;
        this.g = aVar;
        this.h = bundle;
    }

    public String a() {
        return this.a;
    }

    public void a(i iVar) {
        synchronized (this.i) {
            this.j = iVar;
        }
    }

    public List b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public uu d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public com.google.android.gms.c.e g() {
        return f.a(this.j);
    }

    public Bundle h() {
        return this.h;
    }

    public void i() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public String k() {
        return "1";
    }

    public String l() {
        return "";
    }

    public a m() {
        return this.g;
    }
}
