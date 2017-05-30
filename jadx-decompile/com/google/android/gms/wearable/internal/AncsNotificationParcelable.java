package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.w;

public final class AncsNotificationParcelable extends AbstractSafeParcelable implements w {
    public static final Creator<AncsNotificationParcelable> CREATOR = new az();
    final int a;
    private int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final byte i;
    private final byte j;
    private final byte k;
    private final byte l;
    private final String m;

    AncsNotificationParcelable(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.b = i2;
        this.a = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = b;
        this.j = b2;
        this.k = b3;
        this.l = b4;
        this.m = str7;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.a != ancsNotificationParcelable.a || this.b != ancsNotificationParcelable.b || this.i != ancsNotificationParcelable.i || this.j != ancsNotificationParcelable.j || this.k != ancsNotificationParcelable.k || this.l != ancsNotificationParcelable.l || !this.c.equals(ancsNotificationParcelable.c)) {
            return false;
        }
        if (this.d != null) {
            if (!this.d.equals(ancsNotificationParcelable.d)) {
                return false;
            }
        } else if (ancsNotificationParcelable.d != null) {
            return false;
        }
        if (!this.e.equals(ancsNotificationParcelable.e) || !this.f.equals(ancsNotificationParcelable.f) || !this.g.equals(ancsNotificationParcelable.g)) {
            return false;
        }
        if (this.h != null) {
            if (!this.h.equals(ancsNotificationParcelable.h)) {
                return false;
            }
        } else if (ancsNotificationParcelable.h != null) {
            return false;
        }
        if (this.m != null) {
            z = this.m.equals(ancsNotificationParcelable.m);
        } else if (ancsNotificationParcelable.m != null) {
            z = false;
        }
        return z;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.h == null ? this.c : this.h;
    }

    public byte h() {
        return this.i;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.h != null ? this.h.hashCode() : 0) + (((((((((this.d != null ? this.d.hashCode() : 0) + (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31)) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31;
        if (this.m != null) {
            i = this.m.hashCode();
        }
        return hashCode + i;
    }

    public byte i() {
        return this.j;
    }

    public byte j() {
        return this.k;
    }

    public byte k() {
        return this.l;
    }

    public String l() {
        return this.m;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        byte b = this.i;
        byte b2 = this.j;
        byte b3 = this.k;
        byte b4 = this.l;
        String str7 = this.m;
        return new StringBuilder(((((((String.valueOf(str).length() + 234) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("AncsNotificationParcelable{versionCode=").append(i).append(", id=").append(i2).append(", appId='").append(str).append("'").append(", dateTime='").append(str2).append("'").append(", notificationText='").append(str3).append("'").append(", title='").append(str4).append("'").append(", subtitle='").append(str5).append("'").append(", displayName='").append(str6).append("'").append(", eventId=").append(b).append(", eventFlags=").append(b2).append(", categoryId=").append(b3).append(", categoryCount=").append(b4).append(", packageName='").append(str7).append("'").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        az.a(this, parcel, i);
    }
}
