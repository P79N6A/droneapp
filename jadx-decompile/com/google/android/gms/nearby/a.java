package com.google.android.gms.nearby;

import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.internal.amy;
import com.google.android.gms.internal.ang;
import com.google.android.gms.nearby.connection.dev.d;
import com.google.android.gms.nearby.internal.connection.dev.l;
import com.google.android.gms.nearby.messages.f;
import com.google.android.gms.nearby.messages.g;
import com.google.android.gms.nearby.messages.internal.t;
import com.google.android.gms.nearby.messages.internal.u;
import com.google.android.gms.nearby.messages.q;

public final class a {
    public static final com.google.android.gms.common.api.a<b> a = new com.google.android.gms.common.api.a("Nearby.CONNECTIONS_API", ang.b, ang.a);
    public static final com.google.android.gms.nearby.connection.a b = new ang();
    public static final com.google.android.gms.common.api.a<b> c = new com.google.android.gms.common.api.a("Nearby.CONNECTIONS_DEV_API", l.b, l.a);
    public static final d d = new l();
    public static final com.google.android.gms.common.api.a<g> e = new com.google.android.gms.common.api.a("Nearby.MESSAGES_API", t.b, t.a);
    public static final f f = new t();
    public static final q g = new u();
    public static final com.google.android.gms.common.api.a<b> h = new com.google.android.gms.common.api.a("Nearby.BOOTSTRAP_API", amy.b, amy.a);
    public static final com.google.android.gms.nearby.bootstrap.a i = new amy();

    private a() {
    }
}
