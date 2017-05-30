package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.concurrent.TimeUnit;

public class Session extends AbstractSafeParcelable {
    public static final Creator<Session> CREATOR = new c();
    public static final String a = "vnd.google.fitness.session";
    public static final String b = "vnd.google.fitness.session/";
    private final int c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final String h;
    private final int i;
    private final Application j;
    private final Long k;

    public static class a {
        private long a = 0;
        private long b = 0;
        private String c = null;
        private String d;
        private String e;
        private int f = 4;
        private Long g;

        public a a(int i) {
            this.f = i;
            return this;
        }

        public a a(long j, TimeUnit timeUnit) {
            d.a(j > 0, "Start time should be positive.");
            this.a = timeUnit.toMillis(j);
            return this;
        }

        public a a(String str) {
            d.b(str.length() <= 100, "Session name cannot exceed %d characters", new Object[]{Integer.valueOf(100)});
            this.c = str;
            return this;
        }

        public Session a() {
            boolean z = false;
            d.a(this.a > 0, "Start time should be specified.");
            if (this.b == 0 || this.b > this.a) {
                z = true;
            }
            d.a(z, "End time should be later than start time.");
            if (this.d == null) {
                String str = this.c == null ? "" : this.c;
                this.d = new StringBuilder(String.valueOf(str).length() + 20).append(str).append(this.a).toString();
            }
            if (this.e == null) {
                this.e = "";
            }
            return new Session();
        }

        public a b(long j, TimeUnit timeUnit) {
            d.a(j >= 0, "End time should be positive.");
            this.b = timeUnit.toMillis(j);
            return this;
        }

        public a b(String str) {
            boolean z = str != null && TextUtils.getTrimmedLength(str) > 0;
            d.b(z);
            this.d = str;
            return this;
        }

        public a c(long j, TimeUnit timeUnit) {
            this.g = Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        public a c(String str) {
            d.b(str.length() <= 1000, "Session description cannot exceed %d characters", new Object[]{Integer.valueOf(1000)});
            this.e = str;
            return this;
        }

        public a d(String str) {
            return a(com.google.android.gms.fitness.d.a(str));
        }
    }

    Session(int i, long j, long j2, String str, String str2, String str3, int i2, Application application, Long l) {
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i2;
        this.j = application;
        this.k = l;
    }

    public Session(long j, long j2, String str, String str2, String str3, int i, Application application, Long l) {
        this(3, j, j2, str, str2, str3, i, application, l);
    }

    private Session(a aVar) {
        this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, null, aVar.g);
    }

    public static Session a(Intent intent) {
        return intent == null ? null : (Session) c.a(intent, a, CREATOR);
    }

    public static String a(String str) {
        String valueOf = String.valueOf(b);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private boolean a(Session session) {
        return this.d == session.d && this.e == session.e && com.google.android.gms.common.internal.c.a(this.f, session.f) && com.google.android.gms.common.internal.c.a(this.g, session.g) && com.google.android.gms.common.internal.c.a(this.h, session.h) && com.google.android.gms.common.internal.c.a(this.j, session.j) && this.i == session.i;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MILLISECONDS);
    }

    public boolean a() {
        return this.k != null;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.e, TimeUnit.MILLISECONDS);
    }

    public boolean b() {
        return this.e == 0;
    }

    public long c(TimeUnit timeUnit) {
        d.a(this.k != null, "Active time is not set");
        return timeUnit.convert(this.k.longValue(), TimeUnit.MILLISECONDS);
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Session) && a((Session) obj));
    }

    public String f() {
        return com.google.android.gms.fitness.d.a(this.i);
    }

    public int g() {
        return this.i;
    }

    public Application h() {
        return this.j;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{Long.valueOf(this.d), Long.valueOf(this.e), this.g});
    }

    public String i() {
        return this.j == null ? null : this.j.a();
    }

    int j() {
        return this.c;
    }

    public long k() {
        return this.d;
    }

    public long l() {
        return this.e;
    }

    public Long m() {
        return this.k;
    }

    public String toString() {
        return com.google.android.gms.common.internal.c.a(this).a("startTime", Long.valueOf(this.d)).a("endTime", Long.valueOf(this.e)).a(User.FN_NAME, this.f).a("identifier", this.g).a("description", this.h).a("activity", Integer.valueOf(this.i)).a("application", this.j).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
