package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.support.v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.amv;
import com.google.android.gms.internal.amw;
import com.google.android.gms.internal.amw.b;
import com.google.android.gms.internal.amw.c;
import com.google.android.gms.internal.amw.g;
import com.google.android.gms.internal.qw;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.mm.sdk.platformtools.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class aj {
    private static volatile aj a;
    private List<Long> A;
    private int B;
    private int C;
    private final Context b;
    private final p c;
    private final af d;
    private final ab e;
    private final ai f;
    private final g g;
    private final ah h;
    private final AppMeasurement i;
    private final com.google.firebase.a.a j;
    private final m k;
    private final q l;
    private final ac m;
    private final e n;
    private final e o;
    private final s p;
    private final d q;
    private final z r;
    private final ad s;
    private final j t;
    private final o u;
    private final boolean v;
    private boolean w;
    private Boolean x;
    private FileLock y;
    private FileChannel z;

    private class a implements b {
        amw.e a;
        List<Long> b;
        List<b> c;
        long d;
        final /* synthetic */ aj e;

        private a(aj ajVar) {
            this.e = ajVar;
        }

        private long a(b bVar) {
            return ((bVar.c.longValue() / 1000) / 60) / 60;
        }

        public void a(amw.e eVar) {
            d.a(eVar);
            this.a = eVar;
        }

        boolean a() {
            return this.c == null || this.c.isEmpty();
        }

        public boolean a(long j, b bVar) {
            d.a(bVar);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a((b) this.c.get(0)) != a(bVar)) {
                return false;
            }
            long g = this.d + ((long) bVar.g());
            if (g >= ((long) this.e.d().W())) {
                return false;
            }
            this.d = g;
            this.c.add(bVar);
            this.b.add(Long.valueOf(j));
            return this.c.size() < this.e.d().X();
        }
    }

    aj(c cVar) {
        d.a(cVar);
        this.b = cVar.a;
        this.n = cVar.m(this);
        this.c = cVar.a(this);
        af b = cVar.b(this);
        b.d();
        this.d = b;
        ab c = cVar.c(this);
        c.d();
        this.e = c;
        f().C().a("App measurement is starting up, version", Long.valueOf(d().M()));
        f().C().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        f().D().a("Debug-level message logging enabled");
        f().D().a("AppMeasurement singleton hash", Integer.valueOf(System.identityHashCode(this)));
        this.k = cVar.j(this);
        s o = cVar.o(this);
        o.d();
        this.p = o;
        z p = cVar.p(this);
        p.d();
        this.r = p;
        String f = p.f();
        if (o().m(f)) {
            f().C().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop firebase.analytics.debug-mode .none.");
        } else {
            com.google.android.gms.measurement.internal.ab.a C = f().C();
            String str = "To enable faster debug mode event logging run:\n  adb shell setprop firebase.analytics.debug-mode ";
            f = String.valueOf(f);
            C.a(f.length() != 0 ? str.concat(f) : new String(str));
        }
        q k = cVar.k(this);
        k.d();
        this.l = k;
        o s = cVar.s(this);
        s.d();
        this.u = s;
        ac l = cVar.l(this);
        l.d();
        this.m = l;
        e n = cVar.n(this);
        n.d();
        this.o = n;
        d i = cVar.i(this);
        i.d();
        this.q = i;
        j r = cVar.r(this);
        r.d();
        this.t = r;
        this.s = cVar.q(this);
        this.i = cVar.h(this);
        this.j = cVar.g(this);
        g e = cVar.e(this);
        e.d();
        this.g = e;
        ah f2 = cVar.f(this);
        f2.d();
        this.h = f2;
        ai d = cVar.d(this);
        d.d();
        this.f = d;
        if (this.B != this.C) {
            f().f().a("Not all components initialized", Integer.valueOf(this.B), Integer.valueOf(this.C));
        }
        this.v = true;
        if (!(this.c.N() || D())) {
            if (!(this.b.getApplicationContext() instanceof Application)) {
                f().z().a("Application context is not an Application");
            } else if (VERSION.SDK_INT >= 14) {
                l().f();
            } else {
                f().D().a("Not tracking deep linking pre-ICS");
            }
        }
        this.f.a(new Runnable(this) {
            final /* synthetic */ aj a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.c();
            }
        });
    }

    @WorkerThread
    private boolean M() {
        z();
        return this.A != null;
    }

    private boolean N() {
        z();
        a();
        return p().I() || !TextUtils.isEmpty(p().C());
    }

    @WorkerThread
    private void O() {
        z();
        a();
        if (!L()) {
            return;
        }
        if (b() && N()) {
            long P = P();
            if (P == 0) {
                w().b();
                x().f();
                return;
            } else if (q().f()) {
                long a = e().e.a();
                long aa = d().aa();
                if (!o().a(a, aa)) {
                    P = Math.max(P, a + aa);
                }
                w().b();
                P -= s().a();
                if (P <= 0) {
                    P = d().ad();
                }
                f().E().a("Upload scheduled in approximately ms", Long.valueOf(P));
                x().a(P);
                return;
            } else {
                w().a();
                x().f();
                return;
            }
        }
        w().b();
        x().f();
    }

    private long P() {
        long a = s().a();
        long ag = d().ag();
        Object obj = (p().J() || p().D()) ? 1 : null;
        long ac = obj != null ? d().ac() : d().ab();
        long a2 = e().c.a();
        long a3 = e().d.a();
        long max = Math.max(p().G(), p().H());
        if (max == 0) {
            return 0;
        }
        max = a - Math.abs(max - a);
        a3 = a - Math.abs(a3 - a);
        a2 = Math.max(a - Math.abs(a2 - a), a3);
        a = max + ag;
        if (obj != null && a2 > 0) {
            a = Math.min(max, a2) + ac;
        }
        if (!o().a(a2, ac)) {
            a = a2 + ac;
        }
        if (a3 == 0 || a3 < max) {
            return a;
        }
        for (int i = 0; i < d().ai(); i++) {
            a += ((long) (1 << i)) * d().ah();
            if (a > a3) {
                return a;
            }
        }
        return 0;
    }

    public static aj a(Context context) {
        d.a(context);
        d.a(context.getApplicationContext());
        if (a == null) {
            synchronized (aj.class) {
                if (a == null) {
                    a = new c(context).a();
                }
            }
        }
        return a;
    }

    @WorkerThread
    private void a(int i, Throwable th, byte[] bArr) {
        int i2 = 0;
        z();
        a();
        if (bArr == null) {
            bArr = new byte[0];
        }
        List<Long> list = this.A;
        this.A = null;
        if ((i == 200 || i == 204) && th == null) {
            e().c.a(s().a());
            e().d.a(0);
            O();
            f().E().a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
            p().f();
            try {
                for (Long longValue : list) {
                    p().a(longValue.longValue());
                }
                p().g();
                if (q().f() && N()) {
                    I();
                } else {
                    O();
                }
            } finally {
                p().z();
            }
        } else {
            f().E().a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            e().d.a(s().a());
            if (i == it.a.a.e.d || i == 429) {
                i2 = 1;
            }
            if (i2 != 0) {
                e().e.a(s().a());
            }
            O();
        }
    }

    private void a(al alVar) {
        if (alVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private void a(List<Long> list) {
        d.b(!list.isEmpty());
        if (this.A != null) {
            f().f().a("Set uploading progress before finishing the previous upload");
        } else {
            this.A = new ArrayList(list);
        }
    }

    private boolean a(t tVar) {
        if (tVar.f == null) {
            return false;
        }
        Iterator it = tVar.f.iterator();
        while (it.hasNext()) {
            if ("_r".equals((String) it.next())) {
                return true;
            }
        }
        return j().c(tVar.a, tVar.b) && p().a(F(), tVar.a, false, false, false, false, false).e < ((long) d().c(tVar.a));
    }

    private boolean a(String str, long j) {
        p().f();
        try {
            aj ajVar = this;
            a aVar = new a();
            p().a(str, j, (b) aVar);
            if (aVar.a()) {
                p().g();
                p().z();
                return false;
            }
            int i;
            boolean z = false;
            amw.e eVar = aVar.a;
            eVar.b = new b[aVar.c.size()];
            int i2 = 0;
            int i3 = 0;
            while (i3 < aVar.c.size()) {
                boolean z2;
                if (j().b(aVar.a.o, ((b) aVar.c.get(i3)).b)) {
                    f().z().a("Dropping blacklisted raw event", ((b) aVar.c.get(i3)).b);
                    o().a(11, "_ev", ((b) aVar.c.get(i3)).b, 0);
                    i = i2;
                    z2 = z;
                } else {
                    int i4;
                    boolean z3;
                    if (j().c(aVar.a.o, ((b) aVar.c.get(i3)).b)) {
                        c[] cVarArr;
                        c cVar;
                        b bVar;
                        Object obj = null;
                        Object obj2 = null;
                        if (((b) aVar.c.get(i3)).a == null) {
                            ((b) aVar.c.get(i3)).a = new c[0];
                        }
                        c[] cVarArr2 = ((b) aVar.c.get(i3)).a;
                        int length = cVarArr2.length;
                        int i5 = 0;
                        while (i5 < length) {
                            Object obj3;
                            c cVar2 = cVarArr2[i5];
                            if ("_c".equals(cVar2.a)) {
                                cVar2.c = Long.valueOf(1);
                                obj = 1;
                                obj3 = obj2;
                            } else if ("_r".equals(cVar2.a)) {
                                cVar2.c = Long.valueOf(1);
                                obj3 = 1;
                            } else {
                                obj3 = obj2;
                            }
                            i5++;
                            obj2 = obj3;
                        }
                        if (obj == null) {
                            f().E().a("Marking event as conversion", ((b) aVar.c.get(i3)).b);
                            cVarArr = (c[]) Arrays.copyOf(((b) aVar.c.get(i3)).a, ((b) aVar.c.get(i3)).a.length + 1);
                            cVar = new c();
                            cVar.a = "_c";
                            cVar.c = Long.valueOf(1);
                            cVarArr[cVarArr.length - 1] = cVar;
                            ((b) aVar.c.get(i3)).a = cVarArr;
                        }
                        if (obj2 == null) {
                            f().E().a("Marking event as real-time", ((b) aVar.c.get(i3)).b);
                            cVarArr = (c[]) Arrays.copyOf(((b) aVar.c.get(i3)).a, ((b) aVar.c.get(i3)).a.length + 1);
                            cVar = new c();
                            cVar.a = "_r";
                            cVar.c = Long.valueOf(1);
                            cVarArr[cVarArr.length - 1] = cVar;
                            ((b) aVar.c.get(i3)).a = cVarArr;
                        }
                        boolean a = m.a(((b) aVar.c.get(i3)).b);
                        if (p().a(F(), aVar.a.o, false, false, false, false, true).e > ((long) d().c(aVar.a.o))) {
                            bVar = (b) aVar.c.get(i3);
                            i4 = 0;
                            while (i4 < bVar.a.length) {
                                if ("_r".equals(bVar.a[i4].a)) {
                                    obj2 = new c[(bVar.a.length - 1)];
                                    if (i4 > 0) {
                                        System.arraycopy(bVar.a, 0, obj2, 0, i4);
                                    }
                                    if (i4 < obj2.length) {
                                        System.arraycopy(bVar.a, i4 + 1, obj2, i4, obj2.length - i4);
                                    }
                                    bVar.a = obj2;
                                } else {
                                    i4++;
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (a && p().a(F(), aVar.a.o, false, false, true, false, false).c > ((long) d().b(aVar.a.o))) {
                            f().z().a("Too many conversions. Not logging as conversion.");
                            bVar = (b) aVar.c.get(i3);
                            Object obj4 = null;
                            c cVar3 = null;
                            c[] cVarArr3 = bVar.a;
                            int length2 = cVarArr3.length;
                            int i6 = 0;
                            while (i6 < length2) {
                                cVar = cVarArr3[i6];
                                if ("_c".equals(cVar.a)) {
                                    obj2 = obj4;
                                } else if ("_err".equals(cVar.a)) {
                                    c cVar4 = cVar3;
                                    int i7 = 1;
                                    cVar = cVar4;
                                } else {
                                    cVar = cVar3;
                                    obj2 = obj4;
                                }
                                i6++;
                                obj4 = obj2;
                                cVar3 = cVar;
                            }
                            if (obj4 != null && cVar3 != null) {
                                cVarArr3 = new c[(bVar.a.length - 1)];
                                i5 = 0;
                                c[] cVarArr4 = bVar.a;
                                int length3 = cVarArr4.length;
                                i6 = 0;
                                while (i6 < length3) {
                                    c cVar5 = cVarArr4[i6];
                                    if (cVar5 != cVar3) {
                                        i4 = i5 + 1;
                                        cVarArr3[i5] = cVar5;
                                    } else {
                                        i4 = i5;
                                    }
                                    i6++;
                                    i5 = i4;
                                }
                                bVar.a = cVarArr3;
                                z3 = z;
                                i4 = i2 + 1;
                                eVar.b[i2] = (b) aVar.c.get(i3);
                                i = i4;
                                z2 = z3;
                            } else if (cVar3 != null) {
                                cVar3.a = "_err";
                                cVar3.c = Long.valueOf(10);
                                z3 = z;
                                i4 = i2 + 1;
                                eVar.b[i2] = (b) aVar.c.get(i3);
                                i = i4;
                                z2 = z3;
                            } else {
                                f().f().a("Did not find conversion parameter. Error not tracked");
                            }
                        }
                    }
                    z3 = z;
                    i4 = i2 + 1;
                    eVar.b[i2] = (b) aVar.c.get(i3);
                    i = i4;
                    z2 = z3;
                }
                i3++;
                i2 = i;
                z = z2;
            }
            if (i2 < aVar.c.size()) {
                eVar.b = (b[]) Arrays.copyOf(eVar.b, i2);
            }
            eVar.A = a(aVar.a.o, aVar.a.c, eVar.b);
            eVar.e = eVar.b[0].c;
            eVar.f = eVar.b[0].c;
            for (i = 1; i < eVar.b.length; i++) {
                b bVar2 = eVar.b[i];
                if (bVar2.c.longValue() < eVar.e.longValue()) {
                    eVar.e = bVar2.c;
                }
                if (bVar2.c.longValue() > eVar.f.longValue()) {
                    eVar.f = bVar2.c;
                }
            }
            String str2 = aVar.a.o;
            a b = p().b(str2);
            if (b == null) {
                f().f().a("Bundling raw events w/o app info");
            } else {
                long h = b.h();
                eVar.h = h != 0 ? Long.valueOf(h) : null;
                long g = b.g();
                if (g != 0) {
                    h = g;
                }
                eVar.g = h != 0 ? Long.valueOf(h) : null;
                b.r();
                eVar.w = Integer.valueOf((int) b.o());
                b.a(eVar.e.longValue());
                b.b(eVar.f.longValue());
                p().a(b);
            }
            eVar.x = f().F();
            p().a(eVar, z);
            p().a(aVar.b);
            p().i(str2);
            p().g();
            return true;
        } finally {
            p().z();
        }
    }

    private com.google.android.gms.internal.amw.a[] a(String str, g[] gVarArr, b[] bVarArr) {
        d.a(str);
        return y().a(str, bVarArr, gVarArr);
    }

    private void b(b bVar) {
        if (bVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!bVar.a()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    @WorkerThread
    private void c(AppMetadata appMetadata) {
        Object obj = 1;
        z();
        a();
        d.a(appMetadata);
        d.a(appMetadata.b);
        a b = p().b(appMetadata.b);
        String b2 = e().b(appMetadata.b);
        Object obj2 = null;
        if (b == null) {
            a aVar = new a(this, appMetadata.b);
            aVar.a(e().f());
            aVar.c(b2);
            b = aVar;
            obj2 = 1;
        } else if (!b2.equals(b.e())) {
            b.c(b2);
            b.a(e().f());
            int i = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.c) || appMetadata.c.equals(b.d()))) {
            b.b(appMetadata.c);
            obj2 = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.l) || appMetadata.l.equals(b.f()))) {
            b.d(appMetadata.l);
            obj2 = 1;
        }
        if (!(appMetadata.f == 0 || appMetadata.f == b.l())) {
            b.d(appMetadata.f);
            obj2 = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.d) || appMetadata.d.equals(b.i()))) {
            b.e(appMetadata.d);
            obj2 = 1;
        }
        if (appMetadata.k != b.j()) {
            b.c(appMetadata.k);
            obj2 = 1;
        }
        if (!(TextUtils.isEmpty(appMetadata.e) || appMetadata.e.equals(b.k()))) {
            b.f(appMetadata.e);
            obj2 = 1;
        }
        if (appMetadata.g != b.m()) {
            b.e(appMetadata.g);
            obj2 = 1;
        }
        if (appMetadata.i != b.n()) {
            b.a(appMetadata.i);
        } else {
            obj = obj2;
        }
        if (obj != null) {
            p().a(b);
        }
    }

    FileChannel A() {
        return this.z;
    }

    @WorkerThread
    void B() {
        z();
        a();
        if (L() && C()) {
            a(a(A()), v().A());
        }
    }

    @WorkerThread
    boolean C() {
        z();
        try {
            this.z = new RandomAccessFile(new File(r().getFilesDir(), this.l.B()), "rw").getChannel();
            this.y = this.z.tryLock();
            if (this.y != null) {
                f().E().a("Storage concurrent access okay");
                return true;
            }
            f().f().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            f().f().a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            f().f().a("Failed to access storage lock file", e2);
        }
    }

    public boolean D() {
        return false;
    }

    @WorkerThread
    public boolean E() {
        boolean z = false;
        z();
        a();
        if (d().P()) {
            return false;
        }
        Boolean Q = d().Q();
        if (Q != null) {
            z = Q.booleanValue();
        } else if (!d().R()) {
            z = true;
        }
        return e().c(z);
    }

    long F() {
        return ((((s().a() + e().z()) / 1000) / 60) / 60) / 24;
    }

    void G() {
        if (d().N()) {
            throw new IllegalStateException("Unexpected call on package side");
        }
    }

    void H() {
        if (!d().N()) {
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    @WorkerThread
    public void I() {
        Map map = null;
        int i = 0;
        z();
        a();
        if (!d().N()) {
            Boolean B = e().B();
            if (B == null) {
                f().z().a("Upload data called on the client side before use of service was decided");
                return;
            } else if (B.booleanValue()) {
                f().f().a("Upload called in the client side when service should be used");
                return;
            }
        }
        if (M()) {
            f().z().a("Uploading requested multiple times");
        } else if (q().f()) {
            long a = s().a();
            a(a - d().Z());
            long a2 = e().c.a();
            if (a2 != 0) {
                f().D().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a - a2)));
            }
            String C = p().C();
            if (TextUtils.isEmpty(C)) {
                String b = p().b(a - d().Z());
                if (!TextUtils.isEmpty(b)) {
                    a b2 = p().b(b);
                    if (b2 != null) {
                        String a3 = d().a(b2.d(), b2.c());
                        try {
                            URL url = new URL(a3);
                            f().E().a("Fetching remote configuration", b2.b());
                            amv.b a4 = j().a(b2.b());
                            CharSequence b3 = j().b(b2.b());
                            if (!(a4 == null || TextUtils.isEmpty(b3))) {
                                map = new ArrayMap();
                                map.put(org.a.a.e.C, b3);
                            }
                            q().a(b, url, map, new a(this) {
                                final /* synthetic */ aj a;

                                {
                                    this.a = r1;
                                }

                                public void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                                    this.a.a(str, i, th, bArr, map);
                                }
                            });
                            return;
                        } catch (MalformedURLException e) {
                            f().f().a("Failed to parse config URL. Not fetching", a3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            List<Pair> a5 = p().a(C, d().h(C), d().i(C));
            if (!a5.isEmpty()) {
                amw.e eVar;
                Object obj;
                List subList;
                for (Pair pair : a5) {
                    eVar = (amw.e) pair.first;
                    if (!TextUtils.isEmpty(eVar.s)) {
                        obj = eVar.s;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    for (int i2 = 0; i2 < a5.size(); i2++) {
                        eVar = (amw.e) ((Pair) a5.get(i2)).first;
                        if (!TextUtils.isEmpty(eVar.s) && !eVar.s.equals(obj)) {
                            subList = a5.subList(0, i2);
                            break;
                        }
                    }
                }
                subList = a5;
                amw.d dVar = new amw.d();
                dVar.a = new amw.e[subList.size()];
                List arrayList = new ArrayList(subList.size());
                while (i < dVar.a.length) {
                    dVar.a[i] = (amw.e) ((Pair) subList.get(i)).first;
                    arrayList.add((Long) ((Pair) subList.get(i)).second);
                    dVar.a[i].r = Long.valueOf(d().M());
                    dVar.a[i].d = Long.valueOf(a);
                    dVar.a[i].z = Boolean.valueOf(d().N());
                    i++;
                }
                Object b4 = f().a(2) ? m.b(dVar) : null;
                byte[] a6 = o().a(dVar);
                String Y = d().Y();
                try {
                    URL url2 = new URL(Y);
                    a(arrayList);
                    e().d.a(a);
                    Object obj2 = "?";
                    if (dVar.a.length > 0) {
                        obj2 = dVar.a[0].o;
                    }
                    f().E().a("Uploading data. app, uncompressed size, data", obj2, Integer.valueOf(a6.length), b4);
                    q().a(C, url2, a6, null, new a(this) {
                        final /* synthetic */ aj a;

                        {
                            this.a = r1;
                        }

                        public void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                            this.a.a(i, th, bArr);
                        }
                    });
                } catch (MalformedURLException e2) {
                    f().f().a("Failed to parse upload URL. Not uploading", Y);
                }
            }
        } else {
            f().z().a("Network not connected, ignoring upload request");
            O();
        }
    }

    void J() {
        this.C++;
    }

    @WorkerThread
    void K() {
        z();
        a();
        if (!this.w) {
            f().C().a("This instance being marked as an uploader");
            B();
        }
        this.w = true;
    }

    @WorkerThread
    boolean L() {
        z();
        a();
        return this.w || D();
    }

    @WorkerThread
    int a(FileChannel fileChannel) {
        int i = 0;
        z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().f().a("Bad chanel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    f().z().a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
            } catch (IOException e) {
                f().f().a("Failed to read from channel", e);
            }
        }
        return i;
    }

    void a() {
        if (!this.v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    void a(AppMetadata appMetadata) {
        z();
        a();
        d.a(appMetadata.b);
        c(appMetadata);
    }

    @WorkerThread
    void a(AppMetadata appMetadata, long j) {
        a b = p().b(appMetadata.b);
        if (!(b == null || b.d() == null || b.d().equals(appMetadata.c))) {
            f().z().a("New GMP App Id passed in. Removing cached database data.");
            p().g(b.b());
            b = null;
        }
        if (b != null && b.i() != null && !b.i().equals(appMetadata.d)) {
            Bundle bundle = new Bundle();
            bundle.putString("_pv", b.i());
            a(new EventParcel("_au", new EventParams(bundle), "auto", j), appMetadata);
        }
    }

    @WorkerThread
    void a(EventParcel eventParcel, AppMetadata appMetadata) {
        long nanoTime = System.nanoTime();
        z();
        a();
        String str = appMetadata.b;
        d.a(str);
        if (!TextUtils.isEmpty(appMetadata.c)) {
            if (!appMetadata.i) {
                c(appMetadata);
            } else if (j().b(str, eventParcel.b)) {
                f().z().a("Dropping blacklisted event", eventParcel.b);
                o().a(11, "_ev", eventParcel.b, 0);
            } else {
                if (f().a(2)) {
                    f().E().a("Logging event", eventParcel);
                }
                p().f();
                try {
                    Bundle b = eventParcel.c.b();
                    c(appMetadata);
                    if ("_iap".equals(eventParcel.b) || com.google.firebase.a.a.a.g.equals(eventParcel.b)) {
                        long round;
                        Object string = b.getString(com.google.firebase.a.a.b.f);
                        if (com.google.firebase.a.a.a.g.equals(eventParcel.b)) {
                            double d = b.getDouble("value") * 1000000.0d;
                            if (d == 0.0d) {
                                d = ((double) b.getLong("value")) * 1000000.0d;
                            }
                            if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
                                f().z().a("Data lost. Currency value is too big", Double.valueOf(d));
                                p().g();
                                p().z();
                                return;
                            }
                            round = Math.round(d);
                        } else {
                            round = b.getLong("value");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            String toUpperCase = string.toUpperCase(Locale.US);
                            if (toUpperCase.matches("[A-Z]{3}")) {
                                l lVar;
                                String valueOf = String.valueOf("_ltv_");
                                toUpperCase = String.valueOf(toUpperCase);
                                String concat = toUpperCase.length() != 0 ? valueOf.concat(toUpperCase) : new String(valueOf);
                                l c = p().c(str, concat);
                                if (c == null || !(c.d instanceof Long)) {
                                    p().a(str, d().e(str) - 1);
                                    lVar = new l(str, concat, s().a(), Long.valueOf(round));
                                } else {
                                    lVar = new l(str, concat, s().a(), Long.valueOf(round + ((Long) c.d).longValue()));
                                }
                                if (!p().a(lVar)) {
                                    f().f().a("Too many unique user properties are set. Ignoring user property.", lVar.b, lVar.d);
                                    o().a(9, null, null, 0);
                                }
                            }
                        }
                    }
                    boolean a = m.a(eventParcel.b);
                    boolean equals = "_err".equals(eventParcel.b);
                    com.google.android.gms.measurement.internal.q.a a2 = p().a(F(), str, true, a, false, equals, false);
                    long C = a2.b - d().C();
                    if (C > 0) {
                        if (C % 1000 == 1) {
                            f().f().a("Data loss. Too many events logged. count", Long.valueOf(a2.b));
                        }
                        o().a(16, "_ev", eventParcel.b, 0);
                        p().g();
                        return;
                    }
                    u a3;
                    if (a) {
                        C = a2.a - d().D();
                        if (C > 0) {
                            if (C % 1000 == 1) {
                                f().f().a("Data loss. Too many public events logged. count", Long.valueOf(a2.a));
                            }
                            o().a(16, "_ev", eventParcel.b, 0);
                            p().g();
                            p().z();
                            return;
                        }
                    }
                    if (equals) {
                        C = a2.d - ((long) d().a(appMetadata.b));
                        if (C > 0) {
                            if (C == 1) {
                                f().f().a("Too many error events logged. count", Long.valueOf(a2.d));
                            }
                            p().g();
                            p().z();
                            return;
                        }
                    }
                    o().a(b, "_o", eventParcel.d);
                    if (o().m(str)) {
                        o().a(b, "_dbg", Long.valueOf(1));
                        o().a(b, "_r", Long.valueOf(1));
                    }
                    long c2 = p().c(str);
                    if (c2 > 0) {
                        f().z().a("Data lost. Too many events stored on disk, deleted", Long.valueOf(c2));
                    }
                    t tVar = new t(this, eventParcel.d, str, eventParcel.b, eventParcel.e, 0, b);
                    u a4 = p().a(str, tVar.b);
                    if (a4 != null) {
                        tVar = tVar.a(this, a4.e);
                        a3 = a4.a(tVar.d);
                    } else if (p().j(str) >= ((long) d().B())) {
                        f().f().a("Too many event names used, ignoring event. name, supported count", tVar.b, Integer.valueOf(d().B()));
                        o().a(8, null, null, 0);
                        p().z();
                        return;
                    } else {
                        a3 = new u(str, tVar.b, 0, 0, tVar.d);
                    }
                    p().a(a3);
                    a(tVar, appMetadata);
                    p().g();
                    if (f().a(2)) {
                        f().E().a("Event recorded", tVar);
                    }
                    p().z();
                    O();
                    f().E().a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                } finally {
                    p().z();
                }
            }
        }
    }

    @WorkerThread
    void a(EventParcel eventParcel, String str) {
        a b = p().b(str);
        if (b == null || TextUtils.isEmpty(b.i())) {
            f().D().a("No app data available; dropping event", str);
            return;
        }
        try {
            String str2 = r().getPackageManager().getPackageInfo(str, 0).versionName;
            if (!(b.i() == null || b.i().equals(str2))) {
                f().z().a("App version does not match; dropping event", str);
                return;
            }
        } catch (NameNotFoundException e) {
            if (!"_ui".equals(eventParcel.b)) {
                f().z().a("Could not find package", str);
            }
        }
        EventParcel eventParcel2 = eventParcel;
        a(eventParcel2, new AppMetadata(str, b.d(), b.i(), b.j(), b.k(), b.l(), b.m(), null, b.n(), false, b.f()));
    }

    @WorkerThread
    void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        int i = 0;
        z();
        a();
        if (!TextUtils.isEmpty(appMetadata.c)) {
            if (appMetadata.i) {
                int e = o().e(userAttributeParcel.b);
                String a;
                if (e != 0) {
                    a = o().a(userAttributeParcel.b, d().d(), true);
                    if (userAttributeParcel.b != null) {
                        i = userAttributeParcel.b.length();
                    }
                    o().a(e, "_ev", a, i);
                    return;
                }
                e = o().c(userAttributeParcel.b, userAttributeParcel.a());
                if (e != 0) {
                    a = o().a(userAttributeParcel.b, d().d(), true);
                    Object a2 = userAttributeParcel.a();
                    if (a2 != null && ((a2 instanceof String) || (a2 instanceof CharSequence))) {
                        i = String.valueOf(a2).length();
                    }
                    o().a(e, "_ev", a, i);
                    return;
                }
                Object d = o().d(userAttributeParcel.b, userAttributeParcel.a());
                if (d != null) {
                    l lVar = new l(appMetadata.b, userAttributeParcel.b, userAttributeParcel.c, d);
                    f().D().a("Setting user property", lVar.b, d);
                    p().f();
                    try {
                        c(appMetadata);
                        boolean a3 = p().a(lVar);
                        p().g();
                        if (a3) {
                            f().D().a("User property set", lVar.b, lVar.d);
                        } else {
                            f().f().a("Too many unique user properties are set. Ignoring user property.", lVar.b, lVar.d);
                            o().a(9, null, null, 0);
                        }
                        p().z();
                        return;
                    } catch (Throwable th) {
                        p().z();
                    }
                } else {
                    return;
                }
            }
            c(appMetadata);
        }
    }

    void a(b bVar) {
        this.B++;
    }

    void a(t tVar, AppMetadata appMetadata) {
        z();
        a();
        d.a(tVar);
        d.a(appMetadata);
        d.a(tVar.a);
        d.b(tVar.a.equals(appMetadata.b));
        amw.e eVar = new amw.e();
        eVar.a = Integer.valueOf(1);
        eVar.i = SystemMediaRouteProvider.PACKAGE_NAME;
        eVar.o = appMetadata.b;
        eVar.n = appMetadata.e;
        eVar.p = appMetadata.d;
        eVar.C = Integer.valueOf((int) appMetadata.k);
        eVar.q = Long.valueOf(appMetadata.f);
        eVar.y = appMetadata.c;
        eVar.v = appMetadata.g == 0 ? null : Long.valueOf(appMetadata.g);
        Pair a = e().a(appMetadata.b);
        if (a != null && !TextUtils.isEmpty((CharSequence) a.first)) {
            eVar.s = (String) a.first;
            eVar.t = (Boolean) a.second;
        } else if (!u().a(this.b)) {
            String string = Secure.getString(this.b.getContentResolver(), "android_id");
            if (string == null) {
                f().z().a("null secure ID");
                string = "null";
            } else if (string.isEmpty()) {
                f().z().a("empty secure ID");
            }
            eVar.F = string;
        }
        eVar.k = u().f();
        eVar.j = u().g();
        eVar.m = Integer.valueOf((int) u().z());
        eVar.l = u().A();
        eVar.r = null;
        eVar.d = null;
        eVar.e = null;
        eVar.f = null;
        a b = p().b(appMetadata.b);
        if (b == null) {
            b = new a(this, appMetadata.b);
            b.a(e().f());
            b.d(appMetadata.l);
            b.b(appMetadata.c);
            b.c(e().b(appMetadata.b));
            b.f(0);
            b.a(0);
            b.b(0);
            b.e(appMetadata.d);
            b.c(appMetadata.k);
            b.f(appMetadata.e);
            b.d(appMetadata.f);
            b.e(appMetadata.g);
            b.a(appMetadata.i);
            p().a(b);
        }
        eVar.u = b.c();
        eVar.B = b.f();
        List a2 = p().a(appMetadata.b);
        eVar.c = new g[a2.size()];
        for (int i = 0; i < a2.size(); i++) {
            g gVar = new g();
            eVar.c[i] = gVar;
            gVar.b = ((l) a2.get(i)).b;
            gVar.a = Long.valueOf(((l) a2.get(i)).c);
            o().a(gVar, ((l) a2.get(i)).d);
        }
        try {
            p().a(tVar, p().a(eVar), a(tVar));
        } catch (IOException e) {
            f().f().a("Data loss. Failed to insert raw event metadata", e);
        }
    }

    @WorkerThread
    void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        int i2 = 0;
        z();
        a();
        d.a(str);
        if (bArr == null) {
            bArr = new byte[0];
        }
        p().f();
        try {
            a b = p().b(str);
            int i3 = ((i == 200 || i == 204 || i == 304) && th == null) ? 1 : 0;
            if (b == null) {
                f().z().a("App does not exist in onConfigFetched", str);
            } else if (i3 != 0 || i == com.google.android.gms.wallet.e.j) {
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
                if (i == com.google.android.gms.wallet.e.j || i == 304) {
                    if (j().a(str) == null && !j().a(str, null, null)) {
                        p().z();
                        return;
                    }
                } else if (!j().a(str, bArr, str2)) {
                    p().z();
                    return;
                }
                b.g(s().a());
                p().a(b);
                if (i == com.google.android.gms.wallet.e.j) {
                    f().z().a("Config not found. Using empty config");
                } else {
                    f().E().a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (q().f() && N()) {
                    I();
                } else {
                    O();
                }
            } else {
                b.h(s().a());
                p().a(b);
                f().E().a("Fetching config failed. code, error", Integer.valueOf(i), th);
                j().c(str);
                e().d.a(s().a());
                if (i == it.a.a.e.d || i == 429) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    e().e.a(s().a());
                }
                O();
            }
            p().g();
        } finally {
            p().z();
        }
    }

    public void a(boolean z) {
        O();
    }

    @WorkerThread
    boolean a(int i, int i2) {
        z();
        if (i > i2) {
            f().f().a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return false;
        }
        if (i < i2) {
            if (a(i2, A())) {
                f().E().a("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                f().f().a("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                return false;
            }
        }
        return true;
    }

    @WorkerThread
    boolean a(int i, FileChannel fileChannel) {
        z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().f().a("Bad chanel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            f().f().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e) {
            f().f().a("Failed to write to channel", e);
            return false;
        }
    }

    boolean a(long j) {
        return a(null, j);
    }

    @WorkerThread
    public void b(AppMetadata appMetadata) {
        z();
        a();
        d.a(appMetadata);
        d.a(appMetadata.b);
        if (!TextUtils.isEmpty(appMetadata.c)) {
            if (appMetadata.i) {
                long a = s().a();
                p().f();
                try {
                    a(appMetadata, a);
                    c(appMetadata);
                    if (p().a(appMetadata.b, "_f") == null) {
                        a(new UserAttributeParcel("_fot", a, Long.valueOf((1 + (a / Util.MILLSECONDS_OF_HOUR)) * Util.MILLSECONDS_OF_HOUR), "auto"), appMetadata);
                        b(appMetadata, a);
                        c(appMetadata, a);
                    } else if (appMetadata.j) {
                        d(appMetadata, a);
                    }
                    p().g();
                } finally {
                    p().z();
                }
            } else {
                c(appMetadata);
            }
        }
    }

    @WorkerThread
    void b(AppMetadata appMetadata, long j) {
        z();
        a();
        Bundle bundle = new Bundle();
        bundle.putLong("_c", 1);
        bundle.putLong("_r", 1);
        bundle.putLong("_uwa", 0);
        bundle.putLong("_pfo", 0);
        bundle.putLong("_sys", 0);
        bundle.putLong("_sysu", 0);
        PackageManager packageManager = r().getPackageManager();
        if (packageManager == null) {
            f().f().a("PackageManager is null, first open report might be inaccurate");
        } else {
            PackageInfo packageInfo;
            ApplicationInfo applicationInfo;
            try {
                packageInfo = packageManager.getPackageInfo(appMetadata.b, 0);
            } catch (NameNotFoundException e) {
                f().f().a("Package info is null, first open report might be inaccurate", e);
                packageInfo = null;
            }
            if (!(packageInfo == null || packageInfo.firstInstallTime == 0 || packageInfo.firstInstallTime == packageInfo.lastUpdateTime)) {
                bundle.putLong("_uwa", 1);
            }
            try {
                applicationInfo = packageManager.getApplicationInfo(appMetadata.b, 0);
            } catch (NameNotFoundException e2) {
                f().f().a("Application info is null, first open report might be inaccurate", e2);
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                if ((applicationInfo.flags & 1) != 0) {
                    bundle.putLong("_sys", 1);
                }
                if ((applicationInfo.flags & 128) != 0) {
                    bundle.putLong("_sysu", 1);
                }
            }
        }
        long h = p().h(appMetadata.b);
        if (h != 0) {
            bundle.putLong("_pfo", h);
        }
        a(new EventParcel("_f", new EventParams(bundle), "auto", j), appMetadata);
    }

    @WorkerThread
    void b(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        z();
        a();
        if (!TextUtils.isEmpty(appMetadata.c)) {
            if (appMetadata.i) {
                f().D().a("Removing user property", userAttributeParcel.b);
                p().f();
                try {
                    c(appMetadata);
                    p().b(appMetadata.b, userAttributeParcel.b);
                    p().g();
                    f().D().a("User property removed", userAttributeParcel.b);
                } finally {
                    p().z();
                }
            } else {
                c(appMetadata);
            }
        }
    }

    @WorkerThread
    protected boolean b() {
        boolean z = true;
        a();
        z();
        if (this.x == null) {
            if (d().N()) {
                this.x = Boolean.valueOf(true);
                return true;
            }
            if (!(o().k("android.permission.INTERNET") && o().k("android.permission.ACCESS_NETWORK_STATE") && ag.a(r(), false) && f.a(r(), false))) {
                z = false;
            }
            this.x = Boolean.valueOf(z);
            if (this.x.booleanValue()) {
                this.x = Boolean.valueOf(o().h(v().g()));
            }
        }
        return this.x.booleanValue();
    }

    @WorkerThread
    public byte[] b(@NonNull EventParcel eventParcel, @Size(min = 1) String str) {
        a();
        z();
        H();
        d.a(eventParcel);
        d.a(str);
        amw.d dVar = new amw.d();
        p().f();
        try {
            a b = p().b(str);
            byte[] bArr;
            if (b == null) {
                f().D().a("Log and bundle not available. package_name", str);
                bArr = new byte[0];
                return bArr;
            } else if (b.n()) {
                long j;
                amw.e eVar = new amw.e();
                dVar.a = new amw.e[]{eVar};
                eVar.a = Integer.valueOf(1);
                eVar.i = SystemMediaRouteProvider.PACKAGE_NAME;
                eVar.o = b.b();
                eVar.n = b.k();
                eVar.p = b.i();
                eVar.C = Integer.valueOf((int) b.j());
                eVar.q = Long.valueOf(b.l());
                eVar.y = b.d();
                eVar.v = Long.valueOf(b.m());
                Pair a = e().a(b.b());
                if (!(a == null || TextUtils.isEmpty((CharSequence) a.first))) {
                    eVar.s = (String) a.first;
                    eVar.t = (Boolean) a.second;
                }
                eVar.k = u().f();
                eVar.j = u().g();
                eVar.m = Integer.valueOf((int) u().z());
                eVar.l = u().A();
                eVar.u = b.c();
                eVar.B = b.f();
                List a2 = p().a(b.b());
                eVar.c = new g[a2.size()];
                for (int i = 0; i < a2.size(); i++) {
                    g gVar = new g();
                    eVar.c[i] = gVar;
                    gVar.b = ((l) a2.get(i)).b;
                    gVar.a = Long.valueOf(((l) a2.get(i)).c);
                    o().a(gVar, ((l) a2.get(i)).d);
                }
                Bundle b2 = eventParcel.c.b();
                if ("_iap".equals(eventParcel.b)) {
                    b2.putLong("_c", 1);
                    f().D().a("Marking in-app purchase as real-time");
                    b2.putLong("_r", 1);
                }
                b2.putString("_o", eventParcel.d);
                if (o().m(eVar.o)) {
                    o().a(b2, "_dbg", Long.valueOf(1));
                    o().a(b2, "_r", Long.valueOf(1));
                }
                u a3 = p().a(str, eventParcel.b);
                if (a3 == null) {
                    p().a(new u(str, eventParcel.b, 1, 0, eventParcel.e));
                    j = 0;
                } else {
                    j = a3.e;
                    p().a(a3.a(eventParcel.e).a());
                }
                t tVar = new t(this, eventParcel.d, str, eventParcel.b, eventParcel.e, j, b2);
                b bVar = new b();
                eVar.b = new b[]{bVar};
                bVar.c = Long.valueOf(tVar.d);
                bVar.b = tVar.b;
                bVar.d = Long.valueOf(tVar.e);
                bVar.a = new c[tVar.f.a()];
                Iterator it = tVar.f.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    c cVar = new c();
                    int i3 = i2 + 1;
                    bVar.a[i2] = cVar;
                    cVar.a = str2;
                    o().a(cVar, tVar.f.a(str2));
                    i2 = i3;
                }
                eVar.A = a(b.b(), eVar.c, eVar.b);
                eVar.e = bVar.c;
                eVar.f = bVar.c;
                long h = b.h();
                eVar.h = h != 0 ? Long.valueOf(h) : null;
                long g = b.g();
                if (g != 0) {
                    h = g;
                }
                eVar.g = h != 0 ? Long.valueOf(h) : null;
                b.r();
                eVar.w = Integer.valueOf((int) b.o());
                eVar.r = Long.valueOf(d().M());
                eVar.d = Long.valueOf(s().a());
                eVar.z = Boolean.TRUE;
                b.a(eVar.e.longValue());
                b.b(eVar.f.longValue());
                p().a(b);
                p().g();
                p().z();
                try {
                    bArr = new byte[dVar.g()];
                    qw a4 = qw.a(bArr);
                    dVar.a(a4);
                    a4.b();
                    return o().a(bArr);
                } catch (IOException e) {
                    f().f().a("Data loss. Failed to bundle and serialize", e);
                    return null;
                }
            } else {
                f().D().a("Log and bundle disabled. package_name", str);
                bArr = new byte[0];
                p().z();
                return bArr;
            }
        } finally {
            p().z();
        }
    }

    @WorkerThread
    protected void c() {
        z();
        if (!D() || (this.f.a() && !this.f.b())) {
            p().E();
            if (e().c.a() == 0) {
                e().c.a(s().a());
            }
            if (b()) {
                if (!(d().N() || TextUtils.isEmpty(v().g()))) {
                    String A = e().A();
                    if (A == null) {
                        e().c(v().g());
                    } else if (!A.equals(v().g())) {
                        f().C().a("Rechecking which service to use due to a GMP App Id change");
                        e().C();
                        this.o.C();
                        this.o.A();
                        e().c(v().g());
                    }
                }
                if (!(d().N() || D() || TextUtils.isEmpty(v().g()))) {
                    l().g();
                }
            } else if (E()) {
                if (!o().k("android.permission.INTERNET")) {
                    f().f().a("App is missing INTERNET permission");
                }
                if (!o().k("android.permission.ACCESS_NETWORK_STATE")) {
                    f().f().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!d().N()) {
                    if (!ag.a(r(), false)) {
                        f().f().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!f.a(r(), false)) {
                        f().f().a("AppMeasurementService not registered/enabled");
                    }
                }
                if (!D()) {
                    f().f().a("Uploading is not possible. App measurement disabled");
                }
            }
            O();
            return;
        }
        f().f().a("Scheduler shutting down before Scion.start() called");
    }

    @WorkerThread
    void c(AppMetadata appMetadata, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("_et", 1);
        a(new EventParcel("_e", new EventParams(bundle), "auto", j), appMetadata);
    }

    public p d() {
        return this.c;
    }

    @WorkerThread
    void d(AppMetadata appMetadata, long j) {
        a(new EventParcel("_cd", new EventParams(new Bundle()), "auto", j), appMetadata);
    }

    public af e() {
        a(this.d);
        return this.d;
    }

    public ab f() {
        b(this.e);
        return this.e;
    }

    public ab g() {
        return (this.e == null || !this.e.a()) ? null : this.e;
    }

    public ai h() {
        b(this.f);
        return this.f;
    }

    public g i() {
        b(this.g);
        return this.g;
    }

    public ah j() {
        b(this.h);
        return this.h;
    }

    ai k() {
        return this.f;
    }

    public d l() {
        b(this.q);
        return this.q;
    }

    public AppMeasurement m() {
        return this.i;
    }

    public com.google.firebase.a.a n() {
        return this.j;
    }

    public m o() {
        a(this.k);
        return this.k;
    }

    public q p() {
        b(this.l);
        return this.l;
    }

    public ac q() {
        b(this.m);
        return this.m;
    }

    public Context r() {
        return this.b;
    }

    public e s() {
        return this.n;
    }

    public e t() {
        b(this.o);
        return this.o;
    }

    public s u() {
        b(this.p);
        return this.p;
    }

    public z v() {
        b(this.r);
        return this.r;
    }

    public ad w() {
        if (this.s != null) {
            return this.s;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public j x() {
        b(this.t);
        return this.t;
    }

    public o y() {
        b(this.u);
        return this.u;
    }

    @WorkerThread
    public void z() {
        h().j();
    }
}
