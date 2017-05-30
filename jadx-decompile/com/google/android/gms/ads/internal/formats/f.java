package com.google.android.gms.ads.internal.formats;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vd.a;
import java.util.Arrays;
import java.util.List;

@aaa
public class f extends a implements i.a {
    private final a a;
    private final String b;
    private final SimpleArrayMap<String, c> c;
    private final SimpleArrayMap<String, String> d;
    private final Object e = new Object();
    private i f;

    public f(String str, SimpleArrayMap<String, c> simpleArrayMap, SimpleArrayMap<String, String> simpleArrayMap2, a aVar) {
        this.b = str;
        this.c = simpleArrayMap;
        this.d = simpleArrayMap2;
        this.a = aVar;
    }

    public String a(String str) {
        return (String) this.d.get(str);
    }

    public List<String> a() {
        int i = 0;
        String[] strArr = new String[(this.c.size() + this.d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            strArr[i2] = (String) this.c.keyAt(i3);
            i2++;
        }
        while (i < this.d.size()) {
            strArr[i2] = (String) this.d.keyAt(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public void a(i iVar) {
        synchronized (this.e) {
            this.f = iVar;
        }
    }

    public uu b(String str) {
        return (uu) this.c.get(str);
    }

    public void b() {
        synchronized (this.e) {
            if (this.f == null) {
                b.b("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.f.a();
        }
    }

    public void c(String str) {
        synchronized (this.e) {
            if (this.f == null) {
                b.b("Attempt to call performClick before ad initialized.");
                return;
            }
            this.f.a(null, str, null, null, null);
        }
    }

    public String k() {
        return "3";
    }

    public String l() {
        return this.b;
    }

    public a m() {
        return this.a;
    }
}
