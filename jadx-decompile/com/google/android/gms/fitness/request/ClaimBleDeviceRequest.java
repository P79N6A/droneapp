package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Creator<ClaimBleDeviceRequest> CREATOR = new p();
    private final int a;
    private final String b;
    private final BleDevice c;
    private final alq d;

    ClaimBleDeviceRequest(int i, String str, BleDevice bleDevice, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = bleDevice;
        this.d = a.a(iBinder);
    }

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, alq com_google_android_gms_internal_alq) {
        this.a = 4;
        this.b = str;
        this.c = bleDevice;
        this.d = com_google_android_gms_internal_alq;
    }

    public String a() {
        return this.b;
    }

    public BleDevice b() {
        return this.c;
    }

    public IBinder c() {
        return this.d == null ? null : this.d.asBinder();
    }

    int d() {
        return this.a;
    }

    public String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", new Object[]{this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
