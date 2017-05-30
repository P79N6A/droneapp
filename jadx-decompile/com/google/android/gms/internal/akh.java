package com.google.android.gms.internal;

import com.google.android.gms.internal.ru.a;
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

public class akh implements vy {
    protected static final boolean a = ajg.b;
    private static int d = 3000;
    private static int e = 4096;
    protected final apm b;
    protected final ali c;

    public akh(apm com_google_android_gms_internal_apm) {
        this(com_google_android_gms_internal_apm, new ali(e));
    }

    public akh(apm com_google_android_gms_internal_apm, ali com_google_android_gms_internal_ali) {
        this.b = com_google_android_gms_internal_apm;
        this.c = com_google_android_gms_internal_ali;
    }

    protected static Map<String, String> a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private void a(long j, abd<?> com_google_android_gms_internal_abd_, byte[] bArr, StatusLine statusLine) {
        if (a || j > ((long) d)) {
            String str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
            Object[] objArr = new Object[5];
            objArr[0] = com_google_android_gms_internal_abd_;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(com_google_android_gms_internal_abd_.s().b());
            ajg.b(str, objArr);
        }
    }

    private static void a(String str, abd<?> com_google_android_gms_internal_abd_, aii com_google_android_gms_internal_aii) {
        afg s = com_google_android_gms_internal_abd_.s();
        int r = com_google_android_gms_internal_abd_.r();
        try {
            s.a(com_google_android_gms_internal_aii);
            com_google_android_gms_internal_abd_.b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(r)}));
        } catch (aii e) {
            com_google_android_gms_internal_abd_.b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(r)}));
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
        b bVar = new b(this.c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new agh();
            }
            bArr = this.c.a(1024);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                bVar.write(bArr, 0, read);
            }
            byte[] toByteArray = bVar.toByteArray();
            return toByteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                ajg.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(bArr);
            bVar.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.zb a(com.google.android.gms.internal.abd<?> r19) {
        /*
        r18 = this;
        r16 = android.os.SystemClock.elapsedRealtime();
    L_0x0004:
        r3 = 0;
        r14 = 0;
        r6 = java.util.Collections.emptyMap();
        r2 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00e2 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00e2 }
        r4 = r19.e();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00e2 }
        r0 = r18;
        r0.a(r2, r4);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00e2 }
        r0 = r18;
        r4 = r0.b;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00e2 }
        r0 = r19;
        r15 = r4.a(r0, r2);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x00e2 }
        r12 = r15.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r4 = r12.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r2 = r15.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r6 = a(r2);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r4 != r2) goto L_0x0065;
    L_0x0036:
        r2 = r19.e();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        if (r2 != 0) goto L_0x004c;
    L_0x003c:
        r3 = new com.google.android.gms.internal.zb;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r4 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r5 = 0;
        r7 = 1;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
    L_0x004b:
        return r3;
    L_0x004c:
        r3 = r2.g;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r3.putAll(r6);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r7 = new com.google.android.gms.internal.zb;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r8 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r9 = r2.a;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r10 = r2.g;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r11 = 1;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r12 = r2 - r16;
        r7.<init>(r8, r9, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r3 = r7;
        goto L_0x004b;
    L_0x0065:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        if (r2 == 0) goto L_0x009f;
    L_0x006b:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        r0 = r18;
        r11 = r0.a(r2);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
    L_0x0075:
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        r8 = r2 - r16;
        r7 = r18;
        r10 = r19;
        r7.a(r8, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r2) goto L_0x008a;
    L_0x0086:
        r2 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r4 <= r2) goto L_0x00a3;
    L_0x008a:
        r2 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        throw r2;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
    L_0x0090:
        r2 = move-exception;
        r2 = "socket";
        r3 = new com.google.android.gms.internal.ahi;
        r3.<init>();
        r0 = r19;
        a(r2, r0, r3);
        goto L_0x0004;
    L_0x009f:
        r2 = 0;
        r11 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013b }
        goto L_0x0075;
    L_0x00a3:
        r3 = new com.google.android.gms.internal.zb;	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        r8 = r8 - r16;
        r5 = r11;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x0090, ConnectTimeoutException -> 0x00b1, MalformedURLException -> 0x00c0, IOException -> 0x013f }
        goto L_0x004b;
    L_0x00b1:
        r2 = move-exception;
        r2 = "connection";
        r3 = new com.google.android.gms.internal.ahi;
        r3.<init>();
        r0 = r19;
        a(r2, r0, r3);
        goto L_0x0004;
    L_0x00c0:
        r2 = move-exception;
        r3 = r2;
        r4 = new java.lang.RuntimeException;
        r5 = "Bad URL ";
        r2 = r19.c();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x00dc;
    L_0x00d4:
        r2 = r5.concat(r2);
    L_0x00d8:
        r4.<init>(r2, r3);
        throw r4;
    L_0x00dc:
        r2 = new java.lang.String;
        r2.<init>(r5);
        goto L_0x00d8;
    L_0x00e2:
        r2 = move-exception;
        r5 = r14;
    L_0x00e4:
        if (r3 == 0) goto L_0x0128;
    L_0x00e6:
        r2 = r3.getStatusLine();
        r4 = r2.getStatusCode();
        r2 = "Unexpected response code %d for %s";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = java.lang.Integer.valueOf(r4);
        r3[r7] = r8;
        r7 = 1;
        r8 = r19.c();
        r3[r7] = r8;
        com.google.android.gms.internal.ajg.c(r2, r3);
        if (r5 == 0) goto L_0x0134;
    L_0x0106:
        r3 = new com.google.android.gms.internal.zb;
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 == r2) goto L_0x011a;
    L_0x0116:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r4 != r2) goto L_0x012e;
    L_0x011a:
        r2 = "auth";
        r4 = new com.google.android.gms.internal.a;
        r4.<init>(r3);
        r0 = r19;
        a(r2, r0, r4);
        goto L_0x0004;
    L_0x0128:
        r3 = new com.google.android.gms.internal.aac;
        r3.<init>(r2);
        throw r3;
    L_0x012e:
        r2 = new com.google.android.gms.internal.agh;
        r2.<init>(r3);
        throw r2;
    L_0x0134:
        r2 = new com.google.android.gms.internal.ya;
        r3 = 0;
        r2.<init>(r3);
        throw r2;
    L_0x013b:
        r2 = move-exception;
        r5 = r14;
        r3 = r15;
        goto L_0x00e4;
    L_0x013f:
        r2 = move-exception;
        r5 = r11;
        r3 = r15;
        goto L_0x00e4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.akh.a(com.google.android.gms.internal.abd):com.google.android.gms.internal.zb");
    }
}
