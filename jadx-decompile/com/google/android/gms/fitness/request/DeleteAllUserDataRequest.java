package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
import com.google.android.gms.internal.alq.a;

public class DeleteAllUserDataRequest extends AbstractSafeParcelable {
    public static final Creator<DeleteAllUserDataRequest> CREATOR = new ab();
    private final int a;
    private final alq b;

    DeleteAllUserDataRequest(int i, IBinder iBinder) {
        this.a = i;
        this.b = a.a(iBinder);
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
        ab.a(this, parcel, i);
    }
}
