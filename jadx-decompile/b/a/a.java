package b.a;

import b.b.i;
import b.b.j;
import b.b.m;
import b.b.n;

public class a extends n {
    private volatile int a;

    public a(Class<? extends j> cls) {
        super((Class) cls);
    }

    public a(Class<? extends j> cls, String str) {
        super((Class) cls, str);
    }

    public a(String str) {
        super(str);
    }

    public void a(final i iVar, final m mVar) {
        new Thread(this) {
            final /* synthetic */ a c;

            public void run() {
                try {
                    iVar.a(mVar);
                } finally {
                    this.c.b();
                }
            }
        }.start();
    }

    public void a(m mVar) {
        this.a = 0;
        super.a(mVar);
        u_();
    }

    public synchronized void b() {
        this.a++;
        notifyAll();
    }

    synchronized void u_() {
        while (this.a < d()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
