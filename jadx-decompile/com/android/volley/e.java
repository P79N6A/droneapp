package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

public class e implements q {
    private final Executor a;

    private class a implements Runnable {
        final /* synthetic */ e a;
        private final n b;
        private final p c;
        private final Runnable d;

        public a(e eVar, n nVar, p pVar, Runnable runnable) {
            this.a = eVar;
            this.b = nVar;
            this.c = pVar;
            this.d = runnable;
        }

        public void run() {
            if (this.b.m()) {
                this.b.b("canceled-at-delivery");
                return;
            }
            if (this.c.a()) {
                this.b.b(this.c.a);
            } else {
                this.b.b(this.c.c);
            }
            if (this.c.d) {
                this.b.a("intermediate-response");
            } else {
                this.b.b("done");
            }
            if (this.d != null) {
                this.d.run();
            }
        }
    }

    public e(final Handler handler) {
        this.a = new Executor(this) {
            final /* synthetic */ e b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public e(Executor executor) {
        this.a = executor;
    }

    public void a(n<?> nVar, p<?> pVar) {
        a(nVar, pVar, null);
    }

    public void a(n<?> nVar, p<?> pVar, Runnable runnable) {
        nVar.A();
        nVar.a("post-response");
        this.a.execute(new a(this, nVar, pVar, runnable));
    }

    public void a(n<?> nVar, u uVar) {
        nVar.a("post-error");
        this.a.execute(new a(this, nVar, p.a(uVar), null));
    }
}
