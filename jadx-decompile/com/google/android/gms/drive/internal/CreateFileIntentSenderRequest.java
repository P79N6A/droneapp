package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Creator<CreateFileIntentSenderRequest> CREATOR = new bl();
    final int a;
    final MetadataBundle b;
    final int c;
    final String d;
    final DriveId e;
    final Integer f;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId, Integer num) {
        this.a = i;
        this.b = metadataBundle;
        this.c = i2;
        this.d = str;
        this.e = driveId;
        this.f = num;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadataBundle, int i, String str, DriveId driveId, int i2) {
        this(1, metadataBundle, i, str, driveId, Integer.valueOf(i2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        bl.a(this, parcel, i);
    }
}
