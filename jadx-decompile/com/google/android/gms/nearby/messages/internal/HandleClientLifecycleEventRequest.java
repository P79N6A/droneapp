package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Creator<HandleClientLifecycleEventRequest> CREATOR = new h();
    public final int a;
    @Deprecated
    public final ClientAppContext b;
    public final int c;

    public HandleClientLifecycleEventRequest(int i) {
        this(1, null, i);
    }

    HandleClientLifecycleEventRequest(int i, ClientAppContext clientAppContext, int i2) {
        this.a = i;
        this.b = clientAppContext;
        this.c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
