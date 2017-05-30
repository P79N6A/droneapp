package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;

public final class e {
    private e() {
    }

    public static <T, E extends f<T>> ArrayList<T> a(b<E> bVar) {
        ArrayList<T> arrayList = new ArrayList(bVar.c());
        try {
            for (E a : bVar) {
                arrayList.add(a.a());
            }
            return arrayList;
        } finally {
            bVar.d();
        }
    }

    public static boolean b(b<?> bVar) {
        Bundle f = bVar.f();
        return (f == null || f.getString("next_page_token") == null) ? false : true;
    }

    public static boolean c(b<?> bVar) {
        Bundle f = bVar.f();
        return (f == null || f.getString("prev_page_token") == null) ? false : true;
    }

    public static boolean d(b<?> bVar) {
        return bVar != null && bVar.c() > 0;
    }
}
