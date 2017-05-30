package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;

public class bi implements aqe {
    private final aoo a;

    public bi(Context context) {
        this(aoo.a(context));
    }

    bi(aoo com_google_android_gms_internal_aoo) {
        this.a = com_google_android_gms_internal_aoo;
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 0);
        if (this.a.b()) {
            z = false;
        }
        return new eb(Boolean.valueOf(z));
    }
}
