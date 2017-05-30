package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<AnalyticsUserProperty> {
    static void a(AnalyticsUserProperty analyticsUserProperty, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, analyticsUserProperty.a());
        b.a(parcel, 2, analyticsUserProperty.b(), false);
        b.a(parcel, 3, analyticsUserProperty.c(), false);
        b.a(parcel, a);
    }

    public AnalyticsUserProperty a(Parcel parcel) {
        String str = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AnalyticsUserProperty(i, str2, str);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AnalyticsUserProperty[] a(int i) {
        return new AnalyticsUserProperty[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
