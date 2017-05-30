package org.a.a.i.c;

import android.util.Log;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.a.a.a.d;
import org.a.a.f.h;
import org.a.a.m.e;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;

@d
class c extends e<HttpRoute, h> {
    private static final String a = "HttpClient";
    private volatile boolean b;

    public c(String str, HttpRoute httpRoute, h hVar, long j, TimeUnit timeUnit) {
        super(str, httpRoute, hVar, j, timeUnit);
    }

    public void a() {
        this.b = true;
    }

    public boolean a(long j) {
        boolean a = super.a(j);
        if (a && Log.isLoggable(a, 3)) {
            Log.d(a, "Connection " + this + " expired @ " + new Date(n()));
        }
        return a;
    }

    public boolean b() {
        return this.b;
    }

    public void c() {
        ((HttpClientConnection) i()).close();
    }

    public void d() {
        ((HttpClientConnection) i()).shutdown();
    }

    public boolean e() {
        return !((HttpClientConnection) i()).isOpen();
    }

    public void f() {
        try {
            c();
        } catch (Throwable e) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "I/O error closing connection", e);
            }
        }
    }
}
