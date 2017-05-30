package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ajg.a;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public abstract class abd<T> implements Comparable<abd<T>> {
    private final a a;
    private final int b;
    private final String c;
    private final int d;
    private final adf.a e;
    private Integer f;
    private ace g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private afg l;
    private ru.a m;

    public abd(int i, String str, adf.a aVar) {
        this.a = a.a ? new a() : null;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.m = null;
        this.b = i;
        this.c = str;
        this.e = aVar;
        a(new tw());
        this.d = a(str);
    }

    private static int a(String str) {
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
            Throwable th = e;
            String str2 = "Encoding not supported: ";
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    public int a() {
        return this.b;
    }

    public int a(abd<T> com_google_android_gms_internal_abd_T) {
        a q = q();
        a q2 = com_google_android_gms_internal_abd_T.q();
        return q == q2 ? this.f.intValue() - com_google_android_gms_internal_abd_T.f.intValue() : q2.ordinal() - q.ordinal();
    }

    public final abd<?> a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public abd<?> a(ace com_google_android_gms_internal_ace) {
        this.g = com_google_android_gms_internal_ace;
        return this;
    }

    public abd<?> a(afg com_google_android_gms_internal_afg) {
        this.l = com_google_android_gms_internal_afg;
        return this;
    }

    public abd<?> a(ru.a aVar) {
        this.m = aVar;
        return this;
    }

    protected abstract adf<T> a(zb zbVar);

    protected aii a(aii com_google_android_gms_internal_aii) {
        return com_google_android_gms_internal_aii;
    }

    protected abstract void a(T t);

    public int b() {
        return this.d;
    }

    public void b(aii com_google_android_gms_internal_aii) {
        if (this.e != null) {
            this.e.a(com_google_android_gms_internal_aii);
        }
    }

    public void b(String str) {
        if (a.a) {
            this.a.a(str, Thread.currentThread().getId());
        } else if (this.k == 0) {
            this.k = SystemClock.elapsedRealtime();
        }
    }

    public String c() {
        return this.c;
    }

    void c(String str) {
        if (this.g != null) {
            this.g.b(this);
        }
        if (a.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new 1(this, str, id));
                return;
            }
            this.a.a(str, id);
            this.a.a(toString());
            return;
        }
        if (SystemClock.elapsedRealtime() - this.k >= 3000) {
            ajg.b("%d ms: %s", new Object[]{Long.valueOf(SystemClock.elapsedRealtime() - this.k), toString()});
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((abd) obj);
    }

    public String d() {
        return c();
    }

    public ru.a e() {
        return this.m;
    }

    public boolean f() {
        return false;
    }

    public Map<String, String> g() {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> h() {
        return l();
    }

    @Deprecated
    protected String i() {
        return m();
    }

    @Deprecated
    public String j() {
        return n();
    }

    @Deprecated
    public byte[] k() {
        Map h = h();
        return (h == null || h.size() <= 0) ? null : a(h, i());
    }

    protected Map<String, String> l() {
        return null;
    }

    protected String m() {
        return "UTF-8";
    }

    public String n() {
        String str = "application/x-www-form-urlencoded; charset=";
        String valueOf = String.valueOf(m());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public byte[] o() {
        Map l = l();
        return (l == null || l.size() <= 0) ? null : a(l, m());
    }

    public final boolean p() {
        return this.h;
    }

    public a q() {
        return a.b;
    }

    public final int r() {
        return this.l.a();
    }

    public afg s() {
        return this.l;
    }

    public void t() {
        this.j = true;
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(b()));
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = "[ ] ";
        String valueOf2 = String.valueOf(c());
        String valueOf3 = String.valueOf(q());
        String valueOf4 = String.valueOf(this.f);
        return new StringBuilder(((((String.valueOf(str).length() + 3) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(str).append(valueOf2).append(" ").append(valueOf).append(" ").append(valueOf3).append(" ").append(valueOf4).toString();
    }

    public boolean u() {
        return this.j;
    }
}
