package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.b.b;

public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<UserAddress> CREATOR = new b();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    boolean m;
    String n;
    String o;
    private final int p;

    UserAddress() {
        this.p = 1;
    }

    UserAddress(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.p = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = z;
        this.n = str13;
        this.o = str14;
    }

    public static UserAddress a(Intent intent) {
        return (intent == null || !intent.hasExtra(b.a)) ? null : (UserAddress) intent.getParcelableExtra(b.a);
    }

    public int a() {
        return this.p;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public String j() {
        return this.i;
    }

    public String k() {
        return this.j;
    }

    public String l() {
        return this.k;
    }

    public String m() {
        return this.l;
    }

    public boolean n() {
        return this.m;
    }

    public String o() {
        return this.n;
    }

    public String p() {
        return this.o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
