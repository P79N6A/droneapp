package it.sephiroth.android.library.widget;

import android.widget.ExpandableListView;
import java.util.ArrayList;

class b {
    public static final int a = 1;
    public static final int b = 2;
    private static final int g = 5;
    private static ArrayList<b> h = new ArrayList(5);
    public int c;
    public int d;
    int e;
    public int f;

    private b() {
    }

    static b a(int i) {
        return a(2, i, 0, 0);
    }

    static b a(int i, int i2) {
        return a(1, i, i2, 0);
    }

    static b a(int i, int i2, int i3, int i4) {
        b d = d();
        d.f = i;
        d.c = i2;
        d.d = i3;
        d.e = i4;
        return d;
    }

    static b a(long j) {
        if (j == 4294967295L) {
            return null;
        }
        b d = d();
        d.c = ExpandableListView.getPackedPositionGroup(j);
        if (ExpandableListView.getPackedPositionType(j) == 1) {
            d.f = 1;
            d.d = ExpandableListView.getPackedPositionChild(j);
            return d;
        }
        d.f = 2;
        return d;
    }

    private void c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    private static b d() {
        b bVar;
        synchronized (h) {
            if (h.size() > 0) {
                bVar = (b) h.remove(0);
                bVar.c();
            } else {
                bVar = new b();
            }
        }
        return bVar;
    }

    long a() {
        return this.f == 1 ? ExpandableListView.getPackedPositionForChild(this.c, this.d) : ExpandableListView.getPackedPositionForGroup(this.c);
    }

    public void b() {
        synchronized (h) {
            if (h.size() < 5) {
                h.add(this);
            }
        }
    }
}
