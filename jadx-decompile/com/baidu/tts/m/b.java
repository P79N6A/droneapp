package com.baidu.tts.m;

import com.baidu.tts.f.j;
import com.baidu.tts.f.n;
import com.baidu.tts.n.a;
import com.baidu.tts.tools.DataTool;

public class b extends a<b> {
    private com.baidu.tts.b.a.b.f.b a = new com.baidu.tts.b.a.b.f.b();
    private com.baidu.tts.b.a.b.e.b b = new com.baidu.tts.b.a.b.e.b();
    private j c;

    public com.baidu.tts.b.a.b.f.b a() {
        return this.a;
    }

    public void a(j jVar) {
        this.c = jVar;
    }

    public void a(String str) {
        this.a.k(str);
        this.b.k(str);
    }

    public com.baidu.tts.b.a.b.e.b b() {
        return this.b;
    }

    public void b(String str) {
        this.a.m(str);
        this.b.m(str);
    }

    public j c() {
        return this.c;
    }

    public void c(String str) {
        this.a.l(str);
        this.b.l(str);
    }

    public int d(String str) {
        if (!DataTool.isLong(str)) {
            return n.TTS_PARAMETER_INVALID.b();
        }
        this.a.j(str);
        this.b.j(str);
        return 0;
    }
}
