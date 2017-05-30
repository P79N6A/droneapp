package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;

class af extends b {
    static final Pair<String, Long> a = new Pair("", Long.valueOf(0));
    public final c b = new c("health_monitor", y().V());
    public final b c = new b(this, "last_upload", 0);
    public final b d = new b(this, "last_upload_attempt", 0);
    public final b e = new b(this, "backoff", 0);
    public final b f = new b(this, "last_delete_stale", 0);
    public final b g = new b(this, "midnight_offset", 0);
    public final b h = new b(this, "time_before_start", NotificationOptions.a);
    public final b i = new b(this, "session_timeout", 1800000);
    public final a j = new a(this, "start_new_session", true);
    public final b k = new b(this, "last_pause_time", 0);
    public final b l = new b(this, "time_active", 0);
    public boolean m;
    private SharedPreferences o;
    private String p;
    private boolean q;
    private long r;
    private SecureRandom s;

    public final class a {
        final /* synthetic */ af a;
        private final String b;
        private final boolean c;
        private boolean d;
        private boolean e;

        public a(af afVar, String str, boolean z) {
            this.a = afVar;
            d.a(str);
            this.b = str;
            this.c = z;
        }

        @WorkerThread
        private void b() {
            if (!this.d) {
                this.d = true;
                this.e = this.a.o.getBoolean(this.b, this.c);
            }
        }

        @WorkerThread
        public void a(boolean z) {
            Editor edit = this.a.o.edit();
            edit.putBoolean(this.b, z);
            edit.apply();
            this.e = z;
        }

        @WorkerThread
        public boolean a() {
            b();
            return this.e;
        }
    }

    public final class b {
        final /* synthetic */ af a;
        private final String b;
        private final long c;
        private boolean d;
        private long e;

        public b(af afVar, String str, long j) {
            this.a = afVar;
            d.a(str);
            this.b = str;
            this.c = j;
        }

        @WorkerThread
        private void b() {
            if (!this.d) {
                this.d = true;
                this.e = this.a.o.getLong(this.b, this.c);
            }
        }

        @WorkerThread
        public long a() {
            b();
            return this.e;
        }

        @WorkerThread
        public void a(long j) {
            Editor edit = this.a.o.edit();
            edit.putLong(this.b, j);
            edit.apply();
            this.e = j;
        }
    }

    public final class c {
        final String a;
        final /* synthetic */ af b;
        private final String c;
        private final String d;
        private final long e;

        private c(af afVar, String str, long j) {
            this.b = afVar;
            d.a(str);
            d.b(j > 0);
            this.a = String.valueOf(str).concat(":start");
            this.c = String.valueOf(str).concat(":count");
            this.d = String.valueOf(str).concat(":value");
            this.e = j;
        }

        @WorkerThread
        private void b() {
            this.b.j();
            long a = this.b.p().a();
            Editor edit = this.b.o.edit();
            edit.remove(this.c);
            edit.remove(this.d);
            edit.putLong(this.a, a);
            edit.apply();
        }

        @WorkerThread
        private long c() {
            this.b.j();
            long d = d();
            if (d != 0) {
                return Math.abs(d - this.b.p().a());
            }
            b();
            return 0;
        }

        @WorkerThread
        private long d() {
            return this.b.F().getLong(this.a, 0);
        }

        @WorkerThread
        public Pair<String, Long> a() {
            this.b.j();
            long c = c();
            if (c < this.e) {
                return null;
            }
            if (c > this.e * 2) {
                b();
                return null;
            }
            String string = this.b.F().getString(this.d, null);
            c = this.b.F().getLong(this.c, 0);
            b();
            return (string == null || c <= 0) ? af.a : new Pair(string, Long.valueOf(c));
        }

        @WorkerThread
        public void a(String str) {
            a(str, 1);
        }

        @WorkerThread
        public void a(String str, long j) {
            this.b.j();
            if (d() == 0) {
                b();
            }
            if (str == null) {
                str = "";
            }
            long j2 = this.b.o.getLong(this.c, 0);
            if (j2 <= 0) {
                Editor edit = this.b.o.edit();
                edit.putString(this.d, str);
                edit.putLong(this.c, j);
                edit.apply();
                return;
            }
            Object obj = (this.b.E().nextLong() & Long.MAX_VALUE) < (Long.MAX_VALUE / (j2 + j)) * j ? 1 : null;
            Editor edit2 = this.b.o.edit();
            if (obj != null) {
                edit2.putString(this.d, str);
            }
            edit2.putLong(this.c, j2 + j);
            edit2.apply();
        }
    }

    af(aj ajVar) {
        super(ajVar);
    }

    @WorkerThread
    private SecureRandom E() {
        j();
        if (this.s == null) {
            this.s = new SecureRandom();
        }
        return this.s;
    }

    @WorkerThread
    private SharedPreferences F() {
        j();
        c();
        return this.o;
    }

    @WorkerThread
    String A() {
        j();
        return F().getString("gmp_app_id", null);
    }

    @WorkerThread
    Boolean B() {
        j();
        return !F().contains("use_service") ? null : Boolean.valueOf(F().getBoolean("use_service", false));
    }

    @WorkerThread
    void C() {
        boolean z = true;
        j();
        w().E().a("Clearing collection preferences.");
        boolean contains = F().contains("measurement_enabled");
        if (contains) {
            z = c(true);
        }
        Editor edit = F().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            b(z);
        }
    }

    @WorkerThread
    protected String D() {
        j();
        String string = F().getString("previous_os_version", null);
        String g = n().g();
        if (!(TextUtils.isEmpty(g) || g.equals(string))) {
            Editor edit = F().edit();
            edit.putString("previous_os_version", g);
            edit.apply();
        }
        return string;
    }

    @WorkerThread
    @NonNull
    Pair<String, Boolean> a(String str) {
        j();
        long b = p().b();
        if (this.p != null && b < this.r) {
            return new Pair(this.p, Boolean.valueOf(this.q));
        }
        this.r = b + y().d(str);
        com.google.android.gms.ads.a.a.b(true);
        try {
            com.google.android.gms.ads.a.a.a b2 = com.google.android.gms.ads.a.a.b(q());
            this.p = b2.a();
            if (this.p == null) {
                this.p = "";
            }
            this.q = b2.b();
        } catch (Throwable th) {
            w().D().a("Unable to get advertising id", th);
            this.p = "";
        }
        com.google.android.gms.ads.a.a.b(false);
        return new Pair(this.p, Boolean.valueOf(this.q));
    }

    @WorkerThread
    void a(boolean z) {
        j();
        w().E().a("Setting useService", Boolean.valueOf(z));
        Editor edit = F().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    String b(String str) {
        String str2 = (String) a(str).first;
        if (m.j("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, m.j("MD5").digest(str2.getBytes()))});
    }

    @WorkerThread
    void b(boolean z) {
        j();
        w().E().a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = F().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    @WorkerThread
    void c(String str) {
        j();
        Editor edit = F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    @WorkerThread
    boolean c(boolean z) {
        j();
        return F().getBoolean("measurement_enabled", z);
    }

    protected void e() {
        this.o = q().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.m = this.o.getBoolean("has_been_opened", false);
        if (!this.m) {
            Editor edit = this.o.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }

    @WorkerThread
    String f() {
        E().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    @WorkerThread
    String g() {
        j();
        try {
            return com.google.firebase.iid.b.a().b();
        } catch (IllegalStateException e) {
            w().z().a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @WorkerThread
    long z() {
        c();
        j();
        long a = this.g.a();
        if (a != 0) {
            return a;
        }
        a = (long) (E().nextInt(86400000) + 1);
        this.g.a(a);
        return a;
    }
}
