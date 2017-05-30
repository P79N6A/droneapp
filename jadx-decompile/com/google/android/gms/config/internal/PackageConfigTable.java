package com.google.android.gms.config.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PackageConfigTable extends AbstractSafeParcelable {
    public static final k CREATOR = new k();
    private final int a;
    private final Bundle b;

    PackageConfigTable(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public int a() {
        return this.a;
    }

    public Bundle b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
