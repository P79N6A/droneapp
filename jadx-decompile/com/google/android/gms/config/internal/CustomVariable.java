package com.google.android.gms.config.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CustomVariable extends AbstractSafeParcelable {
    public static final f CREATOR = new f();
    private final int a;
    private final String b;
    private final String c;

    CustomVariable(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public CustomVariable(String str, String str2) {
        this(1, str, str2);
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
