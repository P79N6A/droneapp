package com.google.android.gms.internal;

import com.google.android.gms.internal.kt.a;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kr implements kt {
    private final Set<String> a;
    private final a b;

    public kr(a aVar, List<String> list) {
        if (list != null) {
            this.a = new HashSet(list);
        } else {
            this.a = null;
        }
        this.b = aVar;
    }

    public a a() {
        return this.b;
    }

    protected String a(a aVar, String str, String str2, long j) {
        String valueOf = String.valueOf(new Date(j).toString());
        String valueOf2 = String.valueOf(aVar);
        return new StringBuilder((((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(" [").append(valueOf2).append("] ").append(str).append(": ").append(str2).toString();
    }

    protected void a(String str, String str2) {
        System.err.println(str2);
    }

    protected boolean a(a aVar, String str) {
        return aVar.ordinal() >= this.b.ordinal() && (this.a == null || aVar.ordinal() > a.DEBUG.ordinal() || this.a.contains(str));
    }

    public void b(a aVar, String str, String str2, long j) {
        if (a(aVar, str)) {
            String a = a(aVar, str, str2, j);
            switch (aVar) {
                case ERROR:
                    a(str, a);
                    return;
                case WARN:
                    b(str, a);
                    return;
                case INFO:
                    c(str, a);
                    return;
                case DEBUG:
                    d(str, a);
                    return;
                default:
                    throw new RuntimeException("Should not reach here!");
            }
        }
    }

    protected void b(String str, String str2) {
        System.out.println(str2);
    }

    protected void c(String str, String str2) {
        System.out.println(str2);
    }

    protected void d(String str, String str2) {
        System.out.println(str2);
    }
}
