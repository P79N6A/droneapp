package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.HashMap;
import java.util.Map;

public class aj extends com.google.android.gms.fitness.data.y.a {
    private final b a;

    public static class a {
        private static final a a = new a();
        private final Map<b, aj> b = new HashMap();

        private a() {
        }

        public static a a() {
            return a;
        }

        public aj a(b bVar) {
            aj ajVar;
            synchronized (this.b) {
                ajVar = (aj) this.b.get(bVar);
                if (ajVar == null) {
                    ajVar = new aj(bVar);
                    this.b.put(bVar, ajVar);
                }
            }
            return ajVar;
        }

        public aj b(b bVar) {
            aj ajVar;
            synchronized (this.b) {
                ajVar = (aj) this.b.get(bVar);
            }
            return ajVar;
        }

        public aj c(b bVar) {
            aj ajVar;
            synchronized (this.b) {
                ajVar = (aj) this.b.remove(bVar);
                if (ajVar != null) {
                } else {
                    ajVar = new aj(bVar);
                }
            }
            return ajVar;
        }
    }

    private aj(b bVar) {
        this.a = (b) d.a(bVar);
    }

    public void a(DataPoint dataPoint) {
        this.a.a(dataPoint);
    }
}
