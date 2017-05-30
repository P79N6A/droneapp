package com.google.android.gms.internal;

import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.internal.c;

public final class ahh<O extends a> {
    private final boolean a = false;
    private final int b;
    private final com.google.android.gms.common.api.a<O> c;
    private final O d;

    private ahh(com.google.android.gms.common.api.a<O> aVar, O o) {
        this.c = aVar;
        this.d = o;
        this.b = c.a(new Object[]{this.c, this.d});
    }

    public static <O extends a> ahh<O> a(com.google.android.gms.common.api.a<O> aVar, O o) {
        return new ahh(aVar, o);
    }

    public String a() {
        return this.c.f();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahh)) {
            return false;
        }
        ahh com_google_android_gms_internal_ahh = (ahh) obj;
        return c.a(this.c, com_google_android_gms_internal_ahh.c) && c.a(this.d, com_google_android_gms_internal_ahh.d);
    }

    public int hashCode() {
        return this.b;
    }
}
