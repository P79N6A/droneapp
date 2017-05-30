package it.sephiroth.android.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class AbsHListView$LayoutParams extends LayoutParams {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public long e = -1;

    public AbsHListView$LayoutParams(int i, int i2) {
        super(i, i2);
    }

    public AbsHListView$LayoutParams(int i, int i2, int i3) {
        super(i, i2);
        this.a = i3;
    }

    public AbsHListView$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsHListView$LayoutParams(LayoutParams layoutParams) {
        super(layoutParams);
    }
}
