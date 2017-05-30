package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<UpdateFenceOperation> {
    static void a(UpdateFenceOperation updateFenceOperation, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, updateFenceOperation.a());
        b.a(parcel, 2, updateFenceOperation.c());
        b.a(parcel, 3, updateFenceOperation.d(), i, false);
        b.a(parcel, 4, updateFenceOperation.b(), false);
        b.a(parcel, 5, updateFenceOperation.e(), i, false);
        b.a(parcel, 6, updateFenceOperation.f(), false);
        b.a(parcel, 7, updateFenceOperation.g());
        b.a(parcel, 8, updateFenceOperation.h());
        b.a(parcel, a);
    }

    public UpdateFenceOperation a(Parcel parcel) {
        long j = 0;
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        long j2 = 0;
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        ContextFenceRegistrationStub contextFenceRegistrationStub = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    contextFenceRegistrationStub = (ContextFenceRegistrationStub) a.a(parcel, a, ContextFenceRegistrationStub.CREATOR);
                    break;
                case 4:
                    iBinder = a.r(parcel, a);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) a.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    j2 = a.i(parcel, a);
                    break;
                case 8:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpdateFenceOperation(i2, i, contextFenceRegistrationStub, iBinder, pendingIntent, str, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UpdateFenceOperation[] a(int i) {
        return new UpdateFenceOperation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
