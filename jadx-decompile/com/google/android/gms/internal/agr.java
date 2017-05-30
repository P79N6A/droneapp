package com.google.android.gms.internal;

import com.google.android.gms.cast.a.c;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.util.p;
import org.json.JSONObject;

public final class agr implements c {
    private final String a;
    private final int b;
    private final JSONObject c;
    private final boolean d;

    public agr(String str, int i, JSONObject jSONObject, boolean z) {
        this.a = str;
        this.b = i;
        this.c = jSONObject;
        this.d = z;
    }

    public int a() {
        return this.b;
    }

    public JSONObject b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        switch (this.b) {
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.e() && this.b == cVar.a() && f.a(this.a, cVar.c()) && p.a(this.c, cVar.b());
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{this.a, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d)});
    }
}
