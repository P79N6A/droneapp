package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.ArrayList;
import java.util.Iterator;
import org.a.a.f.c.l;

@aaa
public class tn {
    private final int a;
    private final int b;
    private final int c;
    private final ts d;
    private final Object e = new Object();
    private ArrayList<String> f = new ArrayList();
    private ArrayList<String> g = new ArrayList();
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k;
    private String l = "";
    private String m = "";

    public tn(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = new ts(i4);
    }

    private String a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(l.c);
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    private void c(@Nullable String str, boolean z) {
        if (str != null && str.length() >= this.c) {
            synchronized (this.e) {
                this.f.add(str);
                this.h += str.length();
                if (z) {
                    this.g.add(str);
                }
            }
        }
    }

    int a(int i, int i2) {
        return (this.a * i) + (this.b * i2);
    }

    public void a(int i) {
        this.i = i;
    }

    public void a(String str, boolean z) {
        c(str, z);
        synchronized (this.e) {
            if (this.j < 0) {
                b.a("ActivityContent: negative number of WebViews.");
            }
            g();
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            z = this.j == 0;
        }
        return z;
    }

    public String b() {
        return this.l;
    }

    public void b(String str, boolean z) {
        c(str, z);
    }

    public String c() {
        return this.m;
    }

    public void d() {
        synchronized (this.e) {
            this.k -= 100;
        }
    }

    public void e() {
        synchronized (this.e) {
            this.j--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tn)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        tn tnVar = (tn) obj;
        return tnVar.b() != null && tnVar.b().equals(b());
    }

    public void f() {
        synchronized (this.e) {
            this.j++;
        }
    }

    public void g() {
        synchronized (this.e) {
            int a = a(this.h, this.i);
            if (a > this.k) {
                this.k = a;
                this.l = this.d.a(this.f);
                this.m = this.d.a(this.g);
            }
        }
    }

    public int h() {
        return this.k;
    }

    public int hashCode() {
        return b().hashCode();
    }

    int i() {
        return this.h;
    }

    public String toString() {
        int i = this.i;
        int i2 = this.k;
        int i3 = this.h;
        String valueOf = String.valueOf(a(this.f, 100));
        String valueOf2 = String.valueOf(a(this.g, 100));
        String str = this.l;
        String str2 = this.m;
        return new StringBuilder((((String.valueOf(valueOf).length() + 133) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(valueOf).append("\n viewableText").append(valueOf2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).toString();
    }
}
