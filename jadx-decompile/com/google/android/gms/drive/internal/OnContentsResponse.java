package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse extends AbstractSafeParcelable {
    public static final Creator<OnContentsResponse> CREATOR = new u();
    final int a;
    final Contents b;
    final boolean c;

    OnContentsResponse(int i, Contents contents, boolean z) {
        this.a = i;
        this.b = contents;
        this.c = z;
    }

    public Contents a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
