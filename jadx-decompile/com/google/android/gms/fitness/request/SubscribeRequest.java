package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class SubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<SubscribeRequest> CREATOR = new m();
    private final int a;
    private Subscription b;
    private final boolean c;
    private final alq d;

    SubscribeRequest(int i, Subscription subscription, boolean z, IBinder iBinder) {
        this.a = i;
        this.b = subscription;
        this.c = z;
        this.d = a.a(iBinder);
    }

    public SubscribeRequest(Subscription subscription, boolean z, alq com_google_android_gms_internal_alq) {
        this.a = 3;
        this.b = subscription;
        this.c = z;
        this.d = com_google_android_gms_internal_alq;
    }

    public Subscription a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public IBinder c() {
        return this.d == null ? null : this.d.asBinder();
    }

    int d() {
        return this.a;
    }

    public String toString() {
        return c.a(this).a("subscription", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
