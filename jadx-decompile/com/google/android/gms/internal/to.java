package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@aaa
public class to {
    private final Object a = new Object();
    private int b;
    private List<tn> c = new LinkedList();

    @Nullable
    public tn a() {
        tn tnVar = null;
        synchronized (this.a) {
            if (this.c.size() == 0) {
                b.a("Queue empty");
                return null;
            } else if (this.c.size() >= 2) {
                int i = Integer.MIN_VALUE;
                for (tn tnVar2 : this.c) {
                    tn tnVar3;
                    int i2;
                    int h = tnVar2.h();
                    if (h > i) {
                        int i3 = h;
                        tnVar3 = tnVar2;
                        i2 = i3;
                    } else {
                        i2 = i;
                        tnVar3 = tnVar;
                    }
                    i = i2;
                    tnVar = tnVar3;
                }
                this.c.remove(tnVar);
                return tnVar;
            } else {
                tnVar2 = (tn) this.c.get(0);
                tnVar2.d();
                return tnVar2;
            }
        }
    }

    public boolean a(tn tnVar) {
        boolean z;
        synchronized (this.a) {
            if (this.c.contains(tnVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean b(tn tnVar) {
        boolean z;
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                tn tnVar2 = (tn) it.next();
                if (tnVar != tnVar2 && tnVar2.b().equals(tnVar.b())) {
                    it.remove();
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public void c(tn tnVar) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                b.a("Queue is full, current size = " + this.c.size());
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            tnVar.a(i);
            this.c.add(tnVar);
        }
    }
}
