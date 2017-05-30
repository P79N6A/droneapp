package com.fimi.kernel.b.a;

import it.a.a.k;

public abstract class a implements k {

    public enum a {
        Started,
        Transferred,
        Aborted,
        Completed,
        Failed
    }

    public void a() {
        a(a.Aborted, 0);
    }

    public void a(int i) {
        a(a.Transferred, i);
    }

    public abstract void a(a aVar, int i);

    public void b() {
        a(a.Completed, 0);
    }

    public void c() {
        a(a.Failed, 0);
    }

    public void d() {
        a(a.Started, 0);
    }
}
