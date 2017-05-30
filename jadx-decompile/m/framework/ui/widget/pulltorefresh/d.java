package m.framework.ui.widget.pulltorefresh;

import android.content.Context;
import android.view.View;

public abstract class d {
    private Context a;
    private PullToRefreshView b;

    public d(PullToRefreshView pullToRefreshView) {
        this.a = pullToRefreshView.getContext();
        this.b = pullToRefreshView;
    }

    public Context a() {
        return this.a;
    }

    public abstract void a(int i);

    protected PullToRefreshView b() {
        return this.b;
    }

    public void c() {
        this.b.a();
    }

    public abstract View d();

    public abstract i e();

    public abstract boolean f();

    public abstract void g();

    public void h() {
    }
}
