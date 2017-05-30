package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class CapabilityParcel extends AbstractSafeParcelable {
    public static final Creator<CapabilityParcel> CREATOR = new j();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    CapabilityParcel(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public CapabilityParcel(boolean z, boolean z2, boolean z3) {
        this(2, z, z2, z3);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("iap_supported", this.b);
        bundle.putBoolean("default_iap_supported", this.c);
        bundle.putBoolean("app_streaming_supported", this.d);
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
