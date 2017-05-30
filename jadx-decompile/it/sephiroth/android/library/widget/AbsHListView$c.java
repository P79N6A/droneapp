package it.sephiroth.android.library.widget;

import android.view.View;

class AbsHListView$c extends AbsHListView$m implements Runnable {
    final /* synthetic */ AbsHListView a;

    private AbsHListView$c(AbsHListView absHListView) {
        this.a = absHListView;
        super(absHListView);
    }

    public void run() {
        View childAt = this.a.getChildAt(this.a.S - this.a.aw);
        if (childAt != null) {
            boolean c = (!b() || this.a.aK) ? false : this.a.c(childAt, this.a.S, this.a.B.getItemId(this.a.S));
            if (c) {
                this.a.aa = -1;
                this.a.setPressed(false);
                childAt.setPressed(false);
                return;
            }
            this.a.aa = 2;
        }
    }
}
