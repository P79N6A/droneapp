package com.google.android.gms.internal;

public class mf {
    static final /* synthetic */ boolean a = (!mf.class.desiredAssertionStatus());

    private static long a(le<?> leVar) {
        long j = 8;
        if (!((leVar instanceof kz) || (leVar instanceof lf))) {
            if (leVar instanceof ku) {
                j = 4;
            } else if (leVar instanceof lo) {
                j = (long) (((String) leVar.a()).length() + 2);
            } else {
                String valueOf = String.valueOf(leVar.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown leaf node type: ").append(valueOf).toString());
            }
        }
        if (leVar.f().b()) {
            return j;
        }
        return a((le) leVar.f()) + (24 + j);
    }

    public static long a(lh lhVar) {
        if (lhVar.b()) {
            return 4;
        }
        if (lhVar.e()) {
            return a((le) lhVar);
        }
        if (a || (lhVar instanceof kw)) {
            long j = 1;
            for (lg lgVar : lhVar) {
                j = a(lgVar.d()) + ((j + ((long) lgVar.c().e().length())) + 4);
            }
            return !lhVar.f().b() ? (j + 12) + a((le) lhVar.f()) : j;
        } else {
            String valueOf = String.valueOf(lhVar.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
        }
    }

    public static int b(lh lhVar) {
        if (lhVar.b()) {
            return 0;
        }
        if (lhVar.e()) {
            return 1;
        }
        if (a || (lhVar instanceof kw)) {
            int i = 0;
            for (lg d : lhVar) {
                i = b(d.d()) + i;
            }
            return i;
        }
        String valueOf = String.valueOf(lhVar.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
    }
}
