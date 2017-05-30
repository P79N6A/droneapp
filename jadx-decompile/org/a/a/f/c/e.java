package org.a.a.f.c;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.a.a.o.a;

public final class e {
    private final String a;
    private final X509Certificate[] b;

    public e(String str, X509Certificate[] x509CertificateArr) {
        this.a = (String) a.a((Object) str, "Private key type");
        this.b = x509CertificateArr;
    }

    public String a() {
        return this.a;
    }

    public X509Certificate[] b() {
        return this.b;
    }

    public String toString() {
        return this.a + ':' + Arrays.toString(this.b);
    }
}
