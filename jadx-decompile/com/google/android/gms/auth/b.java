package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.l;
import java.util.List;

public final class b extends j {
    public static final String a = "com.google";
    public static final String b = "com.google.work";
    public static final String c = "suppressProgressScreen";
    public static final String d = j.m;
    public static final String e = j.n;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;

    private b() {
    }

    @TargetApi(23)
    public static Bundle a(Context context, Account account) {
        return j.b(context, account);
    }

    public static String a(Context context, Account account, String str) {
        return j.b(context, account, str);
    }

    public static String a(Context context, Account account, String str, Bundle bundle) {
        return b(context, account, str, bundle).a();
    }

    public static String a(Context context, Account account, String str, Bundle bundle, Intent intent) {
        j.a(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("callback_intent", intent);
        bundle.putBoolean("handle_notification", true);
        return g(context, account, str, bundle).a();
    }

    public static String a(Context context, Account account, String str, Bundle bundle, String str2, Bundle bundle2) {
        d.a(str2, (Object) "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return g(context, account, str, bundle).a();
    }

    @Deprecated
    public static String a(Context context, String str, String str2) {
        return j.b(context, str, str2);
    }

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle) {
        return a(context, new Account(str, "com.google"), str2, bundle);
    }

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle, Intent intent) {
        return a(context, new Account(str, "com.google"), str2, bundle, intent);
    }

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) {
        return a(context, new Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    public static List<AccountChangeEvent> a(Context context, int i, String str) {
        return j.b(context, i, str);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void a(Context context, String str) {
        j.d(context, str);
    }

    public static TokenData b(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return g(context, account, str, bundle);
    }

    @Deprecated
    public static String b(Context context, String str, String str2, Bundle bundle) {
        return j.c(context, str, str2, bundle);
    }

    public static void b(Context context, String str) {
        j.e(context, str);
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        return j.e(context, account, str, bundle);
    }

    public static String c(Context context, String str) {
        return j.f(context, str);
    }

    public static TokenData d(Context context, Account account, String str, Bundle bundle) {
        return j.f(context, account, str, bundle);
    }

    private static TokenData g(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            TokenData d = d(context, account, str, bundle);
            l.i(context);
            return d;
        } catch (Throwable e) {
            e.a(e.a(), context);
            Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new e("User intervention required. Notification has been pushed.");
        } catch (Throwable e2) {
            l.i(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new e("User intervention required. Notification has been pushed.");
        }
    }
}
