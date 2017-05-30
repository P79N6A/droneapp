package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.u;
import java.lang.ref.WeakReference;

@aaa
class acu extends acw implements OnGlobalLayoutListener {
    private final WeakReference<OnGlobalLayoutListener> a;

    public acu(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.a = new WeakReference(onGlobalLayoutListener);
    }

    protected void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    protected void b(ViewTreeObserver viewTreeObserver) {
        u.g().a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
