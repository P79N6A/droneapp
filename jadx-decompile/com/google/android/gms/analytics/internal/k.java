package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public final class k {
    static Object a = new Object();
    static aon b;
    static Boolean c;

    public static boolean a(Context context) {
        d.a((Object) context);
        if (c != null) {
            return c.booleanValue();
        }
        boolean a = p.a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        c = Boolean.valueOf(a);
        return a;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void a(Context context, Intent intent) {
        v a = v.a(context);
        g f = a.f();
        if (intent == null) {
            f.t("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (a.e().a()) {
            f.a("Device AnalyticsReceiver got", action);
        } else {
            f.a("Local AnalyticsReceiver got", action);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a2 = l.a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        if (b == null) {
                            b = new aon(context, 1, "Analytics WakeLock");
                            b.a(false);
                        }
                        b.a(1000);
                    } catch (SecurityException e) {
                        f.t("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                    return;
                }
            }
        }
    }
}
