package com.google.android.gms.internal;

import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.b.d.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

@Deprecated
final class aeh$a implements a {
    private aeh a;
    private i<Status> b;
    private com.google.android.gms.b.a c;

    aeh$a(aeh com_google_android_gms_internal_aeh, i<Status> iVar, com.google.android.gms.b.a aVar) {
        this.a = com_google_android_gms_internal_aeh;
        this.b = iVar;
        this.c = aVar;
    }

    public i<Status> a() {
        return this.b;
    }

    public i<Status> a(g gVar) {
        String packageName = gVar.b().getPackageName();
        UsageInfo a = aef.a(this.c, System.currentTimeMillis(), packageName, 2);
        return this.a.a(gVar, new UsageInfo[]{a});
    }
}
