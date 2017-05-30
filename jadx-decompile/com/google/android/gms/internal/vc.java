package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.formats.a.a;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import java.util.ArrayList;
import java.util.List;

@aaa
public class vc extends d {
    private final vb a;
    private final List<a> b = new ArrayList();
    private final uv c;

    public vc(vb vbVar) {
        uv uvVar;
        this.a = vbVar;
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
        return j();
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

    public CharSequence g() {
        try {
            return this.a.f();
        } catch (Throwable e) {
            b.b("Failed to get attribution.", e);
            return null;
        }
    }

    public Bundle h() {
        try {
            return this.a.h();
        } catch (Throwable e) {
            b.d("Failed to get extras", e);
            return null;
        }
    }

    public void i() {
        try {
            this.a.i();
        } catch (Throwable e) {
            b.b("Failed to destroy", e);
        }
    }

    protected e j() {
        try {
            return this.a.g();
        } catch (Throwable e) {
            b.b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
