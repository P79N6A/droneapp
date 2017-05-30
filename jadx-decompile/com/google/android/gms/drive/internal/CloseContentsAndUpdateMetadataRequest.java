package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.x;

public class CloseContentsAndUpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Creator<CloseContentsAndUpdateMetadataRequest> CREATOR = new bg();
    final int a;
    final DriveId b;
    final MetadataBundle c;
    final Contents d;
    final boolean e;
    final String f;
    final int g;
    final int h;
    final boolean i;
    final boolean j;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i2, int i3, boolean z2, boolean z3) {
        this.a = i;
        this.b = driveId;
        this.c = metadataBundle;
        this.d = contents;
        this.e = z;
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = z2;
        this.j = z3;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle, int i, boolean z, x xVar) {
        this(1, driveId, metadataBundle, null, xVar.b(), xVar.a(), xVar.c(), i, z, xVar.d());
    }

    public void writeToParcel(Parcel parcel, int i) {
        bg.a(this, parcel, i);
    }
}
