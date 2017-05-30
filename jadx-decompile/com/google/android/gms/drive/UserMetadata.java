package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UserMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<UserMetadata> CREATOR = new aa();
    final int a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final String f;

    UserMetadata(int i, String str, String str2, String str3, boolean z, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }

    public UserMetadata(String str, String str2, String str3, boolean z, String str4) {
        this(1, str, str2, str3, z, str4);
    }

    public String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[]{this.b, this.c, this.d, Boolean.valueOf(this.e), this.f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
