package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new g();
    final int a;
    private final long b;
    private int c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final List<String> h;
    private final String i;
    private final long j;
    private int k;
    private final String l;
    private final float m;
    private final long n;
    private long o;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.g = i3;
        this.o = -1;
        this.h = list;
        this.i = str2;
        this.j = j2;
        this.k = i4;
        this.l = str4;
        this.m = f;
        this.n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public List<String> g() {
        return this.h;
    }

    public String h() {
        return this.i;
    }

    public long i() {
        return this.o;
    }

    public long j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public String l() {
        String valueOf = String.valueOf("\t");
        String valueOf2 = String.valueOf(c());
        String valueOf3 = String.valueOf("\t");
        int f = f();
        String valueOf4 = String.valueOf("\t");
        String join = g() == null ? "" : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, g());
        String valueOf5 = String.valueOf("\t");
        int k = k();
        String valueOf6 = String.valueOf("\t");
        String d = d() == null ? "" : d();
        String valueOf7 = String.valueOf("\t");
        String m = m() == null ? "" : m();
        String valueOf8 = String.valueOf("\t");
        float n = n();
        String valueOf9 = String.valueOf("\t");
        String e = e() == null ? "" : e();
        return new StringBuilder(((((((((((((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(join).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(d).length()) + String.valueOf(valueOf7).length()) + String.valueOf(m).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(e).length()).append(valueOf).append(valueOf2).append(valueOf3).append(f).append(valueOf4).append(join).append(valueOf5).append(k).append(valueOf6).append(d).append(valueOf7).append(m).append(valueOf8).append(n).append(valueOf9).append(e).toString();
    }

    public String m() {
        return this.l;
    }

    public float n() {
        return this.m;
    }

    public long o() {
        return this.n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
