package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.fimi.kernel.c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.d.b;

public class DroneFaultService extends Service implements b {
    public a a;
    public DroidPlannerApp b;

    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[d.a.values().length];
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.b = (DroidPlannerApp) getApplication();
        this.a = this.b.a;
        this.a.a((b) this);
    }

    public void onDestroy() {
        startService(new Intent(this, DroneFaultService.class));
        this.a.b((b) this);
        super.onDestroy();
    }

    public void onDroneEvent(d.a aVar, a aVar2) {
        String str = "";
        str = "";
        if (c.d() == null) {
            stopSelf();
        } else {
            int i = AnonymousClass1.a[aVar.ordinal()];
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
