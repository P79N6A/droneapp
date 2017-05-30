package com.google.android.gms.internal;

import android.support.annotation.Nullable;

public class tv$a {
    final long a;
    final String b;
    final int c;

    tv$a(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj == null || !(obj instanceof tv$a)) ? false : ((tv$a) obj).a == this.a && ((tv$a) obj).c == this.c;
    }

    public int hashCode() {
        return (int) this.a;
    }
}
