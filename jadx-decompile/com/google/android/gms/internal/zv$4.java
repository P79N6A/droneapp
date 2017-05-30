package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

class zv$4 implements OnScrollChangedListener {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ zv b;

    zv$4(zv zvVar, WeakReference weakReference) {
        this.b = zvVar;
        this.a = weakReference;
    }

    public void onScrollChanged() {
        zv.a(this.b, this.a, true);
    }
}
