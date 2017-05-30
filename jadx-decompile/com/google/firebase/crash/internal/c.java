package com.google.firebase.crash.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<FirebaseCrashOptions> {
    static void a(FirebaseCrashOptions firebaseCrashOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, firebaseCrashOptions.a);
        b.a(parcel, 2, firebaseCrashOptions.a(), false);
        b.a(parcel, 3, firebaseCrashOptions.b(), false);
        b.a(parcel, a);
    }

    public FirebaseCrashOptions a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FirebaseCrashOptions(i, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FirebaseCrashOptions[] a(int i) {
        return new FirebaseCrashOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
