package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.BleDevice;
import java.util.HashMap;
import java.util.Map;

public class d extends com.google.android.gms.fitness.request.ag.a {
    private final a a;

    public static class a {
        private static final a a = new a();
        private final Map<a, d> b = new HashMap();

        private a() {
        }

        public static a a() {
            return a;
        }

        public d a(a aVar) {
            d dVar;
            synchronized (this.b) {
                dVar = (d) this.b.get(aVar);
                if (dVar == null) {
                    dVar = new d(aVar);
                    this.b.put(aVar, dVar);
                }
            }
            return dVar;
        }

        public d b(a aVar) {
            d dVar;
            synchronized (this.b) {
                dVar = (d) this.b.get(aVar);
                if (dVar != null) {
                } else {
                    dVar = new d(aVar);
                }
            }
            return dVar;
        }
    }

    private d(a aVar) {
        this.a = (a) com.google.android.gms.common.internal.d.a(aVar);
    }

    public void a() {
        this.a.a();
    }

    public void a(BleDevice bleDevice) {
        this.a.a(bleDevice);
    }
}
