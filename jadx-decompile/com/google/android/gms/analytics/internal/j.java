package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.d;
import java.util.UUID;

public class j extends t {
    private SharedPreferences a;
    private long b;
    private long c = -1;
    private final a d = new a("monitoring", q().G());

    public final class a {
        final /* synthetic */ j a;
        private final String b;
        private final long c;

        private a(j jVar, String str, long j) {
            this.a = jVar;
            d.a(str);
            d.b(j > 0);
            this.b = str;
            this.c = j;
        }

        private void c() {
            long a = this.a.n().a();
            Editor edit = this.a.a.edit();
            edit.remove(g());
            edit.remove(b());
            edit.putLong(f(), a);
            edit.commit();
        }

        private long d() {
            long e = e();
            return e == 0 ? 0 : Math.abs(e - this.a.n().a());
        }

        private long e() {
            return this.a.a.getLong(f(), 0);
        }

        private String f() {
            return String.valueOf(this.b).concat(":start");
        }

        private String g() {
            return String.valueOf(this.b).concat(":count");
        }

        public Pair<String, Long> a() {
            long d = d();
            if (d < this.c) {
                return null;
            }
            if (d > this.c * 2) {
                c();
                return null;
            }
            String string = this.a.a.getString(b(), null);
            d = this.a.a.getLong(g(), 0);
            c();
            return (string == null || d <= 0) ? null : new Pair(string, Long.valueOf(d));
        }

        public void a(String str) {
            if (e() == 0) {
                c();
            }
            if (str == null) {
                str = "";
            }
            synchronized (this) {
                long j = this.a.a.getLong(g(), 0);
                if (j <= 0) {
                    Editor edit = this.a.a.edit();
                    edit.putString(b(), str);
                    edit.putLong(g(), 1);
                    edit.apply();
                    return;
                }
                Object obj = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / (j + 1) ? 1 : null;
                Editor edit2 = this.a.a.edit();
                if (obj != null) {
                    edit2.putString(b(), str);
                }
                edit2.putLong(g(), j + 1);
                edit2.apply();
            }
        }

        protected String b() {
            return String.valueOf(this.b).concat(":value");
        }
    }

    protected j(v vVar) {
        super(vVar);
    }

    protected void a() {
        this.a = o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public void a(String str) {
        m();
        D();
        Editor edit = this.a.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            t("Failed to commit campaign data");
        }
    }

    public long b() {
        m();
        D();
        if (this.b == 0) {
            long j = this.a.getLong("first_run", 0);
            if (j != 0) {
                this.b = j;
            } else {
                j = n().a();
                Editor edit = this.a.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    t("Failed to commit first run time");
                }
                this.b = j;
            }
        }
        return this.b;
    }

    public m c() {
        return new m(n(), b());
    }

    public long d() {
        m();
        D();
        if (this.c == -1) {
            this.c = this.a.getLong("last_dispatch", 0);
        }
        return this.c;
    }

    public void e() {
        m();
        D();
        long a = n().a();
        Editor edit = this.a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.c = a;
    }

    public String f() {
        m();
        D();
        CharSequence string = this.a.getString("installation_campaign", null);
        return TextUtils.isEmpty(string) ? null : string;
    }

    public a g() {
        return this.d;
    }
}
