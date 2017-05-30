package com.google.firebase.auth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.OAuth;

public class r extends a {
    private final String a;
    private final String b;

    r(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        this.a = a(str, "idToken");
        this.b = a(str2, OAuth.ACCESS_TOKEN);
    }

    public static VerifyAssertionRequest a(@NonNull r rVar) {
        d.a(rVar);
        return new VerifyAssertionRequest(rVar.c(), rVar.b(), rVar.a(), null, null);
    }

    private static String a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    public String a() {
        return s.a;
    }

    @Nullable
    public String b() {
        return this.b;
    }

    @Nullable
    public String c() {
        return this.a;
    }
}
