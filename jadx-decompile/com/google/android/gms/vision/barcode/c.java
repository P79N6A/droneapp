package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.vision.barcode.Barcode.CalendarEvent;
import com.google.android.gms.vision.barcode.Barcode.ContactInfo;
import com.google.android.gms.vision.barcode.Barcode.DriverLicense;
import com.google.android.gms.vision.barcode.Barcode.Email;
import com.google.android.gms.vision.barcode.Barcode.GeoPoint;
import com.google.android.gms.vision.barcode.Barcode.Phone;
import com.google.android.gms.vision.barcode.Barcode.Sms;
import com.google.android.gms.vision.barcode.Barcode.UrlBookmark;
import com.google.android.gms.vision.barcode.Barcode.WiFi;

public class c implements Creator<Barcode> {
    static void a(Barcode barcode, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, barcode.A);
        b.a(parcel, 2, barcode.B);
        b.a(parcel, 3, barcode.C, false);
        b.a(parcel, 4, barcode.D, false);
        b.a(parcel, 5, barcode.E);
        b.a(parcel, 6, barcode.F, i, false);
        b.a(parcel, 7, barcode.G, i, false);
        b.a(parcel, 8, barcode.H, i, false);
        b.a(parcel, 9, barcode.I, i, false);
        b.a(parcel, 10, barcode.J, i, false);
        b.a(parcel, 11, barcode.K, i, false);
        b.a(parcel, 12, barcode.L, i, false);
        b.a(parcel, 13, barcode.M, i, false);
        b.a(parcel, 14, barcode.N, i, false);
        b.a(parcel, 15, barcode.O, i, false);
        b.a(parcel, a);
    }

    public Barcode a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        int i3 = 0;
        Point[] pointArr = null;
        Email email = null;
        Phone phone = null;
        Sms sms = null;
        WiFi wiFi = null;
        UrlBookmark urlBookmark = null;
        GeoPoint geoPoint = null;
        CalendarEvent calendarEvent = null;
        ContactInfo contactInfo = null;
        DriverLicense driverLicense = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    i3 = a.g(parcel, a);
                    break;
                case 6:
                    pointArr = (Point[]) a.b(parcel, a, Point.CREATOR);
                    break;
                case 7:
                    email = (Email) a.a(parcel, a, Email.CREATOR);
                    break;
                case 8:
                    phone = (Phone) a.a(parcel, a, Phone.CREATOR);
                    break;
                case 9:
                    sms = (Sms) a.a(parcel, a, Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (WiFi) a.a(parcel, a, WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (UrlBookmark) a.a(parcel, a, UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (GeoPoint) a.a(parcel, a, GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (CalendarEvent) a.a(parcel, a, CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (ContactInfo) a.a(parcel, a, ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (DriverLicense) a.a(parcel, a, DriverLicense.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Barcode(i, i2, str, str2, i3, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Barcode[] a(int i) {
        return new Barcode[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
