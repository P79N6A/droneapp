package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;

public final class c {
    public static final String a = "https://www.facebook.com";
    public static final String b = "https://accounts.google.com";
    public static final String c = "https://www.linkedin.com";
    public static final String d = "https://login.live.com";
    public static final String e = "https://www.paypal.com";
    public static final String f = "https://twitter.com";
    public static final String g = "https://login.yahoo.com";

    private c() {
    }

    @Nullable
    public static final String a(@NonNull Account account) {
        d.a((Object) account, (Object) "account cannot be null");
        return "com.google".equals(account.type) ? b : "com.facebook.auth.login".equals(account.type) ? a : null;
    }
}
