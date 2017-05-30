package com.fimi.soul.module.setting;

import java.io.Serializable;

public class h implements Serializable {
    private String a;
    private boolean b = false;

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean b() {
        return this.b;
    }

    public String toString() {
        return "RollerItemEntity{itemName='" + this.a + '\'' + ", is_able=" + this.b + '}';
    }
}
