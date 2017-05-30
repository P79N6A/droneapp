package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public class CampaignTrackingService extends Service {
    private static Boolean b;
    private Handler a;

    private void a() {
        try {
            synchronized (CampaignTrackingReceiver.a) {
                aon com_google_android_gms_internal_aon = CampaignTrackingReceiver.b;
                if (com_google_android_gms_internal_aon != null && com_google_android_gms_internal_aon.b()) {
                    com_google_android_gms_internal_aon.a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    public static boolean a(Context context) {
        d.a((Object) context);
        if (b != null) {
            return b.booleanValue();
        }
        boolean a = p.a(context, "com.google.android.gms.analytics.CampaignTrackingService");
        b = Boolean.valueOf(a);
        return a;
    }

    private Handler b() {
        Handler handler = this.a;
        if (handler != null) {
            return handler;
        }
        handler = new Handler(getMainLooper());
        this.a = handler;
        return handler;
    }

    protected void a(final g gVar, Handler handler, final int i) {
        handler.post(new Runnable(this) {
            final /* synthetic */ CampaignTrackingService c;

            public void run() {
                boolean stopSelfResult = this.c.stopSelfResult(i);
                if (stopSelfResult) {
                    gVar.a("Install campaign broadcast processed", Boolean.valueOf(stopSelfResult));
                }
            }
        });
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onCreate() {
        super.onCreate();
        v.a((Context) this).f().q("CampaignTrackingService is starting up");
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onDestroy() {
        v.a((Context) this).f().q("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public int onStartCommand(Intent intent, int i, final int i2) {
        a();
        v a = v.a((Context) this);
        final g f = a.f();
        String str = null;
        if (a.e().a()) {
            f.u("Unexpected installation campaign (package side)");
        } else {
            str = intent.getStringExtra("referrer");
        }
        final Handler b = b();
        if (TextUtils.isEmpty(str)) {
            if (!a.e().a()) {
                f.t("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            a.h().a(new Runnable(this) {
                final /* synthetic */ CampaignTrackingService d;

                public void run() {
                    this.d.a(f, b, i2);
                }
            });
        } else {
            int e = a.e().e();
            if (str.length() > e) {
                f.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(e));
                str = str.substring(0, e);
            }
            f.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(i2), str);
            a.i().a(str, new Runnable(this) {
                final /* synthetic */ CampaignTrackingService d;

                public void run() {
                    this.d.a(f, b, i2);
                }
            });
        }
        return 2;
    }
}
