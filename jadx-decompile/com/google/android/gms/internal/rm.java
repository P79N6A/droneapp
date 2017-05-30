package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.df.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class rm extends pr {
    static boolean n = false;
    protected static volatile rw q = null;
    protected static final Object r = new Object();
    private static final String s = rm.class.getSimpleName();
    private static long t = 0;
    protected boolean l = false;
    protected String m;
    protected boolean o = false;
    protected boolean p = false;

    protected rm(Context context, String str) {
        super(context);
        this.m = str;
        this.l = false;
    }

    protected rm(Context context, String str, boolean z) {
        super(context);
        this.m = str;
        this.l = z;
    }

    static rx a(rw rwVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Throwable e;
        Method a = rwVar.a(rr.H(), rr.I());
        if (a == null || motionEvent == null) {
            throw new rs();
        }
        try {
            return new rx((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new rs(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new rs(e);
        }
    }

    protected static synchronized void a(Context context, boolean z) {
        synchronized (rm.class) {
            if (!n) {
                t = Calendar.getInstance().getTime().getTime() / 1000;
                q = b(context, z);
                n = true;
            }
        }
    }

    private static void a(rw rwVar) {
        List singletonList = Collections.singletonList(Context.class);
        rwVar.a(rr.n(), rr.o(), singletonList);
        rwVar.a(rr.x(), rr.y(), singletonList);
        rwVar.a(rr.v(), rr.w(), singletonList);
        rwVar.a(rr.h(), rr.i(), singletonList);
        rwVar.a(rr.r(), rr.s(), singletonList);
        rwVar.a(rr.d(), rr.e(), singletonList);
        rwVar.a(rr.J(), rr.K(), singletonList);
        singletonList = Arrays.asList(new Class[]{MotionEvent.class, DisplayMetrics.class});
        rwVar.a(rr.H(), rr.I(), singletonList);
        rwVar.a(rr.F(), rr.G(), singletonList);
        rwVar.a(rr.l(), rr.m(), Collections.emptyList());
        rwVar.a(rr.D(), rr.E(), Collections.emptyList());
        rwVar.a(rr.t(), rr.u(), Collections.emptyList());
        rwVar.a(rr.j(), rr.k(), Collections.emptyList());
        rwVar.a(rr.p(), rr.q(), Collections.emptyList());
        rwVar.a(rr.B(), rr.C(), Collections.emptyList());
        rwVar.a(rr.f(), rr.g(), Arrays.asList(new Class[]{Context.class, Boolean.TYPE}));
        rwVar.a(rr.z(), rr.A(), Arrays.asList(new Class[]{StackTraceElement[].class}));
    }

    protected static rw b(Context context, boolean z) {
        if (q == null) {
            synchronized (r) {
                if (q == null) {
                    rw a = rw.a(context, rr.a(), rr.c(), z);
                    a(a);
                    q = a;
                }
            }
        }
        return q;
    }

    private void d(rw rwVar, a aVar) {
        rx a;
        a.a aVar2;
        int i = 0;
        try {
            a = a(rwVar, this.a, this.k);
            aVar.n = a.a;
            aVar.o = a.b;
            aVar.p = a.c;
            if (this.j) {
                aVar.D = a.d;
                aVar.E = a.e;
            }
            if (((Boolean) uf.bk.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
                aVar2 = new a.a();
                rx b = b(this.a);
                aVar2.a = b.a;
                aVar2.b = b.b;
                aVar2.h = b.c;
                if (this.j) {
                    aVar2.c = b.e;
                    aVar2.e = b.d;
                    aVar2.g = Integer.valueOf(b.f.longValue() != 0 ? 1 : 0);
                    if (this.d > 0) {
                        aVar2.d = this.k != null ? Long.valueOf(Math.round(((double) this.i) / ((double) this.d))) : null;
                        aVar2.f = Long.valueOf(Math.round(((double) this.h) / ((double) this.d)));
                    }
                    aVar2.j = b.i;
                    aVar2.i = b.j;
                    aVar2.k = Integer.valueOf(b.k.longValue() != 0 ? 1 : 0);
                    if (this.g > 0) {
                        aVar2.l = Long.valueOf(this.g);
                    }
                }
                aVar.W = aVar2;
            }
        } catch (rs e) {
        }
        if (this.c > 0) {
            aVar.I = Long.valueOf(this.c);
        }
        if (this.d > 0) {
            aVar.H = Long.valueOf(this.d);
        }
        if (this.e > 0) {
            aVar.G = Long.valueOf(this.e);
        }
        if (this.f > 0) {
            aVar.J = Long.valueOf(this.f);
        }
        try {
            int size = this.b.size() - 1;
            if (size > 0) {
                aVar.X = new a.a[size];
                while (i < size) {
                    a = a(rwVar, (MotionEvent) this.b.get(i), this.k);
                    aVar2 = new a.a();
                    aVar2.a = a.a;
                    aVar2.b = a.b;
                    aVar.X[i] = aVar2;
                    i++;
                }
            }
        } catch (rs e2) {
            aVar.X = null;
        }
    }

    protected long a(StackTraceElement[] stackTraceElementArr) {
        Throwable e;
        Method a = q.a(rr.z(), rr.A());
        if (a == null || stackTraceElementArr == null) {
            throw new rs();
        }
        try {
            return new rt((String) a.invoke(null, new Object[]{stackTraceElementArr})).a.longValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new rs(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new rs(e);
        }
    }

    protected a a(Context context, View view) {
        a aVar = new a();
        if (!TextUtils.isEmpty(this.m)) {
            aVar.b = this.m;
        }
        rw b = b(context, this.l);
        b.o();
        a(b, aVar, view);
        b.p();
        return aVar;
    }

    protected void a(rw rwVar, a aVar) {
        if (rwVar.c() != null) {
            a(b(rwVar, aVar));
        }
    }

    protected void a(rw rwVar, a aVar, View view) {
        d(rwVar, aVar);
        a(c(rwVar, aVar));
    }

    protected void a(List<Callable<Void>> list) {
        if (q != null) {
            ExecutorService c = q.c();
            if (c != null && !list.isEmpty()) {
                try {
                    c.invokeAll(list, ((Long) uf.ba.c()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    Log.d(s, String.format("class methods got exception: %s", new Object[]{ry.a(e)}));
                }
            }
        }
    }

    protected a b(Context context) {
        a aVar = new a();
        if (!TextUtils.isEmpty(this.m)) {
            aVar.b = this.m;
        }
        rw b = b(context, this.l);
        b.o();
        a(b, aVar);
        b.p();
        return aVar;
    }

    protected rx b(MotionEvent motionEvent) {
        Throwable e;
        Method a = q.a(rr.F(), rr.G());
        if (a == null || motionEvent == null) {
            throw new rs();
        }
        try {
            return new rx((String) a.invoke(null, new Object[]{motionEvent, this.k}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new rs(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new rs(e);
        }
    }

    protected List<Callable<Void>> b(rw rwVar, a aVar) {
        int q = rwVar.q();
        List arrayList = new ArrayList();
        String f = rr.f();
        String g = rr.g();
        boolean z = ((Boolean) uf.be.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue();
        arrayList.add(new sb(rwVar, f, g, aVar, q, 27, z));
        arrayList.add(new se(rwVar, rr.l(), rr.m(), aVar, t, q, 25));
        arrayList.add(new sj(rwVar, rr.t(), rr.u(), aVar, q, 1));
        arrayList.add(new sk(rwVar, rr.v(), rr.w(), aVar, q, 31));
        arrayList.add(new sn(rwVar, rr.D(), rr.E(), aVar, q, 33));
        arrayList.add(new sa(rwVar, rr.x(), rr.y(), aVar, q, 29));
        arrayList.add(new sc(rwVar, rr.h(), rr.i(), aVar, q, 5));
        arrayList.add(new si(rwVar, rr.r(), rr.s(), aVar, q, 12));
        arrayList.add(new rz(rwVar, rr.d(), rr.e(), aVar, q, 3));
        arrayList.add(new sd(rwVar, rr.j(), rr.k(), aVar, q, 44));
        arrayList.add(new sh(rwVar, rr.p(), rr.q(), aVar, q, 22));
        if (((Boolean) uf.bh.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
            arrayList.add(new so(rwVar, rr.J(), rr.K(), aVar, q, 48));
        }
        if (((Boolean) uf.bm.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
            arrayList.add(new sm(rwVar, rr.B(), rr.C(), aVar, q, 51));
        }
        return arrayList;
    }

    protected List<Callable<Void>> c(rw rwVar, a aVar) {
        ArrayList arrayList = new ArrayList();
        if (rwVar.c() == null) {
            return arrayList;
        }
        int q = rwVar.q();
        arrayList.add(new sg(rwVar, aVar));
        ArrayList arrayList2 = arrayList;
        arrayList2.add(new sj(rwVar, rr.t(), rr.u(), aVar, q, 1));
        arrayList2 = arrayList;
        arrayList2.add(new se(rwVar, rr.l(), rr.m(), aVar, t, q, 25));
        arrayList2 = arrayList;
        arrayList2.add(new sd(rwVar, rr.j(), rr.k(), aVar, q, 44));
        arrayList2 = arrayList;
        arrayList2.add(new rz(rwVar, rr.d(), rr.e(), aVar, q, 3));
        arrayList2 = arrayList;
        arrayList2.add(new sh(rwVar, rr.p(), rr.q(), aVar, q, 22));
        if (((Boolean) uf.bq.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new sc(rwVar, rr.h(), rr.i(), aVar, q, 5));
        }
        if (((Boolean) uf.bj.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new so(rwVar, rr.J(), rr.K(), aVar, q, 48));
        }
        if (((Boolean) uf.bo.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new sm(rwVar, rr.B(), rr.C(), aVar, q, 51));
        }
        if (((Boolean) uf.bt.c()).booleanValue() || ((Boolean) uf.bf.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new sl(rwVar, rr.z(), rr.A(), aVar, q, 45, new Throwable().getStackTrace()));
        }
        return arrayList;
    }
}
