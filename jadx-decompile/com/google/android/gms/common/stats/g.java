package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class g implements Creator<WakeLockEvent> {
    static void a(WakeLockEvent wakeLockEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, wakeLockEvent.a);
        b.a(parcel, 2, wakeLockEvent.a());
        b.a(parcel, 4, wakeLockEvent.c(), false);
        b.a(parcel, 5, wakeLockEvent.f());
        b.b(parcel, 6, wakeLockEvent.g(), false);
        b.a(parcel, 8, wakeLockEvent.j());
        b.a(parcel, 10, wakeLockEvent.d(), false);
        b.a(parcel, 11, wakeLockEvent.b());
        b.a(parcel, 12, wakeLockEvent.h(), false);
        b.a(parcel, 13, wakeLockEvent.m(), false);
        b.a(parcel, 14, wakeLockEvent.k());
        b.a(parcel, 15, wakeLockEvent.n());
        b.a(parcel, 16, wakeLockEvent.o());
        b.a(parcel, 17, wakeLockEvent.e(), false);
        b.a(parcel, a);
    }

    public WakeLockEvent a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        List list = null;
        String str2 = null;
        long j2 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
        long j3 = 0;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    i3 = a.g(parcel, a);
                    break;
                case 6:
                    list = a.E(parcel, a);
                    break;
                case 8:
                    j2 = a.i(parcel, a);
                    break;
                case 10:
                    str3 = a.q(parcel, a);
                    break;
                case 11:
                    i2 = a.g(parcel, a);
                    break;
                case 12:
                    str2 = a.q(parcel, a);
                    break;
                case 13:
                    str4 = a.q(parcel, a);
                    break;
                case 14:
                    i4 = a.g(parcel, a);
                    break;
                case 15:
                    f = a.l(parcel, a);
                    break;
                case 16:
                    j3 = a.i(parcel, a);
                    break;
                case 17:
                    str5 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WakeLockEvent[] a(int i) {
        return new WakeLockEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
