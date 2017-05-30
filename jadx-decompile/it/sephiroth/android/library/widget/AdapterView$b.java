package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;

class AdapterView$b extends DataSetObserver {
    private Parcelable a = null;
    final /* synthetic */ AdapterView b;

    AdapterView$b(AdapterView adapterView) {
        this.b = adapterView;
    }

    public void a() {
        this.a = null;
    }

    public void onChanged() {
        this.b.aK = true;
        this.b.aQ = this.b.aP;
        this.b.aP = this.b.getAdapter().getCount();
        if (!this.b.getAdapter().hasStableIds() || this.a == null || this.b.aQ != 0 || this.b.aP <= 0) {
            this.b.A();
        } else {
            AdapterView.a(this.b, this.a);
            this.a = null;
        }
        this.b.w();
        this.b.requestLayout();
    }

    public void onInvalidated() {
        this.b.aK = true;
        if (this.b.getAdapter().hasStableIds()) {
            this.a = AdapterView.a(this.b);
        }
        this.b.aQ = this.b.aP;
        this.b.aP = 0;
        this.b.aN = -1;
        this.b.aO = Long.MIN_VALUE;
        this.b.aL = -1;
        this.b.aM = Long.MIN_VALUE;
        this.b.aB = false;
        this.b.w();
        this.b.requestLayout();
    }
}
