package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m implements Creator<PopupLocationInfoParcelable> {
    static void a(PopupLocationInfoParcelable popupLocationInfoParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, popupLocationInfoParcelable.b(), false);
        b.a(parcel, 2, popupLocationInfoParcelable.c(), false);
        b.a(parcel, 1000, popupLocationInfoParcelable.a());
        b.a(parcel, a);
    }

    public PopupLocationInfoParcelable a(Parcel parcel) {
        IBinder iBinder = null;
        int b = a.b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    bundle = a.s(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
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
            return new PopupLocationInfoParcelable(i, bundle, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PopupLocationInfoParcelable[] a(int i) {
        return new PopupLocationInfoParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
