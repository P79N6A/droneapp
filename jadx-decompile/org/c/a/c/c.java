package org.c.a.c;

import org.b.b;
import org.b.g;
import org.b.k;
import org.b.p;

public class c {
    public static k<b> a() {
        return a(0);
    }

    public static k<b> a(final int i) {
        return new p<b>() {
            public void a(g gVar) {
                gVar.a("has " + i + " failures");
            }

            public boolean a(b bVar) {
                return bVar.a() == i;
            }

            public /* synthetic */ boolean b(Object obj) {
                return a((b) obj);
            }
        };
    }

    public static k<Object> a(final String str) {
        return new b<Object>() {
            public void a(g gVar) {
                gVar.a("has single failure containing " + str);
            }

            public boolean a(Object obj) {
                return obj.toString().contains(str) && c.a(1).a(obj);
            }
        };
    }

    public static k<b> b(final String str) {
        return new b<b>() {
            public void a(g gVar) {
                gVar.a("has failure containing " + str);
            }

            public boolean a(Object obj) {
                return obj.toString().contains(str);
            }
        };
    }
}
