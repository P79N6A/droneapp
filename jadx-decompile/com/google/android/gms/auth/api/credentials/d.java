package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class d implements Creator<Credential> {
    static void a(Credential credential, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, credential.a(), false);
        b.a(parcel, 2, credential.b(), false);
        b.a(parcel, 3, credential.c(), i, false);
        b.c(parcel, 4, credential.d(), false);
        b.a(parcel, 5, credential.e(), false);
        b.a(parcel, 6, credential.g(), false);
        b.a(parcel, 7, credential.f(), false);
        b.a(parcel, 1000, credential.b);
        b.a(parcel, 8, credential.h(), false);
        b.a(parcel, a);
    }

    public Credential a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str6 = a.q(parcel, a);
                    break;
                case 2:
                    str5 = a.q(parcel, a);
                    break;
                case 3:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = a.c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
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
            return new Credential(i, str6, str5, uri, list, str4, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Credential[] a(int i) {
        return new Credential[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
