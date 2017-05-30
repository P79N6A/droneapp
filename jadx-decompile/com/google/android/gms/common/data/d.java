package com.google.android.gms.common.data;

import com.google.android.gms.common.data.c.a;
import java.util.HashSet;
import java.util.Iterator;

public final class d implements c, a {
    private HashSet<c> a = new HashSet();

    public void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }

    public void a(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, i2);
        }
    }

    public void a(int i, int i2, int i3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, i2, i3);
        }
    }

    public void a(c cVar) {
        this.a.add(cVar);
    }

    public void b(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(i, i2);
        }
    }

    public void b(c cVar) {
        this.a.remove(cVar);
    }

    public boolean b() {
        return !this.a.isEmpty();
    }

    public void c() {
        this.a.clear();
    }

    public void c(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(i, i2);
        }
    }
}
