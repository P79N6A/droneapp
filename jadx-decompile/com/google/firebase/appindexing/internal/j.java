package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.firebase.appindexing.internal.Thing.Metadata;

public class j implements Creator<Thing> {
    static void a(Thing thing, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, thing.b(), false);
        b.a(parcel, 2, thing.c(), i, false);
        b.a(parcel, 3, thing.d(), false);
        b.a(parcel, 4, thing.e(), false);
        b.a(parcel, 1000, thing.a());
        b.a(parcel, a);
    }

    public Thing a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        Metadata metadata = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    bundle = a.s(parcel, a);
                    break;
                case 2:
                    metadata = (Metadata) a.a(parcel, a, Metadata.CREATOR);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
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
            return new Thing(i, bundle, metadata, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Thing[] a(int i) {
        return new Thing[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
