package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Creator<ProxyCard> CREATOR = new w();
    String a;
    String b;
    int c;
    int d;
    private final int e;

    ProxyCard(int i, String str, String str2, int i2, int i3) {
        this.e = i;
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
