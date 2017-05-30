package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.a.a;
import java.util.List;

public abstract class k extends i {
    private String d;
    private List<a> e;
    private String f;
    private a g;
    private String h;
    private String i;

    public final void a(a aVar) {
        this.g = aVar;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(List<a> list) {
        this.e = list;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void c(String str) {
        this.h = str;
    }

    public final void d(String str) {
        this.i = str;
    }

    public final String e() {
        return this.d;
    }

    public final List<a> f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final a h() {
        return this.g;
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.i;
    }
}
