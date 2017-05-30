package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ah implements Creator<OnStartStreamSession> {
    static void a(OnStartStreamSession onStartStreamSession, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onStartStreamSession.a);
        b.a(parcel, 2, onStartStreamSession.b, i, false);
        b.a(parcel, 3, onStartStreamSession.c, false);
        b.a(parcel, 4, onStartStreamSession.d, false);
        b.a(parcel, a);
    }

    public OnStartStreamSession a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            IBinder iBinder2;
            ParcelFileDescriptor parcelFileDescriptor2;
            int g;
            String str2;
            int a = a.a(parcel);
            String str3;
            switch (a.a(a)) {
                case 1:
                    str3 = str;
                    iBinder2 = iBinder;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = a.g(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    g = i;
                    IBinder iBinder3 = iBinder;
                    parcelFileDescriptor2 = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    str2 = str;
                    iBinder2 = iBinder3;
                    break;
                case 3:
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = i;
                    str3 = str;
                    iBinder2 = a.r(parcel, a);
                    str2 = str3;
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    iBinder2 = iBinder;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    str2 = str;
                    iBinder2 = iBinder;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    g = i;
                    break;
            }
            i = g;
            parcelFileDescriptor = parcelFileDescriptor2;
            iBinder = iBinder2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new OnStartStreamSession(i, parcelFileDescriptor, iBinder, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnStartStreamSession[] a(int i) {
        return new OnStartStreamSession[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
