package com.fimi.soul.drone.droneconnection.connection;

import com.fimi.soul.drone.c.a.c;
import java.io.Serializable;

public class b implements Serializable {
    private int a;
    private String b;
    private c c;

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.b;
    }

    public c c() {
        return this.c;
    }
}
