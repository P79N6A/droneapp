package com.fimi.kernel.b.e;

import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.toolbox.h;
import com.fimi.kernel.b.e;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;
import java.util.Map;

class a<T> extends n<T> {
    private Map<String, String> a;
    private e<T> b;
    private Class<?> c;
    private Gson d = new Gson();

    public a(int i, String str, Map<String, String> map, e<T> eVar, Class<?> cls) {
        super(i, str, null);
        this.b = eVar;
        this.a = map;
        this.c = cls;
    }

    protected p<T> a(j jVar) {
        try {
            return p.a(this.d.fromJson(new String(jVar.b, h.a(jVar.c)), this.c), h.a(jVar));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void b(T t) {
        if (this.b != null) {
            this.b.a(t);
        }
    }

    protected Map<String, String> s() {
        return this.a;
    }
}
