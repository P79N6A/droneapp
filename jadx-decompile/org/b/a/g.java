package org.b.a;

import org.b.b;
import org.b.i;
import org.b.k;

public class g<T> extends b<T> {
    private final String a;

    public g() {
        this("ANYTHING");
    }

    public g(String str) {
        this.a = str;
    }

    @i
    public static k<Object> a(String str) {
        return new g(str);
    }

    @i
    public static k<Object> b() {
        return new g();
    }

    public void a(org.b.g gVar) {
        gVar.a(this.a);
    }

    public boolean a(Object obj) {
        return true;
    }
}
