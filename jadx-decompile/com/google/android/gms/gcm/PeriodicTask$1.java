package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class PeriodicTask$1 implements Creator<PeriodicTask> {
    PeriodicTask$1() {
    }

    public PeriodicTask a(Parcel parcel) {
        return new PeriodicTask(parcel, null);
    }

    public PeriodicTask[] a(int i) {
        return new PeriodicTask[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
