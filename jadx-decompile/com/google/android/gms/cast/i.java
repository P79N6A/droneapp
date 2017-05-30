package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class i implements Creator<ApplicationMetadata> {
    static void a(ApplicationMetadata applicationMetadata, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, applicationMetadata.a());
        b.a(parcel, 2, applicationMetadata.b(), false);
        b.a(parcel, 3, applicationMetadata.c(), false);
        b.c(parcel, 4, applicationMetadata.g(), false);
        b.b(parcel, 5, applicationMetadata.d(), false);
        b.a(parcel, 6, applicationMetadata.e(), false);
        b.a(parcel, 7, applicationMetadata.f(), i, false);
        b.a(parcel, a);
    }

    public ApplicationMetadata a(Parcel parcel) {
        Uri uri = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    list2 = a.c(parcel, a, WebImage.CREATOR);
                    break;
                case 5:
                    list = a.E(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ApplicationMetadata(i, str3, str2, list2, list, str, uri);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ApplicationMetadata[] a(int i) {
        return new ApplicationMetadata[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
