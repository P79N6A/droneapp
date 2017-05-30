package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Collection;

public class a implements Creator<AppVisibleCustomProperties> {
    static void a(AppVisibleCustomProperties appVisibleCustomProperties, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, appVisibleCustomProperties.b);
        b.c(parcel, 2, appVisibleCustomProperties.c, false);
        b.a(parcel, a);
    }

    public AppVisibleCustomProperties a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Collection collection = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    collection = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, CustomProperty.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AppVisibleCustomProperties(i, collection);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AppVisibleCustomProperties[] a(int i) {
        return new AppVisibleCustomProperties[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
