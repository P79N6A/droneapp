package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Application extends AbstractSafeParcelable {
    public static final Creator<Application> CREATOR = new g();
    public static final Application a = new Application("com.google.android.gms", null, null);
    private final int b;
    private final String c;
    private final String d;
    private final String e;

    Application(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = (String) d.a(str);
        this.d = "";
        this.e = str3;
    }

    public Application(String str, String str2, String str3) {
        this(1, str, "", str3);
    }

    public static Application a(String str) {
        return a(str, null, null);
    }

    public static Application a(String str, String str2, String str3) {
        return "com.google.android.gms".equals(str) ? a : new Application(str, str2, str3);
    }

    private boolean a(Application application) {
        return this.c.equals(application.c) && c.a(this.d, application.d) && c.a(this.e, application.e);
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Application) && a((Application) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.d, this.e});
    }

    public String toString() {
        return String.format("Application{%s:%s:%s}", new Object[]{this.c, this.d, this.e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
