package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.List;

@aaa
public class ve implements e {
    private final vd a;

    public ve(vd vdVar) {
        this.a = vdVar;
    }

    public CharSequence a(String str) {
        try {
            return this.a.a(str);
        } catch (Throwable e) {
            b.b("Failed to get string.", e);
            return null;
        }
    }

    public List<String> a() {
        try {
            return this.a.a();
        } catch (Throwable e) {
            b.b("Failed to get available asset names.", e);
            return null;
        }
    }

    public a b(String str) {
        try {
            uu b = this.a.b(str);
            if (b != null) {
                return new uv(b);
            }
        } catch (Throwable e) {
            b.b("Failed to get image.", e);
        }
        return null;
    }

    public String b() {
        try {
            return this.a.l();
        } catch (Throwable e) {
            b.b("Failed to get custom template id.", e);
            return null;
        }
    }

    public void c() {
        try {
            this.a.b();
        } catch (Throwable e) {
            b.b("Failed to record impression.", e);
        }
    }

    public void c(String str) {
        try {
            this.a.c(str);
        } catch (Throwable e) {
            b.b("Failed to perform click.", e);
        }
    }
}
