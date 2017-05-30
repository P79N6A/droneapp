package m.framework.ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.GridView;

public class ScrollableGridView extends GridView implements i {
    private c a;
    private boolean b;

    public ScrollableGridView(Context context) {
        super(context);
        a(context);
    }

    public ScrollableGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ScrollableGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.a = new c(this) {
            final /* synthetic */ ScrollableGridView a;

            {
                this.a = r1;
            }

            public void a(i iVar, int i, int i2, int i3, int i4) {
                ScrollableGridView scrollableGridView = this.a;
                boolean z = i2 <= 0 && i4 <= 0;
                scrollableGridView.b = z;
            }
        };
    }

    public boolean a() {
        return this.b;
    }

    protected int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.a != null) {
            this.a.a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }
}
