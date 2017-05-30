package com.fimi.soul.utils;

import android.app.Application;

public class a {
    private Application a;

    private static class a {
        private static final a a = new a();

        private a() {
        }
    }

    public static a a() {
        return a.a;
    }

    public void a(Application application) {
        this.a = application;
    }

    public boolean b() {
        return this.a != null ? ao.q(this.a) : false;
    }
}
