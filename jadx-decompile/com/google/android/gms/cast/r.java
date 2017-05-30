package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<TextTrackStyle> {
    static void a(TextTrackStyle textTrackStyle, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, textTrackStyle.a());
        b.a(parcel, 2, textTrackStyle.b());
        b.a(parcel, 3, textTrackStyle.c());
        b.a(parcel, 4, textTrackStyle.d());
        b.a(parcel, 5, textTrackStyle.e());
        b.a(parcel, 6, textTrackStyle.f());
        b.a(parcel, 7, textTrackStyle.g());
        b.a(parcel, 8, textTrackStyle.h());
        b.a(parcel, 9, textTrackStyle.i());
        b.a(parcel, 10, textTrackStyle.j(), false);
        b.a(parcel, 11, textTrackStyle.k());
        b.a(parcel, 12, textTrackStyle.l());
        b.a(parcel, 13, textTrackStyle.z, false);
        b.a(parcel, a);
    }

    public TextTrackStyle a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        int i9 = 0;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    f = a.l(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i3 = a.g(parcel, a);
                    break;
                case 5:
                    i4 = a.g(parcel, a);
                    break;
                case 6:
                    i5 = a.g(parcel, a);
                    break;
                case 7:
                    i6 = a.g(parcel, a);
                    break;
                case 8:
                    i7 = a.g(parcel, a);
                    break;
                case 9:
                    i8 = a.g(parcel, a);
                    break;
                case 10:
                    str = a.q(parcel, a);
                    break;
                case 11:
                    i9 = a.g(parcel, a);
                    break;
                case 12:
                    i10 = a.g(parcel, a);
                    break;
                case 13:
                    str2 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TextTrackStyle(i, f, i2, i3, i4, i5, i6, i7, i8, str, i9, i10, str2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TextTrackStyle[] a(int i) {
        return new TextTrackStyle[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
