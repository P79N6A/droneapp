package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.mediation.m;

public final class b {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final String e = e.a;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    private final String A;
    private final e m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final String v;
    private final int w;
    private final String x;
    private final int y;
    private final int z;

    public static final class a {
        private final com.google.android.gms.ads.internal.client.e.a a = new com.google.android.gms.ads.internal.client.e.a();
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h = 0;
        private int i;
        private String j;
        private int k;
        private String l;
        private int m;
        private int n;
        private String o;

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a a(int i, int i2) {
            this.c = Color.argb(0, 0, 0, 0);
            this.d = i2;
            this.e = i;
            return this;
        }

        public a a(Location location) {
            this.a.a(location);
            return this;
        }

        public a a(m mVar) {
            this.a.a(mVar);
            return this;
        }

        public a a(Class<? extends com.google.android.gms.ads.mediation.b> cls, Bundle bundle) {
            this.a.a((Class) cls, bundle);
            return this;
        }

        public a a(String str) {
            this.a.b(str);
            return this;
        }

        public a a(boolean z) {
            this.a.b(z);
            return this;
        }

        public b a() {
            return new b();
        }

        public a b(int i) {
            this.c = i;
            this.d = Color.argb(0, 0, 0, 0);
            this.e = Color.argb(0, 0, 0, 0);
            return this;
        }

        public a b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.a.b(cls, bundle);
            return this;
        }

        public a b(String str) {
            this.j = str;
            return this;
        }

        public a c(int i) {
            this.f = i;
            return this;
        }

        public a c(String str) {
            this.l = str;
            return this;
        }

        public a d(int i) {
            this.g = i;
            return this;
        }

        public a d(String str) {
            this.o = str;
            return this;
        }

        public a e(int i) {
            this.h = i;
            return this;
        }

        public a e(String str) {
            this.a.f(str);
            return this;
        }

        public a f(int i) {
            this.i = i;
            return this;
        }

        public a g(int i) {
            this.k = i;
            return this;
        }

        public a h(int i) {
            this.m = i;
            return this;
        }

        public a i(int i) {
            this.n = i;
            return this;
        }
    }

    private b(a aVar) {
        this.n = aVar.b;
        this.o = aVar.c;
        this.p = aVar.d;
        this.q = aVar.e;
        this.r = aVar.f;
        this.s = aVar.g;
        this.t = aVar.h;
        this.u = aVar.i;
        this.v = aVar.j;
        this.w = aVar.k;
        this.x = aVar.l;
        this.y = aVar.m;
        this.z = aVar.n;
        this.A = aVar.o;
        this.m = new e(aVar.a, this);
    }

    public int a() {
        return this.n;
    }

    @Deprecated
    public <T extends m> T a(Class<T> cls) {
        return this.m.a((Class) cls);
    }

    public boolean a(Context context) {
        return this.m.a(context);
    }

    public int b() {
        return this.o;
    }

    public <T extends com.google.android.gms.ads.mediation.b> Bundle b(Class<T> cls) {
        return this.m.b(cls);
    }

    public int c() {
        return this.p;
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> cls) {
        return this.m.c(cls);
    }

    public int d() {
        return this.q;
    }

    public int e() {
        return this.r;
    }

    public int f() {
        return this.s;
    }

    public int g() {
        return this.t;
    }

    public int h() {
        return this.u;
    }

    public String i() {
        return this.v;
    }

    public int j() {
        return this.w;
    }

    public String k() {
        return this.x;
    }

    public int l() {
        return this.y;
    }

    public int m() {
        return this.z;
    }

    public Location n() {
        return this.m.e();
    }

    public String o() {
        return this.A;
    }

    e p() {
        return this.m;
    }
}
