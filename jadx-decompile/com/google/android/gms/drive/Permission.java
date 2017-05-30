package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Permission extends AbstractSafeParcelable {
    public static final Creator<Permission> CREATOR = new y();
    final int a;
    private String b;
    private int c;
    private String d;
    private String e;
    private int f;
    private boolean g;

    Permission(int i, String str, int i2, String str2, String str3, int i3, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = z;
    }

    public static boolean a(int i) {
        switch (i) {
            case 256:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    public static boolean b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public String a() {
        return !a(this.c) ? null : this.b;
    }

    public int b() {
        return !a(this.c) ? -1 : this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public int e() {
        return !b(this.f) ? -1 : this.f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Permission permission = (Permission) obj;
        return c.a(this.b, permission.b) && this.c == permission.c && this.f == permission.f && this.g == permission.g;
    }

    public boolean f() {
        return this.g;
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
