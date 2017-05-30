package com.google.android.gms.internal;

import com.google.firebase.database.c;

public class jz implements kc {
    private final ij a;
    private final ie b;
    private final c c;

    public jz(ie ieVar, c cVar, ij ijVar) {
        this.b = ieVar;
        this.a = ijVar;
        this.c = cVar;
    }

    public ij a() {
        return this.a;
    }

    public void b() {
        this.b.a(this.c);
    }

    public String toString() {
        String valueOf = String.valueOf(a());
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append(valueOf).append(":CANCEL").toString();
    }
}
