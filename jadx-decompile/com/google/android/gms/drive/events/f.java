package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class f implements Creator<ChangesAvailableOptions> {
    static void a(ChangesAvailableOptions changesAvailableOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, changesAvailableOptions.a);
        b.a(parcel, 2, changesAvailableOptions.b);
        b.a(parcel, 3, changesAvailableOptions.c);
        b.c(parcel, 4, changesAvailableOptions.d, false);
        b.a(parcel, a);
    }

    public ChangesAvailableOptions a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    list = a.c(parcel, a, DriveSpace.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangesAvailableOptions(i2, i, z, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChangesAvailableOptions[] a(int i) {
        return new ChangesAvailableOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
