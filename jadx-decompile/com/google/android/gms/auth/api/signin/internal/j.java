package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class j {
    private static final Lock a = new ReentrantLock();
    private static j b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    j(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static j a(Context context) {
        d.a((Object) context);
        a.lock();
        try {
            if (b == null) {
                b = new j(context.getApplicationContext());
            }
            j jVar = b;
            return jVar;
        } finally {
            a.unlock();
        }
    }

    private String b(String str, String str2) {
        String valueOf = String.valueOf(":");
        return new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }

    public GoogleSignInAccount a() {
        return a(c("defaultGoogleSignInAccount"));
    }

    GoogleSignInAccount a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String c = c(b("googleSignInAccount", str));
            if (c != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    void a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        d.a((Object) googleSignInAccount);
        d.a((Object) googleSignInOptions);
        String k = googleSignInAccount.k();
        a(b("googleSignInAccount", k), googleSignInAccount.n());
        a(b("googleSignInOptions", k), googleSignInOptions.i());
    }

    protected void a(String str, String str2) {
        this.c.lock();
        try {
            this.d.edit().putString(str, str2).apply();
        } finally {
            this.c.unlock();
        }
    }

    public GoogleSignInOptions b() {
        return b(c("defaultGoogleSignInAccount"));
    }

    GoogleSignInOptions b(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (!TextUtils.isEmpty(str)) {
            String c = c(b("googleSignInOptions", str));
            if (c != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInOptions;
    }

    public void b(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        d.a((Object) googleSignInAccount);
        d.a((Object) googleSignInOptions);
        a("defaultGoogleSignInAccount", googleSignInAccount.k());
        a(googleSignInAccount, googleSignInOptions);
    }

    protected String c(String str) {
        this.c.lock();
        try {
            String string = this.d.getString(str, null);
            return string;
        } finally {
            this.c.unlock();
        }
    }

    public void c() {
        String c = c("defaultGoogleSignInAccount");
        e("defaultGoogleSignInAccount");
        d(c);
    }

    void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(b("googleSignInAccount", str));
            e(b("googleSignInOptions", str));
        }
    }

    protected void e(String str) {
        this.c.lock();
        try {
            this.d.edit().remove(str).apply();
        } finally {
            this.c.unlock();
        }
    }
}
