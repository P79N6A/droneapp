package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest extends AbstractSafeParcelable {
    public static final Creator<CloseContentsRequest> CREATOR = new bh();
    final int a;
    final Contents b;
    final Boolean c;
    final int d;

    CloseContentsRequest(int i, Contents contents, Boolean bool, int i2) {
        this.a = i;
        this.b = contents;
        this.c = bool;
        this.d = i2;
    }

    public CloseContentsRequest(int i, boolean z) {
        this(1, null, Boolean.valueOf(z), i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        bh.a(this, parcel, i);
    }
}
