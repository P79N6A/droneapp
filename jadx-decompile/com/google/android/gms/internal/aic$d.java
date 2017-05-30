package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.p.f;
import java.util.Collections;

class aic$d implements f {
    final /* synthetic */ aic a;
    private final a.f b;
    private final ahh<?> c;

    public aic$d(aic com_google_android_gms_internal_aic, a.f fVar, ahh<?> com_google_android_gms_internal_ahh_) {
        this.a = com_google_android_gms_internal_aic;
        this.b = fVar;
        this.c = com_google_android_gms_internal_ahh_;
    }

    @WorkerThread
    public void a(@NonNull ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            this.b.a(null, Collections.emptySet());
        } else {
            ((aic$c) aic.g(this.a).get(this.c)).a(connectionResult);
        }
    }
}
