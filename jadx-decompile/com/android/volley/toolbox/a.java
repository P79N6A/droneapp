package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class a implements b {
    private final AccountManager a;
    private final Account b;
    private final String c;
    private final boolean d;

    a(AccountManager accountManager, Account account, String str, boolean z) {
        this.a = accountManager;
        this.b = account;
        this.c = str;
        this.d = z;
    }

    public a(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    public a(Context context, Account account, String str, boolean z) {
        this(AccountManager.get(context), account, str, z);
    }

    public Account a() {
        return this.b;
    }

    public void a(String str) {
        this.a.invalidateAuthToken(this.b.type, str);
    }

    public String b() {
        String str = null;
        AccountManagerFuture authToken = this.a.getAuthToken(this.b, this.c, this.d, null, null);
        try {
            Bundle bundle = (Bundle) authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (bundle.containsKey("intent")) {
                    throw new com.android.volley.a((Intent) bundle.getParcelable("intent"));
                }
                str = bundle.getString("authtoken");
            }
            if (str != null) {
                return str;
            }
            throw new com.android.volley.a("Got null auth token for type: " + this.c);
        } catch (Exception e) {
            throw new com.android.volley.a("Error while retrieving auth token", e);
        }
    }
}
