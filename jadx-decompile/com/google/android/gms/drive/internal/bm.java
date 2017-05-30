package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class bm implements Creator<CreateFileRequest> {
    static void a(CreateFileRequest createFileRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, createFileRequest.a);
        b.a(parcel, 2, createFileRequest.b, i, false);
        b.a(parcel, 3, createFileRequest.c, i, false);
        b.a(parcel, 4, createFileRequest.d, i, false);
        b.a(parcel, 5, createFileRequest.e, false);
        b.a(parcel, 6, createFileRequest.f);
        b.a(parcel, 7, createFileRequest.g, false);
        b.a(parcel, 8, createFileRequest.h);
        b.a(parcel, 9, createFileRequest.i);
        b.a(parcel, 10, createFileRequest.j, false);
        b.a(parcel, a);
    }

    public CreateFileRequest a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        int i2 = 0;
        String str2 = null;
        boolean z = false;
        Integer num = null;
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
                    num = a.h(parcel, a);
                    break;
                case 6:
                    z = a.c(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    i2 = a.g(parcel, a);
                    break;
                case 9:
                    i = a.g(parcel, a);
                    break;
                case 10:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateFileRequest(i3, driveId, metadataBundle, contents, num, z, str2, i2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CreateFileRequest[] a(int i) {
        return new CreateFileRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
