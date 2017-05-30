package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.d;

public class al extends t {
    private boolean a;
    private boolean b;
    private AlarmManager c = ((AlarmManager) o().getSystemService("alarm"));

    protected al(v vVar) {
        super(vVar);
    }

    private PendingIntent f() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(o(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(o(), 0, intent, 0);
    }

    protected void a() {
        try {
            this.c.cancel(f());
            if (q().j() > 0) {
                ActivityInfo receiverInfo = o().getPackageManager().getReceiverInfo(new ComponentName(o(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2);
                if (receiverInfo != null && receiverInfo.enabled) {
                    q("Receiver registered. Using alarm for local dispatch.");
                    this.a = true;
                }
            }
        } catch (NameNotFoundException e) {
        }
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public void d() {
        D();
        d.a(b(), (Object) "Receiver not registered");
        long j = q().j();
        if (j > 0) {
            e();
            long b = n().b() + j;
            this.b = true;
            this.c.setInexactRepeating(2, b, 0, f());
        }
    }

    public void e() {
        D();
        this.b = false;
        this.c.cancel(f());
    }
}
