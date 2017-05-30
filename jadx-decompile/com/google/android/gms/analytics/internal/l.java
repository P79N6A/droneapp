package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public final class l {
    private static Boolean d;
    private final Handler a = new Handler();
    private final a b;
    private final Context c;

    public interface a {
        Context a();

        boolean a(int i);
    }

    public l(a aVar) {
        this.c = aVar.a();
        d.a(this.c);
        this.b = aVar;
    }

    public static boolean a(Context context) {
        d.a((Object) context);
        if (d != null) {
            return d.booleanValue();
        }
        boolean a = p.a(context, "com.google.android.gms.analytics.AnalyticsService");
        d = Boolean.valueOf(a);
        return a;
    }

    private void c() {
        try {
            synchronized (k.a) {
                aon com_google_android_gms_internal_aon = k.b;
                if (com_google_android_gms_internal_aon != null && com_google_android_gms_internal_aon.b()) {
                    com_google_android_gms_internal_aon.a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public int a(Intent intent, int i, final int i2) {
        c();
        final v a = v.a(this.c);
        final g f = a.f();
        if (intent == null) {
            f.t("AnalyticsService started with null intent");
        } else {
            String action = intent.getAction();
            if (a.e().a()) {
                f.a("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            } else {
                f.a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            }
            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
                a.i().a(new am(this) {
                    final /* synthetic */ l d;

                    public void a(Throwable th) {
                        this.d.a.post(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                if (!this.a.d.b.a(i2)) {
                                    return;
                                }
                                if (a.e().a()) {
                                    f.q("Device AnalyticsService processed last dispatch request");
                                } else {
                                    f.q("Local AnalyticsService processed last dispatch request");
                                }
                            }
                        });
                    }
                });
            }
        }
        return 2;
    }

    public IBinder a(Intent intent) {
        return null;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void a() {
        v a = v.a(this.c);
        g f = a.f();
        if (a.e().a()) {
            f.q("Device AnalyticsService is starting up");
        } else {
            f.q("Local AnalyticsService is starting up");
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void b() {
        v a = v.a(this.c);
        g f = a.f();
        if (a.e().a()) {
            f.q("Device AnalyticsService is shutting down");
        } else {
            f.q("Local AnalyticsService is shutting down");
        }
    }
}
