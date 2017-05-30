package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public final class TransferProgressEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Creator<TransferProgressEvent> CREATOR = new p();
    final int a;
    final TransferProgressData b;

    TransferProgressEvent(int i, TransferProgressData transferProgressData) {
        this.a = i;
        this.b = transferProgressData;
    }

    public int a() {
        return 8;
    }

    public TransferProgressData b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return c.a(this.b, ((TransferProgressEvent) obj).b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public String toString() {
        return String.format("TransferProgressEvent[%s]", new Object[]{this.b.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
