package com.google.android.gms.internal;

import com.google.android.gms.internal.kc.a;
import com.google.firebase.database.b;

public class kb implements kc {
    private final a a;
    private final ie b;
    private final b c;
    private final String d;

    public kb(a aVar, ie ieVar, b bVar, String str) {
        this.a = aVar;
        this.b = ieVar;
        this.c = bVar;
        this.d = str;
    }

    public ij a() {
        ij n = this.c.e().n();
        return this.a == a.VALUE ? n : n.f();
    }

    public void b() {
        this.b.a(this);
    }

    public b c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public a e() {
        return this.a;
    }

    public String toString() {
        if (this.a == a.VALUE) {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(this.a);
            String valueOf3 = String.valueOf(this.c.a(true));
            return new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(": ").append(valueOf2).append(": ").append(valueOf3).toString();
        }
        valueOf = String.valueOf(a());
        valueOf2 = String.valueOf(this.a);
        valueOf3 = String.valueOf(this.c.f());
        String valueOf4 = String.valueOf(this.c.a(true));
        return new StringBuilder((((String.valueOf(valueOf).length() + 10) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(": ").append(valueOf2).append(": { ").append(valueOf3).append(": ").append(valueOf4).append(" }").toString();
    }
}
