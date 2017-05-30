package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;

public class tf$c implements tm {
    @Nullable
    private final View a;
    @Nullable
    private final abi b;

    public tf$c(View view, abi com_google_android_gms_internal_abi) {
        this.a = view;
        this.b = com_google_android_gms_internal_abi;
    }

    public View a() {
        return this.a;
    }

    public boolean b() {
        return this.b == null || this.a == null;
    }

    public tm c() {
        return this;
    }
}
