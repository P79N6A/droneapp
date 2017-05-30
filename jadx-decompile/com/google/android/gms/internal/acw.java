package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@aaa
abstract class acw {
    private final WeakReference<View> a;

    public acw(View view) {
        this.a = new WeakReference(view);
    }

    public final void a() {
        ViewTreeObserver c = c();
        if (c != null) {
            a(c);
        }
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    public final void b() {
        ViewTreeObserver c = c();
        if (c != null) {
            b(c);
        }
    }

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    protected ViewTreeObserver c() {
        View view = (View) this.a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
    }
}
