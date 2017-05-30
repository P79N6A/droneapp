package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.u;
import java.util.Iterator;

public class ahr extends ahm {
    public void a() {
        Object obj = null;
        super.a();
        Iterator it = obj.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a();
        }
        obj.clear();
        obj.a(this);
    }

    protected void a(ConnectionResult connectionResult, int i) {
        aic com_google_android_gms_internal_aic = null;
        com_google_android_gms_internal_aic.b(connectionResult, i);
    }

    protected void c() {
        aic com_google_android_gms_internal_aic = null;
        com_google_android_gms_internal_aic.b();
    }
}
