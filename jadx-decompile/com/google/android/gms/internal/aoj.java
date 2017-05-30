package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.s;

public final class aoj {
    public static final g<com.google.android.gms.signin.internal.g> a = new g();
    public static final g<com.google.android.gms.signin.internal.g> b = new g();
    public static final b<com.google.android.gms.signin.internal.g, aom> c = new b<com.google.android.gms.signin.internal.g, aom>() {
        public com.google.android.gms.signin.internal.g a(Context context, Looper looper, s sVar, aom com_google_android_gms_internal_aom, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return new com.google.android.gms.signin.internal.g(context, looper, true, sVar, com_google_android_gms_internal_aom == null ? aom.a : com_google_android_gms_internal_aom, bVar, cVar);
        }
    };
    static final b<com.google.android.gms.signin.internal.g, a> d = new b<com.google.android.gms.signin.internal.g, a>() {
        public com.google.android.gms.signin.internal.g a(Context context, Looper looper, s sVar, a aVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
            return new com.google.android.gms.signin.internal.g(context, looper, false, sVar, aVar.a(), bVar, cVar);
        }
    };
    public static final Scope e = new Scope(f.a);
    public static final Scope f = new Scope(f.b);
    public static final com.google.android.gms.common.api.a<aom> g = new com.google.android.gms.common.api.a("SignIn.API", c, a);
    public static final com.google.android.gms.common.api.a<a> h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", d, b);

    public static class a implements com.google.android.gms.common.api.a.a.a {
        public Bundle a() {
            return null;
        }
    }
}
