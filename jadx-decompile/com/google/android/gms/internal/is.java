package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class is {
    private lh a = null;
    private Map<kv, is> b = null;

    public interface b {
        void a(ij ijVar, lh lhVar);
    }

    public interface a {
        void a(kv kvVar, is isVar);
    }

    public void a(final ij ijVar, final b bVar) {
        if (this.a != null) {
            bVar.a(ijVar, this.a);
        } else {
            a(new a(this) {
                final /* synthetic */ is c;

                public void a(kv kvVar, is isVar) {
                    isVar.a(ijVar.a(kvVar), bVar);
                }
            });
        }
    }

    public void a(ij ijVar, lh lhVar) {
        if (ijVar.h()) {
            this.a = lhVar;
            this.b = null;
        } else if (this.a != null) {
            this.a = this.a.a(ijVar, lhVar);
        } else {
            if (this.b == null) {
                this.b = new HashMap();
            }
            kv d = ijVar.d();
            if (!this.b.containsKey(d)) {
                this.b.put(d, new is());
            }
            ((is) this.b.get(d)).a(ijVar.e(), lhVar);
        }
    }

    public void a(a aVar) {
        if (this.b != null) {
            for (Entry entry : this.b.entrySet()) {
                aVar.a((kv) entry.getKey(), (is) entry.getValue());
            }
        }
    }

    public boolean a(final ij ijVar) {
        if (ijVar.h()) {
            this.a = null;
            this.b = null;
            return true;
        } else if (this.a != null) {
            if (this.a.e()) {
                return false;
            }
            kw kwVar = (kw) this.a;
            this.a = null;
            kwVar.a(new com.google.android.gms.internal.kw.a(this) {
                final /* synthetic */ is b;

                public void a(kv kvVar, lh lhVar) {
                    this.b.a(ijVar.a(kvVar), lhVar);
                }
            });
            return a(ijVar);
        } else if (this.b == null) {
            return true;
        } else {
            kv d = ijVar.d();
            ij e = ijVar.e();
            if (this.b.containsKey(d) && ((is) this.b.get(d)).a(e)) {
                this.b.remove(d);
            }
            if (!this.b.isEmpty()) {
                return false;
            }
            this.b = null;
            return true;
        }
    }
}
