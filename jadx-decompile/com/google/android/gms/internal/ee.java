package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public final class ee extends ea<ea<?>> {
    public static final ee b = new ee("BREAK");
    public static final ee c = new ee("CONTINUE");
    public static final ee d = new ee("NULL");
    public static final ee e = new ee("UNDEFINED");
    private final String f;
    private final boolean g;
    private final ea<?> h;

    public ee(ea<?> eaVar) {
        d.a(eaVar);
        this.f = "RETURN";
        this.g = true;
        this.h = eaVar;
    }

    private ee(String str) {
        this.f = str;
        this.g = false;
        this.h = null;
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public ea d() {
        return this.h;
    }

    public boolean e() {
        return this.g;
    }

    public String toString() {
        return this.f;
    }
}
