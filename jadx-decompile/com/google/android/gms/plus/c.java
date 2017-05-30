package com.google.android.gms.plus;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.anp;
import com.google.android.gms.internal.anq;
import com.google.android.gms.internal.anr;
import com.google.android.gms.internal.ans;
import com.google.android.gms.plus.internal.e;

@Deprecated
public final class c {
    public static final g<e> a = new g();
    static final b<e, a> b = new 1();
    @Deprecated
    public static final a<a> c = new a("Plus.API", b, a);
    public static final Scope d = new Scope(f.c);
    public static final Scope e = new Scope(f.e);
    @Deprecated
    public static final b f = new ans();
    @Deprecated
    public static final a g = new anp();
    @Deprecated
    public static final g h = new anr();
    public static final f i = new anq();

    private c() {
    }

    public static e a(com.google.android.gms.common.api.g gVar, boolean z) {
        d.b(gVar != null, "GoogleApiClient parameter is required.");
        d.a(gVar.j(), (Object) "GoogleApiClient must be connected.");
        d.a(gVar.a(c), (Object) "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b = gVar.b(c);
        if (!z || b) {
            return b ? (e) gVar.a(a) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
    }
}
