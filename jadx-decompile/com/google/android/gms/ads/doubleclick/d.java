package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.e;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.internal.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class d {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final String h = e.a;
    private final e i;

    public static final class a {
        private final com.google.android.gms.ads.internal.client.e.a a = new com.google.android.gms.ads.internal.client.e.a();

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
            return this;
        }

        public a a(String str) {
            this.a.a(str);
            return this;
        }

        public a a(String str, String str2) {
            this.a.a(str, str2);
            return this;
        }

        public a a(String str, List<String> list) {
            if (list != null) {
                this.a.a(str, ak.a(Constants.ACCEPT_TIME_SEPARATOR_SP).a((Iterable) list));
            }
            return this;
        }

        public a a(Date date) {
            this.a.a(date);
            return this;
        }

        @Deprecated
        public a a(boolean z) {
            this.a.a(z);
            return this;
        }

        public d a() {
            return new d();
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
            this.a.b(z);
            return this;
        }

        public a c(String str) {
            com.google.android.gms.common.internal.d.a((Object) str, (Object) "Content URL must be non-null.");
            com.google.android.gms.common.internal.d.a(str, (Object) "Content URL must be non-empty.");
            com.google.android.gms.common.internal.d.b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(512), Integer.valueOf(str.length()));
            this.a.d(str);
            return this;
        }

        public a c(boolean z) {
            this.a.c(z);
            return this;
        }

        public a d(String str) {
            this.a.e(str);
            return this;
        }

        public a e(String str) {
            this.a.f(str);
            return this;
        }

        public a f(String str) {
            this.a.g(str);
            return this;
        }
    }

    private d(a aVar) {
        this.i = new e(aVar.a);
    }

    public static void i() {
    }

    @Deprecated
    public <T extends m> T a(Class<T> cls) {
        return this.i.a((Class) cls);
    }

    public Date a() {
        return this.i.a();
    }

    public boolean a(Context context) {
        return this.i.a(context);
    }

    public <T extends b> Bundle b(Class<T> cls) {
        return this.i.b(cls);
    }

    public String b() {
        return this.i.b();
    }

    public int c() {
        return this.i.c();
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> cls) {
        return this.i.c(cls);
    }

    public Set<String> d() {
        return this.i.d();
    }

    public Location e() {
        return this.i.e();
    }

    public boolean f() {
        return this.i.f();
    }

    public String g() {
        return this.i.g();
    }

    public Bundle h() {
        return this.i.m();
    }

    public e j() {
        return this.i;
    }
}
