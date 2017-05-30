package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.n;
import com.google.firebase.b;
import java.util.ArrayList;
import java.util.List;

public class gs {
    private Context a;
    private String b;
    private SharedPreferences c;
    private nr d;
    private oc e = new oc();

    public gs(@NonNull Context context, @NonNull String str, @NonNull nr nrVar) {
        d.a(context);
        this.b = d.a(str);
        this.a = context.getApplicationContext();
        String format = String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.b});
        this.d = (nr) d.a(nrVar);
        this.c = this.a.getSharedPreferences(format, 0);
    }

    private go a(@NonNull oa oaVar) {
        String c = oaVar.b("cachedTokenState").c();
        String c2 = oaVar.b("applicationName").c();
        boolean g = oaVar.b("anonymous").g();
        String str = "2";
        nx b = oaVar.b("version");
        String c3 = (b == null || b.k()) ? str : b.c();
        nu c4 = oaVar.c("userInfos");
        int a = c4.a();
        List arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add((gm) this.d.a(c4.a(i), gm.class));
        }
        go goVar = new go(b.a(c2), arrayList);
        if (!TextUtils.isEmpty(c)) {
            goVar.a((GetTokenResponse) this.d.a(c, GetTokenResponse.class));
        }
        ((go) goVar.b(g)).a(c3);
        return goVar;
    }

    private static nx c(String str) {
        return new oc().a(str);
    }

    @Nullable
    private String d(@NonNull n nVar) {
        oa oaVar = new oa();
        if (!go.class.isAssignableFrom(nVar.getClass())) {
            return null;
        }
        go goVar = (go) nVar;
        oaVar.a("cachedTokenState", goVar.n());
        oaVar.a("applicationName", goVar.g().b());
        oaVar.a("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
        if (goVar.h() != null) {
            nx nuVar = new nu();
            List h = goVar.h();
            for (int i = 0; i < h.size(); i++) {
                nuVar.a(c(this.d.a((gm) h.get(i))));
            }
            oaVar.a("userInfos", nuVar);
        }
        oaVar.a("anonymous", Boolean.valueOf(goVar.i()));
        oaVar.a("version", "2");
        return oaVar.toString();
    }

    @Nullable
    public n a() {
        n nVar = null;
        String b = b("com.google.firebase.auth.FIREBASE_USER");
        if (!TextUtils.isEmpty(b)) {
            try {
                oa l = this.e.a(b).l();
                if (l.a("type")) {
                    if ("com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(l.b("type").c())) {
                        nVar = a(l);
                    }
                }
            } catch (og e) {
            }
        }
        return nVar;
    }

    @Nullable
    public <T> T a(String str, Class<T> cls) {
        String b = b(str);
        return TextUtils.isEmpty(b) ? null : this.d.a(b, (Class) cls);
    }

    public void a(@NonNull n nVar) {
        d.a(nVar);
        String d = d(nVar);
        if (!TextUtils.isEmpty(d)) {
            a("com.google.firebase.auth.FIREBASE_USER", d);
        }
    }

    public void a(@NonNull n nVar, @NonNull GetTokenResponse getTokenResponse) {
        d.a(nVar);
        d.a(getTokenResponse);
        a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{nVar.a()}), (Object) getTokenResponse);
    }

    public void a(String str) {
        this.c.edit().remove(str).apply();
    }

    public void a(String str, Object obj) {
        this.c.edit().putString(str, this.d.a(obj)).apply();
    }

    public void a(String str, String str2) {
        this.c.edit().putString(str, str2).apply();
    }

    public GetTokenResponse b(@NonNull n nVar) {
        d.a(nVar);
        return (GetTokenResponse) a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{nVar.a()}), GetTokenResponse.class);
    }

    @Nullable
    public String b(String str) {
        return this.c.getString(str, null);
    }

    public void b() {
        a("com.google.firebase.auth.FIREBASE_USER");
    }

    public void c(@NonNull n nVar) {
        d.a(nVar);
        a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{nVar.a()}));
    }
}
