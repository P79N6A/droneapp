package b.a;

import b.b.a;
import b.b.i;
import b.b.m;

public class c extends a implements i {
    protected i a;

    public c(i iVar) {
        this.a = iVar;
    }

    public int a() {
        return this.a.a();
    }

    public void a(m mVar) {
        b(mVar);
    }

    public i b() {
        return this.a;
    }

    public void b(m mVar) {
        this.a.a(mVar);
    }

    public String toString() {
        return this.a.toString();
    }
}
