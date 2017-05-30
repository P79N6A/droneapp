package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class OneoffTask$1 implements Creator<OneoffTask> {
    OneoffTask$1() {
    }

    public OneoffTask a(Parcel parcel) {
        return new OneoffTask(parcel, null);
    }

    public OneoffTask[] a(int i) {
        return new OneoffTask[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
