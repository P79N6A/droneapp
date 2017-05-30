package com.baidu.tts.a.c;

import android.util.Log;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.b.a.a.d;
import com.baidu.tts.b.b.a;
import com.baidu.tts.b.b.a.c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.g;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import com.baidu.tts.m.j;

public class b implements a {
    private d a;
    private c b;
    private TtsListener c;
    private com.baidu.tts.b.a.b d;
    private a e;
    private com.baidu.tts.b.a.b f;

    public b(d dVar, c cVar, j jVar) {
        this.a = dVar;
        this.b = cVar;
    }

    private boolean a(h hVar) {
        i e = hVar.e();
        return e == null ? false : com.baidu.tts.f.i.a(e.g());
    }

    public int a(float f, float f2) {
        return this.b.a(f, f2);
    }

    public int a(e eVar) {
        return this.a.a(eVar);
    }

    public int a(f fVar) {
        return this.a.a(fVar);
    }

    public int a(g gVar) {
        return this.a.a(gVar);
    }

    public c a() {
        return this.b;
    }

    public void a(TtsListener ttsListener) {
        this.c = ttsListener;
        a(this.a);
        a(this.b);
    }

    protected void a(d dVar) {
        if (this.d == null) {
            this.d = new com.baidu.tts.b.a.b(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void a(h hVar) {
                    if (this.a.c != null) {
                        this.a.c.onSynthesizeStart(hVar);
                    }
                }

                public void b(h hVar) {
                    if (this.a.c != null) {
                        this.a.c.onSynthesizeFinished(hVar);
                    }
                }

                public void c(h hVar) {
                    if (this.a.c != null) {
                        this.a.c.onSynthesizeDataArrived(hVar);
                    }
                }

                public void d(h hVar) {
                    if (this.a.c != null) {
                        this.a.c.onError(hVar);
                    }
                }

                public void e(h hVar) {
                    LoggerProxy.d("TtsAdapter", "onSynthesizeStop");
                }
            };
        }
        dVar.a(this.d);
    }

    protected void a(c cVar) {
        if (this.e == null) {
            this.e = new a(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void a(h hVar) {
                    if (this.a.c != null) {
                        this.a.c.onPlayStart(hVar);
                    }
                }

                public void b(h hVar) {
                    if (this.a.c != null) {
                        this.a.c.onPlayProgressUpdate(hVar);
                    }
                }

                public void c(h hVar) {
                    if (this.a.c != null) {
                        try {
                            this.a.c.onPlayFinished(hVar);
                        } catch (Exception e) {
                            Log.e("TtsAdapter", "onPlayFinished exception e=" + e.toString());
                        }
                    }
                }
            };
        }
        cVar.a(this.e);
    }

    public void a(i iVar) {
        this.a.a(iVar);
    }

    public int b(e eVar) {
        return this.a.b(eVar);
    }

    public TtsError b() {
        TtsError b = this.a.b();
        this.b.b();
        g();
        return b;
    }

    public void b(i iVar) {
        this.b.o();
        this.a.a(iVar);
    }

    public void c() {
        this.a.c();
        this.b.c();
    }

    public void d() {
        this.a.d();
        this.b.d();
    }

    public void e() {
        LoggerProxy.d("TtsAdapter", "before engine stop");
        this.a.e();
        LoggerProxy.d("TtsAdapter", "after engine stop");
        this.b.e();
        LoggerProxy.d("TtsAdapter", "after play stop");
    }

    public void f() {
        LoggerProxy.d("TtsAdapter", "before engine destroy");
        this.a.f();
        LoggerProxy.d("TtsAdapter", "after engine destroy");
        this.b.f();
        LoggerProxy.d("TtsAdapter", "after player destroy");
    }

    protected void g() {
        this.f = new com.baidu.tts.b.a.b(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void a(h hVar) {
                if (this.a.a(hVar)) {
                    this.a.b.a(hVar);
                }
            }

            public void b(h hVar) {
                if (this.a.a(hVar)) {
                    this.a.b.a(hVar);
                }
            }

            public void c(h hVar) {
                if (this.a.a(hVar)) {
                    this.a.b.a(hVar);
                }
            }

            public void d(h hVar) {
            }

            public void e(h hVar) {
            }
        };
        this.a.a(this.f);
    }
}
