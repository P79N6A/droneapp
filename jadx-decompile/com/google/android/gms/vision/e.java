package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.b.b;
import java.util.ArrayList;
import java.util.List;

public class e extends b<Object> {
    private List<b<? extends Object>> a;

    public static class a {
        private e a = new e();

        public a a(b<? extends Object> bVar) {
            this.a.a.add(bVar);
            return this;
        }

        public e a() {
            if (this.a.a.size() != 0) {
                return this.a;
            }
            throw new RuntimeException("No underlying detectors added to MultiDetector.");
        }
    }

    private e() {
        this.a = new ArrayList();
    }

    public SparseArray<Object> a(d dVar) {
        SparseArray<Object> sparseArray = new SparseArray();
        for (b a : this.a) {
            SparseArray a2 = a.a(dVar);
            for (int i = 0; i < a2.size(); i++) {
                int keyAt = a2.keyAt(i);
                if (sparseArray.get(keyAt) != null) {
                    throw new IllegalStateException("Detection ID overlap for id = " + keyAt + ".  This means that one of the detectors is not using global IDs.");
                }
                sparseArray.append(keyAt, a2.valueAt(i));
            }
        }
        return sparseArray;
    }

    public void a() {
        for (b a : this.a) {
            a.a();
        }
        this.a.clear();
    }

    public void a(b<Object> bVar) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }

    public void b(d dVar) {
        for (b b : this.a) {
            b.b(dVar);
        }
    }

    public boolean b() {
        for (b b : this.a) {
            if (!b.b()) {
                return false;
            }
        }
        return true;
    }
}
