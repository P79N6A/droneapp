package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class ei extends ea<String> {
    private final String b;
    private final List<ea<?>> c;

    public ei(String str, List<ea<?>> list) {
        d.a(str, "Instruction name must be a string.");
        d.a(list);
        this.b = str;
        this.c = list;
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public String d() {
        return toString();
    }

    public String e() {
        return this.b;
    }

    public List<ea<?>> f() {
        return this.c;
    }

    public String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c.toString());
        return new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(valueOf).length()).append("*").append(str).append(": ").append(valueOf).toString();
    }
}
