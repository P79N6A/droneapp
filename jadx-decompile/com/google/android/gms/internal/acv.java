package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@aaa
class acv extends acw implements OnScrollChangedListener {
    private final WeakReference<OnScrollChangedListener> a;

    public acv(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.a = new WeakReference(onScrollChangedListener);
    }

    protected void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    protected void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            b();
        }
    }
}
