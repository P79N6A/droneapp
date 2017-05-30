package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import java.io.UnsupportedEncodingException;

public class s extends n<String> {
    private b<String> a;

    public s(int i, String str, b<String> bVar, a aVar) {
        super(i, str, aVar);
        this.a = bVar;
    }

    public s(String str, b<String> bVar, a aVar) {
        this(0, str, bVar, aVar);
    }

    protected p<String> a(j jVar) {
        Object str;
        try {
            str = new String(jVar.b, h.a(jVar.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(jVar.b);
        }
        return p.a(str, h.a(jVar));
    }

    protected /* synthetic */ void b(Object obj) {
        d((String) obj);
    }

    protected void d(String str) {
        if (this.a != null) {
            this.a.a(str);
        }
    }

    protected void e() {
        super.e();
        this.a = null;
    }
}
