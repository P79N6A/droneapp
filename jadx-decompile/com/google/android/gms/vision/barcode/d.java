package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.CalendarDateTime;

public class d implements Creator<CalendarDateTime> {
    static void a(CalendarDateTime calendarDateTime, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, calendarDateTime.a);
        b.a(parcel, 2, calendarDateTime.b);
        b.a(parcel, 3, calendarDateTime.c);
        b.a(parcel, 4, calendarDateTime.d);
        b.a(parcel, 5, calendarDateTime.e);
        b.a(parcel, 6, calendarDateTime.f);
        b.a(parcel, 7, calendarDateTime.g);
        b.a(parcel, 8, calendarDateTime.h);
        b.a(parcel, 9, calendarDateTime.i, false);
        b.a(parcel, a);
    }

    public CalendarDateTime a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i7 = a.g(parcel, a);
                    break;
                case 2:
                    i6 = a.g(parcel, a);
                    break;
                case 3:
                    i5 = a.g(parcel, a);
                    break;
                case 4:
                    i4 = a.g(parcel, a);
                    break;
                case 5:
                    i3 = a.g(parcel, a);
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    break;
                case 7:
                    i = a.g(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CalendarDateTime(i7, i6, i5, i4, i3, i2, i, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CalendarDateTime[] a(int i) {
        return new CalendarDateTime[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
