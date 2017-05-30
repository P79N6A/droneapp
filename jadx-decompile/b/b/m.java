package b.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class m {
    protected List<k> a = new ArrayList();
    protected List<k> b = new ArrayList();
    protected List<l> c = new ArrayList();
    protected int d = 0;
    private boolean e = false;

    private synchronized List<l> i() {
        List<l> arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.c);
        return arrayList;
    }

    public synchronized int a() {
        return this.b.size();
    }

    public void a(i iVar) {
        for (l a : i()) {
            a.a(iVar);
        }
    }

    public synchronized void a(i iVar, b bVar) {
        this.a.add(new k(iVar, bVar));
        for (l a : i()) {
            a.a(iVar, bVar);
        }
    }

    public void a(i iVar, h hVar) {
        try {
            hVar.a();
        } catch (b e) {
            a(iVar, e);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable th) {
            a(iVar, th);
        }
    }

    public synchronized void a(i iVar, Throwable th) {
        this.b.add(new k(iVar, th));
        for (l a : i()) {
            a.a(iVar, th);
        }
    }

    protected void a(final j jVar) {
        b((i) jVar);
        a((i) jVar, new h(this) {
            final /* synthetic */ m b;

            public void a() {
                jVar.d();
            }
        });
        a((i) jVar);
    }

    public synchronized void a(l lVar) {
        this.c.add(lVar);
    }

    public synchronized Enumeration<k> b() {
        return Collections.enumeration(this.b);
    }

    public void b(i iVar) {
        int a = iVar.a();
        synchronized (this) {
            this.d = a + this.d;
        }
        for (l b : i()) {
            b.b(iVar);
        }
    }

    public synchronized void b(l lVar) {
        this.c.remove(lVar);
    }

    public synchronized int c() {
        return this.a.size();
    }

    public synchronized Enumeration<k> d() {
        return Collections.enumeration(this.a);
    }

    public synchronized int e() {
        return this.d;
    }

    public synchronized boolean f() {
        return this.e;
    }

    public synchronized void g() {
        this.e = true;
    }

    public synchronized boolean h() {
        boolean z;
        z = c() == 0 && a() == 0;
        return z;
    }
}
