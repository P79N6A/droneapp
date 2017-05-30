package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.uz.a;
import java.util.List;

@aaa
public class d extends a implements i.a {
    private String a;
    private List<c> b;
    private String c;
    private uu d;
    private String e;
    private double f;
    private String g;
    private String h;
    @Nullable
    private a i;
    private Bundle j;
    @Nullable
    private c k;
    @Nullable
    private View l;
    private Object m = new Object();
    private i n;

    public d(String str, List list, String str2, uu uuVar, String str3, double d, String str4, String str5, @Nullable a aVar, Bundle bundle, c cVar, View view) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = uuVar;
        this.e = str3;
        this.f = d;
        this.g = str4;
        this.h = str5;
        this.i = aVar;
        this.j = bundle;
        this.k = cVar;
        this.l = view;
    }

    public String a() {
        return this.a;
    }

    public void a(i iVar) {
        synchronized (this.m) {
            this.n = iVar;
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

    public double f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public c i() {
        return this.k;
    }

    public e j() {
        return f.a(this.n);
    }

    public String k() {
        return "2";
    }

    public String l() {
        return "";
    }

    public a m() {
        return this.i;
    }

    public Bundle n() {
        return this.j;
    }

    public View o() {
        return this.l;
    }

    public void p() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0.0d;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.m = null;
        this.n = null;
        this.k = null;
        this.l = null;
    }
}
