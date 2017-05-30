package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.amv.a;
import com.google.android.gms.internal.amv.b;
import com.google.android.gms.internal.amv.c;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;
import com.google.android.gms.measurement.AppMeasurement$a;
import java.io.IOException;
import java.util.Map;

public class ah extends b {
    private final Map<String, Map<String, String>> a = new ArrayMap();
    private final Map<String, Map<String, Boolean>> b = new ArrayMap();
    private final Map<String, Map<String, Boolean>> c = new ArrayMap();
    private final Map<String, b> d = new ArrayMap();
    private final Map<String, String> e = new ArrayMap();

    ah(aj ajVar) {
        super(ajVar);
    }

    @WorkerThread
    private b a(String str, byte[] bArr) {
        if (bArr == null) {
            return new b();
        }
        qv a = qv.a(bArr);
        b bVar = new b();
        try {
            b bVar2 = (b) bVar.b(a);
            w().E().a("Parsed config. version, gmp_app_id", bVar.a, bVar.b);
            return bVar;
        } catch (IOException e) {
            w().z().a("Unable to merge remote config", str, e);
            return null;
        }
    }

    private Map<String, String> a(b bVar) {
        Map<String, String> arrayMap = new ArrayMap();
        if (!(bVar == null || bVar.d == null)) {
            for (c cVar : bVar.d) {
                if (cVar != null) {
                    arrayMap.put(cVar.a, cVar.b);
                }
            }
        }
        return arrayMap;
    }

    private void a(String str, b bVar) {
        Map arrayMap = new ArrayMap();
        Map arrayMap2 = new ArrayMap();
        if (!(bVar == null || bVar.e == null)) {
            for (a aVar : bVar.e) {
                if (aVar != null) {
                    String str2 = (String) AppMeasurement$a.a.get(aVar.a);
                    if (str2 != null) {
                        aVar.a = str2;
                    }
                    arrayMap.put(aVar.a, aVar.b);
                    arrayMap2.put(aVar.a, aVar.c);
                }
            }
        }
        this.b.put(str, arrayMap);
        this.c.put(str, arrayMap2);
    }

    @WorkerThread
    private void d(String str) {
        c();
        j();
        d.a(str);
        if (!this.d.containsKey(str)) {
            byte[] d = r().d(str);
            if (d == null) {
                this.a.put(str, null);
                this.b.put(str, null);
                this.c.put(str, null);
                this.d.put(str, null);
                this.e.put(str, null);
                return;
            }
            b a = a(str, d);
            this.a.put(str, a(a));
            a(str, a);
            this.d.put(str, a);
            this.e.put(str, null);
        }
    }

    @WorkerThread
    protected b a(String str) {
        c();
        j();
        d.a(str);
        d(str);
        return (b) this.d.get(str);
    }

    @WorkerThread
    String a(String str, String str2) {
        j();
        d(str);
        Map map = (Map) this.a.get(str);
        return map != null ? (String) map.get(str2) : null;
    }

    @WorkerThread
    protected boolean a(String str, byte[] bArr, String str2) {
        c();
        j();
        d.a(str);
        b a = a(str, bArr);
        if (a == null) {
            return false;
        }
        a(str, a);
        this.d.put(str, a);
        this.e.put(str, str2);
        this.a.put(str, a(a));
        k().a(str, a.f);
        try {
            a.f = null;
            byte[] bArr2 = new byte[a.g()];
            a.a(qw.a(bArr2));
            bArr = bArr2;
        } catch (IOException e) {
            w().z().a("Unable to serialize reduced-size config.  Storing full config instead.", e);
        }
        r().a(str, bArr);
        return true;
    }

    @WorkerThread
    protected String b(String str) {
        j();
        return (String) this.e.get(str);
    }

    @WorkerThread
    boolean b(String str, String str2) {
        j();
        d(str);
        Map map = (Map) this.b.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    @WorkerThread
    protected void c(String str) {
        j();
        this.e.put(str, null);
    }

    @WorkerThread
    boolean c(String str, String str2) {
        j();
        d(str);
        Map map = (Map) this.c.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        return bool == null ? false : bool.booleanValue();
    }

    protected void e() {
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }
}
