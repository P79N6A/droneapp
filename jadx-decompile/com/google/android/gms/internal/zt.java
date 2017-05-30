package com.google.android.gms.internal;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.wx.b;
import com.google.android.gms.internal.wx.e;
import java.util.concurrent.TimeUnit;

@aaa
public class zt {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private static final Object b = new Object();
    private static boolean c = false;
    private static wx d = null;
    private final Context e;
    private final a f;
    private final q g;
    private final ro h;
    private wv i;
    private e j;
    private wu k;
    private boolean l = false;

    public zt(Context context, a aVar, q qVar, ro roVar) {
        this.e = context;
        this.f = aVar;
        this.g = qVar;
        this.h = roVar;
        this.l = ((Boolean) uf.bK.c()).booleanValue();
    }

    public static String a(a aVar, String str) {
        String valueOf = String.valueOf(aVar.b.b.indexOf(UriUtil.HTTPS_SCHEME) == 0 ? "https:" : "http:");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private void g() {
        synchronized (b) {
            if (!c) {
                d = new wx(this.e.getApplicationContext() != null ? this.e.getApplicationContext() : this.e, this.f.a.k, a(this.f, (String) uf.bI.c()), new 3(this), new b());
                c = true;
            }
        }
    }

    private void h() {
        this.j = new e(e().b(this.h));
    }

    private void i() {
        this.i = new wv();
    }

    private void j() {
        this.k = (wu) c().a(this.e, this.f.a.k, a(this.f, (String) uf.bI.c()), this.h, this.g.n()).get(a, TimeUnit.MILLISECONDS);
        this.k.a(this.g, this.g, this.g, this.g, false, null, null, null, null);
    }

    public void a() {
        if (this.l) {
            g();
        } else {
            i();
        }
    }

    public void a(a aVar) {
        if (this.l) {
            e f = f();
            if (f == null) {
                com.google.android.gms.ads.internal.util.client.b.d("SharedJavascriptEngine not initialized");
                return;
            } else {
                f.a(new 1(this, aVar), new 2(this, aVar));
                return;
            }
        }
        wy d = d();
        if (d == null) {
            com.google.android.gms.ads.internal.util.client.b.d("JavascriptEngine not initialized");
        } else {
            aVar.a(d);
        }
    }

    public void b() {
        if (this.l) {
            h();
        } else {
            j();
        }
    }

    protected wv c() {
        return this.i;
    }

    protected wu d() {
        return this.k;
    }

    protected wx e() {
        return d;
    }

    protected e f() {
        return this.j;
    }
}
