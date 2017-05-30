package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import java.util.ArrayList;
import java.util.List;

@aaa
public class va extends c {
    private final uz a;
    private final List<a> b = new ArrayList();
    private final uv c;
    private h d = new h();

    public va(uz uzVar) {
        uv uvVar;
        this.a = uzVar;
        try {
            List<Object> b = this.a.b();
            if (b != null) {
                for (Object a : b) {
                    uu a2 = a(a);
                    if (a2 != null) {
                        this.b.add(new uv(a2));
                    }
                }
            }
        } catch (Throwable e) {
            b.b("Failed to get image.", e);
        }
        try {
            uu d = this.a.d();
            if (d != null) {
                uvVar = new uv(d);
                this.c = uvVar;
            }
        } catch (Throwable e2) {
            b.b("Failed to get icon.", e2);
        }
        uvVar = null;
        this.c = uvVar;
    }

    uu a(Object obj) {
        return obj instanceof IBinder ? uu.a.a((IBinder) obj) : null;
    }

    protected /* synthetic */ Object a() {
        return m();
    }

    public CharSequence b() {
        try {
            return this.a.a();
        } catch (Throwable e) {
            b.b("Failed to get headline.", e);
            return null;
        }
    }

    public List<a> c() {
        return this.b;
    }

    public CharSequence d() {
        try {
            return this.a.c();
        } catch (Throwable e) {
            b.b("Failed to get body.", e);
            return null;
        }
    }

    public a e() {
        return this.c;
    }

    public CharSequence f() {
        try {
            return this.a.e();
        } catch (Throwable e) {
            b.b("Failed to get call to action.", e);
            return null;
        }
    }

    public Double g() {
        Double d = null;
        try {
            double f = this.a.f();
            if (f != -1.0d) {
                d = Double.valueOf(f);
            }
        } catch (Throwable e) {
            b.b("Failed to get star rating.", e);
        }
        return d;
    }

    public CharSequence h() {
        try {
            return this.a.g();
        } catch (Throwable e) {
            b.b("Failed to get store", e);
            return null;
        }
    }

    public CharSequence i() {
        try {
            return this.a.h();
        } catch (Throwable e) {
            b.b("Failed to get price.", e);
            return null;
        }
    }

    public h j() {
        try {
            if (this.a.i() != null) {
                this.d.a(this.a.i());
            }
        } catch (Throwable e) {
            b.b("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    public Bundle k() {
        try {
            return this.a.n();
        } catch (Throwable e) {
            b.b("Failed to get extras", e);
            return null;
        }
    }

    public void l() {
        try {
            this.a.p();
        } catch (Throwable e) {
            b.b("Failed to destroy", e);
        }
    }

    protected e m() {
        try {
            return this.a.j();
        } catch (Throwable e) {
            b.b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
