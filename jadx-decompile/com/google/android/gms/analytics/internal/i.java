package com.google.android.gms.analytics.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.google.android.gms.common.internal.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import org.a.a.e;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

class i extends t {
    private static final byte[] c = "\n".getBytes();
    private final String a = a("GoogleAnalytics", u.a, VERSION.RELEASE, p.a(Locale.getDefault()), Build.MODEL, Build.ID);
    private final m b;

    private class a {
        final /* synthetic */ i a;
        private int b;
        private ByteArrayOutputStream c = new ByteArrayOutputStream();

        public a(i iVar) {
            this.a = iVar;
        }

        public int a() {
            return this.b;
        }

        public boolean a(c cVar) {
            d.a((Object) cVar);
            if (this.b + 1 > this.a.q().m()) {
                return false;
            }
            String a = this.a.a(cVar, false);
            if (a == null) {
                this.a.p().a(cVar, "Error formatting hit");
                return true;
            }
            byte[] bytes = a.getBytes();
            int length = bytes.length;
            if (length > this.a.q().e()) {
                this.a.p().a(cVar, "Hit size exceeds the maximum size limit");
                return true;
            }
            if (this.c.size() > 0) {
                length++;
            }
            if (length + this.c.size() > this.a.q().g()) {
                return false;
            }
            try {
                if (this.c.size() > 0) {
                    this.c.write(i.c);
                }
                this.c.write(bytes);
                this.b++;
                return true;
            } catch (IOException e) {
                this.a.e("Failed to write payload when batching hits", e);
                return true;
            }
        }

        public byte[] b() {
            return this.c.toByteArray();
        }
    }

    i(v vVar) {
        super(vVar);
        this.b = new m(vVar.d());
    }

    private int a(URL url, byte[] bArr) {
        Object e;
        Throwable th;
        OutputStream outputStream = null;
        d.a((Object) url);
        d.a((Object) bArr);
        b("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (B()) {
            a("Post payload\n", new String(bArr));
        }
        HttpURLConnection a;
        try {
            a(o().getPackageName());
            a = a(url);
            try {
                a.setDoOutput(true);
                a.setFixedLengthStreamingMode(bArr.length);
                a.connect();
                outputStream = a.getOutputStream();
                outputStream.write(bArr);
                a(a);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    t().i();
                }
                b("POST status", Integer.valueOf(responseCode));
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        e("Error closing http post connection output stream", e2);
                    }
                }
                if (a != null) {
                    a.disconnect();
                }
                c();
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                try {
                    d("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            e("Error closing http post connection output stream", e4);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    c();
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e22) {
                            e("Error closing http post connection output stream", e22);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    c();
                    throw th;
                }
            }
        } catch (IOException e5) {
            e = e5;
            a = outputStream;
            d("Network POST connection error", e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            c();
            return 0;
        } catch (Throwable th3) {
            th = th3;
            a = outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            c();
            throw th;
        }
    }

    private static String a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    private URL a(c cVar, String str) {
        String valueOf;
        String valueOf2;
        if (cVar.f()) {
            valueOf2 = String.valueOf(q().o());
            valueOf = String.valueOf(q().q());
            valueOf = new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(valueOf2).append(valueOf).append("?").append(str).toString();
        } else {
            valueOf2 = String.valueOf(q().p());
            valueOf = String.valueOf(q().q());
            valueOf = new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str).length()).append(valueOf2).append(valueOf).append("?").append(str).toString();
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private void a(StringBuilder stringBuilder, String str, String str2) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        stringBuilder.append(URLEncoder.encode(str, "UTF-8"));
        stringBuilder.append(SignatureVisitor.INSTANCEOF);
        stringBuilder.append(URLEncoder.encode(str2, "UTF-8"));
    }

    private void a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e("Error closing http connection input stream", e2);
                }
            }
        }
    }

    private boolean a(c cVar) {
        d.a((Object) cVar);
        String a = a(cVar, !cVar.f());
        if (a == null) {
            p().a(cVar, "Error formatting hit for upload");
            return true;
        } else if (a.length() <= q().d()) {
            URL a2 = a(cVar, a);
            if (a2 != null) {
                return b(a2) == 200;
            } else {
                u("Failed to build collect GET endpoint url");
                return false;
            }
        } else {
            a = a(cVar, false);
            if (a == null) {
                p().a(cVar, "Error formatting hit for POST upload");
                return true;
            }
            byte[] bytes = a.getBytes();
            if (bytes.length > q().f()) {
                p().a(cVar, "Hit payload exceeds size limit");
                return true;
            }
            URL b = b(cVar);
            if (b != null) {
                return a(b, bytes) == 200;
            } else {
                u("Failed to build collect POST endpoint url");
                return false;
            }
        }
    }

    private static byte[] a(byte[] bArr) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private int b(java.net.URL r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0030 in list [B:7:0x002d]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r4 = this;
        com.google.android.gms.common.internal.d.a(r5);
        r0 = "GET request";
        r4.b(r0, r5);
        r1 = 0;
        r1 = r4.a(r5);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r1.connect();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r4.a(r1);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r0 = r1.getResponseCode();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        if (r0 != r2) goto L_0x0022;	 Catch:{ IOException -> 0x0031, all -> 0x003e }
    L_0x001b:
        r2 = r4.t();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r2.i();	 Catch:{ IOException -> 0x0031, all -> 0x003e }
    L_0x0022:
        r2 = "GET status";	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r3 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r4.b(r2, r3);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        if (r1 == 0) goto L_0x0030;
    L_0x002d:
        r1.disconnect();
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        r2 = "Network GET connection error";	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        r4.d(r2, r0);	 Catch:{ IOException -> 0x0031, all -> 0x003e }
        if (r1 == 0) goto L_0x003c;
    L_0x0039:
        r1.disconnect();
    L_0x003c:
        r0 = 0;
        goto L_0x0030;
    L_0x003e:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r1.disconnect();
    L_0x0044:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.i.b(java.net.URL):int");
    }

    private int b(URL url, byte[] bArr) {
        OutputStream outputStream;
        Object e;
        HttpURLConnection httpURLConnection;
        Throwable th;
        OutputStream outputStream2 = null;
        d.a((Object) url);
        d.a((Object) bArr);
        HttpURLConnection a;
        try {
            a(o().getPackageName());
            byte[] a2 = a(bArr);
            a("POST compressed size, ratio %, url", Integer.valueOf(a2.length), Long.valueOf((100 * ((long) a2.length)) / ((long) bArr.length)), url);
            if (a2.length > bArr.length) {
                c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(a2.length), Integer.valueOf(bArr.length));
            }
            if (B()) {
                String str = "Post payload";
                String str2 = "\n";
                String valueOf = String.valueOf(new String(bArr));
                a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            a = a(url);
            try {
                a.setDoOutput(true);
                a.addRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
                a.setFixedLengthStreamingMode(a2.length);
                a.connect();
                outputStream = a.getOutputStream();
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = a;
                try {
                    d("Network compressed POST connection error", e);
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e3) {
                            e("Error closing http compressed post connection output stream", e3);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c();
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    a = httpURLConnection;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e4) {
                            e("Error closing http compressed post connection output stream", e4);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    c();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                c();
                throw th;
            }
            try {
                outputStream.write(a2);
                outputStream.close();
                a(a);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    t().i();
                }
                b("POST status", Integer.valueOf(responseCode));
                if (a != null) {
                    a.disconnect();
                }
                c();
                return responseCode;
            } catch (IOException e5) {
                e = e5;
                outputStream2 = outputStream;
                httpURLConnection = a;
                d("Network compressed POST connection error", e);
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                c();
                return 0;
            } catch (Throwable th4) {
                th = th4;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                c();
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            httpURLConnection = null;
            d("Network compressed POST connection error", e);
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c();
            return 0;
        } catch (Throwable th5) {
            th = th5;
            a = null;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (a != null) {
                a.disconnect();
            }
            c();
            throw th;
        }
    }

    private URL b(c cVar) {
        String valueOf;
        String valueOf2;
        if (cVar.f()) {
            valueOf = String.valueOf(q().o());
            valueOf2 = String.valueOf(q().q());
            valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            valueOf = String.valueOf(q().p());
            valueOf2 = String.valueOf(q().q());
            valueOf = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private String c(c cVar) {
        return String.valueOf(cVar.c());
    }

    private URL e() {
        String valueOf = String.valueOf(q().o());
        String valueOf2 = String.valueOf(q().r());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    String a(c cVar, boolean z) {
        d.a((Object) cVar);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : cVar.b().entrySet()) {
                String str = (String) entry.getKey();
                if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str) || "z".equals(str) || "_gmsv".equals(str))) {
                    a(stringBuilder, str, (String) entry.getValue());
                }
            }
            a(stringBuilder, "ht", String.valueOf(cVar.d()));
            a(stringBuilder, "qt", String.valueOf(n().a() - cVar.d()));
            if (q().a()) {
                a(stringBuilder, "_gmsv", u.a);
            }
            if (z) {
                long g = cVar.g();
                a(stringBuilder, "z", g != 0 ? String.valueOf(g) : c(cVar));
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            e("Failed to encode name or value", e);
            return null;
        }
    }

    HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(q().D());
            httpURLConnection.setReadTimeout(q().E());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty(e.Y, this.a);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public List<Long> a(List<c> list) {
        boolean z;
        boolean z2 = true;
        m();
        D();
        d.a((Object) list);
        if (q().u().isEmpty() || !this.b.a(q().n() * 1000)) {
            z2 = false;
            z = false;
        } else {
            z = q().s() != ac.NONE;
            if (q().t() != ae.GZIP) {
                z2 = false;
            }
        }
        return z ? a((List) list, z2) : b((List) list);
    }

    List<Long> a(List<c> list, boolean z) {
        d.b(!list.isEmpty());
        a("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        a aVar = new a(this);
        List<Long> arrayList = new ArrayList();
        for (c cVar : list) {
            if (!aVar.a(cVar)) {
                break;
            }
            arrayList.add(Long.valueOf(cVar.c()));
        }
        if (aVar.a() == 0) {
            return arrayList;
        }
        URL e = e();
        if (e == null) {
            u("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int b = z ? b(e, aVar.b()) : a(e, aVar.b());
        if (200 == b) {
            a("Batched upload completed. Hits batched", Integer.valueOf(aVar.a()));
            return arrayList;
        }
        a("Network error uploading hits. status code", Integer.valueOf(b));
        if (q().u().contains(Integer.valueOf(b))) {
            t("Server instructed the client to stop batching");
            this.b.a();
        }
        return Collections.emptyList();
    }

    protected void a() {
        a("Network initialized. User agent", this.a);
    }

    protected void a(String str) {
    }

    List<Long> b(List<c> list) {
        List<Long> arrayList = new ArrayList(list.size());
        for (c cVar : list) {
            if (!a(cVar)) {
                break;
            }
            arrayList.add(Long.valueOf(cVar.c()));
            if (arrayList.size() >= q().l()) {
                break;
            }
        }
        return arrayList;
    }

    public boolean b() {
        NetworkInfo activeNetworkInfo;
        m();
        D();
        try {
            activeNetworkInfo = ((ConnectivityManager) o().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        q("No network connectivity");
        return false;
    }

    protected void c() {
    }
}
