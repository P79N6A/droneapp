package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ad.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DriveServiceResponse extends AbstractSafeParcelable {
    public static final Creator<DriveServiceResponse> CREATOR = new e();
    final int a;
    final IBinder b;

    DriveServiceResponse(int i, IBinder iBinder) {
        this.a = i;
        this.b = iBinder;
    }

    public ad a() {
        return a.a(this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
