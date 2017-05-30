package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class au implements Creator<AddListenerRequest> {
    static void a(AddListenerRequest addListenerRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, addListenerRequest.a);
        b.a(parcel, 2, addListenerRequest.a(), false);
        b.a(parcel, 3, addListenerRequest.c, i, false);
        b.a(parcel, 4, addListenerRequest.d, false);
        b.a(parcel, 5, addListenerRequest.e, false);
        b.a(parcel, a);
    }

    public AddListenerRequest a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        IntentFilter[] intentFilterArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    intentFilterArr = (IntentFilter[]) a.b(parcel, a, IntentFilter.CREATOR);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddListenerRequest(i, iBinder, intentFilterArr, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AddListenerRequest[] a(int i) {
        return new AddListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
