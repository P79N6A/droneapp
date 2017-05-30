package com.google.android.gms.internal;

import java.lang.Thread.State;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ls {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final Charset b = Charset.forName("UTF-8");
    private static ThreadFactory l = Executors.defaultThreadFactory();
    private static lr m = new lr() {
        public void a(Thread thread, String str) {
            thread.setName(str);
        }
    };
    private volatile a c = a.NONE;
    private volatile Socket d = null;
    private lt e = null;
    private final URI f;
    private final lx g;
    private final ly h;
    private final lv i;
    private final int j = a.incrementAndGet();
    private final Thread k = a().newThread(new Runnable(this) {
        final /* synthetic */ ls a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.l();
        }
    });

    private enum a {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public ls(URI uri, String str, Map<String, String> map) {
        this.f = uri;
        this.i = new lv(uri, str, map);
        this.g = new lx(this);
        this.h = new ly(this, "TubeSock", this.j);
    }

    static ThreadFactory a() {
        return l;
    }

    private synchronized void a(byte b, byte[] bArr) {
        if (this.c != a.CONNECTED) {
            this.e.a(new lu("error while sending data: not connected"));
        } else {
            try {
                this.h.a(b, true, bArr);
            } catch (Throwable e) {
                this.e.a(new lu("Failed to send frame", e));
                e();
            }
        }
    }

    public static void a(ThreadFactory threadFactory, lr lrVar) {
        l = threadFactory;
        m = lrVar;
    }

    static lr b() {
        return m;
    }

    private synchronized void i() {
        if (this.c != a.DISCONNECTED) {
            this.g.b();
            this.h.a();
            if (this.d != null) {
                try {
                    this.d.close();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            this.c = a.DISCONNECTED;
            this.e.d();
        }
    }

    private void j() {
        try {
            this.c = a.DISCONNECTING;
            this.h.a();
            this.h.a((byte) 8, true, new byte[0]);
        } catch (Throwable e) {
            this.e.a(new lu("Failed to send close frame", e));
        }
    }

    private Socket k() {
        Throwable th;
        String str;
        String valueOf;
        String scheme = this.f.getScheme();
        String host = this.f.getHost();
        int port = this.f.getPort();
        if (scheme != null && scheme.equals("ws")) {
            try {
                return new Socket(host, port == -1 ? 80 : port);
            } catch (Throwable e) {
                th = e;
                str = "unknown host: ";
                valueOf = String.valueOf(host);
                throw new lu(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            } catch (Throwable e2) {
                host = String.valueOf(this.f);
                throw new lu(new StringBuilder(String.valueOf(host).length() + 31).append("error while creating socket to ").append(host).toString(), e2);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            String str2 = "unsupported protocol: ";
            valueOf = String.valueOf(scheme);
            throw new lu(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            if (port == -1) {
                port = 443;
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                scheme = String.valueOf(this.f);
                throw new lu(new StringBuilder(String.valueOf(scheme).length() + 39).append("Error while verifying secure socket to ").append(scheme).toString());
            } catch (Throwable e22) {
                th = e22;
                str = "unknown host: ";
                valueOf = String.valueOf(host);
                throw new lu(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            } catch (Throwable e222) {
                host = String.valueOf(this.f);
                throw new lu(new StringBuilder(String.valueOf(host).length() + 38).append("error while creating secure socket to ").append(host).toString(), e222);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r11 = this;
        r4 = 1;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = 0;
        r0 = r11.k();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        monitor-enter(r11);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r11.d = r0;	 Catch:{ all -> 0x0025 }
        r2 = r11.c;	 Catch:{ all -> 0x0025 }
        r3 = com.google.android.gms.internal.ls.a.DISCONNECTED;	 Catch:{ all -> 0x0025 }
        if (r2 != r3) goto L_0x0032;
    L_0x0011:
        r0 = r11.d;	 Catch:{ IOException -> 0x001e }
        r0.close();	 Catch:{ IOException -> 0x001e }
        r0 = 0;
        r11.d = r0;	 Catch:{ all -> 0x0025 }
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        r11.e();
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0025 }
        r1.<init>(r0);	 Catch:{ all -> 0x0025 }
        throw r1;	 Catch:{ all -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        throw r0;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
    L_0x0028:
        r0 = move-exception;
        r1 = r11.e;	 Catch:{ all -> 0x00e1 }
        r1.a(r0);	 Catch:{ all -> 0x00e1 }
        r11.e();
        goto L_0x001d;
    L_0x0032:
        monitor-exit(r11);	 Catch:{ all -> 0x0025 }
        r5 = new java.io.DataInputStream;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r2 = r0.getInputStream();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r5.<init>(r2);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r6 = r0.getOutputStream();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r11.i;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r0.a();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r6.write(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = new byte[r0];	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r7 = new java.util.ArrayList;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r7.<init>();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r1;
        r3 = r1;
    L_0x0054:
        if (r3 != 0) goto L_0x00ec;
    L_0x0056:
        r8 = r5.read();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r9 = -1;
        if (r8 != r9) goto L_0x0088;
    L_0x005d:
        r0 = new com.google.android.gms.internal.lu;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1 = "Connection closed before handshake was complete";
        r0.<init>(r1);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        throw r0;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        r2 = r11.e;	 Catch:{ all -> 0x00e1 }
        r3 = new com.google.android.gms.internal.lu;	 Catch:{ all -> 0x00e1 }
        r4 = "error while connecting: ";
        r1 = r0.getMessage();	 Catch:{ all -> 0x00e1 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00e1 }
        r5 = r1.length();	 Catch:{ all -> 0x00e1 }
        if (r5 == 0) goto L_0x014d;
    L_0x007a:
        r1 = r4.concat(r1);	 Catch:{ all -> 0x00e1 }
    L_0x007e:
        r3.<init>(r1, r0);	 Catch:{ all -> 0x00e1 }
        r2.a(r3);	 Catch:{ all -> 0x00e1 }
        r11.e();
        goto L_0x001d;
    L_0x0088:
        r8 = (byte) r8;
        r2[r0] = r8;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r0 + 1;
        r8 = r0 + -1;
        r8 = r2[r8];	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r9 = 10;
        if (r8 != r9) goto L_0x00c2;
    L_0x0095:
        r8 = r0 + -2;
        r8 = r2[r8];	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r9 = 13;
        if (r8 != r9) goto L_0x00c2;
    L_0x009d:
        r0 = new java.lang.String;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r8 = b;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2, r8);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r2 = r0.trim();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r8 = "";
        r2 = r2.equals(r8);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        if (r2 == 0) goto L_0x00b9;
    L_0x00b0:
        r2 = r4;
    L_0x00b1:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = new byte[r0];	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r3 = r2;
        r2 = r0;
        r0 = r1;
        goto L_0x0054;
    L_0x00b9:
        r0 = r0.trim();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r7.add(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r2 = r3;
        goto L_0x00b1;
    L_0x00c2:
        if (r0 != r10) goto L_0x0054;
    L_0x00c4:
        r0 = new java.lang.String;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1 = b;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2, r1);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1 = new com.google.android.gms.internal.lu;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r2 = "Unexpected long line in handshake: ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r3 = r0.length();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        if (r3 == 0) goto L_0x00e6;
    L_0x00d9:
        r0 = r2.concat(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
    L_0x00dd:
        r1.<init>(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        throw r1;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
    L_0x00e1:
        r0 = move-exception;
        r11.e();
        throw r0;
    L_0x00e6:
        r0 = new java.lang.String;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.<init>(r2);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        goto L_0x00dd;
    L_0x00ec:
        r1 = r11.i;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = 0;
        r0 = r7.get(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1.a(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = 0;
        r7.remove(r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1 = new java.util.HashMap;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1.<init>();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r2 = r7.iterator();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
    L_0x0105:
        r0 = r2.hasNext();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        if (r0 == 0) goto L_0x0122;
    L_0x010b:
        r0 = r2.next();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = (java.lang.String) r0;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r3 = ": ";
        r4 = 2;
        r0 = r0.split(r3, r4);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r3 = 0;
        r3 = r0[r3];	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r1.put(r3, r0);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        goto L_0x0105;
    L_0x0122:
        r0 = r11.i;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.a(r1);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r11.h;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.a(r6);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r11.g;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.a(r5);	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = com.google.android.gms.internal.ls.a.CONNECTED;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r11.c = r0;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r11.h;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r0.b();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.start();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r11.e;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.c();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0 = r11.g;	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r0.a();	 Catch:{ lu -> 0x0028, IOException -> 0x0065 }
        r11.e();
        goto L_0x001d;
    L_0x014d:
        r1 = new java.lang.String;	 Catch:{ all -> 0x00e1 }
        r1.<init>(r4);	 Catch:{ all -> 0x00e1 }
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ls.l():void");
    }

    public void a(lt ltVar) {
        this.e = ltVar;
    }

    void a(lu luVar) {
        this.e.a(luVar);
        if (this.c == a.CONNECTED) {
            e();
        }
        i();
    }

    public synchronized void a(String str) {
        a((byte) 1, str.getBytes(b));
    }

    synchronized void a(byte[] bArr) {
        a((byte) 10, bArr);
    }

    lt c() {
        return this.e;
    }

    public synchronized void d() {
        if (this.c != a.NONE) {
            this.e.a(new lu("connect() already called"));
            e();
        } else {
            lr b = b();
            Thread h = h();
            String valueOf = String.valueOf("TubeSockReader-");
            b.a(h, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.j).toString());
            this.c = a.CONNECTING;
            h().start();
        }
    }

    public synchronized void e() {
        switch (this.c) {
            case NONE:
                this.c = a.DISCONNECTED;
                break;
            case CONNECTING:
                i();
                break;
            case CONNECTED:
                j();
                break;
        }
    }

    void f() {
        i();
    }

    public void g() {
        if (this.h.b().getState() != State.NEW) {
            this.h.b().join();
        }
        h().join();
    }

    Thread h() {
        return this.k;
    }
}
