package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.agy.a;

class agv$1 extends a {
    final /* synthetic */ agy a;
    final /* synthetic */ agv b;

    agv$1(agv com_google_android_gms_internal_agv, agy com_google_android_gms_internal_agy) {
        this.b = com_google_android_gms_internal_agv;
        this.a = com_google_android_gms_internal_agy;
    }

    public void a(int i) {
        agv.h().b("onRemoteDisplayEnded", new Object[0]);
        if (this.a != null) {
            this.a.a(i);
        }
        if (agv.a(this.b) != null) {
            agv.a(this.b).a(new Status(i));
        }
    }
}
