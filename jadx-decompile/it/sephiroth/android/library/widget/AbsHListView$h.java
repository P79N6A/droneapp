package it.sephiroth.android.library.widget;

import android.view.View;
import android.widget.ListAdapter;

class AbsHListView$h extends AbsHListView$m implements Runnable {
    int a;
    final /* synthetic */ AbsHListView b;

    private AbsHListView$h(AbsHListView absHListView) {
        this.b = absHListView;
        super(absHListView);
    }

    public void run() {
        if (!this.b.aK) {
            ListAdapter listAdapter = this.b.B;
            int i = this.a;
            if (listAdapter != null && this.b.aP > 0 && i != -1 && i < listAdapter.getCount() && b()) {
                View childAt = this.b.getChildAt(i - this.b.aw);
                if (childAt != null) {
                    this.b.a(childAt, i, listAdapter.getItemId(i));
                }
            }
        }
    }
}
