package com.fimi.soul.drone.droneconnection.connection.b;

import com.fimi.kernel.utils.x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.droneconnection.connection.d;
import com.fimi.soul.utils.NetUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.a.a.f.c.g;

public abstract class b extends d {
    private static final int a = 20000;
    private static final String n = NetUtil.getSSL1234Key();
    private static final String o = "client.bks";
    private static final String p = "ca.bks";
    private Socket h;
    private BufferedOutputStream i;
    private BufferedInputStream j;
    private String k;
    private int l;
    private String m = null;
    private SSLContext q = null;

    public class a implements X509TrustManager {
        final /* synthetic */ b a;
        private X509TrustManager b = null;

        public a(b bVar, KeyStore keyStore) {
            this.a = bVar;
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(keyStore);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 0) {
                throw new NoSuchAlgorithmException("no trust manager found");
            }
            this.b = (X509TrustManager) trustManagers[0];
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.b.checkClientTrusted(x509CertificateArr, str);
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (x509CertificateArr != null) {
                for (X509Certificate checkValidity : x509CertificateArr) {
                    checkValidity.checkValidity();
                }
                return;
            }
            this.b.checkServerTrusted(x509CertificateArr, str);
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.b.getAcceptedIssuers();
        }
    }

    public class b implements X509TrustManager {
        final /* synthetic */ b a;

        public b(b bVar) {
            this.a = bVar;
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    private void k() {
        this.l = a();
        this.k = b();
        InetAddress byName = InetAddress.getByName(this.k);
        this.m = byName.toString();
        this.h = new Socket();
        this.h.setReuseAddress(true);
        this.h.setSoLinger(true, 0);
        this.h.connect(new InetSocketAddress(byName, this.l), 20000);
        this.h.setTrafficClass(20);
        if (this.h.isConnected()) {
            this.i = new BufferedOutputStream(this.h.getOutputStream());
            this.j = new BufferedInputStream(this.h.getInputStream());
        }
    }

    protected abstract int a();

    public final int b(byte[] bArr) {
        return this.j != null ? this.j.read(bArr) : -1;
    }

    protected abstract String b();

    public void c() {
        this.l = a();
        this.k = b();
        try {
            this.m = InetAddress.getByName(this.k).toString();
            this.q = SSLContext.getInstance(g.b);
            KeyStore instance = KeyStore.getInstance("BKS");
            instance.load(DroidPlannerApp.g().getResources().getAssets().open(o), n.toCharArray());
            KeyStore instance2 = KeyStore.getInstance("BKS");
            instance2.load(DroidPlannerApp.g().getResources().getAssets().open(p), n.toCharArray());
            KeyManagerFactory instance3 = KeyManagerFactory.getInstance("X509");
            instance3.init(instance, n.toCharArray());
            TrustManagerFactory.getInstance("X509").init(instance2);
            TrustManager[] trustManagerArr = new TrustManager[]{new a(this, instance2)};
            new TrustManager[1][0] = new b(this);
            this.q.init(instance3.getKeyManagers(), trustManagerArr, null);
            SSLSocket sSLSocket = (SSLSocket) this.q.getSocketFactory().createSocket(this.k, this.l);
            sSLSocket.setTrafficClass(20);
            sSLSocket.addHandshakeCompletedListener(new HandshakeCompletedListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
                }
            });
            sSLSocket.startHandshake();
            this.h = sSLSocket;
            if (this.h != null && this.h.isConnected()) {
                this.i = new BufferedOutputStream(this.h.getOutputStream());
                this.j = new BufferedInputStream(this.h.getInputStream());
            }
        } catch (Exception e) {
            h();
        }
    }

    public final void d() {
        if (com.fimi.soul.biz.e.d.a().k()) {
            c();
        } else {
            k();
        }
    }

    public final void d(final byte[] bArr) {
        x.a(new Runnable(this) {
            final /* synthetic */ b b;

            public void run() {
                if (this.b.i != null && this.b.i != null) {
                    try {
                        this.b.i.write(bArr);
                        this.b.i.flush();
                    } catch (IOException e) {
                        this.b.h();
                    }
                }
            }
        });
    }

    public final void e() {
        if (this.h != null) {
            new Thread(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void run() {
                    try {
                        if (this.a.j != null) {
                            this.a.j.close();
                        }
                        if (this.a.i != null) {
                            this.a.i.close();
                        }
                        if (this.a.h != null) {
                            this.a.h.close();
                        }
                        this.a.h = null;
                        this.a.j = null;
                        this.a.i = null;
                    } catch (Exception e) {
                    }
                }
            }.start();
        }
    }

    public final int j() {
        return 3;
    }
}
