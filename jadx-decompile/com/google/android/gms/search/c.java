package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<GoogleNowAuthState> {
    static void a(GoogleNowAuthState googleNowAuthState, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, googleNowAuthState.a(), false);
        b.a(parcel, 2, googleNowAuthState.b(), false);
        b.a(parcel, 3, googleNowAuthState.c());
        b.a(parcel, 1000, googleNowAuthState.a);
        b.a(parcel, a);
    }

    public GoogleNowAuthState a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
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
                    j = a.i(parcel, a);
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
            return new GoogleNowAuthState(i, str2, str, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GoogleNowAuthState[] a(int i) {
        return new GoogleNowAuthState[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
