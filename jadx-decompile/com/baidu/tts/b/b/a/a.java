package com.baidu.tts.b.b.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.m.h;

public abstract class a extends com.baidu.tts.j.a implements c {
    protected com.baidu.tts.b.b.a a;
    protected volatile b b;

    public int a(float f, float f2) {
        return this.b.a(f, f2);
    }

    public int a(int i) {
        return this.b.a(i);
    }

    public b a() {
        return this.b;
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public void a(com.baidu.tts.b.b.a aVar) {
        this.b.a(aVar);
    }

    public void a(h hVar) {
        this.b.a(hVar);
    }

    public <T> void a(T t) {
        this.b.a((Object) t);
    }

    protected void b(h hVar) {
        if (C() && this.a != null) {
            this.a.a(hVar);
        }
    }

    protected void c(h hVar) {
        if (C() && this.a != null) {
            this.a.b(hVar);
        }
    }

    protected void d(h hVar) {
        if (C() && this.a != null) {
            this.a.c(hVar);
        }
    }

    protected TtsError g() {
        return this.b.b();
    }

    protected void h() {
        this.b.a();
    }

    protected void i() {
        this.b.c();
    }

    protected void j() {
        this.b.d();
    }

    protected void k() {
        this.b.e();
    }

    protected void l() {
        this.b.f();
    }

    public void o() {
        this.b.o();
    }
}
