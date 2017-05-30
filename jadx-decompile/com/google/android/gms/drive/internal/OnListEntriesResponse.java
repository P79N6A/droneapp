package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListEntriesResponse extends WriteAwareParcelable {
    public static final Creator<OnListEntriesResponse> CREATOR = new aa();
    final int a;
    final DataHolder b;
    final boolean c;

    OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.a = i;
        this.b = dataHolder;
        this.c = z;
    }

    protected void a(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }

    public DataHolder b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
