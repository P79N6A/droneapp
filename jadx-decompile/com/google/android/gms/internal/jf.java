package com.google.android.gms.internal;

import com.google.android.gms.internal.jh.a;

public class jf extends jh {
    static final /* synthetic */ boolean a = (!jf.class.desiredAssertionStatus());

    public jf(ji jiVar, ij ijVar) {
        super(a.ListenComplete, jiVar, ijVar);
        if (!a && jiVar.a()) {
            throw new AssertionError("Can't have a listen complete from a user source");
        }
    }

    public jh a(kv kvVar) {
        return this.d.h() ? new jf(this.c, ij.a()) : new jf(this.c, this.d.e());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", new Object[]{c(), d()});
    }
}
