package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<ContextFenceStub> {
    static void a(ContextFenceStub contextFenceStub, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, contextFenceStub.a());
        b.a(parcel, 2, contextFenceStub.b(), false);
        b.a(parcel, a);
    }

    public ContextFenceStub a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.t(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ContextFenceStub(i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ContextFenceStub[] a(int i) {
        return new ContextFenceStub[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
