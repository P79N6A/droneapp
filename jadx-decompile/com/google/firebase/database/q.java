package com.google.firebase.database;

import com.google.android.gms.internal.lh;

public class q {

    public interface a {
        b a(k kVar);

        void a(c cVar, boolean z, b bVar);
    }

    public static class b {
        private boolean a;
        private lh b;

        private b(boolean z, lh lhVar) {
            this.a = z;
            this.b = lhVar;
        }

        public boolean a() {
            return this.a;
        }

        public lh b() {
            return this.b;
        }
    }

    public static b a() {
        return new b(false, null);
    }

    public static b a(k kVar) {
        return new b(true, kVar.a());
    }
}
