package m.framework.a;

import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.a.a.f.c.g;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class i extends SSLSocketFactory {
    SSLContext a = SSLContext.getInstance(g.a);

    public i(KeyStore keyStore) {
        super(keyStore);
        AnonymousClass1 anonymousClass1 = new X509TrustManager(this) {
            final /* synthetic */ i a;

            {
                this.a = r1;
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        this.a.init(null, new TrustManager[]{anonymousClass1}, null);
    }

    public Socket createSocket() {
        return this.a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
