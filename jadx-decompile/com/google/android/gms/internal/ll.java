package com.google.android.gms.internal;

import com.google.firebase.database.d;

public class ll {
    public static lh a() {
        return la.j();
    }

    public static lh a(Object obj) {
        lh a = li.a(obj);
        if (a instanceof lf) {
            a = new kz(Double.valueOf((double) ((Long) a.a()).longValue()), a());
        }
        if (a(a)) {
            return a;
        }
        throw new d("Invalid Firebase Database priority (must be a string, double, ServerValue, or null)");
    }

    public static boolean a(lh lhVar) {
        return lhVar.f().b() && (lhVar.b() || (lhVar instanceof kz) || (lhVar instanceof lo) || (lhVar instanceof ky));
    }
}
