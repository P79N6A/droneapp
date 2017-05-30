package it.sephiroth.android.library.widget;

class AbsHListView$m {
    private int a;
    final /* synthetic */ AbsHListView c;

    private AbsHListView$m(AbsHListView absHListView) {
        this.c = absHListView;
    }

    public void a() {
        this.a = AbsHListView.a(this.c);
    }

    public boolean b() {
        return this.c.hasWindowFocus() && AbsHListView.b(this.c) == this.a;
    }
}
