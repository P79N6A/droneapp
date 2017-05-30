package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.yx;
import com.google.android.gms.internal.yz.a;

@aaa
public class e extends a implements ServiceConnection {
    h a;
    private final Activity b;
    private Context c;
    private yx d;
    private b e;
    private f f;
    private j g;
    private k h;
    private String i = null;

    public e(Activity activity) {
        this.b = activity;
        this.a = h.a(this.b.getApplicationContext());
    }

    public void a() {
        GInAppPurchaseManagerInfoParcel a = GInAppPurchaseManagerInfoParcel.a(this.b.getIntent());
        this.g = a.e;
        this.h = a.b;
        this.d = a.c;
        this.e = new b(this.b.getApplicationContext());
        this.c = a.d;
        if (this.b.getResources().getConfiguration().orientation == 2) {
            this.b.setRequestedOrientation(u.g().a());
        } else {
            this.b.setRequestedOrientation(u.g().b());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.b.bindService(intent, this, 1);
    }

    public void a(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int a = u.s().a(intent);
                if (i2 == -1) {
                    u.s();
                    if (a == 0) {
                        if (this.h.a(this.i, i2, intent)) {
                            z = true;
                        }
                        this.d.c(a);
                        this.b.finish();
                        a(this.d.a(), z, i2, intent);
                    }
                }
                this.a.a(this.f);
                this.d.c(a);
                this.b.finish();
                a(this.d.a(), z, i2, intent);
            } catch (RemoteException e) {
                b.d("Fail to process purchase result.");
                this.b.finish();
            } finally {
                this.i = null;
            }
        }
    }

    protected void a(String str, boolean z, int i, Intent intent) {
        if (this.g != null) {
            this.g.a(str, z, i, intent, this.f);
        }
    }

    public void b() {
        this.b.unbindService(this);
        this.e.a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Throwable e;
        this.e.a(iBinder);
        try {
            this.i = this.h.a();
            Bundle a = this.e.a(this.b.getPackageName(), this.d.a(), this.i);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int a2 = u.s().a(a);
                this.d.c(a2);
                a(this.d.a(), false, a2, null);
                this.b.finish();
                return;
            }
            this.f = new f(this.d.a(), this.i);
            this.a.b(this.f);
            this.b.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        } catch (RemoteException e2) {
            e = e2;
            b.d("Error when connecting in-app billing service", e);
            this.b.finish();
        } catch (SendIntentException e3) {
            e = e3;
            b.d("Error when connecting in-app billing service", e);
            this.b.finish();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        b.c("In-app billing service disconnected.");
        this.e.a();
    }
}
