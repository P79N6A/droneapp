package com.baidu.tts.m;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.f.e;
import com.baidu.tts.n.a;

public class h extends a<h> {
    private e a;
    private int b;
    private int c;
    private String d;
    private int e;
    private int f;
    private byte[] g;
    private com.baidu.tts.f.a h;
    private i i;
    private TtsError j;

    public static h a(i iVar, TtsError ttsError) {
        h b = b(iVar);
        b.a(ttsError);
        return b;
    }

    public static h b(TtsError ttsError) {
        h hVar = new h();
        hVar.a(ttsError);
        return hVar;
    }

    public static h b(i iVar) {
        h hVar = new h();
        hVar.a(iVar);
        return hVar;
    }

    public int a() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(TtsError ttsError) {
        this.j = ttsError;
    }

    public void a(com.baidu.tts.f.a aVar) {
        this.h = aVar;
    }

    public void a(e eVar) {
        this.a = eVar;
    }

    public void a(i iVar) {
        this.i = iVar;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(byte[] bArr) {
        this.g = bArr;
    }

    public int b() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int c() {
        return this.f;
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(int i) {
        this.b = i;
    }

    public byte[] d() {
        return this.g;
    }

    public i e() {
        return this.i;
    }

    public TtsError f() {
        return this.j;
    }

    public e g() {
        return this.a;
    }
}
