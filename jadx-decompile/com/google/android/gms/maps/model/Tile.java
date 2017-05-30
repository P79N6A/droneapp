package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Tile extends AbstractSafeParcelable {
    public static final ab CREATOR = new ab();
    public final int a;
    public final int b;
    public final byte[] c;
    private final int d;

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = bArr;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    int a() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ab.a(this, parcel, i);
    }
}
