package m.framework.ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;

public abstract class e extends d {
    public e(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
    }

    public abstract View a(int i, View view, ViewGroup viewGroup);

    public abstract void a(i iVar, int i, int i2, int i3);

    public abstract long b(int i);

    public abstract Object c(int i);

    public abstract int i();

    public abstract boolean j();
}
