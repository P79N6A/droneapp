package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<AppContentAnnotationEntity> {
    static void a(AppContentAnnotationEntity appContentAnnotationEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, appContentAnnotationEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, appContentAnnotationEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, appContentAnnotationEntity.k(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, appContentAnnotationEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, appContentAnnotationEntity.j(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, appContentAnnotationEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, appContentAnnotationEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, appContentAnnotationEntity.f());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, appContentAnnotationEntity.i());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, appContentAnnotationEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public AppContentAnnotationEntity a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = a.b(parcel);
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str5 = a.q(parcel, a);
                    break;
                case 2:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 3:
                    str4 = a.q(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    i2 = a.g(parcel, a);
                    break;
                case 9:
                    i = a.g(parcel, a);
                    break;
                case 10:
                    bundle = a.s(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AppContentAnnotationEntity(i3, str5, uri, str4, str3, str2, str, i2, i, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppContentAnnotationEntity[] a(int i) {
        return new AppContentAnnotationEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
