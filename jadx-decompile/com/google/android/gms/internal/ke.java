package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ke {
    private final ig a;
    private final ks b;

    public ke(ic icVar) {
        this.a = icVar.l();
        this.b = icVar.a("EventRaiser");
    }

    public void a(List<? extends kc> list) {
        if (this.b.a()) {
            this.b.a("Raising " + list.size() + " event(s)", new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.a.a(new Runnable(this) {
            final /* synthetic */ ke b;

            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kc kcVar = (kc) it.next();
                    if (this.b.b.a()) {
                        ks a = this.b.b;
                        String str = "Raising ";
                        String valueOf = String.valueOf(kcVar.toString());
                        a.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                    }
                    kcVar.b();
                }
            }
        });
    }
}
