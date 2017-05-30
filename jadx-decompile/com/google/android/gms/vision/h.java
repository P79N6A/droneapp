package com.google.android.gms.vision;

import android.util.SparseArray;

public class h {
    private static final Object a = new Object();
    private static int b = 0;
    private SparseArray<Integer> c = new SparseArray();
    private SparseArray<Integer> d = new SparseArray();

    public int a(int i) {
        int intValue;
        synchronized (a) {
            Integer num = (Integer) this.c.get(i);
            if (num != null) {
                intValue = num.intValue();
            } else {
                intValue = b;
                b++;
                this.c.append(i, Integer.valueOf(intValue));
                this.d.append(intValue, Integer.valueOf(i));
            }
        }
        return intValue;
    }

    public int b(int i) {
        int intValue;
        synchronized (a) {
            intValue = ((Integer) this.d.get(i)).intValue();
        }
        return intValue;
    }
}
