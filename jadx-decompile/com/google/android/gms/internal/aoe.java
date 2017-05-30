package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.UserManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import com.google.android.gms.common.util.s;

public class aoe {
    private final Context a;
    private volatile Boolean b = null;

    public aoe(Context context) {
        this.a = context;
    }

    @TargetApi(17)
    private static int a(Context context, String str, int i) {
        return s.f() ? Global.getInt(context.getContentResolver(), str, i) : Secure.getInt(context.getContentResolver(), str, i);
    }

    public static boolean a(Context context) {
        return s.k() ? c(context) : false;
    }

    public static boolean b(Context context) {
        return a(context, "package_verifier_enable", 1) == 1;
    }

    @TargetApi(21)
    private static boolean c(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.hasUserRestriction("ensure_verify_apps");
    }

    public boolean a() {
        return c() ? b() : b() && b(this.a);
    }

    public boolean b() {
        if (c()) {
            return (s.k() && a(this.a)) || Secure.getInt(this.a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
        } else {
            if (s.h()) {
                return Secure.getInt(this.a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
            } else {
                try {
                    return this.a.createPackageContext("com.android.vending", 2).getSharedPreferences("package_verifer_public_preferences", 1).getBoolean("accepted-anti-malware-consent", false);
                } catch (NameNotFoundException e) {
                    return false;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean c() {
        /*
        r5 = this;
        r0 = 0;
        monitor-enter(r5);
        r1 = r5.b;	 Catch:{ all -> 0x002c }
        if (r1 != 0) goto L_0x0024;
    L_0x0006:
        r1 = r5.a;	 Catch:{ all -> 0x002c }
        r2 = r1.getPackageManager();	 Catch:{ all -> 0x002c }
        r1 = 0;
        r3 = "com.android.vending";
        r4 = 0;
        r1 = r2.getPackageInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x002f }
    L_0x0014:
        if (r1 == 0) goto L_0x001d;
    L_0x0016:
        r1 = r1.versionCode;	 Catch:{ all -> 0x002c }
        r2 = 80440000; // 0x4cb6ac0 float:4.7823105E-36 double:3.97426406E-316;
        if (r1 < r2) goto L_0x001e;
    L_0x001d:
        r0 = 1;
    L_0x001e:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x002c }
        r5.b = r0;	 Catch:{ all -> 0x002c }
    L_0x0024:
        r0 = r5.b;	 Catch:{ all -> 0x002c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x002c }
        monitor-exit(r5);
        return r0;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x002f:
        r2 = move-exception;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aoe.c():boolean");
    }
}
