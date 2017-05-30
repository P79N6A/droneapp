package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.hj.a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class t {
    private final Set<String> a;
    private final String b;

    public t(String str, String... strArr) {
        this.b = str;
        this.a = new HashSet(strArr.length);
        for (Object add : strArr) {
            this.a.add(add);
        }
    }

    public abstract a a(Map<String, a> map);

    public abstract boolean a();

    boolean a(Set<String> set) {
        return set.containsAll(this.a);
    }

    public String b() {
        return this.b;
    }

    public Set<String> c() {
        return this.a;
    }
}
