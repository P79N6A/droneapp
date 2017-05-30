package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnStartStreamSession extends AbstractSafeParcelable {
    public static final Creator<OnStartStreamSession> CREATOR = new ah();
    final int a;
    final ParcelFileDescriptor b;
    final IBinder c;
    final String d;

    OnStartStreamSession(int i, ParcelFileDescriptor parcelFileDescriptor, IBinder iBinder, String str) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = iBinder;
        this.d = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ah.a(this, parcel, i | 1);
    }
}
