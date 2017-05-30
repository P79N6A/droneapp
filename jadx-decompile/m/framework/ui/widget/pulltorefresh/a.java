package m.framework.ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class a extends BaseAdapter {
    private e a;

    public a(e eVar) {
        this.a = eVar;
    }

    public int getCount() {
        return this.a.i();
    }

    public Object getItem(int i) {
        return this.a.c(i);
    }

    public long getItemId(int i) {
        return this.a.b(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.a.a(i, view, viewGroup);
    }
}
