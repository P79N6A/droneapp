package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

@KeepName
public class PlusCommonExtras extends AbstractSafeParcelable {
    public static final f CREATOR = new f();
    private final int a;
    private String b;
    private String c;

    public PlusCommonExtras() {
        this.a = 1;
        this.b = "";
        this.c = "";
    }

    PlusCommonExtras(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public int a() {
        return this.a;
    }

    public void a(Bundle bundle) {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", c.a(this));
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.a == plusCommonExtras.a && com.google.android.gms.common.internal.c.a(this.b, plusCommonExtras.b) && com.google.android.gms.common.internal.c.a(this.c, plusCommonExtras.c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return com.google.android.gms.common.internal.c.a(this).a("versionCode", Integer.valueOf(this.a)).a("Gpsrc", this.b).a("ClientCallingPackage", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
