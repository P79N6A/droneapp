package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class kx {
    private final List<ij> a;
    private final List<String> b;

    class AnonymousClass1 extends com.google.android.gms.internal.kw.a {
        final /* synthetic */ a a;

        AnonymousClass1(a aVar) {
            this.a = aVar;
        }

        public void a(kv kvVar, lh lhVar) {
            this.a.a(kvVar);
            kx.b(lhVar, this.a);
            this.a.e();
        }
    }

    static class a {
        private StringBuilder a = null;
        private Stack<kv> b = new Stack();
        private int c = -1;
        private int d;
        private boolean e = true;
        private final List<ij> f = new ArrayList();
        private final List<String> g = new ArrayList();
        private final c h;

        public a(c cVar) {
            this.h = cVar;
        }

        private ij a(int i) {
            kv[] kvVarArr = new kv[i];
            for (int i2 = 0; i2 < i; i2++) {
                kvVarArr[i2] = (kv) this.b.get(i2);
            }
            return new ij(kvVarArr);
        }

        private void a(kv kvVar) {
            d();
            if (this.e) {
                this.a.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            a(this.a, kvVar);
            this.a.append(":(");
            if (this.d == this.b.size()) {
                this.b.add(kvVar);
            } else {
                this.b.set(this.d, kvVar);
            }
            this.d++;
            this.e = false;
        }

        private void a(le<?> leVar) {
            d();
            this.c = this.d;
            this.a.append(leVar.a(com.google.android.gms.internal.lh.a.V2));
            this.e = true;
            if (this.h.a(this)) {
                g();
            }
        }

        private void a(StringBuilder stringBuilder, kv kvVar) {
            stringBuilder.append(mk.c(kvVar.e()));
        }

        private void d() {
            if (!a()) {
                this.a = new StringBuilder();
                this.a.append("(");
                Iterator it = a(this.d).iterator();
                while (it.hasNext()) {
                    a(this.a, (kv) it.next());
                    this.a.append(":(");
                }
                this.e = false;
            }
        }

        private void e() {
            this.d--;
            if (a()) {
                this.a.append(")");
            }
            this.e = true;
        }

        private void f() {
            mk.a(this.d == 0, "Can't finish hashing in the middle processing a child");
            if (a()) {
                g();
            }
            this.g.add("");
        }

        private void g() {
            mk.a(a(), "Can't end range without starting a range!");
            for (int i = 0; i < this.d; i++) {
                this.a.append(")");
            }
            this.a.append(")");
            ij a = a(this.c);
            this.g.add(mk.b(this.a.toString()));
            this.f.add(a);
            this.a = null;
        }

        public boolean a() {
            return this.a != null;
        }

        public int b() {
            return this.a.length();
        }

        public ij c() {
            return a(this.d);
        }
    }

    public interface c {
        boolean a(a aVar);
    }

    private static class b implements c {
        private final long a;

        public b(lh lhVar) {
            this.a = Math.max(512, (long) Math.sqrt((double) (mf.a(lhVar) * 100)));
        }

        public boolean a(a aVar) {
            return ((long) aVar.b()) > this.a && (aVar.c().h() || !aVar.c().g().equals(kv.c()));
        }
    }

    private kx(List<ij> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.a = list;
        this.b = list2;
    }

    public static kx a(lh lhVar) {
        return a(lhVar, new b(lhVar));
    }

    public static kx a(lh lhVar, c cVar) {
        if (lhVar.b()) {
            return new kx(Collections.emptyList(), Collections.singletonList(""));
        }
        a aVar = new a(cVar);
        b(lhVar, aVar);
        aVar.f();
        return new kx(aVar.f, aVar.g);
    }

    private static void b(lh lhVar, a aVar) {
        if (lhVar.e()) {
            aVar.a((le) lhVar);
        } else if (lhVar.b()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else if (lhVar instanceof kw) {
            ((kw) lhVar).a(new AnonymousClass1(aVar), true);
        } else {
            String valueOf = String.valueOf(lhVar);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Expected children node, but got: ").append(valueOf).toString());
        }
    }

    public List<ij> a() {
        return Collections.unmodifiableList(this.a);
    }

    public List<String> b() {
        return Collections.unmodifiableList(this.b);
    }
}
