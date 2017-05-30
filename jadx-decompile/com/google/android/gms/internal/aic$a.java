package com.google.android.gms.internal;

import com.google.android.gms.common.api.u;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class aic$a extends PhantomReference<u<?>> {
    final /* synthetic */ aic a;
    private final int b;

    public aic$a(aic com_google_android_gms_internal_aic, u uVar, int i, ReferenceQueue<u<?>> referenceQueue) {
        this.a = com_google_android_gms_internal_aic;
        super(uVar, referenceQueue);
        this.b = i;
    }

    public void a() {
        aic.a(this.a).sendMessage(aic.a(this.a).obtainMessage(2, this.b, 2));
    }
}
