package org.c.a.c;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import org.c.e.b.a;
import org.c.e.h;
import org.c.e.i;
import org.c.e.j;

public class b {
    private j a;

    public b(List<a> list) {
        this(new a(list).a());
    }

    private b(j jVar) {
        this.a = jVar;
    }

    public static b a(Class<?> cls) {
        return a(i.a((Class) cls));
    }

    public static b a(i iVar) {
        return new b(new h().a(iVar));
    }

    public int a() {
        return this.a.d().size();
    }

    public String toString() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new org.c.b.j(new PrintStream(byteArrayOutputStream)).a(this.a);
        return byteArrayOutputStream.toString();
    }
}
