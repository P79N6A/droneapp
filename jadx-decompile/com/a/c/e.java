package com.a.c;

import android.view.View;
import android.view.animation.Interpolator;
import com.a.a.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

class e extends b {
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 4;
    private static final int p = 8;
    private static final int q = 16;
    private static final int r = 32;
    private static final int s = 64;
    private static final int t = 128;
    private static final int u = 256;
    private static final int v = 512;
    private static final int w = 511;
    ArrayList<b> a = new ArrayList();
    private final com.a.c.a.a b;
    private final WeakReference<View> c;
    private long d;
    private boolean e = false;
    private long f = 0;
    private boolean g = false;
    private Interpolator h;
    private boolean i = false;
    private com.a.a.a.a j = null;
    private a k = new a();
    private Runnable x = new Runnable(this) {
        final /* synthetic */ e a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.e();
        }
    };
    private HashMap<com.a.a.a, c> y = new HashMap();

    private class a implements com.a.a.a.a, com.a.a.q.b {
        final /* synthetic */ e a;

        private a(e eVar) {
            this.a = eVar;
        }

        public void a(com.a.a.a aVar) {
            if (this.a.j != null) {
                this.a.j.a(aVar);
            }
        }

        public void b(com.a.a.a aVar) {
            if (this.a.j != null) {
                this.a.j.b(aVar);
            }
            this.a.y.remove(aVar);
            if (this.a.y.isEmpty()) {
                this.a.j = null;
            }
        }

        public void c(com.a.a.a aVar) {
            if (this.a.j != null) {
                this.a.j.c(aVar);
            }
        }

        public void d(com.a.a.a aVar) {
            if (this.a.j != null) {
                this.a.j.d(aVar);
            }
        }

        public void onAnimationUpdate(q qVar) {
            float A = qVar.A();
            c cVar = (c) this.a.y.get(qVar);
            if ((cVar.a & e.w) != 0) {
                View view = (View) this.a.c.get();
                if (view != null) {
                    view.invalidate();
                }
            }
            ArrayList arrayList = cVar.b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    b bVar = (b) arrayList.get(i);
                    this.a.c(bVar.a, bVar.b + (bVar.c * A));
                }
            }
            View view2 = (View) this.a.c.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    private static class b {
        int a;
        float b;
        float c;

        b(int i, float f, float f2) {
            this.a = i;
            this.b = f;
            this.c = f2;
        }
    }

    private static class c {
        int a;
        ArrayList<b> b;

        c(int i, ArrayList<b> arrayList) {
            this.a = i;
            this.b = arrayList;
        }

        boolean a(int i) {
            if (!((this.a & i) == 0 || this.b == null)) {
                int size = this.b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((b) this.b.get(i2)).a == i) {
                        this.b.remove(i2);
                        this.a &= i ^ -1;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    e(View view) {
        this.c = new WeakReference(view);
        this.b = com.a.c.a.a.a(view);
    }

    private float a(int i) {
        switch (i) {
            case 1:
                return this.b.k();
            case 2:
                return this.b.l();
            case 4:
                return this.b.g();
            case 8:
                return this.b.h();
            case 16:
                return this.b.d();
            case 32:
                return this.b.e();
            case 64:
                return this.b.f();
            case 128:
                return this.b.m();
            case 256:
                return this.b.n();
            case 512:
                return this.b.a();
            default:
                return 0.0f;
        }
    }

    private void a(int i, float f) {
        float a = a(i);
        a(i, a, f - a);
    }

    private void a(int i, float f, float f2) {
        if (this.y.size() > 0) {
            for (com.a.a.a aVar : this.y.keySet()) {
                c cVar = (c) this.y.get(aVar);
                if (cVar.a(i) && cVar.a == 0) {
                    break;
                }
            }
            com.a.a.a aVar2 = null;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
        this.a.add(new b(i, f, f2));
        View view = (View) this.c.get();
        if (view != null) {
            view.removeCallbacks(this.x);
            view.post(this.x);
        }
    }

    private void b(int i, float f) {
        a(i, a(i), f);
    }

    private void c(int i, float f) {
        switch (i) {
            case 1:
                this.b.i(f);
                return;
            case 2:
                this.b.j(f);
                return;
            case 4:
                this.b.g(f);
                return;
            case 8:
                this.b.h(f);
                return;
            case 16:
                this.b.d(f);
                return;
            case 32:
                this.b.e(f);
                return;
            case 64:
                this.b.f(f);
                return;
            case 128:
                this.b.k(f);
                return;
            case 256:
                this.b.l(f);
                return;
            case 512:
                this.b.a(f);
                return;
            default:
                return;
        }
    }

    private void e() {
        q b = q.b(1.0f);
        ArrayList arrayList = (ArrayList) this.a.clone();
        this.a.clear();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i |= ((b) arrayList.get(i2)).a;
        }
        this.y.put(b, new c(i, arrayList));
        b.a(this.k);
        b.a(this.k);
        if (this.g) {
            b.a(this.f);
        }
        if (this.e) {
            b.d(this.d);
        }
        if (this.i) {
            b.a(this.h);
        }
        b.a();
    }

    public long a() {
        return this.e ? this.d : new q().e();
    }

    public b a(float f) {
        a(128, f);
        return this;
    }

    public b a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.e = true;
        this.d = j;
        return this;
    }

    public b a(Interpolator interpolator) {
        this.i = true;
        this.h = interpolator;
        return this;
    }

    public b a(com.a.a.a.a aVar) {
        this.j = aVar;
        return this;
    }

    public long b() {
        return this.g ? this.f : 0;
    }

    public b b(float f) {
        b(128, f);
        return this;
    }

    public b b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.g = true;
        this.f = j;
        return this;
    }

    public b c(float f) {
        a(256, f);
        return this;
    }

    public void c() {
        e();
    }

    public b d(float f) {
        b(256, f);
        return this;
    }

    public void d() {
        if (this.y.size() > 0) {
            for (com.a.a.a b : ((HashMap) this.y.clone()).keySet()) {
                b.b();
            }
        }
        this.a.clear();
        View view = (View) this.c.get();
        if (view != null) {
            view.removeCallbacks(this.x);
        }
    }

    public b e(float f) {
        a(16, f);
        return this;
    }

    public b f(float f) {
        b(16, f);
        return this;
    }

    public b g(float f) {
        a(32, f);
        return this;
    }

    public b h(float f) {
        b(32, f);
        return this;
    }

    public b i(float f) {
        a(64, f);
        return this;
    }

    public b j(float f) {
        b(64, f);
        return this;
    }

    public b k(float f) {
        a(1, f);
        return this;
    }

    public b l(float f) {
        b(1, f);
        return this;
    }

    public b m(float f) {
        a(2, f);
        return this;
    }

    public b n(float f) {
        b(2, f);
        return this;
    }

    public b o(float f) {
        a(4, f);
        return this;
    }

    public b p(float f) {
        b(4, f);
        return this;
    }

    public b q(float f) {
        a(8, f);
        return this;
    }

    public b r(float f) {
        b(8, f);
        return this;
    }

    public b s(float f) {
        a(512, f);
        return this;
    }

    public b t(float f) {
        b(512, f);
        return this;
    }
}
