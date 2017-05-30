package it.sephiroth.android.library.widget;

class HListView$c implements Runnable {
    final /* synthetic */ HListView a;
    private int b;
    private int c;

    private HListView$c(HListView hListView) {
        this.a = hListView;
    }

    public HListView$c a(int i, int i2) {
        this.b = i;
        this.c = i2;
        return this;
    }

    public void run() {
        this.a.j(this.b, this.c);
    }
}
