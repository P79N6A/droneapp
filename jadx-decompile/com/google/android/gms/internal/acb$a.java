package com.google.android.gms.internal;

import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.c;

public class acb$a {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public acb$a(String str, double d, double d2, double d3, int i) {
        this.a = str;
        this.c = d;
        this.b = d2;
        this.d = d3;
        this.e = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof acb$a)) {
            return false;
        }
        acb$a com_google_android_gms_internal_acb_a = (acb$a) obj;
        return c.a(this.a, com_google_android_gms_internal_acb_a.a) && this.b == com_google_android_gms_internal_acb_a.b && this.c == com_google_android_gms_internal_acb_a.c && this.e == com_google_android_gms_internal_acb_a.e && Double.compare(this.d, com_google_android_gms_internal_acb_a.d) == 0;
    }

    public int hashCode() {
        return c.a(new Object[]{this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public String toString() {
        return c.a(this).a(User.FN_NAME, this.a).a("minBound", Double.valueOf(this.c)).a("maxBound", Double.valueOf(this.b)).a("percent", Double.valueOf(this.d)).a("count", Integer.valueOf(this.e)).toString();
    }
}
