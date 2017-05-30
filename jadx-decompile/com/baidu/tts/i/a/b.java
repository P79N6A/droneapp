package com.baidu.tts.i.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.Iterator;

public class b implements Iterator<a> {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    private int e() {
        return (this.a + this.b) - 1;
    }

    private int f() {
        return (this.d + this.c) - 1;
    }

    public void a() {
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public void a(int i) {
        this.c = i;
    }

    public void b() {
    }

    public void b(int i) {
        this.b += i;
        this.f = 0;
    }

    public a c() {
        a aVar = new a();
        int f = f();
        if (f <= e()) {
            int i = (f - this.e) + 1;
            aVar.a(this.f);
            aVar.b(i);
            this.e = f + 1;
            this.d = this.e;
            this.f += i;
            float f2 = ((float) this.d) / ((float) this.b);
            LoggerProxy.d("UtteranceSubpackager", "mCurrentProgressStartIndex=" + this.d + "--mCurrentAllUtteranceLenght=" + this.b + "--percent=" + f2);
            aVar.a(f2);
            aVar.a(true);
        } else {
            f = this.b - this.e;
            aVar.a(this.f);
            aVar.b(f);
            this.e += f;
            this.f = f + this.f;
        }
        return aVar;
    }

    public void c(int i) {
        this.g = i;
    }

    public int d() {
        return this.g;
    }

    public boolean hasNext() {
        return this.e < e();
    }

    public /* synthetic */ Object next() {
        return c();
    }

    public void remove() {
    }
}
