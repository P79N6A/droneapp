package it.a.a;

import java.net.Socket;

class d implements i {
    private final String a;
    private final int b;
    private final b c;

    d(b bVar, String str, int i) {
        this.c = bVar;
        this.a = str;
        this.b = i;
    }

    public Socket a() {
        try {
            String c = b.b(this.c).a() ? this.a : b.c(this.c);
            Socket d = b.b(this.c).d(c, this.b);
            return b.a(this.c) ? b.a(this.c, d, c, this.b) : d;
        } catch (Throwable e) {
            throw new j("Cannot connect to the remote server", e);
        }
    }

    public void b() {
    }
}
