package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class d implements Creator<AppMetadata> {
    static void a(AppMetadata appMetadata, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, appMetadata.b(), false);
        b.a(parcel, 1000, appMetadata.a());
        b.a(parcel, a);
    }

    public AppMetadata a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list = a.c(parcel, a, AppIdentifier.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AppMetadata(i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppMetadata[] a(int i) {
        return new AppMetadata[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
