package org.a.a.i.f;

import android.util.Log;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import org.a.a.a.d;
import org.a.a.d.b;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionReleaseTrigger;

@d
class c implements Closeable, b, ConnectionReleaseTrigger {
    private static final String a = "HttpClient";
    private final org.a.a.f.d b;
    private final HttpClientConnection c;
    private volatile boolean d;
    private volatile Object e;
    private volatile long f;
    private volatile TimeUnit g;
    private volatile boolean h;

    public c(org.a.a.f.d dVar, HttpClientConnection httpClientConnection) {
        this.b = dVar;
        this.c = httpClientConnection;
    }

    public void a(long j, TimeUnit timeUnit) {
        synchronized (this.c) {
            this.f = j;
            this.g = timeUnit;
        }
    }

    public void a(Object obj) {
        this.e = obj;
    }

    public boolean a() {
        boolean z = this.h;
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Cancelling request execution");
        }
        abortConnection();
        return !z;
    }

    public void abortConnection() {
        synchronized (this.c) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.c.shutdown();
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Connection discarded");
                }
            } catch (Throwable e) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, e.getMessage(), e);
                }
            } finally {
                this.b.a(this.c, null, 0, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        return this.d;
    }

    public void c() {
        this.d = true;
    }

    public void close() {
        abortConnection();
    }

    public void d() {
        this.d = false;
    }

    public boolean e() {
        return this.h;
    }

    public void releaseConnection() {
        synchronized (this.c) {
            if (this.h) {
                return;
            }
            this.h = true;
            if (this.d) {
                this.b.a(this.c, this.e, this.f, this.g);
            } else {
                try {
                    this.c.close();
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Connection discarded");
                    }
                } catch (Throwable e) {
                    if (Log.isLoggable(a, 3)) {
                        Log.d(a, e.getMessage(), e);
                    }
                } finally {
                    this.b.a(this.c, null, 0, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}
