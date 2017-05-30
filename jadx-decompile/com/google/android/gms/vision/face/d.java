package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.b;
import com.google.android.gms.vision.c;
import com.google.android.gms.vision.g;

public class d extends c<a> {

    public static class a {
        private d a;

        public a(b<a> bVar, g<a> gVar) {
            this.a = new d(bVar, gVar);
        }

        public a a(int i) {
            this.a.a(i);
            return this;
        }

        public d a() {
            return this.a;
        }
    }

    public d(b<a> bVar, g<a> gVar) {
        super(bVar, gVar);
    }

    public int b(com.google.android.gms.vision.b.a<a> aVar) {
        SparseArray a = aVar.a();
        if (a.size() == 0) {
            throw new IllegalArgumentException("No faces for selectFocus.");
        }
        int keyAt = a.keyAt(0);
        float b = ((a) a.valueAt(0)).b();
        for (int i = 1; i < a.size(); i++) {
            int keyAt2 = a.keyAt(i);
            float b2 = ((a) a.valueAt(i)).b();
            if (b2 > b) {
                b = b2;
                keyAt = keyAt2;
            }
        }
        return keyAt;
    }
}
