package it.sephiroth.android.library.widget;

class AdapterView$f implements Runnable {
    final /* synthetic */ AdapterView a;

    private AdapterView$f(AdapterView adapterView) {
        this.a = adapterView;
    }

    public void run() {
        if (!this.a.aK) {
            AdapterView.b(this.a);
            AdapterView.c(this.a);
        } else if (this.a.getAdapter() != null) {
            this.a.post(this);
        }
    }
}
