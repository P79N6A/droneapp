package org.a.a.f.c;

import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import org.a.a.a.b;

@b
public class i {
    public static SSLContext a() {
        try {
            SSLContext instance = SSLContext.getInstance(g.a);
            instance.init(null, null, null);
            return instance;
        } catch (Throwable e) {
            throw new j(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new j(e2.getMessage(), e2);
        }
    }

    public static SSLContext b() {
        try {
            return SSLContext.getInstance("Default");
        } catch (NoSuchAlgorithmException e) {
            return a();
        }
    }

    public static h c() {
        return new h();
    }
}
