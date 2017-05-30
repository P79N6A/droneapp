package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ad implements Creator<OnMetadataResponse> {
    static void a(OnMetadataResponse onMetadataResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onMetadataResponse.a);
        b.a(parcel, 2, onMetadataResponse.b, i, false);
        b.a(parcel, a);
    }

    public OnMetadataResponse a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) a.a(parcel, a, MetadataBundle.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnMetadataResponse(i, metadataBundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnMetadataResponse[] a(int i) {
        return new OnMetadataResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
