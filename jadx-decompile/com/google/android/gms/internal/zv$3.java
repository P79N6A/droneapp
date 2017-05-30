package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

class zv$3 implements OnGlobalLayoutListener {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ zv b;

    zv$3(zv zvVar, WeakReference weakReference) {
        this.b = zvVar;
        this.a = weakReference;
    }

    public void onGlobalLayout() {
        zv.a(this.b, this.a, false);
    }
}
