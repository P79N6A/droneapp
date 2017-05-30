package org.a.a.c.b;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.a.a.a.c;
import org.a.a.h.b;
import org.a.a.h.e;
import org.a.a.h.f;
import org.a.a.h.h;
import org.a.a.h.i;
import org.a.a.h.j;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;

@c
public class d {
    private String a;
    private byte[] b;
    private InputStream c;
    private List<NameValuePair> d;
    private Serializable e;
    private File f;
    private e g;
    private String h;
    private boolean i;
    private boolean j;

    d() {
    }

    public static d a() {
        return new d();
    }

    private e b(e eVar) {
        return this.g != null ? this.g : eVar;
    }

    private void o() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public d a(File file) {
        o();
        this.f = file;
        return this;
    }

    public d a(InputStream inputStream) {
        o();
        this.c = inputStream;
        return this;
    }

    public d a(Serializable serializable) {
        o();
        this.e = serializable;
        return this;
    }

    public d a(String str) {
        o();
        this.a = str;
        return this;
    }

    public d a(List<NameValuePair> list) {
        o();
        this.d = list;
        return this;
    }

    public d a(e eVar) {
        this.g = eVar;
        return this;
    }

    public d a(byte[] bArr) {
        o();
        this.b = bArr;
        return this;
    }

    public d a(NameValuePair... nameValuePairArr) {
        return a(Arrays.asList(nameValuePairArr));
    }

    public String b() {
        return this.a;
    }

    public d b(String str) {
        this.h = str;
        return this;
    }

    public byte[] c() {
        return this.b;
    }

    public InputStream d() {
        return this.c;
    }

    public List<NameValuePair> e() {
        return this.d;
    }

    public Serializable f() {
        return this.e;
    }

    public File g() {
        return this.f;
    }

    public e h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public boolean j() {
        return this.i;
    }

    public d k() {
        this.i = true;
        return this;
    }

    public boolean l() {
        return this.j;
    }

    public d m() {
        this.j = true;
        return this;
    }

    public HttpEntity n() {
        HttpEntity jVar;
        if (this.a != null) {
            jVar = new j(this.a, b(e.m));
        } else if (this.b != null) {
            jVar = new org.a.a.h.d(this.b, b(e.n));
        } else if (this.c != null) {
            jVar = new h(this.c, 1, b(e.n));
        } else if (this.d != null) {
            Object hVar = new h(this.d, this.g != null ? this.g.b() : null);
        } else if (this.e != null) {
            jVar = new i(this.e);
            jVar.a(e.n.toString());
        } else {
            jVar = this.f != null ? new f(this.f, b(e.n)) : new b();
        }
        if (!(jVar.getContentType() == null || this.g == null)) {
            jVar.a(this.g.toString());
        }
        jVar.b(this.h);
        jVar.a(this.i);
        return this.j ? new e(jVar) : jVar;
    }
}
