package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.aom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class s {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<com.google.android.gms.common.api.a<?>, a> d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final aom i;
    private Integer j;

    public static final class a {
        public final Set<Scope> a;
        public final boolean b;

        public a(Set<Scope> set, boolean z) {
            d.a((Object) set);
            this.a = Collections.unmodifiableSet(set);
            this.b = z;
        }
    }

    public s(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, a> map, int i, View view, String str, String str2, aom com_google_android_gms_internal_aom) {
        Map map2;
        this.a = account;
        this.b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        }
        this.d = map2;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = com_google_android_gms_internal_aom;
        Set hashSet = new HashSet(this.b);
        for (a aVar : this.d.values()) {
            hashSet.addAll(aVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static s a(Context context) {
        return new com.google.android.gms.common.api.g.a(context).b();
    }

    @Deprecated
    public String a() {
        return this.a != null ? this.a.name : null;
    }

    public Set<Scope> a(com.google.android.gms.common.api.a<?> aVar) {
        a aVar2 = (a) this.d.get(aVar);
        if (aVar2 == null || aVar2.a.isEmpty()) {
            return this.b;
        }
        Set<Scope> hashSet = new HashSet(this.b);
        hashSet.addAll(aVar2.a);
        return hashSet;
    }

    public void a(Integer num) {
        this.j = num;
    }

    public Account b() {
        return this.a;
    }

    public Account c() {
        return this.a != null ? this.a : new Account("<<default account>>", "com.google");
    }

    public int d() {
        return this.e;
    }

    public Set<Scope> e() {
        return this.b;
    }

    public Set<Scope> f() {
        return this.c;
    }

    public Map<com.google.android.gms.common.api.a<?>, a> g() {
        return this.d;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public View j() {
        return this.f;
    }

    public aom k() {
        return this.i;
    }

    public Integer l() {
        return this.j;
    }
}
