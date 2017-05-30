package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListParentsResponse extends WriteAwareParcelable {
    public static final Creator<OnListParentsResponse> CREATOR = new ac();
    final int a;
    final DataHolder b;

    OnListParentsResponse(int i, DataHolder dataHolder) {
        this.a = i;
        this.b = dataHolder;
    }

    protected void a(Parcel parcel, int i) {
        ac.a(this, parcel, i);
    }

    public DataHolder b() {
        return this.b;
    }
}
