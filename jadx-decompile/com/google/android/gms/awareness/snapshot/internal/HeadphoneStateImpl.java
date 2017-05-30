package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.state.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HeadphoneStateImpl extends AbstractSafeParcelable implements a {
    public static final Creator<HeadphoneStateImpl> CREATOR = new d();
    private final int c;
    private final int d;

    HeadphoneStateImpl(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public int a() {
        return this.d;
    }

    int b() {
        return this.c;
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return "HEADPHONE_PLUGGED";
            case 2:
                return "HEADPHONE_UNPLUGGED";
            default:
                return "unknown headphone state=" + this.d;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
