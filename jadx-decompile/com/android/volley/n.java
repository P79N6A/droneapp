package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public abstract class n<T> implements Comparable<n<T>> {
    private static final String a = "UTF-8";
    private static long q;
    private final a b;
    private final int c;
    private final String d;
    private String e;
    private String f;
    private final int g;
    private com.android.volley.p.a h;
    private Integer i;
    private o j;
    private boolean k;
    private boolean l;
    private boolean m;
    private r n;
    private com.android.volley.b.a o;
    private Object p;

    public interface a {
        public static final int a = -1;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;
        public static final int h = 6;
        public static final int i = 7;
    }

    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public n(int i, String str, com.android.volley.p.a aVar) {
        this.b = a.a ? new a() : null;
        this.k = true;
        this.l = false;
        this.m = false;
        this.o = null;
        this.c = i;
        this.d = str;
        this.f = a(i, str);
        this.h = aVar;
        a(new d());
        this.g = d(str);
    }

    @Deprecated
    public n(String str, com.android.volley.p.a aVar) {
        this(-1, str, aVar);
    }

    private static String a(int i, String str) {
        StringBuilder append = new StringBuilder().append("Request:").append(i).append(":").append(str).append(":").append(System.currentTimeMillis()).append(":");
        long j = q;
        q = 1 + j;
        return f.a(append.append(j).toString());
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append(SignatureVisitor.INSTANCEOF);
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    private static int d(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    return host.hashCode();
                }
            }
        }
        return 0;
    }

    public void A() {
        this.m = true;
    }

    public boolean B() {
        return this.m;
    }

    public int a() {
        return this.c;
    }

    public int a(n<T> nVar) {
        b x = x();
        b x2 = nVar.x();
        return x == x2 ? this.i.intValue() - nVar.i.intValue() : x2.ordinal() - x.ordinal();
    }

    public final n<?> a(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    public n<?> a(com.android.volley.b.a aVar) {
        this.o = aVar;
        return this;
    }

    public n<?> a(o oVar) {
        this.j = oVar;
        return this;
    }

    public n<?> a(r rVar) {
        this.n = rVar;
        return this;
    }

    public n<?> a(Object obj) {
        this.p = obj;
        return this;
    }

    public final n<?> a(boolean z) {
        this.k = z;
        return this;
    }

    protected abstract p<T> a(j jVar);

    protected u a(u uVar) {
        return uVar;
    }

    public void a(String str) {
        if (a.a) {
            this.b.a(str, Thread.currentThread().getId());
        }
    }

    public Object b() {
        return this.p;
    }

    public void b(u uVar) {
        if (this.h != null) {
            this.h.a(uVar);
        }
    }

    protected abstract void b(T t);

    void b(final String str) {
        if (this.j != null) {
            this.j.b(this);
            e();
        }
        if (a.a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ n c;

                    public void run() {
                        this.c.b.a(str, id);
                        this.c.b.a(toString());
                    }
                });
                return;
            }
            this.b.a(str, id);
            this.b.a(toString());
        }
    }

    public com.android.volley.p.a c() {
        return this.h;
    }

    public void c(String str) {
        this.e = str;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((n) obj);
    }

    public int d() {
        return this.g;
    }

    protected void e() {
        this.h = null;
    }

    public final int f() {
        if (this.i != null) {
            return this.i.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public String g() {
        return this.e != null ? this.e : this.d;
    }

    public String h() {
        return this.d;
    }

    public String i() {
        return this.f;
    }

    public String j() {
        return this.c + ":" + this.d;
    }

    public com.android.volley.b.a k() {
        return this.o;
    }

    public void l() {
        this.l = true;
    }

    public boolean m() {
        return this.l;
    }

    public Map<String, String> n() {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> o() {
        return s();
    }

    @Deprecated
    protected String p() {
        return t();
    }

    @Deprecated
    public String q() {
        return u();
    }

    @Deprecated
    public byte[] r() {
        Map o = o();
        return (o == null || o.size() <= 0) ? null : a(o, p());
    }

    protected Map<String, String> s() {
        return null;
    }

    protected String t() {
        return "UTF-8";
    }

    public String toString() {
        return (this.l ? "[X] " : "[ ] ") + g() + " " + ("0x" + Integer.toHexString(d())) + " " + x() + " " + this.i;
    }

    public String u() {
        return "application/x-www-form-urlencoded; charset=" + t();
    }

    public byte[] v() {
        Map s = s();
        return (s == null || s.size() <= 0) ? null : a(s, t());
    }

    public final boolean w() {
        return this.k;
    }

    public b x() {
        return b.NORMAL;
    }

    public final int y() {
        return this.n.a();
    }

    public r z() {
        return this.n;
    }
}
