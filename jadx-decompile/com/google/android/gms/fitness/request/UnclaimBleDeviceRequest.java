package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Creator<UnclaimBleDeviceRequest> CREATOR = new n();
    private final int a;
    private final String b;
    private final alq c;

    UnclaimBleDeviceRequest(int i, String str, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = a.a(iBinder);
    }

    public UnclaimBleDeviceRequest(String str, alq com_google_android_gms_internal_alq) {
        this.a = 5;
        this.b = str;
        this.c = com_google_android_gms_internal_alq;
    }

    public String a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    int c() {
        return this.a;
    }

    public String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
