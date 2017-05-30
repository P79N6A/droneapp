package org.c.b.d;

import java.util.Arrays;
import java.util.List;

@Deprecated
public class d extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> a;

    public d(String str) {
        this(new Exception(str));
    }

    public d(List<Throwable> list) {
        this.a = list;
    }

    public d(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public List<Throwable> a() {
        return this.a;
    }
}
