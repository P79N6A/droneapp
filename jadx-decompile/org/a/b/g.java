package org.a.b;

import java.io.ByteArrayOutputStream;
import org.a.b.b.e;
import org.a.b.c.a;

public class g {
    private final ByteArrayOutputStream a;
    private final a b;
    private e c;

    public g() {
        this(new org.a.b.b.a.a());
    }

    public g(org.a.b.b.g gVar) {
        this.a = new ByteArrayOutputStream();
        this.b = new a(this.a);
        this.c = gVar.a(this.b);
    }

    public byte[] a(a aVar) {
        this.a.reset();
        aVar.b(this.c);
        return this.a.toByteArray();
    }
}
