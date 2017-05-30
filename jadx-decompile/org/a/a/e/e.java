package org.a.a.e;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public final class e<I> {
    private final Map<String, I> a = new HashMap();

    e() {
    }

    public static <I> e<I> a() {
        return new e();
    }

    public e<I> a(String str, I i) {
        a.a((CharSequence) str, "ID");
        a.a((Object) i, "Item");
        this.a.put(str.toLowerCase(Locale.US), i);
        return this;
    }

    public d<I> b() {
        return new d(this.a);
    }

    public String toString() {
        return this.a.toString();
    }
}
