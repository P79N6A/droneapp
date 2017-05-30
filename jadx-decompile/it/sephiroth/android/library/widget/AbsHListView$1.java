package it.sephiroth.android.library.widget;

import android.view.View;

class AbsHListView$1 implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ AbsHListView$h b;
    final /* synthetic */ AbsHListView c;

    AbsHListView$1(AbsHListView absHListView, View view, AbsHListView$h absHListView$h) {
        this.c = absHListView;
        this.a = view;
        this.b = absHListView$h;
    }

    public void run() {
        this.c.aa = -1;
        this.a.setPressed(false);
        this.c.setPressed(false);
        if (!this.c.aK) {
            this.b.run();
        }
    }
}
