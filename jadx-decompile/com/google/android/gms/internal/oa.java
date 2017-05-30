package com.google.android.gms.internal;

import java.util.Map.Entry;
import java.util.Set;

public final class oa extends nx {
    private final ow<String, nx> a = new ow();

    private nx a(Object obj) {
        return obj == null ? nz.a : new od(obj);
    }

    public Set<Entry<String, nx>> a() {
        return this.a.entrySet();
    }

    public void a(String str, nx nxVar) {
        Object obj;
        if (nxVar == null) {
            obj = nz.a;
        }
        this.a.put(str, obj);
    }

    public void a(String str, Boolean bool) {
        a(str, a((Object) bool));
    }

    public void a(String str, String str2) {
        a(str, a((Object) str2));
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }

    public nx b(String str) {
        return (nx) this.a.get(str);
    }

    public nu c(String str) {
        return (nu) this.a.get(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof oa) && ((oa) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
