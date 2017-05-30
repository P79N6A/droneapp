package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.fimi.kernel.c.c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.update.a.d;
import com.fimi.soul.utils.y;
import com.google.android.gms.maps.model.LatLng;

public class CheckCampassCaliService extends IntentService {
    DroidPlannerApp a;
    private Location b;

    public CheckCampassCaliService() {
        super("CheckCampassCaliService");
    }

    public CheckCampassCaliService(String str) {
        super(str);
    }

    public void onCreate() {
        super.onCreate();
        this.a = (DroidPlannerApp) getApplication();
    }

    protected void onHandleIntent(Intent intent) {
        this.a.a.a(a.XIAOMI_INSURENCE);
        CheckCampssBeann checkCampssBeann = (CheckCampssBeann) c.a().a(com.fimi.soul.drone.g.c.Z, CheckCampssBeann.class);
        if (checkCampssBeann == null) {
            this.a.a.a(a.SHOWCAMPASSCALI);
            return;
        }
        Location c = MyLocationManager.a((Context) this).c();
        if (c == null) {
            this.a.a.a(a.SHOWCAMPASSCALI);
            return;
        }
        LatLng latLng = new LatLng(c.getLatitude(), c.getLongitude());
        double d = 0.0d;
        for (LatLng c2 : checkCampssBeann.getListLatlng()) {
            d = y.c(latLng, c2).a();
            if (d <= 3000.0d) {
                break;
            }
        }
        if (d > 3000.0d) {
            this.a.a.a(a.SHOWCAMPASSCALI);
        }
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        d.a(this.a.a);
    }
}
