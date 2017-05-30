package org.a.a.i.b;

import java.util.HashMap;
import java.util.Map;
import org.a.a.c.c;
import org.a.a.m.d;
import org.apache.http.conn.routing.HttpRoute;

public class a implements c {
    private final d<HttpRoute> a;
    private final g b;
    private final Map<HttpRoute, Long> c;
    private final Map<HttpRoute, Long> d;
    private long e;
    private double f;
    private int g;

    public a(d<HttpRoute> dVar) {
        this(dVar, new af());
    }

    a(d<HttpRoute> dVar, g gVar) {
        this.e = 5000;
        this.f = 0.5d;
        this.g = 2;
        this.b = gVar;
        this.a = dVar;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    private Long a(Map<HttpRoute, Long> map, HttpRoute httpRoute) {
        Long l = (Long) map.get(httpRoute);
        return l == null ? Long.valueOf(0) : l;
    }

    private int b(int i) {
        return i <= 1 ? 1 : (int) Math.floor(this.f * ((double) i));
    }

    public void a(double d) {
        boolean z = d > 0.0d && d < 1.0d;
        org.a.a.o.a.a(z, "Backoff factor must be 0.0 < f < 1.0");
        this.f = d;
    }

    public void a(int i) {
        org.a.a.o.a.a(i, "Per host connection cap");
        this.g = i;
    }

    public void a(long j) {
        org.a.a.o.a.a(this.e, "Cool down");
        this.e = j;
    }

    public void a(HttpRoute httpRoute) {
        synchronized (this.a) {
            int b = this.a.b((Object) httpRoute);
            Long a = a(this.d, httpRoute);
            long a2 = this.b.a();
            if (a2 - a.longValue() < this.e) {
                return;
            }
            this.a.a(httpRoute, b(b));
            this.d.put(httpRoute, Long.valueOf(a2));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(org.apache.http.conn.routing.HttpRoute r11) {
        /*
        r10 = this;
        r1 = r10.a;
        monitor-enter(r1);
        r0 = r10.a;	 Catch:{ all -> 0x004e }
        r0 = r0.b(r11);	 Catch:{ all -> 0x004e }
        r2 = r10.g;	 Catch:{ all -> 0x004e }
        if (r0 < r2) goto L_0x003b;
    L_0x000d:
        r0 = r10.g;	 Catch:{ all -> 0x004e }
    L_0x000f:
        r2 = r10.c;	 Catch:{ all -> 0x004e }
        r2 = r10.a(r2, r11);	 Catch:{ all -> 0x004e }
        r3 = r10.d;	 Catch:{ all -> 0x004e }
        r3 = r10.a(r3, r11);	 Catch:{ all -> 0x004e }
        r4 = r10.b;	 Catch:{ all -> 0x004e }
        r4 = r4.a();	 Catch:{ all -> 0x004e }
        r6 = r2.longValue();	 Catch:{ all -> 0x004e }
        r6 = r4 - r6;
        r8 = r10.e;	 Catch:{ all -> 0x004e }
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 < 0) goto L_0x0039;
    L_0x002d:
        r2 = r3.longValue();	 Catch:{ all -> 0x004e }
        r2 = r4 - r2;
        r6 = r10.e;	 Catch:{ all -> 0x004e }
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x003e;
    L_0x0039:
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
    L_0x003a:
        return;
    L_0x003b:
        r0 = r0 + 1;
        goto L_0x000f;
    L_0x003e:
        r2 = r10.a;	 Catch:{ all -> 0x004e }
        r2.a(r11, r0);	 Catch:{ all -> 0x004e }
        r0 = r10.c;	 Catch:{ all -> 0x004e }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x004e }
        r0.put(r11, r2);	 Catch:{ all -> 0x004e }
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        goto L_0x003a;
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.a.i.b.a.b(org.apache.http.conn.routing.HttpRoute):void");
    }
}
