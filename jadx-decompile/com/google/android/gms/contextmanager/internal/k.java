package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl.Operation;

public class k implements Creator<Operation> {
    static void a(Operation operation, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, operation.a());
        b.a(parcel, 2, operation.d());
        b.a(parcel, 3, operation.b(), i, false);
        b.a(parcel, 4, operation.c(), false);
        b.a(parcel, a);
    }

    public Operation a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        InterestRecordStub interestRecordStub = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            InterestRecordStub interestRecordStub2;
            int i3;
            String str2;
            int a = a.a(parcel);
            String str3;
            switch (a.a(a)) {
                case 1:
                    str3 = str;
                    interestRecordStub2 = interestRecordStub;
                    i3 = i;
                    i = a.g(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    i = i2;
                    InterestRecordStub interestRecordStub3 = interestRecordStub;
                    i3 = a.g(parcel, a);
                    str2 = str;
                    interestRecordStub2 = interestRecordStub3;
                    break;
                case 3:
                    i3 = i;
                    i = i2;
                    str3 = str;
                    interestRecordStub2 = (InterestRecordStub) a.a(parcel, a, InterestRecordStub.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    interestRecordStub2 = interestRecordStub;
                    i3 = i;
                    i = i2;
                    break;
                default:
                    a.b(parcel, a);
                    str2 = str;
                    interestRecordStub2 = interestRecordStub;
                    i3 = i;
                    i = i2;
                    break;
            }
            i2 = i;
            i = i3;
            interestRecordStub = interestRecordStub2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new Operation(i2, i, interestRecordStub, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Operation[] a(int i) {
        return new Operation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
