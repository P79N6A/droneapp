package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;

public class a implements Creator<ActionImpl> {
    static void a(ActionImpl actionImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, actionImpl.a(), false);
        b.a(parcel, 2, actionImpl.b(), false);
        b.a(parcel, 3, actionImpl.c(), false);
        b.a(parcel, 4, actionImpl.d(), false);
        b.a(parcel, 5, actionImpl.e(), i, false);
        b.a(parcel, 6, actionImpl.f(), false);
        b.a(parcel, 1000, actionImpl.a);
        b.a(parcel, a);
    }

    public ActionImpl a(Parcel parcel) {
        String str = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        MetadataImpl metadataImpl = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    str5 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 2:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 5:
                    metadataImpl = (MetadataImpl) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, MetadataImpl.CREATOR);
                    break;
                case 6:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActionImpl(i, str5, str4, str3, str2, metadataImpl, str);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ActionImpl[] a(int i) {
        return new ActionImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
