package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ns {
    private ot a = ot.a;
    private oh b = oh.DEFAULT;
    private nq c = no.IDENTITY;
    private final Map<Type, nt<?>> d = new HashMap();
    private final List<ok> e = new ArrayList();
    private final List<ok> f = new ArrayList();
    private int g = 2;
    private int h = 2;
    private boolean i = true;

    private void a(String str, int i, int i2, List<ok> list) {
        Object nlVar;
        if (str != null && !"".equals(str.trim())) {
            nlVar = new nl(str);
        } else if (i != 2 && i2 != 2) {
            nlVar = new nl(i, i2);
        } else {
            return;
        }
        list.add(oi.a(po.b(Date.class), nlVar));
        list.add(oi.a(po.b(Timestamp.class), nlVar));
        list.add(oi.a(po.b(java.sql.Date.class), nlVar));
    }

    public ns a() {
        this.i = false;
        return this;
    }

    public ns a(Type type, Object obj) {
        boolean z = (obj instanceof of) || (obj instanceof nw) || (obj instanceof nt) || (obj instanceof oj);
        op.a(z);
        if (obj instanceof nt) {
            this.d.put(type, (nt) obj);
        }
        if ((obj instanceof of) || (obj instanceof nw)) {
            this.e.add(oi.b(po.a(type), obj));
        }
        if (obj instanceof oj) {
            this.e.add(pn.a(po.a(type), (oj) obj));
        }
        return this;
    }

    public ns a(int... iArr) {
        this.a = this.a.a(iArr);
        return this;
    }

    public ns a(nm... nmVarArr) {
        for (nm a : nmVarArr) {
            this.a = this.a.a(a, true, true);
        }
        return this;
    }

    public nr b() {
        List arrayList = new ArrayList();
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        arrayList.addAll(this.f);
        a(null, this.g, this.h, arrayList);
        return new nr(this.a, this.c, this.d, false, false, false, this.i, false, false, this.b, arrayList);
    }
}
