package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Creator<GoogleNowAuthState> CREATOR = new c();
    final int a;
    String b;
    String c;
    long d;

    GoogleNowAuthState(int i, String str, String str2, long j) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        return new StringBuilder((String.valueOf(str).length() + 74) + String.valueOf(str2).length()).append("mAuthCode = ").append(str).append("\nmAccessToken = ").append(str2).append("\nmNextAllowedTimeMillis = ").append(this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
