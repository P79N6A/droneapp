package b.a;

import b.b.i;
import b.b.m;

public class b extends c {
    private int b;

    public b(i iVar, int i) {
        super(iVar);
        if (i < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.b = i;
    }

    public int a() {
        return super.a() * this.b;
    }

    public void a(m mVar) {
        for (int i = 0; i < this.b && !mVar.f(); i++) {
            super.a(mVar);
        }
    }

    public String toString() {
        return super.toString() + "(repeated)";
    }
}
