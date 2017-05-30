package com.fimi.soul.biz.k;

import com.google.android.gms.maps.model.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class b {
    private List<c> a = new CopyOnWriteArrayList();

    static class a {
        private static final b a = new b();

        a() {
        }
    }

    public static b a() {
        return a.a;
    }

    public List<c> b() {
        return this.a;
    }
}
