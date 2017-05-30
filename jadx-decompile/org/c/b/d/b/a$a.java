package org.c.b.d.b;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

class a$a {
    private final Class<? extends Annotation> a;
    private boolean b;
    private final List<a$j> c;

    private a$a(Class<? extends Annotation> cls) {
        this.a = cls;
        this.b = false;
        this.c = new ArrayList();
    }

    a$a a() {
        this.b = true;
        return this;
    }

    a$a a(a$j org_c_b_d_b_a_j) {
        this.c.add(org_c_b_d_b_a_j);
        return this;
    }

    a b() {
        return new a(this);
    }
}
