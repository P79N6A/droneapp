package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ae implements Creator<NodeParcelable> {
    static void a(NodeParcelable nodeParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, nodeParcelable.a);
        b.a(parcel, 2, nodeParcelable.a(), false);
        b.a(parcel, 3, nodeParcelable.b(), false);
        b.a(parcel, 4, nodeParcelable.d());
        b.a(parcel, 5, nodeParcelable.c());
        b.a(parcel, a);
    }

    public NodeParcelable a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NodeParcelable(i2, str2, str, i, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NodeParcelable[] a(int i) {
        return new NodeParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
