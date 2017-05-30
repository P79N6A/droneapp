package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.pv;
import com.google.android.gms.internal.pw;
import com.google.android.gms.internal.px;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qh;
import com.google.android.gms.internal.qi;
import com.google.android.gms.internal.qk;
import com.google.android.gms.internal.ql;
import com.google.android.gms.internal.qm;
import com.google.android.gms.internal.qp;
import com.google.android.gms.internal.qt;
import com.google.android.gms.internal.qu;
import com.google.android.gms.internal.rd;
import com.google.android.gms.internal.sw;
import java.util.ArrayList;
import java.util.Collection;

public class ContextFenceStub extends AwarenessFence {
    public static final Creator<ContextFenceStub> CREATOR = new g();
    private final int a;
    private qa b;
    private byte[] c;

    ContextFenceStub(int i, byte[] bArr) {
        this.a = i;
        this.b = null;
        this.c = bArr;
        f();
    }

    public ContextFenceStub(qa qaVar) {
        this.a = 1;
        this.b = (qa) d.a(qaVar);
        this.c = null;
        f();
    }

    public static ContextFenceStub a(ContextFenceStub contextFenceStub) {
        d.a(contextFenceStub);
        Collection arrayList = new ArrayList();
        arrayList.add(contextFenceStub);
        return new ContextFenceStub(a(3, e(arrayList), null, null, null, null, null, null, null, null, null, null, null));
    }

    public static ContextFenceStub a(a aVar) {
        d.a(aVar);
        return new ContextFenceStub(a(7, null, null, null, null, aVar.a(), null, null, null, null, null, null, null));
    }

    public static ContextFenceStub a(b bVar) {
        d.a(bVar);
        return new ContextFenceStub(a(11, null, null, null, null, null, null, null, null, bVar.c(), null, null, null));
    }

    public static ContextFenceStub a(d dVar) {
        d.a(dVar);
        return new ContextFenceStub(a(12, null, null, null, null, null, null, null, null, null, dVar.a(), null, null));
    }

    public static ContextFenceStub a(n nVar) {
        d.a(nVar);
        return new ContextFenceStub(a(5, null, null, nVar.a(), null, null, null, null, null, null, null, null, null));
    }

    public static ContextFenceStub a(p pVar) {
        d.a(pVar);
        return new ContextFenceStub(a(4, null, pVar.a(), null, null, null, null, null, null, null, null, null, null));
    }

    public static qa a(int i, qa[] qaVarArr, qt qtVar, qh qhVar, ql qlVar, pv pvVar, qp qpVar, qm qmVar, qk qkVar, pw pwVar, px pxVar, qi qiVar, qu quVar) {
        qa qaVar = new qa();
        qaVar.a = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                qaVar.b = qaVarArr;
                break;
            case 4:
                qaVar.c = qtVar;
                break;
            case 5:
                qaVar.d = qhVar;
                break;
            case 6:
                qaVar.e = qlVar;
                break;
            case 7:
                qaVar.f = pvVar;
                break;
            case 8:
                qaVar.g = qpVar;
                break;
            case 9:
                qaVar.h = qmVar;
                break;
            case 10:
                qaVar.i = qkVar;
                break;
            case 11:
                qaVar.j = pwVar;
                break;
            case 12:
                qaVar.k = pxVar;
                break;
            case 13:
                qaVar.l = qiVar;
                break;
            case 14:
                qaVar.n = quVar;
                break;
            default:
                sw.a("ContextFenceStub", "Unknown context fence type=%s", Integer.valueOf(i));
                break;
        }
        return qaVar;
    }

    public static ContextFenceStub c(Collection<ContextFenceStub> collection) {
        d.a(collection);
        d.b(!collection.isEmpty());
        return new ContextFenceStub(a(1, e(collection), null, null, null, null, null, null, null, null, null, null, null));
    }

    public static ContextFenceStub d(Collection<ContextFenceStub> collection) {
        d.a(collection);
        d.b(!collection.isEmpty());
        return new ContextFenceStub(a(2, e(collection), null, null, null, null, null, null, null, null, null, null, null));
    }

    private void d() {
        if (!e()) {
            try {
                this.b = qa.a(this.c);
                this.c = null;
            } catch (Throwable e) {
                sw.a("ContextFenceStub", "Could not deserialize context fence bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        f();
    }

    private boolean e() {
        return this.b != null;
    }

    private static qa[] e(Collection<ContextFenceStub> collection) {
        qa[] qaVarArr = new qa[collection.size()];
        int i = 0;
        for (ContextFenceStub c : collection) {
            int i2 = i + 1;
            qaVarArr[i] = c.c();
            i = i2;
        }
        return qaVarArr;
    }

    private void f() {
        if (this.b == null && this.c != null) {
            return;
        }
        if (this.b != null && this.c == null) {
            return;
        }
        if (this.b != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.b == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    int a() {
        return this.a;
    }

    public byte[] b() {
        return this.c != null ? this.c : rd.a(this.b);
    }

    public qa c() {
        d();
        return this.b;
    }

    public String toString() {
        d();
        return this.b.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
