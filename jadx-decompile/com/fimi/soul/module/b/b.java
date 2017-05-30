package com.fimi.soul.module.b;

import java.util.ArrayList;
import java.util.List;

public class b implements c {
    private List<b> a = new ArrayList();

    public interface b {
        void a(int i);
    }

    static class a {
        private static b a = new b();

        a() {
        }
    }

    public static b a() {
        return a.a;
    }

    public void a(int i) {
        for (b a : this.a) {
            a.a(i);
        }
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public void b(b bVar) {
        this.a.add(bVar);
    }
}
