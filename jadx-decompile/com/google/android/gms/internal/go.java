package com.google.android.gms.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.j;
import com.google.firebase.auth.n;
import com.google.firebase.auth.w;
import com.google.firebase.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class go extends n {
    private GetTokenResponse a;
    private gm b;
    private String c;
    private String d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
    private List<gm> e;
    private List<String> f;
    private Map<String, gm> g;
    private String h = "2";
    private boolean i;
    private nr j = fy.a();

    public go(@NonNull b bVar, @NonNull List<? extends w> list) {
        d.a(bVar);
        this.c = bVar.b();
        a((List) list);
    }

    public go a(@NonNull String str) {
        this.h = str;
        return this;
    }

    public go a(boolean z) {
        this.i = z;
        return this;
    }

    @NonNull
    public n a(@NonNull List<? extends w> list) {
        d.a(list);
        this.e = new ArrayList(list.size());
        this.f = new ArrayList(list.size());
        this.g = new ArrayMap();
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = new gm((w) list.get(i));
            if (gmVar.b().equals(j.a)) {
                this.b = gmVar;
            } else {
                this.f.add(gmVar.b());
            }
            this.e.add(gmVar);
            this.g.put(gmVar.b(), gmVar);
        }
        if (this.b == null) {
            this.b = (gm) this.e.get(0);
        }
        return this;
    }

    @NonNull
    public String a() {
        return this.b.a();
    }

    public void a(@NonNull GetTokenResponse getTokenResponse) {
        this.a = (GetTokenResponse) d.a(getTokenResponse);
    }

    public /* synthetic */ n b(boolean z) {
        return a(z);
    }

    @NonNull
    public String b() {
        return this.b.b();
    }

    @Nullable
    public String c() {
        return this.b.c();
    }

    @Nullable
    public Uri d() {
        return this.b.d();
    }

    @Nullable
    public String e() {
        return this.b.e();
    }

    public boolean f() {
        return this.b.f();
    }

    @NonNull
    public b g() {
        return b.a(this.c);
    }

    public List<gm> h() {
        return this.e;
    }

    public boolean i() {
        return this.i;
    }

    @Nullable
    public List<String> j() {
        return this.f;
    }

    @NonNull
    public List<? extends w> k() {
        return this.e;
    }

    @NonNull
    public GetTokenResponse l() {
        return this.a;
    }

    @NonNull
    public String m() {
        return l().c();
    }

    @NonNull
    public String n() {
        return this.j.a(this.a);
    }
}
