package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class DisableFitRequest extends AbstractSafeParcelable {
    public static final Creator<DisableFitRequest> CREATOR = new ac();
    private final int a;
    private final alq b;

    DisableFitRequest(int i, IBinder iBinder) {
        this.a = i;
        this.b = a.a(iBinder);
    }

    public DisableFitRequest(alq com_google_android_gms_internal_alq) {
        this.a = 2;
        this.b = com_google_android_gms_internal_alq;
    }

    int a() {
        return this.a;
    }

    public IBinder b() {
        return this.b.asBinder();
    }

    public String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ac.a(this, parcel, i);
    }
}
