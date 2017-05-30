package org.b.a;

import org.b.i;
import org.b.k;

public class o extends r {
    public o(String str) {
        super(str);
    }

    @i
    public static k<String> b(String str) {
        return new o(str);
    }

    protected boolean a(String str) {
        return str.indexOf(this.a) >= 0;
    }

    protected String b() {
        return "containing";
    }
}
