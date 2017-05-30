package org.a.a.e;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@org.a.a.a.d
public final class d<I> implements b<I> {
    private final Map<String, I> a;

    d(Map<String, I> map) {
        this.a = new ConcurrentHashMap(map);
    }

    public I a(String str) {
        return str == null ? null : this.a.get(str.toLowerCase(Locale.US));
    }

    public String toString() {
        return this.a.toString();
    }
}
