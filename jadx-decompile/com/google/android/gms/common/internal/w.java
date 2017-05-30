package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.common.internal.x.a;
import java.util.Set;

public abstract class w<T extends IInterface> extends p<T> implements f, a {
    private final s a;
    private final Set<Scope> e;
    private final Account f;

    class AnonymousClass1 implements b {
        final /* synthetic */ g.b a;

        AnonymousClass1(g.b bVar) {
            this.a = bVar;
        }

        public void a(int i) {
            this.a.a(i);
        }

        public void a(@Nullable Bundle bundle) {
            this.a.a(bundle);
        }
    }

    class AnonymousClass2 implements c {
        final /* synthetic */ g.c a;

        AnonymousClass2(g.c cVar) {
            this.a = cVar;
        }

        public void a(@NonNull ConnectionResult connectionResult) {
            this.a.a(connectionResult);
        }
    }

    protected w(Context context, Looper looper, int i, s sVar, g.b bVar, g.c cVar) {
        this(context, looper, y.a(context), com.google.android.gms.common.b.a(), i, sVar, (g.b) d.a((Object) bVar), (g.c) d.a((Object) cVar));
    }

    protected w(Context context, Looper looper, y yVar, com.google.android.gms.common.b bVar, int i, s sVar, g.b bVar2, g.c cVar) {
        super(context, looper, yVar, bVar, i, a(bVar2), a(cVar), sVar.i());
        this.a = sVar;
        this.f = sVar.b();
        this.e = b(sVar.f());
    }

    @Nullable
    private static b a(g.b bVar) {
        return bVar == null ? null : new AnonymousClass1(bVar);
    }

    @Nullable
    private static c a(g.c cVar) {
        return cVar == null ? null : new AnonymousClass2(cVar);
    }

    private Set<Scope> b(@NonNull Set<Scope> set) {
        Set<Scope> a = a((Set) set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    public final Account D() {
        return this.f;
    }

    protected final Set<Scope> I() {
        return this.e;
    }

    protected final s J() {
        return this.a;
    }

    @NonNull
    protected Set<Scope> a(@NonNull Set<Scope> set) {
        return set;
    }
}
