package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public class acb$b {
    private final List<String> a = new ArrayList();
    private final List<Double> b = new ArrayList();
    private final List<Double> c = new ArrayList();

    public acb$b a(String str, double d, double d2) {
        int i = 0;
        while (i < this.a.size()) {
            double doubleValue = ((Double) this.c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.a.add(i, str);
        this.c.add(i, Double.valueOf(d));
        this.b.add(i, Double.valueOf(d2));
        return this;
    }

    public acb a() {
        return new acb(this, null);
    }
}
