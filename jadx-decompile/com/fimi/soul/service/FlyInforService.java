package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import com.fimi.kernel.c.c;
import com.fimi.soul.base.a;
import com.fimi.soul.entity.DroneInfoBean;
import com.fimi.soul.entity.UpdateDroneInforBean;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.m;
import com.xiaomi.mipush.sdk.Constants;

public class FlyInforService extends Service {
    private DroneInfoBean a = new DroneInfoBean();
    private c b;

    private void a() {
        Object updateDroneInforBean = new UpdateDroneInforBean();
        User b = a.b(this);
        if (!(b == null || b.getUserID() == null || "".equals(b.getUserID()))) {
            updateDroneInforBean.setUserID(b.getUserID());
        }
        com.fimi.soul.drone.e.a aVar = (com.fimi.soul.drone.e.a) this.b.a("0", com.fimi.soul.drone.e.a.class);
        if (aVar != null) {
            updateDroneInforBean.setPlaneID(aVar.d() + "" + aVar.e() + "" + aVar.g());
            this.a.setFlySoftVersion(aVar.c());
        }
        aVar = (com.fimi.soul.drone.e.a) this.b.a("1", com.fimi.soul.drone.e.a.class);
        if (aVar != null) {
            this.a.setRemoteId(aVar.d() + "" + aVar.e() + "" + aVar.g());
            this.a.setRemoteSoftVersion(aVar.c());
        }
        aVar = (com.fimi.soul.drone.e.a) this.b.a("3", com.fimi.soul.drone.e.a.class);
        if (aVar != null) {
            this.a.setCoulidId(aVar.d() + "" + aVar.e() + "" + aVar.g());
            this.a.setCloudSoftVersion(aVar.c());
        }
        aVar = (com.fimi.soul.drone.e.a) this.b.a(m.n, com.fimi.soul.drone.e.a.class);
        if (aVar != null) {
            this.a.setLightStreamVersion(aVar.c());
        }
        updateDroneInforBean.setmDroneInfoBean(this.a);
        this.b.a(com.fimi.soul.drone.g.c.r, updateDroneInforBean);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.b = c.a();
        this.a.setPhoneDevice(ao.g(getApplicationContext()).substring(0, ao.g(getApplicationContext()).indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        this.a.setTelePhoneId(ao.g(getApplicationContext()).substring(ao.g(getApplicationContext()).indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP) + 1));
        this.a.setAppSoftVersion(ao.d(getApplicationContext()));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if (ao.b(getApplicationContext())) {
            new com.fimi.soul.biz.b.a(getApplicationContext()).a();
        }
        a();
        return super.onStartCommand(intent, i, i2);
    }
}
