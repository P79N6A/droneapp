package com.google.android.gms.internal;

import com.fimi.soul.biz.camera.e;
import java.util.HashMap;
import java.util.Map;

public class kf {
    public static final kf a = new kf();
    static final /* synthetic */ boolean b = (!kf.class.desiredAssertionStatus());
    private Integer c;
    private a d;
    private lh e = null;
    private kv f = null;
    private lh g = null;
    private kv h = null;
    private lb i = lk.d();
    private String j = null;

    private enum a {
        LEFT,
        RIGHT
    }

    public static kf a(Map<String, Object> map) {
        String str;
        kf kfVar = new kf();
        kfVar.c = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            kfVar.e = a(li.a(map.get("sp")));
            str = (String) map.get("sn");
            if (str != null) {
                kfVar.f = kv.a(str);
            }
        }
        if (map.containsKey("ep")) {
            kfVar.g = a(li.a(map.get("ep")));
            str = (String) map.get("en");
            if (str != null) {
                kfVar.h = kv.a(str);
            }
        }
        str = (String) map.get(e.cm);
        if (str != null) {
            kfVar.d = str.equals("l") ? a.LEFT : a.RIGHT;
        }
        str = (String) map.get("i");
        if (str != null) {
            kfVar.i = lb.a(str);
        }
        return kfVar;
    }

    private static lh a(lh lhVar) {
        if ((lhVar instanceof lo) || (lhVar instanceof ku) || (lhVar instanceof kz) || (lhVar instanceof la)) {
            return lhVar;
        }
        if (lhVar instanceof lf) {
            return new kz(Double.valueOf(((Long) lhVar.a()).doubleValue()), ll.a());
        }
        String valueOf = String.valueOf(lhVar.a());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Unexpected value passed to normalizeValue: ").append(valueOf).toString());
    }

    private kf r() {
        kf kfVar = new kf();
        kfVar.c = this.c;
        kfVar.e = this.e;
        kfVar.f = this.f;
        kfVar.g = this.g;
        kfVar.h = this.h;
        kfVar.d = this.d;
        kfVar.i = this.i;
        return kfVar;
    }

    public kf a(int i) {
        kf r = r();
        r.c = Integer.valueOf(i);
        r.d = a.LEFT;
        return r;
    }

    public kf a(lb lbVar) {
        kf r = r();
        r.i = lbVar;
        return r;
    }

    public kf a(lh lhVar, kv kvVar) {
        if (b || lhVar.e() || lhVar.b()) {
            mk.a(!(lhVar instanceof lf));
            kf r = r();
            r.e = lhVar;
            r.f = kvVar;
            return r;
        }
        throw new AssertionError();
    }

    public boolean a() {
        return this.e != null;
    }

    public kf b(int i) {
        kf r = r();
        r.c = Integer.valueOf(i);
        r.d = a.RIGHT;
        return r;
    }

    public kf b(lh lhVar, kv kvVar) {
        if (b || lhVar.e() || lhVar.b()) {
            mk.a(!(lhVar instanceof lf));
            kf r = r();
            r.g = lhVar;
            r.h = kvVar;
            return r;
        }
        throw new AssertionError();
    }

    public lh b() {
        if (a()) {
            return this.e;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public kv c() {
        if (a()) {
            return this.f != null ? this.f : kv.a();
        } else {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
    }

    public boolean d() {
        return this.g != null;
    }

    public lh e() {
        if (d()) {
            return this.g;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kf kfVar = (kf) obj;
        return (this.c == null ? kfVar.c != null : !this.c.equals(kfVar.c)) ? false : (this.i == null ? kfVar.i != null : !this.i.equals(kfVar.i)) ? false : (this.h == null ? kfVar.h != null : !this.h.equals(kfVar.h)) ? false : (this.g == null ? kfVar.g != null : !this.g.equals(kfVar.g)) ? false : (this.f == null ? kfVar.f != null : !this.f.equals(kfVar.f)) ? false : (this.e == null ? kfVar.e != null : !this.e.equals(kfVar.e)) ? false : k() == kfVar.k();
    }

    public kv f() {
        if (d()) {
            return this.h != null ? this.h : kv.b();
        } else {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
    }

    public boolean g() {
        return this.c != null;
    }

    public boolean h() {
        return g() && this.d != null;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.h != null ? this.h.hashCode() : 0) + (((this.g != null ? this.g.hashCode() : 0) + (((this.f != null ? this.f.hashCode() : 0) + (((this.e != null ? this.e.hashCode() : 0) + (((k() ? 1231 : 1237) + ((this.c != null ? this.c.intValue() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.i != null) {
            i = this.i.hashCode();
        }
        return hashCode + i;
    }

    public int i() {
        if (g()) {
            return this.c.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public lb j() {
        return this.i;
    }

    public boolean k() {
        return this.d != null ? this.d == a.LEFT : a();
    }

    public Map<String, Object> l() {
        Map<String, Object> hashMap = new HashMap();
        if (a()) {
            hashMap.put("sp", this.e.a());
            if (this.f != null) {
                hashMap.put("sn", this.f.e());
            }
        }
        if (d()) {
            hashMap.put("ep", this.g.a());
            if (this.h != null) {
                hashMap.put("en", this.h.e());
            }
        }
        if (this.c != null) {
            hashMap.put("l", this.c);
            a aVar = this.d;
            if (aVar == null) {
                aVar = a() ? a.LEFT : a.RIGHT;
            }
            switch (aVar) {
                case LEFT:
                    hashMap.put(e.cm, "l");
                    break;
                case RIGHT:
                    hashMap.put(e.cm, "r");
                    break;
            }
        }
        if (!this.i.equals(lk.d())) {
            hashMap.put("i", this.i.c());
        }
        return hashMap;
    }

    public boolean m() {
        return (a() || d() || g()) ? false : true;
    }

    public boolean n() {
        return m() && this.i.equals(lk.d());
    }

    public boolean o() {
        return (a() && d() && g() && !h()) ? false : true;
    }

    public String p() {
        if (this.j == null) {
            try {
                this.j = mb.a(l());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return this.j;
    }

    public ko q() {
        return m() ? new kl(j()) : g() ? new kn(this) : new kp(this);
    }

    public String toString() {
        return l().toString();
    }
}
