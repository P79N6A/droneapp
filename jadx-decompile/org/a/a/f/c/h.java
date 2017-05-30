package org.a.a.f.c;

import java.net.Socket;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.a.a.a.c;

@c
public class h {
    static final String a = "TLS";
    static final String b = "SSL";
    private String c;
    private Set<KeyManager> d = new HashSet();
    private Set<TrustManager> e = new HashSet();
    private SecureRandom f;

    static class a implements X509KeyManager {
        private final X509KeyManager a;
        private final f b;

        a(X509KeyManager x509KeyManager, f fVar) {
            this.a = x509KeyManager;
            this.b = fVar;
        }

        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            Map hashMap = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.a.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        hashMap.put(str2, new e(str, this.a.getCertificateChain(str2)));
                    }
                }
            }
            return this.b.a(hashMap, socket);
        }

        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            Map hashMap = new HashMap();
            String[] serverAliases = this.a.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (String str2 : serverAliases) {
                    hashMap.put(str2, new e(str, this.a.getCertificateChain(str2)));
                }
            }
            return this.b.a(hashMap, socket);
        }

        public X509Certificate[] getCertificateChain(String str) {
            return this.a.getCertificateChain(str);
        }

        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.a.getClientAliases(str, principalArr);
        }

        public PrivateKey getPrivateKey(String str) {
            return this.a.getPrivateKey(str);
        }

        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.a.getServerAliases(str, principalArr);
        }
    }

    static class b implements X509TrustManager {
        private final X509TrustManager a;
        private final n b;

        b(X509TrustManager x509TrustManager, n nVar) {
            this.a = x509TrustManager;
            this.b = nVar;
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.a.checkClientTrusted(x509CertificateArr, str);
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (!this.b.a(x509CertificateArr, str)) {
                this.a.checkServerTrusted(x509CertificateArr, str);
            }
        }

        public X509Certificate[] getAcceptedIssuers() {
            return this.a.getAcceptedIssuers();
        }
    }

    public h a() {
        this.c = "TLS";
        return this;
    }

    public h a(String str) {
        this.c = str;
        return this;
    }

    public h a(KeyStore keyStore) {
        return a(keyStore, null);
    }

    public h a(KeyStore keyStore, n nVar) {
        int i = 0;
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            if (nVar != null) {
                for (int i2 = 0; i2 < trustManagers.length; i2++) {
                    TrustManager trustManager = trustManagers[i2];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i2] = new b((X509TrustManager) trustManager, nVar);
                    }
                }
            }
            int length = trustManagers.length;
            while (i < length) {
                this.e.add(trustManagers[i]);
                i++;
            }
        }
        return this;
    }

    public h a(KeyStore keyStore, char[] cArr) {
        a(keyStore, cArr, null);
        return this;
    }

    public h a(KeyStore keyStore, char[] cArr, f fVar) {
        int i = 0;
        KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore, cArr);
        KeyManager[] keyManagers = instance.getKeyManagers();
        if (keyManagers != null) {
            if (fVar != null) {
                for (int i2 = 0; i2 < keyManagers.length; i2++) {
                    KeyManager keyManager = keyManagers[i2];
                    if (keyManager instanceof X509KeyManager) {
                        keyManagers[i2] = new a((X509KeyManager) keyManager, fVar);
                    }
                }
            }
            int length = keyManagers.length;
            while (i < length) {
                this.d.add(keyManagers[i]);
                i++;
            }
        }
        return this;
    }

    public h a(SecureRandom secureRandom) {
        this.f = secureRandom;
        return this;
    }

    public h b() {
        this.c = "SSL";
        return this;
    }

    public SSLContext c() {
        SSLContext instance = SSLContext.getInstance(this.c != null ? this.c : "TLS");
        instance.init(!this.d.isEmpty() ? (KeyManager[]) this.d.toArray(new KeyManager[this.d.size()]) : null, !this.e.isEmpty() ? (TrustManager[]) this.e.toArray(new TrustManager[this.e.size()]) : null, this.f);
        return instance;
    }
}
