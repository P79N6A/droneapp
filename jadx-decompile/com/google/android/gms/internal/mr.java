package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.xiaomi.mipush.sdk.Constants;

public class mr {
    private String a;

    public mr(@Nullable String str) {
        this.a = str;
    }

    @Nullable
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mr)) {
            return false;
        }
        return c.a(this.a, ((mr) obj).a);
    }

    public int hashCode() {
        return c.a(new Object[]{this.a});
    }

    public String toString() {
        return c.a(this).a(Constants.EXTRA_KEY_TOKEN, this.a).toString();
    }
}
