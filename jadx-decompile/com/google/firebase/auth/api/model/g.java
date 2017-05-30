package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class g implements Creator<StringList> {
    static void a(StringList stringList, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, stringList.a);
        b.b(parcel, 2, stringList.a(), false);
        b.a(parcel, a);
    }

    public StringList a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list = a.E(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StringList(i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StringList[] a(int i) {
        return new StringList[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
