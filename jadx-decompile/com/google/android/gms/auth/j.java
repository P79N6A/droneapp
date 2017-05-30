package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.l;
import com.google.android.gms.internal.afb;
import com.google.android.gms.internal.ajl;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class j {
    private static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    private static final ajl c = i.a("GoogleAuthUtil");
    public static final String j = "com.google";
    public static final String k = "com.google.work";
    public static final String l = "suppressProgressScreen";
    public static final String m = (VERSION.SDK_INT >= 11 ? "callerUid" : "callerUid");
    public static final String n = (VERSION.SDK_INT >= 14 ? "androidPackageName" : "androidPackageName");
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;

    private interface a<T> {
        T b(IBinder iBinder);
    }

    class AnonymousClass1 implements a<TokenData> {
        final /* synthetic */ Account a;
        final /* synthetic */ String b;
        final /* synthetic */ Bundle c;

        AnonymousClass1(Account account, String str, Bundle bundle) {
            this.a = account;
            this.b = str;
            this.c = bundle;
        }

        public TokenData a(IBinder iBinder) {
            Bundle bundle = (Bundle) j.b(com.google.android.gms.internal.sr.a.a(iBinder).a(this.a, this.b, this.c));
            TokenData a = TokenData.a(bundle, "tokenDetails");
            if (a != null) {
                return a;
            }
            String string = bundle.getString("Error");
            Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
            afb a2 = afb.a(string);
            if (afb.a(a2)) {
                Object[] objArr = new Object[1];
                String valueOf = String.valueOf(a2);
                objArr[0] = new StringBuilder(String.valueOf(valueOf).length() + 31).append("isUserRecoverableError status: ").append(valueOf).toString();
                j.c.c("GoogleAuthUtil", objArr);
                throw new d(string, intent);
            } else if (afb.b(a2)) {
                throw new IOException(string);
            } else {
                throw new a(string);
            }
        }

        public /* synthetic */ Object b(IBinder iBinder) {
            return a(iBinder);
        }
    }

    class AnonymousClass2 implements a<Void> {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        AnonymousClass2(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        public Void a(IBinder iBinder) {
            Bundle bundle = (Bundle) j.b(com.google.android.gms.internal.sr.a.a(iBinder).a(this.a, this.b));
            String string = bundle.getString("Error");
            if (bundle.getBoolean("booleanResult")) {
                return null;
            }
            throw new a(string);
        }

        public /* synthetic */ Object b(IBinder iBinder) {
            return a(iBinder);
        }
    }

    class AnonymousClass3 implements a<List<AccountChangeEvent>> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        AnonymousClass3(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public List<AccountChangeEvent> a(IBinder iBinder) {
            return ((AccountChangeEventsResponse) j.b(com.google.android.gms.internal.sr.a.a(iBinder).a(new AccountChangeEventsRequest().a(this.a).a(this.b)))).a();
        }

        public /* synthetic */ Object b(IBinder iBinder) {
            return a(iBinder);
        }
    }

    class AnonymousClass4 implements a<Bundle> {
        final /* synthetic */ Account a;

        AnonymousClass4(Account account) {
            this.a = account;
        }

        public Bundle a(IBinder iBinder) {
            return (Bundle) j.b(com.google.android.gms.internal.sr.a.a(iBinder).a(this.a));
        }

        public /* synthetic */ Object b(IBinder iBinder) {
            return a(iBinder);
        }
    }

    j() {
    }

    private static <T> T a(Context context, ComponentName componentName, a<T> aVar) {
        Throwable e;
        ServiceConnection hVar = new h();
        y a = y.a(context);
        if (a.a(componentName, hVar, "GoogleAuthUtil")) {
            try {
                T b = aVar.b(hVar.a());
                a.b(componentName, hVar, "GoogleAuthUtil");
                return b;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    c.b("GoogleAuthUtil", new Object[]{"Error on service connection.", e});
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.b(componentName, hVar, "GoogleAuthUtil");
                }
            } catch (InterruptedException e3) {
                e = e3;
                c.b("GoogleAuthUtil", new Object[]{"Error on service connection.", e});
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    private static void a(Context context) {
        try {
            l.f(context.getApplicationContext());
        } catch (d e) {
            throw new c(e.a(), e.getMessage(), e.b());
        } catch (c e2) {
            throw new a(e2.getMessage());
        }
    }

    static void a(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    @TargetApi(23)
    public static Bundle b(Context context, Account account) {
        com.google.android.gms.common.internal.d.a((Object) context);
        com.google.android.gms.common.internal.d.a((Object) account, (Object) "Account cannot be null.");
        a(context);
        return (Bundle) a(context, a, new AnonymousClass4(account));
    }

    private static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        c.c("GoogleAuthUtil", new Object[]{"Binder call returned null."});
        throw new IOException("Service unavailable.");
    }

    public static String b(Context context, Account account, String str) {
        return e(context, account, str, new Bundle());
    }

    @Deprecated
    public static String b(Context context, String str, String str2) {
        return b(context, new Account(str, "com.google"), str2);
    }

    public static List<AccountChangeEvent> b(Context context, int i, String str) {
        com.google.android.gms.common.internal.d.a(str, (Object) "accountName must be provided");
        com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
        a(context);
        return (List) a(context, a, new AnonymousClass3(str, i));
    }

    @Deprecated
    public static String c(Context context, String str, String str2, Bundle bundle) {
        return e(context, new Account(str, "com.google"), str2, bundle);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void d(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static String e(Context context, Account account, String str, Bundle bundle) {
        return f(context, account, str, bundle).a();
    }

    public static void e(Context context, String str) {
        com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
        a(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(n)) {
            bundle.putString(n, str2);
        }
        a(context, a, new AnonymousClass2(str, bundle));
    }

    public static TokenData f(Context context, Account account, String str, Bundle bundle) {
        com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.common.internal.d.a(str, (Object) "Scope cannot be empty or null.");
        com.google.android.gms.common.internal.d.a((Object) account, (Object) "Account cannot be null.");
        a(context);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(n))) {
            bundle2.putString(n, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) a(context, a, new AnonymousClass1(account, str, bundle2));
    }

    public static String f(Context context, String str) {
        com.google.android.gms.common.internal.d.a(str, (Object) "accountName must be provided");
        com.google.android.gms.common.internal.d.c("Calling this from your main thread can lead to deadlock");
        a(context);
        return c(context, str, "^^_account_id_^^", new Bundle());
    }
}
