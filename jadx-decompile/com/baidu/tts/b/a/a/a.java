package com.baidu.tts.b.a.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.b.a.b.b;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.g;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends com.baidu.tts.j.a implements d {
    protected b a;
    protected List<com.baidu.tts.b.a.b> b = new ArrayList();
    protected volatile b c;

    public int a(e eVar) {
        return this.c.a(eVar);
    }

    public int a(f fVar) {
        return this.c.a(fVar);
    }

    public int a(g gVar) {
        return this.c.a(gVar);
    }

    public b a() {
        return this.c;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(b bVar) {
        this.c.a(bVar);
    }

    public void a(com.baidu.tts.b.a.b bVar) {
        this.c.a(bVar);
    }

    void a(h hVar) {
        if (C()) {
            if (hVar == null) {
                hVar = new h();
            }
            hVar.a(com.baidu.tts.f.e.SYN_START);
            if (this.b != null) {
                for (com.baidu.tts.b.a.b bVar : this.b) {
                    if (bVar != null) {
                        bVar.a(hVar);
                    }
                }
            }
        }
    }

    public void a(i iVar) {
        this.c.a(iVar);
    }

    public void a(Object obj) {
        this.c.a(obj);
    }

    public int b(e eVar) {
        return this.c.b(eVar);
    }

    void b(h hVar) {
        if (C()) {
            if (hVar == null) {
                hVar = new h();
            }
            hVar.a(com.baidu.tts.f.e.SYN_DATA);
            if (this.b != null) {
                for (com.baidu.tts.b.a.b bVar : this.b) {
                    if (bVar != null) {
                        bVar.c(hVar);
                    }
                }
            }
        }
    }

    void c(h hVar) {
        if (C()) {
            if (hVar == null) {
                hVar = new h();
            }
            hVar.a(com.baidu.tts.f.e.SYN_FINISH);
            if (this.b != null) {
                for (com.baidu.tts.b.a.b bVar : this.b) {
                    if (bVar != null) {
                        bVar.b(hVar);
                    }
                }
            }
        }
    }

    void d(h hVar) {
        if (hVar == null) {
            hVar = new h();
        }
        hVar.a(com.baidu.tts.f.e.SYN_STOP);
        if (this.b != null) {
            for (com.baidu.tts.b.a.b bVar : this.b) {
                if (bVar != null) {
                    bVar.e(hVar);
                }
            }
        }
    }

    void e(h hVar) {
        if (hVar == null) {
            hVar = new h();
        }
        hVar.a(com.baidu.tts.f.e.SYN_ERROR);
        if (this.b != null) {
            for (com.baidu.tts.b.a.b bVar : this.b) {
                if (bVar != null) {
                    bVar.d(hVar);
                }
            }
        }
    }

    protected TtsError g() {
        return this.c.b();
    }

    protected void h() {
        this.c.a();
    }

    protected void i() {
        this.c.c();
    }

    protected void j() {
        this.c.d();
    }

    protected void k() {
        this.c.e();
    }

    protected void l() {
        this.c.f();
    }
}
