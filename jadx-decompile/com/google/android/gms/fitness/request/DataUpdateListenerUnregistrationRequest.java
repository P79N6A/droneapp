package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class DataUpdateListenerUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<DataUpdateListenerUnregistrationRequest> CREATOR = new z();
    private final int a;
    private final PendingIntent b;
    private final alq c;

    DataUpdateListenerUnregistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder) {
        this.a = i;
        this.b = pendingIntent;
        this.c = a.a(iBinder);
    }

    public DataUpdateListenerUnregistrationRequest(PendingIntent pendingIntent, IBinder iBinder) {
        this.a = 1;
        this.b = pendingIntent;
        this.c = a.a(iBinder);
    }

    private boolean a(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest) {
        return c.a(this.b, dataUpdateListenerUnregistrationRequest.b);
    }

    public PendingIntent a() {
        return this.b;
    }

    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateListenerUnregistrationRequest) && a((DataUpdateListenerUnregistrationRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        return "DataUpdateListenerUnregistrationRequest";
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
