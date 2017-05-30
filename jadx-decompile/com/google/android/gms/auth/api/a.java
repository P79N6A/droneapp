package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.internal.e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aep;
import com.google.android.gms.internal.aeq;
import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aez;
import java.util.Collections;
import java.util.List;

public final class a {
    public static final g<com.google.android.gms.auth.api.credentials.internal.g> a = new g();
    public static final g<aer> b = new g();
    public static final g<c> c = new g();
    public static final com.google.android.gms.common.api.a<c> d = b.b;
    public static final com.google.android.gms.common.api.a<a> e = new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", l, a);
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f = new com.google.android.gms.common.api.a("Auth.GOOGLE_SIGN_IN_API", n, c);
    public static final com.google.android.gms.common.api.a<b> g = new com.google.android.gms.common.api.a("Auth.ACCOUNT_STATUS_API", m, b);
    public static final com.google.android.gms.auth.api.proxy.b h = new aez();
    public static final com.google.android.gms.auth.api.credentials.b i = new e();
    public static final aep j = new aeq();
    public static final com.google.android.gms.auth.api.signin.a k = new com.google.android.gms.auth.api.signin.internal.b();
    private static final com.google.android.gms.common.api.a.b<com.google.android.gms.auth.api.credentials.internal.g, a> l = new com.google.android.gms.common.api.a.b<com.google.android.gms.auth.api.credentials.internal.g, a>() {
        public com.google.android.gms.auth.api.credentials.internal.g a(Context context, Looper looper, s sVar, a aVar, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return new com.google.android.gms.auth.api.credentials.internal.g(context, looper, sVar, aVar, bVar, cVar);
        }
    };
    private static final com.google.android.gms.common.api.a.b<aer, b> m = new com.google.android.gms.common.api.a.b<aer, b>() {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return a(context, looper, sVar, (b) obj, bVar, cVar);
        }

        public aer a(Context context, Looper looper, s sVar, b bVar, com.google.android.gms.common.api.g.b bVar2, com.google.android.gms.common.api.g.c cVar) {
            return new aer(context, looper, sVar, bVar2, cVar);
        }
    };
    private static final com.google.android.gms.common.api.a.b<c, GoogleSignInOptions> n = new com.google.android.gms.common.api.a.b<c, GoogleSignInOptions>() {
        public c a(Context context, Looper looper, s sVar, @Nullable GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
            return new c(context, looper, sVar, googleSignInOptions, bVar, cVar);
        }

        public List<Scope> a(@Nullable GoogleSignInOptions googleSignInOptions) {
            return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.a();
        }

        public /* synthetic */ List a(@Nullable Object obj) {
            return a((GoogleSignInOptions) obj);
        }
    };

    public static final class a implements d {

        public static class a {
            @NonNull
            private PasswordSpecification a = PasswordSpecification.a;
        }

        public PasswordSpecification a() {
            return null;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putParcelable("password_specification", null);
            return bundle;
        }
    }

    private a() {
    }
}
