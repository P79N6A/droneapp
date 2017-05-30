package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.f;

public class i {
    private String a;

    private i(String str) {
        this.a = str.toLowerCase();
    }

    public static i a(String str) {
        boolean z = str == null || !str.isEmpty();
        d.b(z);
        return str == null ? null : new i(str);
    }

    public boolean a() {
        return this.a.equals(f.b_);
    }

    public boolean b() {
        return (c() || a()) ? false : true;
    }

    public boolean c() {
        return this.a.startsWith("application/vnd.google-apps");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return this.a.equals(((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
