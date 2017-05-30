package com.google.android.gms.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.w;

public class gm implements w {
    @om(a = "userId")
    @NonNull
    private String a;
    @om(a = "providerId")
    @NonNull
    private String b;
    @Nullable
    @om(a = "displayName")
    private String c;
    @Nullable
    @om(a = "photoUrl")
    private String d;
    @Nullable
    @gc
    private Uri e;
    @Nullable
    @om(a = "email")
    private String f;
    @om(a = "isEmailVerified")
    private boolean g;

    public gm(@NonNull GetAccountInfoUser getAccountInfoUser, @NonNull String str) {
        d.a((Object) getAccountInfoUser);
        d.a(str);
        this.a = d.a(getAccountInfoUser.c());
        this.b = str;
        this.f = getAccountInfoUser.a();
        this.c = getAccountInfoUser.d();
        Uri f = getAccountInfoUser.f();
        if (f != null) {
            this.d = f.toString();
            this.e = f;
        }
        this.g = getAccountInfoUser.b();
    }

    public gm(@NonNull ProviderUserInfo providerUserInfo) {
        d.a((Object) providerUserInfo);
        this.a = d.a(providerUserInfo.a());
        this.b = d.a(providerUserInfo.e());
        this.c = providerUserInfo.b();
        Uri d = providerUserInfo.d();
        if (d != null) {
            this.d = d.toString();
            this.e = d;
        }
        this.f = null;
        this.g = false;
    }

    public gm(@NonNull w wVar) {
        d.a((Object) wVar);
        this.a = d.a(wVar.a());
        this.b = d.a(wVar.b());
        this.c = wVar.c();
        if (wVar.d() != null) {
            this.e = wVar.d();
            this.d = wVar.d().toString();
        }
        this.f = wVar.e();
        this.g = wVar.f();
    }

    @NonNull
    public String a() {
        return this.a;
    }

    @NonNull
    public String b() {
        return this.b;
    }

    @Nullable
    public String c() {
        return this.c;
    }

    @Nullable
    public Uri d() {
        if (!TextUtils.isEmpty(this.d) && this.e == null) {
            this.e = Uri.parse(this.d);
        }
        return this.e;
    }

    @Nullable
    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }
}
