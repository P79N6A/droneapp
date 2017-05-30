package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.aem.a;

public class aej extends w<aem> {
    private final String a;

    public aej(Context context, Looper looper, b bVar, c cVar, s sVar) {
        super(context, looper, 77, sVar, bVar, cVar);
        this.a = sVar.h();
    }

    private Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("authPackage", this.a);
        return bundle;
    }

    protected aem a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.appinvite.service.START";
    }

    public void a(ael com_google_android_gms_internal_ael) {
        try {
            ((aem) G()).a(com_google_android_gms_internal_ael);
        } catch (RemoteException e) {
        }
    }

    public void a(ael com_google_android_gms_internal_ael, String str) {
        try {
            ((aem) G()).b(com_google_android_gms_internal_ael, str);
        } catch (RemoteException e) {
        }
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.appinvite.internal.IAppInviteService";
    }

    public void b(ael com_google_android_gms_internal_ael, String str) {
        try {
            ((aem) G()).a(com_google_android_gms_internal_ael, str);
        } catch (RemoteException e) {
        }
    }

    protected Bundle c() {
        return h();
    }
}
