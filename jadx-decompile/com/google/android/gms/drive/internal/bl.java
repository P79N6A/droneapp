package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class bl implements Creator<CreateFileIntentSenderRequest> {
    static void a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, createFileIntentSenderRequest.a);
        b.a(parcel, 2, createFileIntentSenderRequest.b, i, false);
        b.a(parcel, 3, createFileIntentSenderRequest.c);
        b.a(parcel, 4, createFileIntentSenderRequest.d, false);
        b.a(parcel, 5, createFileIntentSenderRequest.e, i, false);
        b.a(parcel, 6, createFileIntentSenderRequest.f, false);
        b.a(parcel, a);
    }

    public CreateFileIntentSenderRequest a(Parcel parcel) {
        int i = 0;
        Integer num = null;
        int b = a.b(parcel);
        DriveId driveId = null;
        String str = null;
        MetadataBundle metadataBundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) a.a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 6:
                    num = a.h(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateFileIntentSenderRequest(i2, metadataBundle, i, str, driveId, num);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CreateFileIntentSenderRequest[] a(int i) {
        return new CreateFileIntentSenderRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
