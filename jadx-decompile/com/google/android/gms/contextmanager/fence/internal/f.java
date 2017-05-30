package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<ContextFenceRegistrationStub> {
    static void a(ContextFenceRegistrationStub contextFenceRegistrationStub, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, contextFenceRegistrationStub.a());
        b.a(parcel, 2, contextFenceRegistrationStub.b(), false);
        b.a(parcel, 3, contextFenceRegistrationStub.c(), i, false);
        b.a(parcel, a);
    }

    public ContextFenceRegistrationStub a(Parcel parcel) {
        ContextFenceStub contextFenceStub = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    contextFenceStub = (ContextFenceStub) a.a(parcel, a, ContextFenceStub.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ContextFenceRegistrationStub(i, str, contextFenceStub);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ContextFenceRegistrationStub[] a(int i) {
        return new ContextFenceRegistrationStub[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
