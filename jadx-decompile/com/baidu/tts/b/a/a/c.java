package com.baidu.tts.b.a.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.b.a.b.b;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.g;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class c extends a {
    private ExecutorService f;
    private h g;
    private e h;
    private g i;
    private f j;

    private class a implements Callable<Void> {
        final /* synthetic */ c a;
        private i b;

        public a(c cVar, i iVar) {
            this.a = cVar;
            this.b = iVar;
        }

        public Void a() {
            try {
                this.a.a(h.b(this.b));
                TtsError a = this.a.a.a(this.b);
                if (a == null) {
                    this.a.c(h.b(this.b));
                } else {
                    this.a.e(h.a(this.b, a));
                }
            } catch (InterruptedException e) {
            }
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public c() {
        this.g = new h(this);
        this.h = new e(this);
        this.i = new g(this);
        this.j = new f(this);
        this.c = this.g;
    }

    private void a(boolean z) {
        if (z) {
            d(null);
            return;
        }
        h hVar = new h();
        hVar.a(com.baidu.tts.h.a.c.a().b(n.TTS_ENGINE_STOP_FAILURE));
        d(hVar);
    }

    int b(f fVar) {
        return this.a.a(fVar);
    }

    int b(g gVar) {
        return this.a.a(gVar);
    }

    void b(b bVar) {
        this.a = bVar;
    }

    void b(com.baidu.tts.b.a.b bVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
    }

    void b(i iVar) {
        this.f.submit(new a(this, iVar));
    }

    <T> void b(T t) {
        this.a.a((Object) t);
    }

    int c(e eVar) {
        return this.a.a(eVar);
    }

    int d(e eVar) {
        return this.a.b(eVar);
    }

    public boolean m() {
        return this.c == this.j;
    }

    public boolean n() {
        return Thread.currentThread().isInterrupted() || this.c == this.h;
    }

    public h o() {
        return this.g;
    }

    public e p() {
        return this.h;
    }

    public g q() {
        return this.i;
    }

    public f r() {
        return this.j;
    }

    TtsError s() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.a.a(new com.baidu.tts.b.a.b(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void a(h hVar) {
            }

            public void b(h hVar) {
            }

            public void c(h hVar) {
                this.a.b(hVar);
            }

            public void d(h hVar) {
            }

            public void e(h hVar) {
            }
        });
        return this.a.a();
    }

    void t() {
        this.f = Executors.newSingleThreadExecutor(new com.baidu.tts.g.a.a("EngineExecutorPoolThread"));
    }

    void u() {
    }

    void v() {
    }

    void w() {
        if (this.f != null) {
            if (!this.f.isShutdown()) {
                this.f.shutdownNow();
            }
            try {
                LoggerProxy.d("EngineExecutor", "before awaitTermination");
                boolean awaitTermination = this.f.awaitTermination(l.DEFAULT.a(), TimeUnit.MILLISECONDS);
                LoggerProxy.d("EngineExecutor", "after awaitTermination isTermination=" + awaitTermination);
                a(awaitTermination);
            } catch (InterruptedException e) {
                a(false);
            }
            this.f = null;
        }
    }

    void x() {
        this.a.b();
        this.b = null;
    }
}
