package com.google.firebase.database;

import com.google.android.gms.g.f;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.lh;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.mh;
import com.google.android.gms.internal.mk;
import com.google.android.gms.internal.ml;
import com.google.android.gms.internal.mm;
import com.google.firebase.database.e.a;
import java.util.Map;

public class l {
    private im a;
    private ij b;

    l(im imVar, ij ijVar) {
        this.a = imVar;
        this.b = ijVar;
    }

    private f<Void> a(Object obj, lh lhVar, a aVar) {
        ml.a(this.b);
        iz.a(this.b, obj);
        Object a = mm.a(obj);
        ml.a(a);
        final lh a2 = li.a(a, lhVar);
        final mh a3 = mk.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ l c;

            public void run() {
                this.c.a.b(this.c.b, a2, (a) a3.b());
            }
        });
        return (f) a3.a();
    }

    private f<Void> b(final Map<String, Object> map, a aVar) {
        final Map a = ml.a(this.b, map);
        final mh a2 = mk.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ l d;

            public void run() {
                this.d.a.a(this.d.b, a, (a) a2.b(), map);
            }
        });
        return (f) a2.a();
    }

    private f<Void> c(a aVar) {
        final mh a = mk.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ l b;

            public void run() {
                this.b.a.a(this.b.b, (a) a.b());
            }
        });
        return (f) a.a();
    }

    public f<Void> a() {
        return a(null);
    }

    public f<Void> a(Object obj) {
        return a(obj, ll.a(), null);
    }

    public f<Void> a(Object obj, double d) {
        return a(obj, ll.a(Double.valueOf(d)), null);
    }

    public f<Void> a(Object obj, String str) {
        return a(obj, ll.a((Object) str), null);
    }

    public f<Void> a(Map<String, Object> map) {
        return b(map, null);
    }

    public void a(a aVar) {
        a(null, aVar);
    }

    public void a(Object obj, double d, a aVar) {
        a(obj, ll.a(Double.valueOf(d)), aVar);
    }

    public void a(Object obj, a aVar) {
        a(obj, ll.a(), aVar);
    }

    public void a(Object obj, String str, a aVar) {
        a(obj, ll.a((Object) str), aVar);
    }

    public void a(Object obj, Map map, a aVar) {
        a(obj, ll.a((Object) map), aVar);
    }

    public void a(Map<String, Object> map, a aVar) {
        b(map, aVar);
    }

    public f<Void> b() {
        return c(null);
    }

    public void b(a aVar) {
        c(aVar);
    }
}
