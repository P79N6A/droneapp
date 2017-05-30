package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class h implements Creator<BleDevice> {
    static void a(BleDevice bleDevice, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, bleDevice.a(), false);
        b.a(parcel, 2, bleDevice.b(), false);
        b.b(parcel, 3, bleDevice.c(), false);
        b.c(parcel, 4, bleDevice.d(), false);
        b.a(parcel, 1000, bleDevice.e());
        b.a(parcel, a);
    }

    public BleDevice a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        List list2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    list2 = a.E(parcel, a);
                    break;
                case 4:
                    list = a.c(parcel, a, DataType.CREATOR);
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
            return new BleDevice(i, str2, str, list2, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public BleDevice[] a(int i) {
        return new BleDevice[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
