package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.m.b;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.g;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;

public class d extends a {
    private b b;
    private f c = new f();
    private e d = new e();
    private c e = new c();
    private TtsError f;
    private int g = 0;
    private int h = 0;

    private h b(h hVar) {
        int b = hVar.b();
        hVar.b(b >= 0 ? b + this.h : b - this.h);
        hVar.c(hVar.c() + this.g);
        return hVar;
    }

    public int a(e eVar) {
        return this.d.a(eVar);
    }

    public int a(f fVar) {
        return this.d.a(fVar);
    }

    public int a(g gVar) {
        if (this.f == null) {
            return this.d.a(gVar);
        }
        String a = gVar.a();
        String b = gVar.b();
        e.b b2 = this.b.b();
        b2.d(a);
        b2.e(b);
        this.f = this.d.a();
        return this.f == null ? 0 : this.f.getDetailCode();
    }

    public TtsError a() {
        this.c.a(new com.baidu.tts.b.a.b(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void a(h hVar) {
            }

            public void b(h hVar) {
            }

            public void c(h hVar) {
                this.a.h = hVar.b();
                this.a.g = hVar.c();
                this.a.a(hVar);
            }

            public void d(h hVar) {
            }

            public void e(h hVar) {
            }
        });
        this.d.a(new com.baidu.tts.b.a.b(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void a(h hVar) {
            }

            public void b(h hVar) {
            }

            public void c(h hVar) {
                this.a.a(this.a.b(hVar));
            }

            public void d(h hVar) {
            }

            public void e(h hVar) {
            }
        });
        this.c.a();
        this.f = this.d.a();
        return this.f != null ? c.a().b(n.MIX_ENGINE_OFFLINE_INIT_FAILURE) : null;
    }

    public TtsError a(i iVar) {
        this.h = 0;
        this.g = 0;
        if (!this.e.a()) {
            return this.d.a(iVar);
        }
        TtsError a = this.c.a(iVar);
        if (a == null) {
            return a;
        }
        LoggerProxy.d("MixSynthesizer", "online synthesize ttserror=" + a.getDetailMessage());
        iVar.b(iVar.c().substring(this.g));
        return this.d.a(iVar);
    }

    public <AllSynthesizerParams> void a(AllSynthesizerParams allSynthesizerParams) {
        this.b = (b) allSynthesizerParams;
        Object a = this.b.a();
        a.a(3);
        a.b(500);
        this.c.a(a);
        this.d.a(this.b.b());
        this.e.a(this.b);
    }

    public int b(e eVar) {
        return this.d.b(eVar);
    }

    public TtsError b() {
        this.c.b();
        this.d.b();
        this.e.a(null);
        return null;
    }
}
