package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.zd;
import com.tencent.mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@aaa
public class c extends abq implements ServiceConnection {
    private final Object a;
    private boolean b;
    private Context c;
    private zd d;
    private b e;
    private h f;
    private List<f> g;
    private k h;

    public c(Context context, zd zdVar, k kVar) {
        this(context, zdVar, kVar, new b(context), h.a(context.getApplicationContext()));
    }

    c(Context context, zd zdVar, k kVar, b bVar, h hVar) {
        this.a = new Object();
        this.b = false;
        this.g = null;
        this.c = context;
        this.d = zdVar;
        this.h = kVar;
        this.e = bVar;
        this.f = hVar;
        this.g = this.f.a(10);
    }

    private void a(long j) {
        do {
            if (!b(j)) {
                abr.e("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.b);
    }

    private boolean b(long j) {
        long elapsedRealtime = Util.MILLSECONDS_OF_MINUTE - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            b.d("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void a() {
        synchronized (this.a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.b.a().a(this.c, intent, this, 1);
            a(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.b.a().a(this.c, this);
            this.e.a();
        }
    }

    protected void a(final f fVar, String str, String str2) {
        final Intent intent = new Intent();
        u.s();
        intent.putExtra("RESPONSE_CODE", 0);
        u.s();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        u.s();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        abv.a.post(new Runnable(this) {
            final /* synthetic */ c c;

            public void run() {
                try {
                    if (this.c.h.a(fVar.b, -1, intent)) {
                        this.c.d.a(new g(this.c.c, fVar.c, true, -1, intent, fVar));
                    } else {
                        this.c.d.a(new g(this.c.c, fVar.c, false, -1, intent, fVar));
                    }
                } catch (RemoteException e) {
                    b.d("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    public void b() {
        synchronized (this.a) {
            com.google.android.gms.common.stats.b.a().a(this.c, this);
            this.e.a();
        }
    }

    protected void c() {
        if (!this.g.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (f fVar : this.g) {
                hashMap.put(fVar.c, fVar);
            }
            String str = null;
            while (true) {
                Bundle b = this.e.b(this.c.getPackageName(), str);
                if (b == null || u.s().a(b) != 0) {
                    break;
                }
                ArrayList stringArrayList = b.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = b.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = b.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String string = b.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        str = (String) stringArrayList.get(i);
                        String str2 = (String) stringArrayList2.get(i);
                        String str3 = (String) stringArrayList3.get(i);
                        f fVar2 = (f) hashMap.get(str);
                        if (fVar2.b.equals(u.s().a(str2))) {
                            a(fVar2, str2, str3);
                            hashMap.remove(str);
                        }
                    }
                }
                if (string == null || hashMap.isEmpty()) {
                    break;
                }
                str = string;
            }
            for (String str4 : hashMap.keySet()) {
                this.f.a((f) hashMap.get(str4));
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.e.a(iBinder);
            c();
            this.b = true;
            this.a.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        b.c("In-app billing service disconnected.");
        this.e.a();
    }
}
