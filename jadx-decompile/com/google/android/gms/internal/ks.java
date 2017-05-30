package com.google.android.gms.internal;

import com.google.android.gms.internal.kt.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class ks {
    private final kt a;
    private final String b;
    private final String c;

    public ks(kt ktVar, String str) {
        this(ktVar, str, null);
    }

    public ks(kt ktVar, String str, String str2) {
        this.a = ktVar;
        this.b = str;
        this.c = str2;
    }

    private static String a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private long b() {
        return System.currentTimeMillis();
    }

    private String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.c == null) {
            return str;
        }
        String str2 = this.c;
        return new StringBuilder((String.valueOf(str2).length() + 3) + String.valueOf(str).length()).append(str2).append(" - ").append(str).toString();
    }

    public void a(String str) {
        b(str, null);
    }

    public void a(String str, Throwable th) {
        String valueOf = String.valueOf(b(str, new Object[0]));
        String valueOf2 = String.valueOf(a(th));
        this.a.b(a.ERROR, this.b, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("\n").append(valueOf2).toString(), b());
    }

    public void a(String str, Throwable th, Object... objArr) {
        if (a()) {
            String b = b(str, objArr);
            if (th != null) {
                String valueOf = String.valueOf(a(th));
                b = new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(valueOf).length()).append(b).append("\n").append(valueOf).toString();
            }
            this.a.b(a.DEBUG, this.b, b, b());
        }
    }

    public void a(String str, Object... objArr) {
        a(str, null, objArr);
    }

    public boolean a() {
        return this.a.a().ordinal() <= a.DEBUG.ordinal();
    }

    public void b(String str) {
        this.a.b(a.INFO, this.b, b(str, new Object[0]), b());
    }

    public void b(String str, Throwable th) {
        String b = b(str, new Object[0]);
        if (th != null) {
            String valueOf = String.valueOf(a(th));
            b = new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(valueOf).length()).append(b).append("\n").append(valueOf).toString();
        }
        this.a.b(a.WARN, this.b, b, b());
    }
}
