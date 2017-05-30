package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ar implements Creator<SetPinnedDownloadPreferencesRequest> {
    static void a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, setPinnedDownloadPreferencesRequest.a);
        b.a(parcel, 2, setPinnedDownloadPreferencesRequest.b, i, false);
        b.a(parcel, a);
    }

    public SetPinnedDownloadPreferencesRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    parcelableTransferPreferences = (ParcelableTransferPreferences) a.a(parcel, a, ParcelableTransferPreferences.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SetPinnedDownloadPreferencesRequest(i, parcelableTransferPreferences);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SetPinnedDownloadPreferencesRequest[] a(int i) {
        return new SetPinnedDownloadPreferencesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
