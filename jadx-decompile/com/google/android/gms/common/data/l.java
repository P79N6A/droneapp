package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l implements Creator<DataHolder> {
    static void a(DataHolder dataHolder, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, dataHolder.c(), false);
        b.a(parcel, 2, dataHolder.d(), i, false);
        b.a(parcel, 3, dataHolder.e());
        b.a(parcel, 4, dataHolder.f(), false);
        b.a(parcel, 1000, dataHolder.b());
        b.a(parcel, a);
    }

    public DataHolder a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = a.b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    strArr = a.C(parcel, a);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) a.b(parcel, a, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    bundle = a.s(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a.a("Overread allowed size end=" + b, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.a();
        return dataHolder;
    }

    public DataHolder[] a(int i) {
        return new DataHolder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
