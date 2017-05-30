package com.fimi.soul.biz.h;

import com.fimi.soul.drone.c.a.c;
import java.util.HashMap;

public class a {
    public static a a;
    private volatile HashMap<Integer, c> b = new HashMap();

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public void a(HashMap<Integer, c> hashMap) {
        this.b = hashMap;
    }

    public HashMap<Integer, c> b() {
        return this.b;
    }
}
