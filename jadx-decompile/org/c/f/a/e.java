package org.c.f.a;

import java.util.Arrays;
import java.util.List;

public class e extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> a;

    public e(String str) {
        this(new Exception(str));
    }

    public e(Throwable th) {
        this(Arrays.asList(new Throwable[]{th}));
    }

    public e(List<Throwable> list) {
        this.a = list;
    }

    public List<Throwable> a() {
        return this.a;
    }
}
