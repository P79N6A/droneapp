package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public class hk {
    private final List<List<String>> a;
    private final List<String> b;

    public hk(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.a = list;
        this.b = list2;
    }

    public List<List<String>> a() {
        return Collections.unmodifiableList(this.a);
    }

    public List<String> b() {
        return Collections.unmodifiableList(this.b);
    }
}
