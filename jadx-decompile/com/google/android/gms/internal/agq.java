package com.google.android.gms.internal;

import com.google.android.gms.cast.a.b;
import com.google.android.gms.cast.a.c;
import com.google.android.gms.cast.internal.f;
import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class agq implements b {
    private final int a;
    private final int b;
    private final String c;
    private final JSONObject d;
    private final String e;
    private final int f;
    private final Map<String, c> g;

    public agq(int i, int i2, String str, JSONObject jSONObject, Collection<c> collection, String str2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = jSONObject;
        this.e = str2;
        this.f = i3;
        this.g = new HashMap(collection.size());
        for (c cVar : collection) {
            this.g.put(cVar.c(), cVar);
        }
    }

    public int a() {
        return this.a;
    }

    public c a(String str) {
        return str == null ? null : (c) this.g.get(str);
    }

    public List<c> a(int i) {
        List arrayList = new ArrayList();
        for (c cVar : g()) {
            if (cVar.a() == i) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public boolean a(b bVar) {
        return this.a != bVar.a();
    }

    public boolean a(String str, b bVar) {
        return !f.a(a(str), bVar.a(str));
    }

    public int b() {
        return this.b;
    }

    public boolean b(b bVar) {
        return this.b != bVar.b();
    }

    public boolean b(String str, b bVar) {
        c a = a(str);
        c a2 = bVar.a(str);
        return (a == null && a2 == null) ? false : a == null || a2 == null || a.a() != a2.a();
    }

    public JSONObject c() {
        return this.d;
    }

    public boolean c(b bVar) {
        return !p.a(this.d, bVar.c());
    }

    public boolean c(String str, b bVar) {
        c a = a(str);
        c a2 = bVar.a(str);
        return (a == null && a2 == null) ? false : a == null || a2 == null || !p.a(a.b(), a2.b());
    }

    public CharSequence d() {
        return this.c;
    }

    public boolean d(b bVar) {
        return !f.a(this.c, bVar.d());
    }

    public CharSequence e() {
        return this.e;
    }

    public Collection<String> e(b bVar) {
        Collection hashSet = new HashSet();
        for (c cVar : g()) {
            c a = bVar.a(cVar.c());
            if (a == null || !cVar.equals(a)) {
                hashSet.add(cVar.c());
            }
        }
        for (c cVar2 : bVar.g()) {
            if (a(cVar2.c()) == null) {
                hashSet.add(cVar2.c());
            }
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (g().size() != bVar.g().size()) {
            return false;
        }
        for (c cVar : g()) {
            boolean z2 = false;
            for (c cVar2 : bVar.g()) {
                boolean z3;
                if (!f.a(cVar.c(), cVar2.c())) {
                    z3 = z2;
                } else if (!f.a(cVar, cVar2)) {
                    return false;
                } else {
                    z3 = true;
                }
                z2 = z3;
            }
            if (!z2) {
                return false;
            }
        }
        if (!(this.a == bVar.a() && this.b == bVar.b() && this.f == bVar.f() && f.a(this.e, bVar.e()) && f.a(this.c, bVar.d()) && p.a(this.d, bVar.c()))) {
            z = false;
        }
        return z;
    }

    public int f() {
        return this.f;
    }

    public Collection<c> g() {
        return Collections.unmodifiableCollection(this.g.values());
    }

    public List<c> h() {
        List arrayList = new ArrayList();
        for (c cVar : g()) {
            if (cVar.e()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.g, this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    public List<c> i() {
        List arrayList = new ArrayList();
        for (c cVar : g()) {
            if (cVar.d()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public List<c> j() {
        List arrayList = new ArrayList();
        for (c cVar : g()) {
            if (cVar.d() && cVar.e()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
