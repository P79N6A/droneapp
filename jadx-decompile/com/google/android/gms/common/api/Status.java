package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.market.sdk.j;

public final class Status extends AbstractSafeParcelable implements m, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new y();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status f = new Status(17);
    public static final Status g = new Status(18);
    private final int h;
    private final int i;
    private final String j;
    private final PendingIntent k;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.h = i;
        this.i = i2;
        this.j = str;
        this.k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    private String k() {
        return this.j != null ? this.j : f.b(this.i);
    }

    public Status a() {
        return this;
    }

    public void a(Activity activity, int i) {
        if (e()) {
            activity.startIntentSenderForResult(this.k.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    PendingIntent b() {
        return this.k;
    }

    @Nullable
    public String c() {
        return this.j;
    }

    int d() {
        return this.h;
    }

    public boolean e() {
        return this.k != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.h == status.h && this.i == status.i && c.a(this.j, status.j) && c.a(this.k, status.k);
    }

    public boolean f() {
        return this.i <= 0;
    }

    public boolean g() {
        return this.i == 16;
    }

    public boolean h() {
        return this.i == 14;
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k);
    }

    public int i() {
        return this.i;
    }

    public PendingIntent j() {
        return this.k;
    }

    public String toString() {
        return c.a((Object) this).a("statusCode", k()).a(j.ai, this.k).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
