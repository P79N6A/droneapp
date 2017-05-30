package com.android.volley.toolbox;

import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.v;
import java.io.UnsupportedEncodingException;

public abstract class o<T> extends n<T> {
    protected static final String a = "utf-8";
    private static final String b = String.format("application/json; charset=%s", new Object[]{a});
    private b<T> c;
    private final String d;

    public o(int i, String str, String str2, b<T> bVar, a aVar) {
        super(i, str, aVar);
        this.c = bVar;
        this.d = str2;
    }

    public o(String str, String str2, b<T> bVar, a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    protected abstract p<T> a(j jVar);

    protected void b(T t) {
        if (this.c != null) {
            this.c.a(t);
        }
    }

    protected void e() {
        super.e();
        this.c = null;
    }

    public String q() {
        return u();
    }

    public byte[] r() {
        return v();
    }

    public String u() {
        return b;
    }

    public byte[] v() {
        byte[] bArr = null;
        try {
            if (this.d != null) {
                bArr = this.d.getBytes(a);
            }
        } catch (UnsupportedEncodingException e) {
            v.d("Unsupported Encoding while trying to get the bytes of %s using %s", this.d, a);
        }
        return bArr;
    }
}
