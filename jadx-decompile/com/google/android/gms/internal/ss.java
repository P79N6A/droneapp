package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;

public class ss {
    public static final ss a = new ss("@@ContextManagerNullAccount@@");
    private static a b = null;
    private final String c;

    public interface a {
    }

    public ss(String str) {
        this.c = d.a(str);
    }

    public String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        return TextUtils.equals(this.c, ((ss) obj).a());
    }

    public int hashCode() {
        return c.a(new Object[]{this.c});
    }

    public String toString() {
        return "#account#";
    }
}
