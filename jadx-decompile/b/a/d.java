package b.a;

import b.b.h;
import b.b.i;
import b.b.m;

public class d extends c {
    public d(i iVar) {
        super(iVar);
    }

    public void a(final m mVar) {
        mVar.a((i) this, new h(this) {
            final /* synthetic */ d b;

            public void a() {
                this.b.c();
                this.b.b(mVar);
                this.b.d();
            }
        });
    }

    protected void c() {
    }

    protected void d() {
    }
}
