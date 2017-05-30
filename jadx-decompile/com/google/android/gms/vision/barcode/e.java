package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.CalendarDateTime;
import com.google.android.gms.vision.barcode.Barcode.CalendarEvent;

public class e implements Creator<CalendarEvent> {
    static void a(CalendarEvent calendarEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, calendarEvent.a);
        b.a(parcel, 2, calendarEvent.b, false);
        b.a(parcel, 3, calendarEvent.c, false);
        b.a(parcel, 4, calendarEvent.d, false);
        b.a(parcel, 5, calendarEvent.e, false);
        b.a(parcel, 6, calendarEvent.f, false);
        b.a(parcel, 7, calendarEvent.g, i, false);
        b.a(parcel, 8, calendarEvent.h, i, false);
        b.a(parcel, a);
    }

    public CalendarEvent a(Parcel parcel) {
        CalendarDateTime calendarDateTime = null;
        int b = a.b(parcel);
        int i = 0;
        CalendarDateTime calendarDateTime2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str5 = a.q(parcel, a);
                    break;
                case 3:
                    str4 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    calendarDateTime2 = (CalendarDateTime) a.a(parcel, a, CalendarDateTime.CREATOR);
                    break;
                case 8:
                    calendarDateTime = (CalendarDateTime) a.a(parcel, a, CalendarDateTime.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CalendarEvent(i, str5, str4, str3, str2, str, calendarDateTime2, calendarDateTime);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CalendarEvent[] a(int i) {
        return new CalendarEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
