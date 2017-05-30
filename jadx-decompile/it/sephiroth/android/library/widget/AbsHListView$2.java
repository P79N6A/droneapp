package it.sephiroth.android.library.widget;

class AbsHListView$2 implements Runnable {
    final /* synthetic */ AbsHListView a;

    AbsHListView$2(AbsHListView absHListView) {
        this.a = absHListView;
    }

    public void run() {
        if (this.a.Q) {
            AbsHListView absHListView = this.a;
            this.a.R = false;
            absHListView.Q = false;
            AbsHListView.a(this.a, false);
            if ((this.a.getPersistentDrawingCache() & 2) == 0) {
                AbsHListView.b(this.a, false);
            }
            if (!this.a.isAlwaysDrawnWithCacheEnabled()) {
                this.a.invalidate();
            }
        }
    }
}
