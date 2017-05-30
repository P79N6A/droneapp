package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.d;

public class e implements m {
    private final Status a;
    private final boolean b;

    public e(Status status, boolean z) {
        this.a = (Status) d.a((Object) status, (Object) "Status must not be null");
        this.b = z;
    }

    public Status a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b == eVar.b;
    }

    public final int hashCode() {
        return (this.b ? 1 : 0) + ((this.a.hashCode() + 527) * 31);
    }
}
