package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public class p implements Creator<TransferProgressEvent> {
    static void a(TransferProgressEvent transferProgressEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, transferProgressEvent.a);
        b.a(parcel, 2, transferProgressEvent.b, i, false);
        b.a(parcel, a);
    }

    public TransferProgressEvent a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        TransferProgressData transferProgressData = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    transferProgressData = (TransferProgressData) a.a(parcel, a, TransferProgressData.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TransferProgressEvent(i, transferProgressData);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TransferProgressEvent[] a(int i) {
        return new TransferProgressEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
