package com.baidu.tts.aop.tts;

import com.baidu.tts.f.n;
import com.baidu.tts.h.a.b;

public class TtsError {
    private Throwable a;
    private int b;
    private String c;
    private b d;

    public int getCode() {
        return this.b;
    }

    public int getDetailCode() {
        return this.d != null ? this.d.a(this) : this.b;
    }

    public String getDetailMessage() {
        return this.d != null ? this.d.b(this) : this.c != null ? this.c : "TtsErrorFlyweight is null";
    }

    public n getErrorEnum() {
        return this.d == null ? null : this.d.a();
    }

    public String getMessage() {
        return this.c;
    }

    public Throwable getThrowable() {
        return this.a;
    }

    public b getTtsErrorFlyweight() {
        return this.d;
    }

    public void setCode(int i) {
        this.b = i;
    }

    public void setMessage(String str) {
        this.c = str;
    }

    public void setThrowable(Throwable th) {
        this.a = th;
    }

    public void setTtsErrorFlyweight(b bVar) {
        this.d = bVar;
    }
}
