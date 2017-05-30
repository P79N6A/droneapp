package org.c.b;

import org.c.c;

public class f extends d {
    public Object a;

    public f(double d) {
        this.a = Double.valueOf(d);
    }

    public f(float f) {
        this.a = Float.valueOf(f);
    }

    protected void a(Object obj, Object obj2) {
        if (obj instanceof Double) {
            c.b(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.a).doubleValue());
        } else {
            c.b(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.a).floatValue());
        }
    }
}
