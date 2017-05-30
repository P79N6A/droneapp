package com.baidu.tts.b.b.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.b.b.b;
import com.baidu.tts.b.b.b.c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import com.baidu.tts.m.h;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class f extends a {
    private ThreadPoolExecutor c;
    private c f;
    private h g;
    private d h;
    private g i;
    private e j;

    private class a implements Runnable {
        final /* synthetic */ f a;
        private h b;

        public a(f fVar, h hVar) {
            this.a = fVar;
            this.b = hVar;
        }

        public void run() {
            LoggerProxy.d("PlayQueueMachine", "enter run");
            this.a.f.a(this.b);
            LoggerProxy.d("PlayQueueMachine", "end run");
        }
    }

    public f() {
        this.g = new h(this);
        this.h = new d(this);
        this.i = new g(this);
        this.j = new e(this);
        this.b = this.g;
        this.f = b.a().b();
    }

    int b(float f, float f2) {
        return this.f.a(f, f2);
    }

    int b(int i) {
        return this.f.a(i);
    }

    void b(com.baidu.tts.b.b.a aVar) {
        this.a = aVar;
    }

    <T> void b(T t) {
        this.f.a(((com.baidu.tts.m.a) t).a());
    }

    void e(h hVar) {
        this.c.execute(new a(this, hVar));
    }

    public boolean m() {
        return this.b == this.j;
    }

    public boolean n() {
        return Thread.currentThread().isInterrupted() || this.b == this.h;
    }

    public h p() {
        return this.g;
    }

    public d q() {
        return this.h;
    }

    public g r() {
        return this.i;
    }

    public e s() {
        return this.j;
    }

    TtsError t() {
        this.f.a(new com.baidu.tts.b.b.a(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void a(h hVar) {
                this.a.b(hVar);
            }

            public void b(h hVar) {
                this.a.c(hVar);
            }

            public void c(h hVar) {
                this.a.d(hVar);
            }
        });
        return this.f.a();
    }

    void u() {
        this.c = new com.baidu.tts.c.a(100, "PlayExecutorPoolThread");
    }

    void v() {
        this.f.d();
    }

    void w() {
        this.f.c();
    }

    void x() {
        this.f.e();
        if (this.c != null) {
            if (!this.c.isShutdown()) {
                this.c.shutdownNow();
            }
            try {
                LoggerProxy.d("PlayQueueMachine", "before await");
                LoggerProxy.d("PlayQueueMachine", "after await isTer=" + this.c.awaitTermination(l.DEFAULT.a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                LoggerProxy.d("PlayQueueMachine", "InterruptedException");
            }
            this.c = null;
        }
    }

    void y() {
        this.f.f();
    }

    void z() {
        this.f.b();
    }
}
