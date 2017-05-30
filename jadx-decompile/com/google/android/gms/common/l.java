package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.s;
import com.google.android.gms.common.util.y;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class l {
    private static String a = null;
    private static int b = 0;
    private static boolean c = false;
    private static final AtomicBoolean d = new AtomicBoolean();
    @Deprecated
    public static final int e = b();
    @Deprecated
    public static final String f = "com.google.android.gms";
    public static final String g = "com.android.vending";
    public static boolean h = false;
    public static boolean i = false;
    static boolean j = false;
    static final AtomicBoolean k = new AtomicBoolean();

    l() {
    }

    private static void a(Context context) {
        if (!d.get()) {
            b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != e) {
                int i = e;
                int i2 = b;
                String valueOf = String.valueOf("com.google.android.gms.version");
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(i).append(" but found ").append(i2).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(valueOf).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
    }

    @Deprecated
    public static boolean a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(19)
    @Deprecated
    public static boolean a(Context context, int i, String str) {
        return y.a(context, i, str);
    }

    @TargetApi(21)
    static boolean a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (equals && d.a()) {
            return false;
        }
        if (s.k()) {
            for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            boolean z = applicationInfo.enabled && !n(context);
            return z;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    private static int b() {
        return q.a;
    }

    @Deprecated
    public static PendingIntent b(int i, Context context, int i2) {
        return j.b().a(context, i, i2);
    }

    private static void b(Context context) {
        if (!c) {
            c(context);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(android.content.Context r7) {
        /*
        r6 = 1;
        r0 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x003a }
        a = r0;	 Catch:{ NameNotFoundException -> 0x003a }
        r0 = com.google.android.gms.internal.ajp.b(r7);	 Catch:{ NameNotFoundException -> 0x003a }
        r1 = com.google.android.gms.common.internal.b.b(r7);	 Catch:{ NameNotFoundException -> 0x003a }
        b = r1;	 Catch:{ NameNotFoundException -> 0x003a }
        r1 = "com.google.android.gms";
        r2 = 64;
        r0 = r0.b(r1, r2);	 Catch:{ NameNotFoundException -> 0x003a }
        if (r0 == 0) goto L_0x0036;
    L_0x001b:
        r1 = com.google.android.gms.common.m.a(r7);	 Catch:{ NameNotFoundException -> 0x003a }
        r2 = 1;
        r2 = new com.google.android.gms.common.k.a[r2];	 Catch:{ NameNotFoundException -> 0x003a }
        r3 = 0;
        r4 = com.google.android.gms.common.k.d.a;	 Catch:{ NameNotFoundException -> 0x003a }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ NameNotFoundException -> 0x003a }
        r2[r3] = r4;	 Catch:{ NameNotFoundException -> 0x003a }
        r0 = r1.a(r0, r2);	 Catch:{ NameNotFoundException -> 0x003a }
        if (r0 == 0) goto L_0x0036;
    L_0x0030:
        r0 = 1;
        j = r0;	 Catch:{ NameNotFoundException -> 0x003a }
    L_0x0033:
        c = r6;
    L_0x0035:
        return;
    L_0x0036:
        r0 = 0;
        j = r0;	 Catch:{ NameNotFoundException -> 0x003a }
        goto L_0x0033;
    L_0x003a:
        r0 = move-exception;
        r1 = "GooglePlayServicesUtil";
        r2 = "Cannot find Google Play services package name.";
        android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x0045 }
        c = r6;
        goto L_0x0035;
    L_0x0045:
        r0 = move-exception;
        c = r6;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.l.c(android.content.Context):void");
    }

    @Deprecated
    public static boolean c(Context context, int i) {
        return y.a(context, i);
    }

    @Deprecated
    public static String d(int i) {
        return ConnectionResult.a(i);
    }

    @Deprecated
    public static boolean d(Context context, int i) {
        return i == 18 ? true : i == 1 ? a(context, "com.google.android.gms") : false;
    }

    @Deprecated
    public static int e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            a(context);
        }
        int i = !i.a(context) ? 1 : 0;
        PackageInfo packageInfo = null;
        if (i != 0) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            m a = m.a(context);
            if (i != 0) {
                if (a.a(packageInfo, d.a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                }
                if (a.a(packageInfo2, a.a(packageInfo, d.a)) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else if (a.a(packageInfo2, d.a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (com.google.android.gms.common.util.l.a(packageInfo2.versionCode) < com.google.android.gms.common.util.l.a(e)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + e + " but found " + packageInfo2.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static Intent e(int i) {
        return j.b().a(null, i, null);
    }

    @Deprecated
    public static boolean e(Context context, int i) {
        return i == 9 ? a(context, "com.android.vending") : false;
    }

    @Deprecated
    public static void f(Context context) {
        int a = j.b().a(context);
        if (a != 0) {
            Intent a2 = j.b().a(context, a, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new c(a);
            }
            throw new d(a, "Google Play Services not available", a2);
        }
    }

    static boolean f(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 18:
            case 42:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static boolean g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean g(Context context) {
        b(context);
        return j;
    }

    public static boolean h(Context context) {
        return g(context) || !a();
    }

    @Deprecated
    public static void i(Context context) {
        if (!k.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    @Deprecated
    public static String j(Context context) {
        InputStream openInputStream;
        try {
            openInputStream = context.getContentResolver().openInputStream(new Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build());
            String next = new Scanner(openInputStream).useDelimiter("\\A").next();
            if (openInputStream == null) {
                return next;
            }
            openInputStream.close();
            return next;
        } catch (NoSuchElementException e) {
            if (openInputStream != null) {
                openInputStream.close();
            }
            return null;
        } catch (Exception e2) {
            return null;
        } catch (Throwable th) {
            if (openInputStream != null) {
                openInputStream.close();
            }
        }
    }

    public static Resources k(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static Context l(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    public static int m(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return i;
        }
    }

    @TargetApi(18)
    public static boolean n(Context context) {
        if (s.g()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
}
