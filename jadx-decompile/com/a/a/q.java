package com.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class q extends a {
    private static long I = p;
    static final int b = 0;
    static final int c = 1;
    static final int d = 0;
    static final int e = 1;
    static final int f = 2;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = -1;
    private static final long p = 10;
    private static ThreadLocal<a> q = new ThreadLocal();
    private static final ThreadLocal<ArrayList<q>> r = new ThreadLocal<ArrayList<q>>() {
        protected ArrayList<q> a() {
            return new ArrayList();
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };
    private static final ThreadLocal<ArrayList<q>> s = new ThreadLocal<ArrayList<q>>() {
        protected ArrayList<q> a() {
            return new ArrayList();
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };
    private static final ThreadLocal<ArrayList<q>> t = new ThreadLocal<ArrayList<q>>() {
        protected ArrayList<q> a() {
            return new ArrayList();
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };
    private static final ThreadLocal<ArrayList<q>> u = new ThreadLocal<ArrayList<q>>() {
        protected ArrayList<q> a() {
            return new ArrayList();
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };
    private static final ThreadLocal<ArrayList<q>> v = new ThreadLocal<ArrayList<q>>() {
        protected ArrayList<q> a() {
            return new ArrayList();
        }

        protected /* synthetic */ Object initialValue() {
            return a();
        }
    };
    private static final Interpolator w = new AccelerateDecelerateInterpolator();
    private static final p x = new h();
    private static final p y = new f();
    private int A = 0;
    private float B = 0.0f;
    private boolean C = false;
    private long D;
    private boolean E = false;
    private boolean F = false;
    private long G = 300;
    private long H = 0;
    private int J = 0;
    private int K = 1;
    private Interpolator L = w;
    private ArrayList<b> M = null;
    long g;
    long h = -1;
    int i = 0;
    boolean j = false;
    n[] k;
    HashMap<String, n> l;
    private boolean z = false;

    private static class a extends Handler {
        private a() {
        }

        public void handleMessage(Message message) {
            ArrayList arrayList;
            Object obj;
            ArrayList arrayList2;
            int size;
            int i;
            q qVar;
            ArrayList arrayList3 = (ArrayList) q.r.get();
            ArrayList arrayList4 = (ArrayList) q.t.get();
            switch (message.what) {
                case 0:
                    arrayList = (ArrayList) q.s.get();
                    if (arrayList3.size() > 0 || arrayList4.size() > 0) {
                        obj = null;
                    } else {
                        int i2 = 1;
                    }
                    while (arrayList.size() > 0) {
                        arrayList2 = (ArrayList) arrayList.clone();
                        arrayList.clear();
                        size = arrayList2.size();
                        for (i = 0; i < size; i++) {
                            qVar = (q) arrayList2.get(i);
                            if (qVar.H == 0) {
                                qVar.o();
                            } else {
                                arrayList4.add(qVar);
                            }
                        }
                    }
                    break;
                case 1:
                    obj = 1;
                    break;
                default:
                    return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            arrayList = (ArrayList) q.v.get();
            arrayList2 = (ArrayList) q.u.get();
            size = arrayList4.size();
            for (i = 0; i < size; i++) {
                qVar = (q) arrayList4.get(i);
                if (qVar.g(currentAnimationTimeMillis)) {
                    arrayList.add(qVar);
                }
            }
            size = arrayList.size();
            if (size > 0) {
                for (i = 0; i < size; i++) {
                    qVar = (q) arrayList.get(i);
                    qVar.o();
                    qVar.E = true;
                    arrayList4.remove(qVar);
                }
                arrayList.clear();
            }
            i = arrayList3.size();
            int i3 = 0;
            while (i3 < i) {
                int i4;
                q qVar2 = (q) arrayList3.get(i3);
                if (qVar2.c(currentAnimationTimeMillis)) {
                    arrayList2.add(qVar2);
                }
                if (arrayList3.size() == i) {
                    i4 = i3 + 1;
                    i3 = i;
                } else {
                    i--;
                    arrayList2.remove(qVar2);
                    i4 = i3;
                    i3 = i;
                }
                i = i3;
                i3 = i4;
            }
            if (arrayList2.size() > 0) {
                for (i3 = 0; i3 < arrayList2.size(); i3++) {
                    ((q) arrayList2.get(i3)).m();
                }
                arrayList2.clear();
            }
            if (obj == null) {
                return;
            }
            if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0, q.I - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    public interface b {
        void onAnimationUpdate(q qVar);
    }

    public static int B() {
        return ((ArrayList) r.get()).size();
    }

    public static void C() {
        ((ArrayList) r.get()).clear();
        ((ArrayList) s.get()).clear();
        ((ArrayList) t.get()).clear();
    }

    public static q a(p pVar, Object... objArr) {
        q qVar = new q();
        qVar.a(objArr);
        qVar.a(pVar);
        return qVar;
    }

    public static q a(n... nVarArr) {
        q qVar = new q();
        qVar.b(nVarArr);
        return qVar;
    }

    private void a(boolean z) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.z = z;
        this.A = 0;
        this.i = 0;
        this.F = true;
        this.C = false;
        ((ArrayList) s.get()).add(this);
        if (this.H == 0) {
            e(s());
            this.i = 0;
            this.E = true;
            if (this.a != null) {
                ArrayList arrayList = (ArrayList) this.a.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((com.a.a.a.a) arrayList.get(i)).a(this);
                }
            }
        }
        a aVar = (a) q.get();
        if (aVar == null) {
            aVar = new a();
            q.set(aVar);
        }
        aVar.sendEmptyMessage(0);
    }

    public static q b(float... fArr) {
        q qVar = new q();
        qVar.a(fArr);
        return qVar;
    }

    public static q b(int... iArr) {
        q qVar = new q();
        qVar.a(iArr);
        return qVar;
    }

    public static void f(long j) {
        I = j;
    }

    private boolean g(long j) {
        if (this.C) {
            long j2 = j - this.D;
            if (j2 > this.H) {
                this.g = j - (j2 - this.H);
                this.i = 1;
                return true;
            }
        }
        this.C = true;
        this.D = j;
        return false;
    }

    private void m() {
        ((ArrayList) r.get()).remove(this);
        ((ArrayList) s.get()).remove(this);
        ((ArrayList) t.get()).remove(this);
        this.i = 0;
        if (this.E && this.a != null) {
            ArrayList arrayList = (ArrayList) this.a.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((com.a.a.a.a) arrayList.get(i)).b(this);
            }
        }
        this.E = false;
        this.F = false;
    }

    private void o() {
        n();
        ((ArrayList) r.get()).add(this);
        if (this.H > 0 && this.a != null) {
            ArrayList arrayList = (ArrayList) this.a.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((com.a.a.a.a) arrayList.get(i)).a(this);
            }
        }
    }

    public static long t() {
        return I;
    }

    public float A() {
        return this.B;
    }

    public void a() {
        a(false);
    }

    void a(float f) {
        int i;
        float interpolation = this.L.getInterpolation(f);
        this.B = interpolation;
        for (n a : this.k) {
            a.a(interpolation);
        }
        if (this.M != null) {
            int size = this.M.size();
            for (i = 0; i < size; i++) {
                ((b) this.M.get(i)).onAnimationUpdate(this);
            }
        }
    }

    public void a(int i) {
        this.J = i;
    }

    public void a(long j) {
        this.H = j;
    }

    public void a(Interpolator interpolator) {
        if (interpolator != null) {
            this.L = interpolator;
        } else {
            this.L = new LinearInterpolator();
        }
    }

    public void a(p pVar) {
        if (pVar != null && this.k != null && this.k.length > 0) {
            this.k[0].a(pVar);
        }
    }

    public void a(b bVar) {
        if (this.M == null) {
            this.M = new ArrayList();
        }
        this.M.add(bVar);
    }

    public void a(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            if (this.k == null || this.k.length == 0) {
                b(n.a("", fArr));
            } else {
                this.k[0].a(fArr);
            }
            this.j = false;
        }
    }

    public void a(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            if (this.k == null || this.k.length == 0) {
                b(n.a("", iArr));
            } else {
                this.k[0].a(iArr);
            }
            this.j = false;
        }
    }

    public void a(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            if (this.k == null || this.k.length == 0) {
                b(n.a("", (p) null, objArr));
            } else {
                this.k[0].a(objArr);
            }
            this.j = false;
        }
    }

    public /* synthetic */ a b(long j) {
        return d(j);
    }

    public Object b(String str) {
        n nVar = (n) this.l.get(str);
        return nVar != null ? nVar.d() : null;
    }

    public void b() {
        if (this.i != 0 || ((ArrayList) s.get()).contains(this) || ((ArrayList) t.get()).contains(this)) {
            if (this.E && this.a != null) {
                Iterator it = ((ArrayList) this.a.clone()).iterator();
                while (it.hasNext()) {
                    ((com.a.a.a.a) it.next()).c(this);
                }
            }
            m();
        }
    }

    public void b(int i) {
        this.K = i;
    }

    public void b(b bVar) {
        if (this.M != null) {
            this.M.remove(bVar);
            if (this.M.size() == 0) {
                this.M = null;
            }
        }
    }

    public void b(n... nVarArr) {
        this.k = nVarArr;
        this.l = new HashMap(r2);
        for (n nVar : nVarArr) {
            this.l.put(nVar.c(), nVar);
        }
        this.j = false;
    }

    public void c() {
        if (!((ArrayList) r.get()).contains(this) && !((ArrayList) s.get()).contains(this)) {
            this.C = false;
            o();
        } else if (!this.j) {
            n();
        }
        if (this.J <= 0 || (this.J & 1) != 1) {
            a(1.0f);
        } else {
            a(0.0f);
        }
        m();
    }

    boolean c(long j) {
        boolean z = false;
        if (this.i == 0) {
            this.i = 1;
            if (this.h < 0) {
                this.g = j;
            } else {
                this.g = j - this.h;
                this.h = -1;
            }
        }
        switch (this.i) {
            case 1:
            case 2:
                float f;
                float f2 = this.G > 0 ? ((float) (j - this.g)) / ((float) this.G) : 1.0f;
                if (f2 < 1.0f) {
                    f = f2;
                } else if (this.A < this.J || this.J == -1) {
                    if (this.a != null) {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            ((com.a.a.a.a) this.a.get(i)).d(this);
                        }
                    }
                    if (this.K == 2) {
                        this.z = !this.z;
                    }
                    this.A += (int) f2;
                    f = f2 % 1.0f;
                    this.g += this.G;
                } else {
                    f = Math.min(f2, 1.0f);
                    z = true;
                }
                if (this.z) {
                    f = 1.0f - f;
                }
                a(f);
                break;
        }
        return z;
    }

    public /* synthetic */ Object clone() {
        return q();
    }

    public long d() {
        return this.H;
    }

    public q d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.G = j;
        return this;
    }

    public long e() {
        return this.G;
    }

    public void e(long j) {
        n();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.i != 1) {
            this.h = j;
            this.i = 2;
        }
        this.g = currentAnimationTimeMillis - j;
        c(currentAnimationTimeMillis);
    }

    public boolean f() {
        return this.i == 1 || this.E;
    }

    public boolean g() {
        return this.F;
    }

    public /* synthetic */ a j() {
        return q();
    }

    void n() {
        if (!this.j) {
            for (n b : this.k) {
                b.b();
            }
            this.j = true;
        }
    }

    public q q() {
        int i = 0;
        q qVar = (q) super.j();
        if (this.M != null) {
            ArrayList arrayList = this.M;
            qVar.M = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                qVar.M.add(arrayList.get(i2));
            }
        }
        qVar.h = -1;
        qVar.z = false;
        qVar.A = 0;
        qVar.j = false;
        qVar.i = 0;
        qVar.C = false;
        n[] nVarArr = this.k;
        if (nVarArr != null) {
            int length = nVarArr.length;
            qVar.k = new n[length];
            qVar.l = new HashMap(length);
            while (i < length) {
                n a = nVarArr[i].a();
                qVar.k[i] = a;
                qVar.l.put(a.c(), a);
                i++;
            }
        }
        return qVar;
    }

    public n[] r() {
        return this.k;
    }

    public long s() {
        return (!this.j || this.i == 0) ? 0 : AnimationUtils.currentAnimationTimeMillis() - this.g;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.k != null) {
            for (n nVar : this.k) {
                str = str + "\n    " + nVar.toString();
            }
        }
        return str;
    }

    public Object u() {
        return (this.k == null || this.k.length <= 0) ? null : this.k[0].d();
    }

    public int v() {
        return this.J;
    }

    public int w() {
        return this.K;
    }

    public void x() {
        if (this.M != null) {
            this.M.clear();
            this.M = null;
        }
    }

    public Interpolator y() {
        return this.L;
    }

    public void z() {
        this.z = !this.z;
        if (this.i == 1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.g = currentAnimationTimeMillis - (this.G - (currentAnimationTimeMillis - this.g));
            return;
        }
        a(true);
    }
}
