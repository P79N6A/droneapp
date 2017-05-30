package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class bn implements Creator<CreateFolderRequest> {
    static void a(CreateFolderRequest createFolderRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, createFolderRequest.a);
        b.a(parcel, 2, createFolderRequest.b, i, false);
        b.a(parcel, 3, createFolderRequest.c, i, false);
        b.a(parcel, a);
    }

    public CreateFolderRequest a(Parcel parcel) {
        MetadataBundle metadataBundle = null;
        int b = a.b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int g;
            MetadataBundle metadataBundle2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    MetadataBundle metadataBundle3 = metadataBundle;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    metadataBundle2 = metadataBundle3;
                    break;
                case 2:
                    g = i;
                    DriveId driveId3 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    metadataBundle2 = metadataBundle;
                    driveId2 = driveId3;
                    break;
                case 3:
                    metadataBundle2 = (MetadataBundle) a.a(parcel, a, MetadataBundle.CREATOR);
                    driveId2 = driveId;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    metadataBundle2 = metadataBundle;
                    driveId2 = driveId;
                    g = i;
                    break;
            }
            i = g;
            driveId = driveId2;
            metadataBundle = metadataBundle2;
        }
        if (parcel.dataPosition() == b) {
            return new CreateFolderRequest(i, driveId, metadataBundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CreateFolderRequest[] a(int i) {
        return new CreateFolderRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
