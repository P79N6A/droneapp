package com.fimi.soul.drone.d;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.a.az;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.module.b.d;
import java.util.Map;

public class f {
    public static final az a = new az();
    public static c b = a.a();

    static {
        a.a = 193;
    }

    public static void a() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void a(a aVar) {
        a.d = (byte) 0;
        aVar.T().a(a.a());
    }

    public static void b(a aVar) {
        a.d = (byte) 1;
        aVar.T().a(a.a());
    }

    public static void c(a aVar) {
        a.d = (byte) 3;
        aVar.T().a(a.a());
    }

    public static void d(a aVar) {
        a.d = (byte) 10;
        aVar.T().a(a.a());
    }

    public static void e(a aVar) {
        a.d = (byte) -3;
        aVar.T().a(a.a());
    }

    public static void f(a aVar) {
        a.d = (byte) 5;
        aVar.T().a(a.a());
    }

    public static void g(a aVar) {
        a.d = (byte) 9;
        aVar.T().a(a.a());
    }

    public static void h(a aVar) {
        a.d = (byte) 6;
        aVar.T().a(a.a());
    }

    public static void i(a aVar) {
        a.d = (byte) 5;
        aVar.T().a(a.a());
    }

    public static void j(a aVar) {
        c(aVar);
        a();
        b(aVar);
        a();
        a(aVar);
        a();
        g(aVar);
        a();
        d(aVar);
        a();
        h(aVar);
        a();
    }

    public static void k(a aVar) {
        Map b = com.fimi.soul.module.update.a.a.a().b();
        if (!b.containsKey(Integer.valueOf(3))) {
            d.a(aVar).b(3);
            c(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(1))) {
            d.a(aVar).b(1);
            b(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(0))) {
            d.a(aVar).b(0);
            a(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(9))) {
            d.a(aVar).b(9);
            g(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(10))) {
            d.a(aVar).b(10);
            d(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(6))) {
            d.a(aVar).b(6);
            h(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(253))) {
            d.a(aVar).b(253);
            e(aVar);
            a();
        }
        if (!b.containsKey(Integer.valueOf(5))) {
            d.a(aVar).b(5);
            i(aVar);
            a();
        }
    }
}
