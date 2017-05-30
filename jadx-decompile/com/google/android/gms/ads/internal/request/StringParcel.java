package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class StringParcel extends AbstractSafeParcelable {
    public static final Creator<StringParcel> CREATOR = new o();
    final int a;
    String b;

    StringParcel(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public StringParcel(String str) {
        this.a = 1;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
