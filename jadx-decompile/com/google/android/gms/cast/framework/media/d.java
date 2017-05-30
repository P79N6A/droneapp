package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<CastMediaOptions> {
    static void a(CastMediaOptions castMediaOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, castMediaOptions.a());
        b.a(parcel, 2, castMediaOptions.b(), false);
        b.a(parcel, 3, castMediaOptions.d(), false);
        b.a(parcel, 4, castMediaOptions.f(), false);
        b.a(parcel, 5, castMediaOptions.c(), i, false);
        b.a(parcel, a);
    }

    public CastMediaOptions a(Parcel parcel) {
        NotificationOptions notificationOptions = null;
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    iBinder = a.r(parcel, a);
                    break;
                case 5:
                    notificationOptions = (NotificationOptions) a.a(parcel, a, NotificationOptions.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CastMediaOptions(i, str2, str, iBinder, notificationOptions);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CastMediaOptions[] a(int i) {
        return new CastMediaOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
