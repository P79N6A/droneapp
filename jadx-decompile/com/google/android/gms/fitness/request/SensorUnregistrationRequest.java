package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.y;
import com.google.android.gms.fitness.data.y.a;
import com.google.android.gms.internal.alq;

public class SensorUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SensorUnregistrationRequest> CREATOR = new an();
    private final int a;
    private final y b;
    private final PendingIntent c;
    private final alq d;

    SensorUnregistrationRequest(int i, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        this.a = i;
        this.b = iBinder == null ? null : a.a(iBinder);
        this.c = pendingIntent;
        this.d = alq.a.a(iBinder2);
    }

    public SensorUnregistrationRequest(y yVar, PendingIntent pendingIntent, alq com_google_android_gms_internal_alq) {
        this.a = 4;
        this.b = yVar;
        this.c = pendingIntent;
        this.d = com_google_android_gms_internal_alq;
    }

    public PendingIntent a() {
        return this.c;
    }

    public IBinder b() {
        return this.d == null ? null : this.d.asBinder();
    }

    int c() {
        return this.a;
    }

    IBinder d() {
        return this.b == null ? null : this.b.asBinder();
    }

    public String toString() {
        return String.format("SensorUnregistrationRequest{%s}", new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        an.a(this, parcel, i);
    }
}
