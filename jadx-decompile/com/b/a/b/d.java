package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.b.a.b.a.e;
import com.b.a.b.a.f;
import com.b.a.b.a.h;
import com.b.a.b.e.b;
import com.b.a.b.e.c;

public class d {
    public static final String a = d.class.getSimpleName();
    static final String b = "Initialize ImageLoader with configuration";
    static final String c = "Destroy ImageLoader";
    static final String d = "Load image from memory cache [%s]";
    private static final String e = "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.";
    private static final String f = "Wrong arguments were passed to displayImage() method (ImageView reference must not be null)";
    private static final String g = "ImageLoader must be init with configuration before using";
    private static final String h = "ImageLoader configuration can not be initialized with null";
    private static volatile d l;
    private e i;
    private f j;
    private com.b.a.b.f.a k = new com.b.a.b.f.d();

    private static class a extends com.b.a.b.f.d {
        private Bitmap a;

        private a() {
        }

        public Bitmap a() {
            return this.a;
        }

        public void a(String str, View view, Bitmap bitmap) {
            this.a = bitmap;
        }
    }

    protected d() {
    }

    private static Handler a(c cVar) {
        Handler r = cVar.r();
        return cVar.s() ? null : (r == null && Looper.myLooper() == Looper.getMainLooper()) ? new Handler() : r;
    }

    public static d a() {
        if (l == null) {
            synchronized (d.class) {
                if (l == null) {
                    l = new d();
                }
            }
        }
        return l;
    }

    private void m() {
        if (this.i == null) {
            throw new IllegalStateException(g);
        }
    }

    public Bitmap a(String str) {
        return a(str, null, null);
    }

    public Bitmap a(String str, e eVar) {
        return a(str, eVar, null);
    }

    public Bitmap a(String str, e eVar, c cVar) {
        if (cVar == null) {
            cVar = this.i.r;
        }
        c d = new com.b.a.b.c.a().a(cVar).f(true).d();
        com.b.a.b.f.a aVar = new a();
        a(str, eVar, d, aVar);
        return aVar.a();
    }

    public Bitmap a(String str, c cVar) {
        return a(str, null, cVar);
    }

    public String a(ImageView imageView) {
        return this.j.a(new b(imageView));
    }

    public String a(com.b.a.b.e.a aVar) {
        return this.j.a(aVar);
    }

    public synchronized void a(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException(h);
        } else if (this.i == null) {
            com.b.a.c.d.a(b, new Object[0]);
            this.j = new f(eVar);
            this.i = eVar;
        } else {
            com.b.a.c.d.c(e, new Object[0]);
        }
    }

    public void a(com.b.a.b.f.a aVar) {
        if (aVar == null) {
            aVar = new com.b.a.b.f.d();
        }
        this.k = aVar;
    }

    public void a(String str, ImageView imageView) {
        a(str, new b(imageView), null, null, null);
    }

    public void a(String str, ImageView imageView, c cVar) {
        a(str, new b(imageView), cVar, null, null);
    }

    public void a(String str, ImageView imageView, c cVar, com.b.a.b.f.a aVar) {
        a(str, imageView, cVar, aVar, null);
    }

    public void a(String str, ImageView imageView, c cVar, com.b.a.b.f.a aVar, com.b.a.b.f.b bVar) {
        a(str, new b(imageView), cVar, aVar, bVar);
    }

    public void a(String str, ImageView imageView, com.b.a.b.f.a aVar) {
        a(str, new b(imageView), null, aVar, null);
    }

    public void a(String str, e eVar, c cVar, com.b.a.b.f.a aVar) {
        a(str, eVar, cVar, aVar, null);
    }

    public void a(String str, e eVar, c cVar, com.b.a.b.f.a aVar, com.b.a.b.f.b bVar) {
        m();
        if (eVar == null) {
            eVar = this.i.a();
        }
        a(str, new c(str, eVar, h.CROP), cVar == null ? this.i.r : cVar, aVar, bVar);
    }

    public void a(String str, e eVar, com.b.a.b.f.a aVar) {
        a(str, eVar, null, aVar, null);
    }

    public void a(String str, c cVar, com.b.a.b.f.a aVar) {
        a(str, null, cVar, aVar, null);
    }

    public void a(String str, com.b.a.b.e.a aVar) {
        a(str, aVar, null, null, null);
    }

    public void a(String str, com.b.a.b.e.a aVar, c cVar) {
        a(str, aVar, cVar, null, null);
    }

    public void a(String str, com.b.a.b.e.a aVar, c cVar, com.b.a.b.f.a aVar2) {
        a(str, aVar, cVar, aVar2, null);
    }

    public void a(String str, com.b.a.b.e.a aVar, c cVar, com.b.a.b.f.a aVar2, com.b.a.b.f.b bVar) {
        m();
        if (aVar == null) {
            throw new IllegalArgumentException(f);
        }
        com.b.a.b.f.a aVar3 = aVar2 == null ? this.k : aVar2;
        c cVar2 = cVar == null ? this.i.r : cVar;
        if (TextUtils.isEmpty(str)) {
            this.j.b(aVar);
            aVar3.a(str, aVar.d());
            if (cVar2.b()) {
                aVar.a(cVar2.b(this.i.a));
            } else {
                aVar.a(null);
            }
            aVar3.a(str, aVar.d(), null);
            return;
        }
        e a = com.b.a.c.b.a(aVar, this.i.a());
        String a2 = com.b.a.c.e.a(str, a);
        this.j.a(aVar, a2);
        aVar3.a(str, aVar.d());
        Bitmap a3 = this.i.n.a(a2);
        if (a3 == null || a3.isRecycled()) {
            if (cVar2.a()) {
                aVar.a(cVar2.a(this.i.a));
            } else if (cVar2.g()) {
                aVar.a(null);
            }
            h hVar = new h(this.j, new g(str, aVar, a, a2, cVar2, aVar3, bVar, this.j.a(str)), a(cVar2));
            if (cVar2.s()) {
                hVar.run();
                return;
            } else {
                this.j.a(hVar);
                return;
            }
        }
        com.b.a.c.d.a(d, a2);
        if (cVar2.e()) {
            i iVar = new i(this.j, a3, new g(str, aVar, a, a2, cVar2, aVar3, bVar, this.j.a(str)), a(cVar2));
            if (cVar2.s()) {
                iVar.run();
                return;
            } else {
                this.j.a(iVar);
                return;
            }
        }
        cVar2.q().a(a3, aVar, f.MEMORY_CACHE);
        aVar3.a(str, aVar.d(), a3);
    }

    public void a(String str, com.b.a.b.e.a aVar, com.b.a.b.f.a aVar2) {
        a(str, aVar, null, aVar2, null);
    }

    public void a(String str, com.b.a.b.f.a aVar) {
        a(str, null, null, aVar, null);
    }

    public void a(boolean z) {
        this.j.a(z);
    }

    public void b(ImageView imageView) {
        this.j.b(new b(imageView));
    }

    public void b(com.b.a.b.e.a aVar) {
        this.j.b(aVar);
    }

    public void b(boolean z) {
        this.j.b(z);
    }

    public boolean b() {
        return this.i != null;
    }

    public com.b.a.a.b.c c() {
        m();
        return this.i.n;
    }

    public void d() {
        m();
        this.i.n.b();
    }

    @Deprecated
    public com.b.a.a.a.a e() {
        return f();
    }

    public com.b.a.a.a.a f() {
        m();
        return this.i.o;
    }

    @Deprecated
    public void g() {
        h();
    }

    public void h() {
        m();
        this.i.o.c();
    }

    public void i() {
        this.j.a();
    }

    public void j() {
        this.j.b();
    }

    public void k() {
        this.j.c();
    }

    public void l() {
        if (this.i != null) {
            com.b.a.c.d.a(c, new Object[0]);
        }
        k();
        this.i.o.b();
        this.j = null;
        this.i = null;
    }
}
