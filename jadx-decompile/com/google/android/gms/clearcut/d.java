package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public class d implements Creator<LogEventParcelable> {
    static void a(LogEventParcelable logEventParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, logEventParcelable.a);
        b.a(parcel, 2, logEventParcelable.b, i, false);
        b.a(parcel, 3, logEventParcelable.c, false);
        b.a(parcel, 4, logEventParcelable.d, false);
        b.a(parcel, 5, logEventParcelable.e, false);
        b.a(parcel, 6, logEventParcelable.f, false);
        b.a(parcel, 7, logEventParcelable.g, false);
        b.a(parcel, 8, logEventParcelable.h);
        b.a(parcel, a);
    }

    public LogEventParcelable a(Parcel parcel) {
        byte[][] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        boolean z = true;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        PlayLoggerContext playLoggerContext = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    playLoggerContext = (PlayLoggerContext) a.a(parcel, a, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr2 = a.t(parcel, a);
                    break;
                case 4:
                    iArr2 = a.w(parcel, a);
                    break;
                case 5:
                    strArr = a.C(parcel, a);
                    break;
                case 6:
                    iArr = a.w(parcel, a);
                    break;
                case 7:
                    bArr = a.u(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LogEventParcelable(i, playLoggerContext, bArr2, iArr2, strArr, iArr, bArr, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LogEventParcelable[] a(int i) {
        return new LogEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
