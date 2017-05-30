package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.x.a;

public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Creator<RemoveListenerRequest> CREATOR = new ai();
    final int a;
    public final x b;

    RemoveListenerRequest(int i, IBinder iBinder) {
        this.a = i;
        if (iBinder != null) {
            this.b = a.a(iBinder);
        } else {
            this.b = null;
        }
    }

    public RemoveListenerRequest(x xVar) {
        this.a = 1;
        this.b = xVar;
    }

    IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ai.a(this, parcel, i);
    }
}
