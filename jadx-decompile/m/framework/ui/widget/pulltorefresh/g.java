package m.framework.ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import m.framework.ui.widget.pulltorefresh.GroupListView.a;

public abstract class g extends d {
    private ScrollableGroupListView a = new ScrollableGroupListView(a());
    private a b;
    private boolean c;
    private b d;

    public g(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.a.setOnScrollListener(new OnScrollListener(this) {
            final /* synthetic */ g a;
            private int b;
            private int c;

            {
                this.a = r1;
            }

            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                this.b = i;
                this.c = i2;
                this.a.a(this.a.a, i, i2, i3);
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                this.a.c = i == 2;
                if (i != 0) {
                    return;
                }
                if (this.a.d != null) {
                    this.a.d.a(this.b, this.c);
                } else if (this.a.b != null) {
                    this.a.b.b();
                }
            }
        });
        this.b = new a(this) {
            final /* synthetic */ g a;

            {
                this.a = r1;
            }

            public int a() {
                return this.a.i();
            }

            public View a(int i, int i2, View view, ViewGroup viewGroup) {
                return this.a.a(i, i2, view, viewGroup);
            }

            public View a(int i, View view, ViewGroup viewGroup) {
                return this.a.a(i, view, viewGroup);
            }

            public Object a(int i, int i2) {
                return this.a.a(i, i2);
            }

            public String a(int i) {
                return this.a.b(i);
            }

            public int b(int i) {
                return this.a.c(i);
            }
        };
        this.a.setAdapter(this.b);
    }

    public abstract View a(int i, int i2, View view, ViewGroup viewGroup);

    public abstract View a(int i, View view, ViewGroup viewGroup);

    public abstract Object a(int i, int i2);

    public void a(i iVar, int i, int i2, int i3) {
    }

    public abstract String b(int i);

    public abstract int c(int i);

    public void c() {
        super.c();
        this.b.b();
    }

    public i e() {
        return this.a;
    }

    public boolean f() {
        return this.a.a();
    }

    public abstract int i();

    public GroupListView j() {
        return this.a;
    }

    public boolean k() {
        return this.c;
    }
}
