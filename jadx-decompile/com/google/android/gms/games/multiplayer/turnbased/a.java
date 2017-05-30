package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.b.z;

public final class a {
    private final com.google.android.gms.games.multiplayer.a a;
    private final c b;
    private final c c;
    private final c d;

    public a(Bundle bundle) {
        DataHolder a = a(bundle, 0);
        if (a != null) {
            this.a = new com.google.android.gms.games.multiplayer.a(a);
        } else {
            this.a = null;
        }
        a = a(bundle, 1);
        if (a != null) {
            this.b = new c(a);
        } else {
            this.b = null;
        }
        a = a(bundle, 2);
        if (a != null) {
            this.c = new c(a);
        } else {
            this.c = null;
        }
        a = a(bundle, 3);
        if (a != null) {
            this.d = new c(a);
        } else {
            this.d = null;
        }
    }

    private static DataHolder a(Bundle bundle, int i) {
        String a = z.a(i);
        return !bundle.containsKey(a) ? null : (DataHolder) bundle.getParcelable(a);
    }

    public com.google.android.gms.games.multiplayer.a a() {
        return this.a;
    }

    public c b() {
        return this.b;
    }

    public c c() {
        return this.c;
    }

    public c d() {
        return this.d;
    }

    @Deprecated
    public void e() {
        f();
    }

    public void f() {
        if (this.a != null) {
            this.a.b();
        }
        if (this.b != null) {
            this.b.b();
        }
        if (this.c != null) {
            this.c.b();
        }
        if (this.d != null) {
            this.d.b();
        }
    }

    public boolean g() {
        return (this.a == null || this.a.c() <= 0) ? (this.b == null || this.b.c() <= 0) ? (this.c == null || this.c.c() <= 0) ? this.d != null && this.d.c() > 0 : true : true : true;
    }
}
