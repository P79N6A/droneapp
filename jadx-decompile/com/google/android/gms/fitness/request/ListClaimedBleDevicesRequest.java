package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amd;
import com.google.android.gms.internal.amd.a;

public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Creator<ListClaimedBleDevicesRequest> CREATOR = new ah();
    private final int a;
    private final amd b;

    ListClaimedBleDevicesRequest(int i, IBinder iBinder) {
        this.a = i;
        this.b = a.a(iBinder);
    }

    public ListClaimedBleDevicesRequest(amd com_google_android_gms_internal_amd) {
        this.a = 2;
        this.b = com_google_android_gms_internal_amd;
    }

    int a() {
        return this.a;
    }

    public IBinder b() {
        return this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ah.a(this, parcel, i);
    }
}
