package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<SignInButtonConfig> {
    static void a(SignInButtonConfig signInButtonConfig, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, signInButtonConfig.a);
        b.a(parcel, 2, signInButtonConfig.a());
        b.a(parcel, 3, signInButtonConfig.b());
        b.a(parcel, 4, signInButtonConfig.c(), i, false);
        b.a(parcel, a);
    }

    public SignInButtonConfig a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    scopeArr = (Scope[]) a.b(parcel, a, Scope.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SignInButtonConfig(i3, i2, i, scopeArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SignInButtonConfig[] a(int i) {
        return new SignInButtonConfig[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
