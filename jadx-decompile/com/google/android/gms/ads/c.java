package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.internal.d;
import java.util.Date;
import java.util.Set;

public final class c {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 512;
    public static final String i = e.a;
    private final e j;

    public static final class a {
        private final com.google.android.gms.ads.internal.client.e.a a = new com.google.android.gms.ads.internal.client.e.a();

        public a() {
            this.a.b(c.i);
        }

        public a a(int i) {
            this.a.a(i);
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

        public a a(Class<? extends b> cls, Bundle bundle) {
            this.a.a((Class) cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.a.c(c.i);
            }
            return this;
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public a a(Date date) {
            this.a.a(date);
            return this;
        }

        public a a(boolean z) {
            this.a.b(z);
            return this;
        }

        public c a() {
            return new c();
        }

        public a b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.a.b(cls, bundle);
            return this;
        }

        public a b(String str) {
            this.a.b(str);
            return this;
        }

        public a b(boolean z) {
            this.a.c(z);
            return this;
        }

        public a c(String str) {
            d.a((Object) str, (Object) "Content URL must be non-null.");
            d.a(str, (Object) "Content URL must be non-empty.");
            d.b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(512), Integer.valueOf(str.length()));
            this.a.d(str);
            return this;
        }

        public a d(String str) {
            this.a.f(str);
            return this;
        }
    }

    private c(a aVar) {
        this.j = new e(aVar.a);
    }

    @Deprecated
    public <T extends m> T a(Class<T> cls) {
        return this.j.a((Class) cls);
    }

    public Date a() {
        return this.j.a();
    }

    public boolean a(Context context) {
        return this.j.a(context);
    }

    public <T extends b> Bundle b(Class<T> cls) {
        return this.j.b(cls);
    }

    public String b() {
        return this.j.b();
    }

    public int c() {
        return this.j.c();
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> cls) {
        return this.j.c(cls);
    }

    public Set<String> d() {
        return this.j.d();
    }

    public Location e() {
        return this.j.e();
    }

    public e f() {
        return this.j;
    }
}
