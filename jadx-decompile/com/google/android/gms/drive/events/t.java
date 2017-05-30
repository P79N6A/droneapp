package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class t implements Creator<TransferStateOptions> {
    static void a(TransferStateOptions transferStateOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, transferStateOptions.a);
        b.c(parcel, 2, transferStateOptions.b, false);
        b.a(parcel, a);
    }

    public TransferStateOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list = a.c(parcel, a, DriveSpace.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TransferStateOptions(i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TransferStateOptions[] a(int i) {
        return new TransferStateOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
