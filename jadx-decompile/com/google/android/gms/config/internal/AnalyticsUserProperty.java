package com.google.android.gms.config.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AnalyticsUserProperty extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;

    AnalyticsUserProperty(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public AnalyticsUserProperty(String str, String str2) {
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
        a.a(this, parcel, i);
    }
}
