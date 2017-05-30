package com.fimi.soul.biz.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fimi.soul.drone.g.c;
import java.util.concurrent.atomic.AtomicInteger;

public class h {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private static h g;
    private AtomicInteger f = new AtomicInteger(0);
    private SharedPreferences h;

    public h(Context context) {
        this.h = PreferenceManager.getDefaultSharedPreferences(context);
        a(this.h.getInt(c.bo, 0));
    }

    public static h a(Context context) {
        if (g == null) {
            g = new h(context);
        }
        return g;
    }

    public AtomicInteger a() {
        return this.f;
    }

    public void a(int i) {
        this.f.set(i);
        this.h.edit().putInt(c.bo, i).commit();
    }

    public boolean b() {
        return 1 == this.f.get() || 2 == this.f.get() || 3 == this.f.get();
    }
}
