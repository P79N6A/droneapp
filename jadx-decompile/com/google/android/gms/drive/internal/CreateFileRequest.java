package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.w;

public class CreateFileRequest extends AbstractSafeParcelable {
    public static final Creator<CreateFileRequest> CREATOR = new bm();
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;
    final Integer e;
    final boolean f;
    final String g;
    final int h;
    final int i;
    final String j;

    CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, Integer num, boolean z, String str, int i2, int i3, String str2) {
        if (!(contents == null || i3 == 0)) {
            d.b(contents.f() == i3, "inconsistent contents reference");
        }
        if ((num == null || num.intValue() == 0) && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        this.a = i;
        this.b = (DriveId) d.a(driveId);
        this.c = (MetadataBundle) d.a(metadataBundle);
        this.d = contents;
        this.e = num;
        this.g = str;
        this.h = i2;
        this.f = z;
        this.i = i3;
        this.j = str2;
    }

    public CreateFileRequest(DriveId driveId, MetadataBundle metadataBundle, int i, int i2, w wVar) {
        this(2, driveId, metadataBundle, null, Integer.valueOf(i2), wVar.b(), wVar.a(), wVar.c(), i, wVar.d());
    }

    public void writeToParcel(Parcel parcel, int i) {
        bm.a(this, parcel, i);
    }
}
