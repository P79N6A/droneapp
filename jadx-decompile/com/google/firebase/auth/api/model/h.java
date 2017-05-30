package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<VerifyAssertionRequest> {
    static void a(VerifyAssertionRequest verifyAssertionRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, verifyAssertionRequest.a);
        b.a(parcel, 2, verifyAssertionRequest.a(), false);
        b.a(parcel, 3, verifyAssertionRequest.b(), false);
        b.a(parcel, 4, verifyAssertionRequest.c(), false);
        b.a(parcel, 5, verifyAssertionRequest.d(), false);
        b.a(parcel, 6, verifyAssertionRequest.e(), false);
        b.a(parcel, 7, verifyAssertionRequest.h(), false);
        b.a(parcel, 8, verifyAssertionRequest.i(), false);
        b.a(parcel, 9, verifyAssertionRequest.f(), false);
        b.a(parcel, 10, verifyAssertionRequest.g());
        b.a(parcel, a);
    }

    public VerifyAssertionRequest a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str8 = a.q(parcel, a);
                    break;
                case 3:
                    str7 = a.q(parcel, a);
                    break;
                case 4:
                    str6 = a.q(parcel, a);
                    break;
                case 5:
                    str5 = a.q(parcel, a);
                    break;
                case 6:
                    str4 = a.q(parcel, a);
                    break;
                case 7:
                    str3 = a.q(parcel, a);
                    break;
                case 8:
                    str2 = a.q(parcel, a);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                case 10:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VerifyAssertionRequest(i, str8, str7, str6, str5, str4, str3, str2, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VerifyAssertionRequest[] a(int i) {
        return new VerifyAssertionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
