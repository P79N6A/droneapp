package com.google.android.gms.internal;

import com.google.android.gms.internal.adf.a;
import com.google.android.gms.internal.adf.b;
import java.io.UnsupportedEncodingException;

public class ac extends abd<String> {
    private final b<String> a;

    public ac(int i, String str, b<String> bVar, a aVar) {
        super(i, str, aVar);
        this.a = bVar;
    }

    protected adf<String> a(zb zbVar) {
        Object str;
        try {
            str = new String(zbVar.b, aol.a(zbVar.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(zbVar.b);
        }
        return adf.a(str, aol.a(zbVar));
    }

    protected /* synthetic */ void a(Object obj) {
        a((String) obj);
    }

    protected void a(String str) {
        this.a.a(str);
    }
}
