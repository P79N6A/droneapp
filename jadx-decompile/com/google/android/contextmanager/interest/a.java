package com.google.android.contextmanager.interest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<InterestRecordStub> {
    static void a(InterestRecordStub interestRecordStub, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, interestRecordStub.a());
        b.a(parcel, 2, interestRecordStub.b(), false);
        b.a(parcel, a);
    }

    public InterestRecordStub a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    bArr = com.google.android.gms.common.internal.safeparcel.a.t(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InterestRecordStub(i, bArr);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public InterestRecordStub[] a(int i) {
        return new InterestRecordStub[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
