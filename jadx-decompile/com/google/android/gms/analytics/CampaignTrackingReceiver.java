package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aon;

public class CampaignTrackingReceiver extends BroadcastReceiver {
    static Object a = new Object();
    static aon b;
    static Boolean c;

    public static boolean a(Context context) {
        d.a((Object) context);
        if (c != null) {
            return c.booleanValue();
        }
        boolean a = p.a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        c = Boolean.valueOf(a);
        return a;
    }

    protected Class<? extends CampaignTrackingService> a() {
        return CampaignTrackingService.class;
    }

    protected void a(Context context, String str) {
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(Context context, Intent intent) {
        v a = v.a(context);
        g f = a.f();
        if (intent == null) {
            f.t("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        f.a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            f.t("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        boolean a2 = CampaignTrackingService.a(context);
        if (!a2) {
            f.t("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        a(context, stringExtra);
        if (a.e().a()) {
            f.u("Received unexpected installation campaign on package side");
            return;
        }
        Object a3 = a();
        d.a(a3);
        Intent intent2 = new Intent(context, a3);
        intent2.putExtra("referrer", stringExtra);
        synchronized (a) {
            context.startService(intent2);
            if (a2) {
                try {
                    if (b == null) {
                        b = new aon(context, 1, "Analytics campaign WakeLock");
                        b.a(false);
                    }
                    b.a(1000);
                } catch (SecurityException e) {
                    f.t("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
                return;
            }
        }
    }
}
