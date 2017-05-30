package com.google.android.gms.internal;

import com.google.android.gms.internal.lh.a;
import java.util.Collections;
import java.util.Iterator;

public class la extends kw implements lh {
    private static final la c = new la();

    private la() {
    }

    public static la j() {
        return c;
    }

    public int a(lh lhVar) {
        return lhVar.b() ? 0 : -1;
    }

    public lh a(ij ijVar) {
        return this;
    }

    public lh a(ij ijVar, lh lhVar) {
        if (ijVar.h()) {
            return lhVar;
        }
        kv d = ijVar.d();
        return a(d, c(d).a(ijVar.e(), lhVar));
    }

    public lh a(kv kvVar, lh lhVar) {
        return (lhVar.b() || kvVar.f()) ? this : new kw().a(kvVar, lhVar);
    }

    public Object a() {
        return null;
    }

    public Object a(boolean z) {
        return null;
    }

    public String a(a aVar) {
        return "";
    }

    public boolean a(kv kvVar) {
        return false;
    }

    public kv b(kv kvVar) {
        return null;
    }

    public /* synthetic */ lh b(lh lhVar) {
        return c(lhVar);
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return 0;
    }

    public la c(lh lhVar) {
        return this;
    }

    public lh c(kv kvVar) {
        return this;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((lh) obj);
    }

    public String d() {
        return "";
    }

    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof la) {
            return true;
        }
        boolean z = (obj instanceof lh) && ((lh) obj).b() && f().equals(((lh) obj).f());
        return z;
    }

    public lh f() {
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public Iterator<lg> i() {
        return Collections.emptyList().iterator();
    }

    public Iterator<lg> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        return "<Empty Node>";
    }
}
