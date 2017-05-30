package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class FenceTriggerInfoImpl extends AbstractSafeParcelable {
    public static final Creator<FenceTriggerInfoImpl> CREATOR = new k();
    private final int a;
    private final boolean b;
    private final String c;

    FenceTriggerInfoImpl(int i, boolean z, String str) {
        this.a = i;
        this.b = z;
        this.c = str;
    }

    int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
