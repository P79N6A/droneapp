package it.sephiroth.android.library.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewConfiguration;

final class AbsHListView$d implements Runnable {
    final /* synthetic */ AbsHListView a;

    AbsHListView$d(AbsHListView absHListView) {
        this.a = absHListView;
    }

    public void run() {
        if (this.a.aa == 0) {
            this.a.aa = 1;
            View childAt = this.a.getChildAt(this.a.S - this.a.aw);
            if (childAt != null && !childAt.hasFocusable()) {
                this.a.z = 0;
                if (this.a.aK) {
                    this.a.aa = 2;
                    return;
                }
                childAt.setPressed(true);
                this.a.setPressed(true);
                this.a.h();
                this.a.a(this.a.S, childAt);
                this.a.refreshDrawableState();
                int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                boolean isLongClickable = this.a.isLongClickable();
                if (this.a.E != null) {
                    Drawable current = this.a.E.getCurrent();
                    if (current != null && (current instanceof TransitionDrawable)) {
                        if (isLongClickable) {
                            ((TransitionDrawable) current).startTransition(longPressTimeout);
                        } else {
                            ((TransitionDrawable) current).resetTransition();
                        }
                    }
                }
                if (isLongClickable) {
                    if (AbsHListView.c(this.a) == null) {
                        AbsHListView.a(this.a, new AbsHListView$c(this.a));
                    }
                    AbsHListView.c(this.a).a();
                    this.a.postDelayed(AbsHListView.c(this.a), (long) longPressTimeout);
                    return;
                }
                this.a.aa = 2;
            }
        }
    }
}
