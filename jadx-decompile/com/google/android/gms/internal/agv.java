package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.d.b;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.agx.a;

public class agv extends w<agx> implements DeathRecipient {
    private static final m a = new m("CastRemoteDisplayClientImpl");
    private b e;
    private CastDevice f;
    private Bundle g;

    public agv(Context context, Looper looper, s sVar, CastDevice castDevice, Bundle bundle, b bVar, g.b bVar2, c cVar) {
        super(context, looper, 83, sVar, bVar2, cVar);
        a.b("instance created", new Object[0]);
        this.e = bVar;
        this.f = castDevice;
        this.g = bundle;
    }

    public agx a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    public void a(agw com_google_android_gms_internal_agw) {
        a.b("stopRemoteDisplay", new Object[0]);
        ((agx) G()).a(com_google_android_gms_internal_agw);
    }

    public void a(agw com_google_android_gms_internal_agw, int i) {
        ((agx) G()).a(com_google_android_gms_internal_agw, i);
    }

    public void a(agw com_google_android_gms_internal_agw, agy com_google_android_gms_internal_agy, String str) {
        a.b("startRemoteDisplay", new Object[0]);
        agw com_google_android_gms_internal_agw2 = com_google_android_gms_internal_agw;
        ((agx) G()).a(com_google_android_gms_internal_agw2, new 1(this, com_google_android_gms_internal_agy), this.f.b(), str, this.g);
    }

    public /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    public void binderDied() {
    }

    public void f() {
        a.b("disconnect", new Object[0]);
        this.e = null;
        this.f = null;
        try {
            ((agx) G()).b();
            super.f();
        } catch (RemoteException e) {
            super.f();
        } catch (IllegalStateException e2) {
            super.f();
        } catch (Throwable th) {
            super.f();
        }
    }
}
