package org.a.a.i.c;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import org.a.a.a.b;
import org.a.a.f.b.a;
import org.a.a.f.h;
import org.a.a.f.i;
import org.a.a.f.j;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;

@b
class l {
    static final String a = "http.socket-factory-registry";
    private static final String b = "HttpClient";
    private final org.a.a.e.b<a> c;
    private final i d;
    private final org.a.a.f.b e;

    l(org.a.a.e.b<a> bVar, i iVar, org.a.a.f.b bVar2) {
        org.a.a.o.a.a((Object) bVar, "Socket factory registry");
        this.c = bVar;
        if (iVar == null) {
            iVar = k.a;
        }
        this.d = iVar;
        if (bVar2 == null) {
            bVar2 = s.a;
        }
        this.e = bVar2;
    }

    private static String a(IOException iOException, HttpHost httpHost, InetAddress... inetAddressArr) {
        StringBuilder append = new StringBuilder().append("Connect to ").append(httpHost != null ? httpHost.toHostString() : "remote host");
        String str = (inetAddressArr == null || inetAddressArr.length <= 0) ? "" : " " + Arrays.asList(inetAddressArr);
        append = append.append(str);
        str = (iOException == null || iOException.getMessage() == null) ? " timed out" : " failed: " + iOException.getMessage();
        return append.append(str).toString();
    }

    private org.a.a.e.b<a> a(HttpContext httpContext) {
        org.a.a.e.b<a> bVar = (org.a.a.e.b) httpContext.getAttribute(a);
        return bVar == null ? this.c : bVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(org.a.a.f.h r13, org.apache.http.HttpHost r14, java.net.InetSocketAddress r15, int r16, org.a.a.e.f r17, org.apache.http.protocol.HttpContext r18) {
        /*
        r12 = this;
        r0 = r18;
        r1 = r12.a(r0);
        r2 = r14.getSchemeName();
        r1 = r1.a(r2);
        r1 = (org.a.a.f.b.a) r1;
        if (r1 != 0) goto L_0x002f;
    L_0x0012:
        r1 = new org.a.a.f.j;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r14.getSchemeName();
        r2 = r2.append(r3);
        r3 = " protocol is not supported";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x002f:
        r2 = r12.e;
        r3 = r14.getHostName();
        r10 = r2.a(r3);
        r2 = r12.d;
        r11 = r2.a(r14);
        r2 = 0;
        r8 = r2;
    L_0x0041:
        r2 = r10.length;
        if (r8 >= r2) goto L_0x00d2;
    L_0x0044:
        r4 = r10[r8];
        r2 = r10.length;
        r2 = r2 + -1;
        if (r8 != r2) goto L_0x00d3;
    L_0x004b:
        r2 = 1;
        r9 = r2;
    L_0x004d:
        r0 = r18;
        r3 = r1.a(r0);
        r2 = r17.a();
        r3.setSoTimeout(r2);
        r2 = r17.b();
        r3.setReuseAddress(r2);
        r2 = r17.e();
        r3.setTcpNoDelay(r2);
        r2 = r17.d();
        r3.setKeepAlive(r2);
        r5 = r17.c();
        if (r5 < 0) goto L_0x007b;
    L_0x0075:
        if (r5 <= 0) goto L_0x00d7;
    L_0x0077:
        r2 = 1;
    L_0x0078:
        r3.setSoLinger(r2, r5);
    L_0x007b:
        r13.a(r3);
        r5 = new java.net.InetSocketAddress;
        r5.<init>(r4, r11);
        r2 = "HttpClient";
        r4 = 3;
        r2 = android.util.Log.isLoggable(r2, r4);
        if (r2 == 0) goto L_0x00a4;
    L_0x008c:
        r2 = "HttpClient";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = "Connecting to ";
        r4 = r4.append(r6);
        r4 = r4.append(r5);
        r4 = r4.toString();
        android.util.Log.d(r2, r4);
    L_0x00a4:
        r2 = r16;
        r4 = r14;
        r6 = r15;
        r7 = r18;
        r2 = r1.a(r2, r3, r4, r5, r6, r7);	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        r13.a(r2);	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        r2 = "HttpClient";
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        if (r2 == 0) goto L_0x00d2;
    L_0x00ba:
        r2 = "HttpClient";
        r3 = new java.lang.StringBuilder;	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        r3.<init>();	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        r4 = "Connection established ";
        r3 = r3.append(r4);	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        r3 = r3.append(r13);	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        r3 = r3.toString();	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
        android.util.Log.d(r2, r3);	 Catch:{ SocketTimeoutException -> 0x00d9, ConnectException -> 0x011a }
    L_0x00d2:
        return;
    L_0x00d3:
        r2 = 0;
        r9 = r2;
        goto L_0x004d;
    L_0x00d7:
        r2 = 0;
        goto L_0x0078;
    L_0x00d9:
        r2 = move-exception;
        if (r9 == 0) goto L_0x00e8;
    L_0x00dc:
        r3 = new org.apache.http.conn.ConnectTimeoutException;
        r4 = a(r2, r14, r10);
        r3.<init>(r4);
        r3.initCause(r2);
    L_0x00e8:
        r2 = "HttpClient";
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);
        if (r2 == 0) goto L_0x0115;
    L_0x00f1:
        r2 = "HttpClient";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Connect to ";
        r3 = r3.append(r4);
        r3 = r3.append(r5);
        r4 = " timed out. ";
        r3 = r3.append(r4);
        r4 = "Connection will be retried using another IP address";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.d(r2, r3);
    L_0x0115:
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0041;
    L_0x011a:
        r2 = move-exception;
        if (r9 == 0) goto L_0x00e8;
    L_0x011d:
        r1 = r2.getMessage();
        r3 = "Connection timed out";
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x0136;
    L_0x0129:
        r1 = new org.apache.http.conn.ConnectTimeoutException;
        r3 = a(r2, r14, r10);
        r1.<init>(r3);
        r1.initCause(r2);
        throw r1;
    L_0x0136:
        r1 = new org.apache.http.conn.HttpHostConnectException;
        r1.<init>(r14, r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.a.i.c.l.a(org.a.a.f.h, org.apache.http.HttpHost, java.net.InetSocketAddress, int, org.a.a.e.f, org.apache.http.protocol.HttpContext):void");
    }

    public void a(h hVar, HttpHost httpHost, HttpContext httpContext) {
        a aVar = (a) a(org.a.a.c.e.a.a(httpContext)).a(httpHost.getSchemeName());
        if (aVar == null) {
            throw new j(httpHost.getSchemeName() + " protocol is not supported");
        } else if (aVar instanceof org.a.a.f.b.b) {
            hVar.a(((org.a.a.f.b.b) aVar).a(hVar.b(), httpHost.getHostName(), this.d.a(httpHost), httpContext));
        } else {
            throw new j(httpHost.getSchemeName() + " protocol does not support connection upgrade");
        }
    }
}
