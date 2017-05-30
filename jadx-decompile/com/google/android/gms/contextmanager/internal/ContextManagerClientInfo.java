package com.google.android.gms.contextmanager.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import com.google.android.gms.awareness.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ss;

public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Creator<ContextManagerClientInfo> CREATOR = new e();
    private final int a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;
    private final String h;
    private final String i;
    private final int j;
    private ss k;

    ContextManagerClientInfo(int i, String str, String str2, int i2, String str3, int i3, int i4, String str4, String str5, int i5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = i3;
        this.g = i4;
        this.h = str4;
        this.i = str5;
        this.j = i5;
    }

    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4) {
        this(1, d.a(str), d.a(str2), i, d.a(str3), i2, i3, str4, str5, i4);
    }

    public static ContextManagerClientInfo a(Context context, String str) {
        return new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), context.getPackageName(), com.google.android.gms.common.util.d.a(context, context.getPackageName()), 3, null, null, -1);
    }

    public static ContextManagerClientInfo a(Context context, String str, b bVar) {
        return new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), bVar.a(), com.google.android.gms.common.util.d.a(context, context.getPackageName()), bVar.b(), bVar.c(), bVar.d(), bVar.e());
    }

    int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public ss c() {
        if (this.b == null) {
            return null;
        }
        if (this.k == null) {
            this.k = new ss(this.b);
        }
        return this.k;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    int h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public String j() {
        return this.i;
    }

    public int k() {
        return this.j;
    }

    public String l() {
        switch (this.g) {
            case 0:
                return "0P";
            case 1:
                return "1P";
            case 3:
                return "3P";
            default:
                return "unknownPartyType";
        }
    }

    public byte[] m() {
        return c.a(this);
    }

    public String toString() {
        String valueOf = String.valueOf(c());
        String valueOf2 = String.valueOf(d());
        int e = e();
        String valueOf3 = String.valueOf(f());
        int g = g();
        String valueOf4 = String.valueOf(l());
        String valueOf5 = String.valueOf(i());
        String valueOf6 = String.valueOf(j());
        return new StringBuilder((((((String.valueOf(valueOf).length() + 100) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("(account=").append(valueOf).append(", ").append(valueOf2).append("(").append(e).append("):").append(valueOf3).append(", version=").append(g).append(", ").append(valueOf4).append(", thirdPartyPackageName = ").append(valueOf5).append(" ,  thirdPartyModuleId = ").append(valueOf6).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
