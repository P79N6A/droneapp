package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR = new f();
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        this.c = (String) d.a((Object) str);
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.a = 1;
        this.b = j;
        this.c = (String) d.a((Object) str);
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.b == accountChangeEvent.b && c.a(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && c.a(this.f, accountChangeEvent.f);
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.d) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.c;
        String str3 = this.f;
        return new StringBuilder(((String.valueOf(str2).length() + 91) + String.valueOf(str).length()) + String.valueOf(str3).length()).append("AccountChangeEvent {accountName = ").append(str2).append(", changeType = ").append(str).append(", changeData = ").append(str3).append(", eventIndex = ").append(this.e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
