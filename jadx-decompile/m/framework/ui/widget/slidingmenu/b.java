package m.framework.ui.widget.slidingmenu;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class b {
    private ArrayList<d> a = new ArrayList();

    public b(SlidingMenu slidingMenu) {
    }

    private d c(int i) {
        if (this.a == null) {
            return null;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar != null && dVar.a == i) {
                return dVar;
            }
        }
        return null;
    }

    public View a() {
        return null;
    }

    public abstract View a(int i, ViewGroup viewGroup);

    public abstract View a(e eVar, ViewGroup viewGroup);

    d a(int i) {
        return (d) this.a.get(i);
    }

    protected e a(int i, int i2) {
        return ((d) this.a.get(i)).b(i2);
    }

    public void a(int i, String str) {
        d c = c(i);
        if (c == null) {
            c = new d();
            c.a = i;
            this.a.add(c);
        }
        c.b = str;
    }

    public void a(int i, e eVar) {
        if (eVar != null) {
            d c = c(i);
            if (c != null) {
                c.a(eVar);
            }
        }
    }

    void a(d dVar) {
        if (dVar != null) {
            d c = c(dVar.a);
            if (c == null) {
                this.a.add(dVar);
                return;
            }
            int indexOf = this.a.indexOf(c);
            this.a.remove(indexOf);
            this.a.add(indexOf, dVar);
        }
    }

    public void a(e eVar) {
    }

    public void a(boolean z) {
    }

    int b() {
        return this.a == null ? 0 : this.a.size();
    }

    protected String b(int i) {
        return ((d) this.a.get(i)).b;
    }

    public e b(int i, int i2) {
        d c = c(i);
        return c == null ? null : c.a(i2);
    }

    public boolean b(e eVar) {
        return false;
    }
}
