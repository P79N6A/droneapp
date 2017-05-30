package it.sephiroth.android.library.widget;

import android.view.View;

class AbsHListView$b extends AbsHListView$m implements Runnable {
    final /* synthetic */ AbsHListView a;

    private AbsHListView$b(AbsHListView absHListView) {
        this.a = absHListView;
        super(absHListView);
    }

    public void run() {
        if (this.a.isPressed() && this.a.aN >= 0) {
            View childAt = this.a.getChildAt(this.a.aN - this.a.aw);
            if (this.a.aK) {
                this.a.setPressed(false);
                if (childAt != null) {
                    childAt.setPressed(false);
                    return;
                }
                return;
            }
            if (b() ? this.a.c(childAt, this.a.aN, this.a.aO) : false) {
                this.a.setPressed(false);
                childAt.setPressed(false);
            }
        }
    }
}
