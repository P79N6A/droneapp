package com.a.c;

import android.view.View;
import android.view.animation.Interpolator;
import com.a.a.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

class c extends b {
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 4;
    private static final int o = 8;
    private static final int p = 16;
    private static final int q = 32;
    private static final int r = 64;
    private static final int s = 128;
    private static final int t = 256;
    private static final int u = 512;
    private static final int v = 511;
    ArrayList<b> a = new ArrayList();
    private final WeakReference<View> b;
    private long c;
    private boolean d = false;
    private long e = 0;
    private boolean f = false;
    private Interpolator g;
    private boolean h = false;
    private com.a.a.a.a i = null;
    private a j = new a();
    private Runnable w = new Runnable(this) {
        final /* synthetic */ c a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.e();
        }
    };
    private HashMap<com.a.a.a, c> x = new HashMap();

    private class a implements com.a.a.a.a, com.a.a.q.b {
        final /* synthetic */ c a;

        private a(c cVar) {
            this.a = cVar;
        }

        public void a(com.a.a.a aVar) {
            if (this.a.i != null) {
                this.a.i.a(aVar);
            }
        }

        public void b(com.a.a.a aVar) {
            if (this.a.i != null) {
                this.a.i.b(aVar);
            }
            this.a.x.remove(aVar);
            if (this.a.x.isEmpty()) {
                this.a.i = null;
            }
        }

        public void c(com.a.a.a aVar) {
            if (this.a.i != null) {
                this.a.i.c(aVar);
            }
        }

        public void d(com.a.a.a aVar) {
            if (this.a.i != null) {
                this.a.i.d(aVar);
            }
        }

        public void onAnimationUpdate(q qVar) {
            float A = qVar.A();
            c cVar = (c) this.a.x.get(qVar);
            if ((cVar.a & c.v) != 0) {
                View view = (View) this.a.b.get();
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
            View view2 = (View) this.a.b.get();
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

    c(View view) {
        this.b = new WeakReference(view);
    }

    private float a(int i) {
        View view = (View) this.b.get();
        if (view != null) {
            switch (i) {
                case 1:
                    return view.getTranslationX();
                case 2:
                    return view.getTranslationY();
                case 4:
                    return view.getScaleX();
                case 8:
                    return view.getScaleY();
                case 16:
                    return view.getRotation();
                case 32:
                    return view.getRotationX();
                case 64:
                    return view.getRotationY();
                case 128:
                    return view.getX();
                case 256:
                    return view.getY();
                case 512:
                    return view.getAlpha();
            }
        }
        return 0.0f;
    }

    private void a(int i, float f) {
        float a = a(i);
        a(i, a, f - a);
    }

    private void a(int i, float f, float f2) {
        if (this.x.size() > 0) {
            for (com.a.a.a aVar : this.x.keySet()) {
                c cVar = (c) this.x.get(aVar);
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
        View view = (View) this.b.get();
        if (view != null) {
            view.removeCallbacks(this.w);
            view.post(this.w);
        }
    }

    private void b(int i, float f) {
        a(i, a(i), f);
    }

    private void c(int i, float f) {
        View view = (View) this.b.get();
        if (view != null) {
            switch (i) {
                case 1:
                    view.setTranslationX(f);
                    return;
                case 2:
                    view.setTranslationY(f);
                    return;
                case 4:
                    view.setScaleX(f);
                    return;
                case 8:
                    view.setScaleY(f);
                    return;
                case 16:
                    view.setRotation(f);
                    return;
                case 32:
                    view.setRotationX(f);
                    return;
                case 64:
                    view.setRotationY(f);
                    return;
                case 128:
                    view.setX(f);
                    return;
                case 256:
                    view.setY(f);
                    return;
                case 512:
                    view.setAlpha(f);
                    return;
                default:
                    return;
            }
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
        this.x.put(b, new c(i, arrayList));
        b.a(this.j);
        b.a(this.j);
        if (this.f) {
            b.a(this.e);
        }
        if (this.d) {
            b.d(this.c);
        }
        if (this.h) {
            b.a(this.g);
        }
        b.a();
    }

    public long a() {
        return this.d ? this.c : new q().e();
    }

    public b a(float f) {
        a(128, f);
        return this;
    }

    public b a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.d = true;
        this.c = j;
        return this;
    }

    public b a(Interpolator interpolator) {
        this.h = true;
        this.g = interpolator;
        return this;
    }

    public b a(com.a.a.a.a aVar) {
        this.i = aVar;
        return this;
    }

    public long b() {
        return this.f ? this.e : 0;
    }

    public b b(float f) {
        b(128, f);
        return this;
    }

    public b b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f = true;
        this.e = j;
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
        if (this.x.size() > 0) {
            for (com.a.a.a b : ((HashMap) this.x.clone()).keySet()) {
                b.b();
            }
        }
        this.a.clear();
        View view = (View) this.b.get();
        if (view != null) {
            view.removeCallbacks(this.w);
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
