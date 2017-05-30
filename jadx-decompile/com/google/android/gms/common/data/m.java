package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class m<T> extends a<T> {
    private boolean b = false;
    private ArrayList<Integer> c;

    protected m(DataHolder dataHolder) {
        super(dataHolder);
    }

    private void a() {
        synchronized (this) {
            if (!this.b) {
                int g = this.a.g();
                this.c = new ArrayList();
                if (g > 0) {
                    this.c.add(Integer.valueOf(0));
                    String h = h();
                    String c = this.a.c(h, 0, this.a.a(0));
                    int i = 1;
                    while (i < g) {
                        int a = this.a.a(i);
                        String c2 = this.a.c(h, i, a);
                        if (c2 == null) {
                            throw new NullPointerException(new StringBuilder(String.valueOf(h).length() + 78).append("Missing value for markerColumn: ").append(h).append(", at row: ").append(i).append(", for window: ").append(a).toString());
                        }
                        if (c2.equals(c)) {
                            c2 = c;
                        } else {
                            this.c.add(Integer.valueOf(i));
                        }
                        i++;
                        c = c2;
                    }
                }
                this.b = true;
            }
        }
    }

    public final T a(int i) {
        a();
        return a(b(i), c(i));
    }

    protected abstract T a(int i, int i2);

    int b(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    public int c() {
        a();
        return this.c.size();
    }

    protected int c(int i) {
        if (i < 0 || i == this.c.size()) {
            return 0;
        }
        int g = i == this.c.size() + -1 ? this.a.g() - ((Integer) this.c.get(i)).intValue() : ((Integer) this.c.get(i + 1)).intValue() - ((Integer) this.c.get(i)).intValue();
        if (g != 1) {
            return g;
        }
        int b = b(i);
        int a = this.a.a(b);
        String i2 = i();
        return (i2 == null || this.a.c(i2, b, a) != null) ? g : 0;
    }

    protected abstract String h();

    protected String i() {
        return null;
    }
}
