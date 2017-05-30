package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class OpenFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Creator<OpenFileIntentSenderRequest> CREATOR = new al();
    final int a;
    final String b;
    final String[] c;
    final DriveId d;
    final FilterHolder e;

    OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this.a = i;
        this.b = str;
        this.c = strArr;
        this.d = driveId;
        this.e = filterHolder;
    }

    public OpenFileIntentSenderRequest(String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this(1, str, strArr, driveId, filterHolder);
    }

    public void writeToParcel(Parcel parcel, int i) {
        al.a(this, parcel, i);
    }
}
