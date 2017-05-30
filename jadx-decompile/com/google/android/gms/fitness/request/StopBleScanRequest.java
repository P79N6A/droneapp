package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.request.ag.a;
import com.google.android.gms.internal.alq;

public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Creator<StopBleScanRequest> CREATOR = new l();
    private final int a;
    private final ag b;
    private final alq c;

    StopBleScanRequest(int i, IBinder iBinder, IBinder iBinder2) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = alq.a.a(iBinder2);
    }

    public StopBleScanRequest(a aVar, alq com_google_android_gms_internal_alq) {
        this(d.a.a().b(aVar), com_google_android_gms_internal_alq);
    }

    public StopBleScanRequest(ag agVar, alq com_google_android_gms_internal_alq) {
        this.a = 3;
        this.b = agVar;
        this.c = com_google_android_gms_internal_alq;
    }

    int a() {
        return this.a;
    }

    public IBinder b() {
        return this.b.asBinder();
    }

    public IBinder c() {
        return this.c == null ? null : this.c.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
