package it.a.a.a;

import it.a.a.f;
import it.a.a.h;
import it.a.a.o;
import java.io.IOException;
import java.net.Socket;

public class e extends h {
    public static int d = 0;
    public static int e = 1;
    public int f;
    private String g;
    private int h;
    private String i;
    private String j;

    public e(String str, int i) {
        this(str, i, "anonymous", "ftp4j");
    }

    public e(String str, int i, String str2, String str3) {
        super(true);
        this.f = d;
        this.g = str;
        this.h = i;
        this.i = str2;
        this.j = str3;
    }

    public Socket c(String str, int i) {
        Socket a = a(this.g, this.h);
        f fVar = new f(a, "ASCII");
        try {
            if (fVar.c().a() != it.a.a.e.A) {
                throw new IOException("Invalid proxy response");
            }
            if (this.f == d) {
                fVar.a(new StringBuffer().append("USER ").append(this.i).toString());
                try {
                    Object obj;
                    switch (fVar.c().a()) {
                        case it.a.a.e.F /*230*/:
                            obj = null;
                            break;
                        case it.a.a.e.q /*331*/:
                            obj = 1;
                            break;
                        default:
                            throw new IOException("Proxy authentication failed");
                    }
                    if (obj != null) {
                        fVar.a(new StringBuffer().append("PASS ").append(this.j).toString());
                        try {
                            if (fVar.c().a() != it.a.a.e.F) {
                                throw new IOException("Proxy authentication failed");
                            }
                        } catch (o e) {
                            throw new IOException("Invalid proxy response");
                        }
                    }
                    fVar.a(new StringBuffer().append("SITE ").append(str).append(":").append(i).toString());
                } catch (o e2) {
                    throw new IOException("Invalid proxy response");
                }
            } else if (this.f == e) {
                fVar.a(new StringBuffer().append("OPEN ").append(str).append(":").append(i).toString());
            }
            return a;
        } catch (o e3) {
            throw new IOException("Invalid proxy response");
        }
    }

    public Socket d(String str, int i) {
        return b(str, i);
    }

    public void d(int i) {
        if (i == e || i == d) {
            this.f = i;
            return;
        }
        throw new IllegalArgumentException("Invalid style");
    }
}
