package org.c.f.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.c.f.a.k;

public class d {
    private final String a;
    private final k b;
    private final List<Object> c;

    public d(String str, k kVar, List<Object> list) {
        a(str, "The name is missing.");
        a(kVar, "The test class is missing.");
        a(list, "The parameters are missing.");
        this.a = str;
        this.b = kVar;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    private static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public String a() {
        return this.a;
    }

    public k b() {
        return this.b;
    }

    public List<Object> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.c.equals(dVar.c) && this.b.equals(dVar.b);
    }

    public int hashCode() {
        return (14747 * (((this.a.hashCode() + 14747) * 14747) + this.b.hashCode())) + this.c.hashCode();
    }

    public String toString() {
        return this.b.e() + " '" + this.a + "' with parameters " + this.c;
    }
}
