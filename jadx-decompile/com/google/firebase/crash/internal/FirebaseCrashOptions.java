package com.google.firebase.crash.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FirebaseCrashOptions implements SafeParcelable {
    public static final Creator<FirebaseCrashOptions> CREATOR = new c();
    public final int a;
    private String b;
    private String c;

    FirebaseCrashOptions(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public FirebaseCrashOptions(String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
