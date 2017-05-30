package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 32;
    public static final int h = 64;
    public static final int i = 128;
    public static final int j = 256;
    public static final int k = 512;
    public static final int l = 1024;
    public static final int m = 2048;
    public static final int n = 4096;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public static final int s = 5;
    public static final int t = 6;
    public static final int u = 7;
    public static final int v = 8;
    public static final int w = 9;
    public static final int x = 10;
    public static final int y = 11;
    public static final int z = 12;
    final int A;
    public int B;
    public String C;
    public String D;
    public int E;
    public Point[] F;
    public Email G;
    public Phone H;
    public Sms I;
    public WiFi J;
    public UrlBookmark K;
    public GeoPoint L;
    public CalendarEvent M;
    public ContactInfo N;
    public DriverLicense O;

    public static class Address extends AbstractSafeParcelable {
        public static final b CREATOR = new b();
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        final int a;
        public int e;
        public String[] f;

        public Address() {
            this.a = 1;
        }

        public Address(int i, int i2, String[] strArr) {
            this.a = i;
            this.e = i2;
            this.f = strArr;
        }

        public void writeToParcel(Parcel parcel, int i) {
            b bVar = CREATOR;
            b.a(this, parcel, i);
        }
    }

    public static class CalendarDateTime extends AbstractSafeParcelable {
        public static final d CREATOR = new d();
        final int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public String i;

        public CalendarDateTime() {
            this.a = 1;
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = z;
            this.i = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            d dVar = CREATOR;
            d.a(this, parcel, i);
        }
    }

    public static class CalendarEvent extends AbstractSafeParcelable {
        public static final e CREATOR = new e();
        final int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public CalendarDateTime g;
        public CalendarDateTime h;

        public CalendarEvent() {
            this.a = 1;
        }

        public CalendarEvent(int i, String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = calendarDateTime;
            this.h = calendarDateTime2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            e eVar = CREATOR;
            e.a(this, parcel, i);
        }
    }

    public static class ContactInfo extends AbstractSafeParcelable {
        public static final f CREATOR = new f();
        final int a;
        public PersonName b;
        public String c;
        public String d;
        public Phone[] e;
        public Email[] f;
        public String[] g;
        public Address[] h;

        public ContactInfo() {
            this.a = 1;
        }

        public ContactInfo(int i, PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.a = i;
            this.b = personName;
            this.c = str;
            this.d = str2;
            this.e = phoneArr;
            this.f = emailArr;
            this.g = strArr;
            this.h = addressArr;
        }

        public void writeToParcel(Parcel parcel, int i) {
            f fVar = CREATOR;
            f.a(this, parcel, i);
        }
    }

    public static class DriverLicense extends AbstractSafeParcelable {
        public static final g CREATOR = new g();
        final int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;

        public DriverLicense() {
            this.a = 1;
        }

        public DriverLicense(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
            this.k = str10;
            this.l = str11;
            this.m = str12;
            this.n = str13;
            this.o = str14;
        }

        public void writeToParcel(Parcel parcel, int i) {
            g gVar = CREATOR;
            g.a(this, parcel, i);
        }
    }

    public static class Email extends AbstractSafeParcelable {
        public static final h CREATOR = new h();
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        final int d;
        public int e;
        public String f;
        public String g;
        public String h;

        public Email() {
            this.d = 1;
        }

        public Email(int i, int i2, String str, String str2, String str3) {
            this.d = i;
            this.e = i2;
            this.f = str;
            this.g = str2;
            this.h = str3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            h hVar = CREATOR;
            h.a(this, parcel, i);
        }
    }

    public static class GeoPoint extends AbstractSafeParcelable {
        public static final i CREATOR = new i();
        final int a;
        public double b;
        public double c;

        public GeoPoint() {
            this.a = 1;
        }

        public GeoPoint(int i, double d, double d2) {
            this.a = i;
            this.b = d;
            this.c = d2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i iVar = CREATOR;
            i.a(this, parcel, i);
        }
    }

    public static class PersonName extends AbstractSafeParcelable {
        public static final j CREATOR = new j();
        final int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;

        public PersonName() {
            this.a = 1;
        }

        public PersonName(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
        }

        public void writeToParcel(Parcel parcel, int i) {
            j jVar = CREATOR;
            j.a(this, parcel, i);
        }
    }

    public static class Phone extends AbstractSafeParcelable {
        public static final k CREATOR = new k();
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        final int f;
        public int g;
        public String h;

        public Phone() {
            this.f = 1;
        }

        public Phone(int i, int i2, String str) {
            this.f = i;
            this.g = i2;
            this.h = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            k kVar = CREATOR;
            k.a(this, parcel, i);
        }
    }

    public static class Sms extends AbstractSafeParcelable {
        public static final l CREATOR = new l();
        final int a;
        public String b;
        public String c;

        public Sms() {
            this.a = 1;
        }

        public Sms(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            l lVar = CREATOR;
            l.a(this, parcel, i);
        }
    }

    public static class UrlBookmark extends AbstractSafeParcelable {
        public static final m CREATOR = new m();
        final int a;
        public String b;
        public String c;

        public UrlBookmark() {
            this.a = 1;
        }

        public UrlBookmark(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            m mVar = CREATOR;
            m.a(this, parcel, i);
        }
    }

    public static class WiFi extends AbstractSafeParcelable {
        public static final n CREATOR = new n();
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        final int d;
        public String e;
        public String f;
        public int g;

        public WiFi() {
            this.d = 1;
        }

        public WiFi(int i, String str, String str2, int i2) {
            this.d = i;
            this.e = str;
            this.f = str2;
            this.g = i2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            n nVar = CREATOR;
            n.a(this, parcel, i);
        }
    }

    public Barcode() {
        this.A = 1;
    }

    public Barcode(int i, int i2, String str, String str2, int i3, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense) {
        this.A = i;
        this.B = i2;
        this.C = str;
        this.D = str2;
        this.E = i3;
        this.F = pointArr;
        this.G = email;
        this.H = phone;
        this.I = sms;
        this.J = wiFi;
        this.K = urlBookmark;
        this.L = geoPoint;
        this.M = calendarEvent;
        this.N = contactInfo;
        this.O = driverLicense;
    }

    public Rect a() {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : this.F) {
            i4 = Math.min(i4, point.x);
            i3 = Math.max(i3, point.x);
            i = Math.min(i, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i4, i, i3, i2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        c cVar = CREATOR;
        c.a(this, parcel, i);
    }
}
