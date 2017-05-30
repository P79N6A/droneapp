package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public class tf$d implements tm {
    private final WeakReference<View> a;
    private final WeakReference<abi> b;

    public tf$d(View view, abi com_google_android_gms_internal_abi) {
        this.a = new WeakReference(view);
        this.b = new WeakReference(com_google_android_gms_internal_abi);
    }

    public View a() {
        return (View) this.a.get();
    }

    public boolean b() {
        return this.a.get() == null || this.b.get() == null;
    }

    public tm c() {
        return new tf$c((View) this.a.get(), (abi) this.b.get());
    }
}
