package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class bg implements Creator<CloseContentsAndUpdateMetadataRequest> {
    static void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, closeContentsAndUpdateMetadataRequest.a);
        b.a(parcel, 2, closeContentsAndUpdateMetadataRequest.b, i, false);
        b.a(parcel, 3, closeContentsAndUpdateMetadataRequest.c, i, false);
        b.a(parcel, 4, closeContentsAndUpdateMetadataRequest.d, i, false);
        b.a(parcel, 5, closeContentsAndUpdateMetadataRequest.e);
        b.a(parcel, 6, closeContentsAndUpdateMetadataRequest.f, false);
        b.a(parcel, 7, closeContentsAndUpdateMetadataRequest.g);
        b.a(parcel, 8, closeContentsAndUpdateMetadataRequest.h);
        b.a(parcel, 9, closeContentsAndUpdateMetadataRequest.i);
        b.a(parcel, 10, closeContentsAndUpdateMetadataRequest.j);
        b.a(parcel, a);
    }

    public CloseContentsAndUpdateMetadataRequest a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = true;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        Contents contents = null;
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) a.a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) a.a(parcel, a, Contents.CREATOR);
                    break;
                case 5:
                    z3 = a.c(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                case 8:
                    i = a.g(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                case 10:
                    z2 = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CloseContentsAndUpdateMetadataRequest(i3, driveId, metadataBundle, contents, z3, str, i2, i, z, z2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CloseContentsAndUpdateMetadataRequest[] a(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
