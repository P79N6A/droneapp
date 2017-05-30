package com.baidu.tts.m;

import com.baidu.tts.f.h;
import com.baidu.tts.n.a;

public class d<T> extends a<T> {
    private String a = "5";
    private String b = "5";
    private String c = "5";
    private h d = h.ZH;
    private com.baidu.tts.f.d e = com.baidu.tts.f.d.UTF8;
    private String f = "0";

    public void a(com.baidu.tts.f.d dVar) {
        this.e = dVar;
    }

    public void i(String str) {
        this.d = h.a(str);
    }

    public void j(String str) {
        this.f = str;
    }

    public void k(String str) {
        this.a = str;
    }

    public void l(String str) {
        this.b = str;
    }

    public void m(String str) {
        this.c = str;
    }

    public String p() {
        return this.e.a();
    }

    public String q() {
        return this.e.b();
    }

    public String r() {
        return this.d.a();
    }

    public String s() {
        return this.f;
    }

    public long t() {
        long j = 0;
        try {
            j = Long.parseLong(this.f);
        } catch (Exception e) {
        }
        return j;
    }

    public String u() {
        return this.a;
    }

    public String v() {
        return this.b;
    }

    public String w() {
        return this.c;
    }

    public long x() {
        return Long.parseLong(this.c);
    }

    public long y() {
        return Long.parseLong(this.a);
    }

    public long z() {
        return Long.parseLong(this.b);
    }
}
