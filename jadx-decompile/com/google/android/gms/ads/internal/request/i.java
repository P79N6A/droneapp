package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class i implements Creator<AutoClickProtectionConfigurationParcel> {
    static void a(AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, autoClickProtectionConfigurationParcel.a);
        b.a(parcel, 2, autoClickProtectionConfigurationParcel.b);
        b.b(parcel, 3, autoClickProtectionConfigurationParcel.c, false);
        b.a(parcel, a);
    }

    public AutoClickProtectionConfigurationParcel a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z = a.c(parcel, a);
                    break;
                case 3:
                    list = a.E(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AutoClickProtectionConfigurationParcel(i, z, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AutoClickProtectionConfigurationParcel[] a(int i) {
        return new AutoClickProtectionConfigurationParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
