package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.search.b;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@aaa
public final class e {
    public static final String a = ac.a().a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set<String> e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map<Class<? extends m>, m> i;
    private final String j;
    private final String k;
    private final b l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;

    public static final class a {
        private final HashSet<String> a = new HashSet();
        private final Bundle b = new Bundle();
        private final HashMap<Class<? extends m>, m> c = new HashMap();
        private final HashSet<String> d = new HashSet();
        private final Bundle e = new Bundle();
        private final HashSet<String> f = new HashSet();
        private Date g;
        private String h;
        private int i = -1;
        private Location j;
        private boolean k = false;
        private String l;
        private String m;
        private int n = -1;
        private boolean o;

        public void a(int i) {
            this.i = i;
        }

        public void a(Location location) {
            this.j = location;
        }

        @Deprecated
        public void a(m mVar) {
            if (mVar instanceof com.google.android.gms.ads.mediation.a.a) {
                a(AdMobAdapter.class, ((com.google.android.gms.ads.mediation.a.a) mVar).a());
            } else {
                this.c.put(mVar.getClass(), mVar);
            }
        }

        public void a(Class<? extends com.google.android.gms.ads.mediation.b> cls, Bundle bundle) {
            this.b.putBundle(cls.getName(), bundle);
        }

        public void a(String str) {
            this.a.add(str);
        }

        public void a(String str, String str2) {
            this.e.putString(str, str2);
        }

        public void a(Date date) {
            this.g = date;
        }

        public void a(boolean z) {
            this.k = z;
        }

        public void b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            if (this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
                this.b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
        }

        public void b(String str) {
            this.d.add(str);
        }

        public void b(boolean z) {
            this.n = z ? 1 : 0;
        }

        public void c(String str) {
            this.d.remove(str);
        }

        public void c(boolean z) {
            this.o = z;
        }

        public void d(String str) {
            this.h = str;
        }

        public void e(String str) {
            this.l = str;
        }

        public void f(String str) {
            this.m = str;
        }

        public void g(String str) {
            this.f.add(str);
        }
    }

    public e(a aVar) {
        this(aVar, null);
    }

    public e(a aVar, b bVar) {
        this.b = aVar.g;
        this.c = aVar.h;
        this.d = aVar.i;
        this.e = Collections.unmodifiableSet(aVar.a);
        this.f = aVar.j;
        this.g = aVar.k;
        this.h = aVar.b;
        this.i = Collections.unmodifiableMap(aVar.c);
        this.j = aVar.l;
        this.k = aVar.m;
        this.l = bVar;
        this.m = aVar.n;
        this.n = Collections.unmodifiableSet(aVar.d);
        this.o = aVar.e;
        this.p = Collections.unmodifiableSet(aVar.f);
        this.q = aVar.o;
    }

    @Deprecated
    public <T extends m> T a(Class<T> cls) {
        return (m) this.i.get(cls);
    }

    public Date a() {
        return this.b;
    }

    public boolean a(Context context) {
        return this.n.contains(ac.a().a(context));
    }

    public Bundle b(Class<? extends com.google.android.gms.ads.mediation.b> cls) {
        return this.h.getBundle(cls.getName());
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public Bundle c(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls) {
        Bundle bundle = this.h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle != null ? bundle.getBundle(cls.getName()) : null;
    }

    public Set<String> d() {
        return this.e;
    }

    public Location e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public String g() {
        return this.j;
    }

    public String h() {
        return this.k;
    }

    public b i() {
        return this.l;
    }

    public Map<Class<? extends m>, m> j() {
        return this.i;
    }

    public Bundle k() {
        return this.h;
    }

    public int l() {
        return this.m;
    }

    public Bundle m() {
        return this.o;
    }

    public Set<String> n() {
        return this.p;
    }

    public boolean o() {
        return this.q;
    }
}
