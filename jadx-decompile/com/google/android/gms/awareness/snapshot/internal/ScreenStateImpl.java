package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ScreenStateImpl extends AbstractSafeParcelable {
    public static final Creator<ScreenStateImpl> CREATOR = new i();
    private final int a;
    private final int b;

    ScreenStateImpl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    public String toString() {
        return this.b == 1 ? "ScreenState: SCREEN_OFF" : this.b == 2 ? "ScreenState: SCREEN_ON" : "ScreenState: UNKNOWN";
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
