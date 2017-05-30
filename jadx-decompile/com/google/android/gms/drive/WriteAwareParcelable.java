package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class WriteAwareParcelable extends AbstractSafeParcelable {
    private volatile transient boolean a = false;

    protected abstract void a(Parcel parcel, int i);

    public final boolean j_() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(!j_());
        this.a = true;
        a(parcel, i);
    }
}
