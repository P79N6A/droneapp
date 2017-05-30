package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Creator<AppIdentifier> CREATOR = new c();
    private final int a;
    private final String b;

    AppIdentifier(int i, String str) {
        this.a = i;
        this.b = d.a(str, "Missing application identifier value");
    }

    public AppIdentifier(String str) {
        this(1, str);
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
