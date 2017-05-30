package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akk;
import com.google.android.gms.internal.ame;

public final class Device extends AbstractSafeParcelable {
    public static final Creator<Device> CREATOR = new r();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    private final int h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private final int n;

    Device(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        this.h = i;
        this.i = (String) d.a(str);
        this.j = (String) d.a(str2);
        this.k = "";
        this.l = a(str4);
        this.m = i2;
        this.n = i3;
    }

    public Device(String str, String str2, String str3, int i) {
        this(str, str2, "", str3, i, 0);
    }

    public Device(String str, String str2, String str3, String str4, int i, int i2) {
        this(1, str, str2, "", str4, i, i2);
    }

    public static Device a(Context context) {
        int b = akk.b(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, VERSION.RELEASE, b(context), b, 2);
    }

    private String a(String str) {
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Device UID is null.");
    }

    private boolean a(Device device) {
        return c.a(this.i, device.i) && c.a(this.j, device.j) && c.a(this.k, device.k) && c.a(this.l, device.l) && this.m == device.m && this.n == device.n;
    }

    private static String b(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    private boolean j() {
        return f() == 1;
    }

    public String a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public String c() {
        return this.k;
    }

    public String d() {
        return this.l;
    }

    public int e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Device) && a((Device) obj));
    }

    public int f() {
        return this.n;
    }

    String g() {
        return String.format("%s:%s:%s", new Object[]{this.i, this.j, this.l});
    }

    public String h() {
        return j() ? this.l : ame.a(this.l);
    }

    public int hashCode() {
        return c.a(new Object[]{this.i, this.j, this.k, this.l, Integer.valueOf(this.m)});
    }

    int i() {
        return this.h;
    }

    public String toString() {
        return String.format("Device{%s:%s:%s:%s}", new Object[]{g(), this.k, Integer.valueOf(this.m), Integer.valueOf(this.n)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
