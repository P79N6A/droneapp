package org.a.a.f.c;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.a.a.a.d;
import org.a.a.f.b.b;
import org.a.a.o.a;
import org.a.a.o.f;
import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.protocol.HttpContext;

@d
public class g implements b {
    public static final String a = "TLS";
    public static final String b = "SSL";
    public static final String c = "SSLv2";
    public static final X509HostnameVerifier d = new b();
    public static final X509HostnameVerifier e = new c();
    public static final X509HostnameVerifier f = new k();
    private static final String g = "HttpClient";
    private final SSLSocketFactory h;
    private final X509HostnameVerifier i;
    private final String[] j;
    private final String[] k;

    public g(SSLContext sSLContext) {
        this(sSLContext, e);
    }

    public g(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) a.a((Object) sSLContext, "SSL context")).getSocketFactory(), null, null, x509HostnameVerifier);
    }

    public g(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) a.a((Object) sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
    }

    public g(SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, null, null, x509HostnameVerifier);
    }

    public g(SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this.h = (SSLSocketFactory) a.a((Object) sSLSocketFactory, "SSL socket factory");
        this.j = strArr;
        this.k = strArr2;
        if (x509HostnameVerifier == null) {
            x509HostnameVerifier = e;
        }
        this.i = x509HostnameVerifier;
    }

    public static g a() {
        return new g((SSLSocketFactory) SSLSocketFactory.getDefault(), e);
    }

    private void a(SSLSocket sSLSocket, String str) {
        try {
            if (Log.isLoggable(g, 3)) {
                try {
                    List arrayList;
                    SSLSession session = sSLSocket.getSession();
                    Log.d(g, "Secure session established");
                    Log.d(g, " negotiated protocol: " + session.getProtocol());
                    Log.d(g, " negotiated cipher suite: " + session.getCipherSuite());
                    X509Certificate x509Certificate = (X509Certificate) session.getPeerCertificates()[0];
                    Log.d(g, " peer principal: " + x509Certificate.getSubjectX500Principal().toString());
                    Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                    if (subjectAlternativeNames != null) {
                        List arrayList2 = new ArrayList();
                        for (List arrayList3 : subjectAlternativeNames) {
                            if (!arrayList3.isEmpty()) {
                                arrayList2.add((String) arrayList3.get(1));
                            }
                        }
                        Log.d(g, " peer alternative names: " + arrayList2);
                    }
                    Log.d(g, " issuer principal: " + x509Certificate.getIssuerX500Principal().toString());
                    Collection<List> issuerAlternativeNames = x509Certificate.getIssuerAlternativeNames();
                    if (issuerAlternativeNames != null) {
                        arrayList3 = new ArrayList();
                        for (List list : issuerAlternativeNames) {
                            if (!list.isEmpty()) {
                                arrayList3.add((String) list.get(1));
                            }
                        }
                        Log.d(g, " issuer alternative names: " + arrayList3);
                    }
                } catch (Exception e) {
                }
            }
            this.i.verify(str, sSLSocket);
        } catch (IOException e2) {
            try {
                sSLSocket.close();
            } catch (Exception e3) {
            }
            throw e2;
        }
    }

    private static String[] a(String str) {
        return f.b(str) ? null : str.split(" *, *");
    }

    public static g b() {
        return new g((SSLSocketFactory) SSLSocketFactory.getDefault(), a(System.getProperty("https.protocols")), a(System.getProperty("https.cipherSuites")), e);
    }

    public Socket a(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        a.a((Object) httpHost, "HTTP host");
        a.a((Object) inetSocketAddress, "Remote address");
        Socket a = socket != null ? socket : a(httpContext);
        if (inetSocketAddress2 != null) {
            a.bind(inetSocketAddress2);
        }
        if (i > 0) {
            try {
                if (a.getSoTimeout() == 0) {
                    a.setSoTimeout(i);
                }
            } catch (IOException e) {
                try {
                    a.close();
                } catch (IOException e2) {
                }
                throw e;
            }
        }
        if (Log.isLoggable(g, 3)) {
            Log.d(g, "Connecting socket to " + inetSocketAddress + " with timeout " + i);
        }
        a.connect(inetSocketAddress, i);
        if (!(a instanceof SSLSocket)) {
            return a(a, httpHost.getHostName(), inetSocketAddress.getPort(), httpContext);
        }
        SSLSocket sSLSocket = (SSLSocket) a;
        if (Log.isLoggable(g, 3)) {
            Log.d(g, "Starting handshake");
        }
        sSLSocket.startHandshake();
        a(sSLSocket, httpHost.getHostName());
        return a;
    }

    @TargetApi(17)
    public Socket a(Socket socket, String str, int i, HttpContext httpContext) {
        SSLSocket sSLSocket = (SSLSocket) this.h.createSocket(socket, str, i, true);
        if (this.j != null) {
            sSLSocket.setEnabledProtocols(this.j);
        } else {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            List arrayList = new ArrayList(enabledProtocols.length);
            for (String str2 : enabledProtocols) {
                if (!str2.startsWith(b)) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
        if (this.k != null) {
            sSLSocket.setEnabledCipherSuites(this.k);
        }
        if (Log.isLoggable(g, 3)) {
            Log.d(g, "Enabled protocols: " + Arrays.asList(sSLSocket.getEnabledProtocols()));
            Log.d(g, "Enabled cipher suites:" + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
        }
        a(sSLSocket);
        if (VERSION.SDK_INT >= 17) {
            if (Log.isLoggable(g, 3)) {
                Log.d(g, "Enabling SNI for " + str);
            }
            try {
                sSLSocket.getClass().getMethod("setHostname", new Class[]{String.class}).invoke(sSLSocket, new Object[]{str});
            } catch (Throwable e) {
                if (Log.isLoggable(g, 3)) {
                    Log.d(g, "SNI configuration failed", e);
                }
            }
        }
        if (Log.isLoggable(g, 3)) {
            Log.d(g, "Starting handshake");
        }
        sSLSocket.startHandshake();
        a(sSLSocket, str);
        return sSLSocket;
    }

    public Socket a(HttpContext httpContext) {
        return SocketFactory.getDefault().createSocket();
    }

    protected void a(SSLSocket sSLSocket) {
    }

    X509HostnameVerifier c() {
        return this.i;
    }
}
