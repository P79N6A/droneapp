package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b.a;
import com.android.volley.g;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.u;
import com.android.volley.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.a.a.e;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;

public class c implements g {
    protected static final boolean a = v.b;
    private static int d = 3000;
    private static int e = 4096;
    protected final i b;
    protected final d c;

    public c(i iVar) {
        this(iVar, new d(e));
    }

    public c(i iVar, d dVar) {
        this.b = iVar;
        this.c = dVar;
    }

    protected static Map<String, String> a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private void a(long j, n<?> nVar, byte[] bArr, StatusLine statusLine) {
        if (a || j > ((long) d)) {
            String str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
            Object[] objArr = new Object[5];
            objArr[0] = nVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(nVar.z().b());
            v.b(str, objArr);
        }
    }

    private static void a(String str, n<?> nVar, u uVar) {
        r z = nVar.z();
        int y = nVar.y();
        try {
            z.a(uVar);
            nVar.a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(y)}));
        } catch (u e) {
            nVar.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(y)}));
            throw e;
        }
    }

    private void a(Map<String, String> map, a aVar) {
        if (aVar != null) {
            if (aVar.b != null) {
                map.put(e.D, aVar.b);
            }
            if (aVar.d > 0) {
                map.put(e.C, DateUtils.formatDate(new Date(aVar.d)));
            }
        }
    }

    private byte[] a(HttpEntity httpEntity) {
        q qVar = new q(this.c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new s();
            }
            bArr = this.c.a(1024);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                qVar.write(bArr, 0, read);
            }
            byte[] toByteArray = qVar.toByteArray();
            return toByteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                v.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(bArr);
            qVar.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.j a(com.android.volley.n<?> r19) {
        /*
        r18 = this;
        r16 = android.os.SystemClock.elapsedRealtime();
    L_0x0004:
        r3 = 0;
        r14 = 0;
        r6 = java.util.Collections.emptyMap();
        r2 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x00f3 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x00f3 }
        r4 = r19.k();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x00f3 }
        r0 = r18;
        r0.a(r2, r4);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x00f3 }
        r0 = r18;
        r4 = r0.b;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x00f3 }
        r0 = r19;
        r15 = r4.a(r0, r2);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x00f3 }
        r12 = r15.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r4 = r12.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r2 = r15.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r6 = a(r2);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r4 != r2) goto L_0x0065;
    L_0x0036:
        r2 = r19.k();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        if (r2 != 0) goto L_0x004c;
    L_0x003c:
        r3 = new com.android.volley.j;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r4 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r5 = 0;
        r7 = 1;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
    L_0x004b:
        return r3;
    L_0x004c:
        r3 = r2.g;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r3.putAll(r6);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r7 = new com.android.volley.j;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r8 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r9 = r2.a;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r10 = r2.g;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r11 = 1;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r12 = r2 - r16;
        r7.<init>(r8, r9, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r3 = r7;
        goto L_0x004b;
    L_0x0065:
        r2 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r4 == r2) goto L_0x006d;
    L_0x0069:
        r2 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r4 != r2) goto L_0x007a;
    L_0x006d:
        r2 = "Location";
        r2 = r6.get(r2);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r2 = (java.lang.String) r2;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r0 = r19;
        r0.c(r2);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
    L_0x007a:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        if (r2 == 0) goto L_0x00b4;
    L_0x0080:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        r0 = r18;
        r11 = r0.a(r2);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
    L_0x008a:
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        r8 = r2 - r16;
        r7 = r18;
        r10 = r19;
        r7.a(r8, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r2) goto L_0x009f;
    L_0x009b:
        r2 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r4 <= r2) goto L_0x00b8;
    L_0x009f:
        r2 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        throw r2;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
    L_0x00a5:
        r2 = move-exception;
        r2 = "socket";
        r3 = new com.android.volley.t;
        r3.<init>();
        r0 = r19;
        a(r2, r0, r3);
        goto L_0x0004;
    L_0x00b4:
        r2 = 0;
        r11 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0180 }
        goto L_0x008a;
    L_0x00b8:
        r3 = new com.android.volley.j;	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        r8 = r8 - r16;
        r5 = r11;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x00a5, ConnectTimeoutException -> 0x00c6, MalformedURLException -> 0x00d5, IOException -> 0x0185 }
        goto L_0x004b;
    L_0x00c6:
        r2 = move-exception;
        r2 = "connection";
        r3 = new com.android.volley.t;
        r3.<init>();
        r0 = r19;
        a(r2, r0, r3);
        goto L_0x0004;
    L_0x00d5:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Bad URL ";
        r4 = r4.append(r5);
        r5 = r19.g();
        r4 = r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4, r2);
        throw r3;
    L_0x00f3:
        r2 = move-exception;
        r5 = r14;
    L_0x00f5:
        if (r3 == 0) goto L_0x0141;
    L_0x00f7:
        r3 = r3.getStatusLine();
        r4 = r3.getStatusCode();
        r3 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r4 == r3) goto L_0x0107;
    L_0x0103:
        r3 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r4 != r3) goto L_0x0147;
    L_0x0107:
        r3 = "Request at %s has been redirected to %s";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r19.h();
        r7[r8] = r9;
        r8 = 1;
        r9 = r19.g();
        r7[r8] = r9;
        com.android.volley.v.c(r3, r7);
    L_0x011d:
        if (r5 == 0) goto L_0x017a;
    L_0x011f:
        r3 = new com.android.volley.j;
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 == r2) goto L_0x0133;
    L_0x012f:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r4 != r2) goto L_0x015e;
    L_0x0133:
        r2 = "auth";
        r4 = new com.android.volley.a;
        r4.<init>(r3);
        r0 = r19;
        a(r2, r0, r4);
        goto L_0x0004;
    L_0x0141:
        r3 = new com.android.volley.k;
        r3.<init>(r2);
        throw r3;
    L_0x0147:
        r3 = "Unexpected response code %d for %s";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = java.lang.Integer.valueOf(r4);
        r7[r8] = r9;
        r8 = 1;
        r9 = r19.g();
        r7[r8] = r9;
        com.android.volley.v.c(r3, r7);
        goto L_0x011d;
    L_0x015e:
        r2 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r4 == r2) goto L_0x0166;
    L_0x0162:
        r2 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        if (r4 != r2) goto L_0x0174;
    L_0x0166:
        r2 = "redirect";
        r4 = new com.android.volley.m;
        r4.<init>(r3);
        r0 = r19;
        a(r2, r0, r4);
        goto L_0x0004;
    L_0x0174:
        r2 = new com.android.volley.s;
        r2.<init>(r3);
        throw r2;
    L_0x017a:
        r3 = new com.android.volley.i;
        r3.<init>(r2);
        throw r3;
    L_0x0180:
        r2 = move-exception;
        r5 = r14;
        r3 = r15;
        goto L_0x00f5;
    L_0x0185:
        r2 = move-exception;
        r5 = r11;
        r3 = r15;
        goto L_0x00f5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.c.a(com.android.volley.n):com.android.volley.j");
    }

    protected void a(String str, String str2, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        v.a("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(elapsedRealtime - j), str2);
    }
}
