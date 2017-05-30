package m.framework.ui.widget.pulltorefresh;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

public abstract class h extends e {
    private ScrollableListView a = new ScrollableListView(a());
    private a b;
    private boolean c;
    private b d;

    public h(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.a.setOnScrollListener(new OnScrollListener(this) {
            final /* synthetic */ h a;
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
                    this.a.b.notifyDataSetChanged();
                }
            }
        });
        this.b = new a(this);
        this.a.setAdapter(this.b);
    }

    public void a(i iVar, int i, int i2, int i3) {
    }

    public void c() {
        super.c();
        this.b.notifyDataSetChanged();
    }

    public i e() {
        return this.a;
    }

    public boolean f() {
        return this.a.a();
    }

    public boolean j() {
        return this.c;
    }

    public ListView k() {
        return this.a;
    }
}
