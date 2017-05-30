package com.google.android.gms.internal;

import java.util.Map;

public class kg {
    private final ij a;
    private final kf b;

    public kg(ij ijVar, kf kfVar) {
        this.a = ijVar;
        this.b = kfVar;
    }

    public static kg a(ij ijVar) {
        return new kg(ijVar, kf.a);
    }

    public static kg a(ij ijVar, Map<String, Object> map) {
        return new kg(ijVar, kf.a((Map) map));
    }

    public ij a() {
        return this.a;
    }

    public kf b() {
        return this.b;
    }

    public lb c() {
        return this.b.j();
    }

    public boolean d() {
        return this.b.n();
    }

    public boolean e() {
        return this.b.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kg kgVar = (kg) obj;
        return !this.a.equals(kgVar.a) ? false : this.b.equals(kgVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }
}
