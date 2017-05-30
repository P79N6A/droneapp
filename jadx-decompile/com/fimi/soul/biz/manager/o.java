package com.fimi.soul.biz.manager;

import android.content.Context;
import com.fimi.kernel.utils.v;

public class o {
    private static String a = "screenlight";
    private static String b = "soundmax";
    private static String c = "autoupdate";
    private static String d = "push_control";
    private static String e = "open_position";
    private static String f = "mapchangge";
    private static o g = null;
    private v h;

    public o(Context context) {
        this.h = v.a(context);
    }

    public static o a(Context context) {
        if (g == null) {
            g = new o(context);
        }
        return g;
    }

    public void a(boolean z) {
        this.h.a().edit().putBoolean(d, z).commit();
    }

    public boolean a() {
        return this.h.a().getBoolean(a, false);
    }

    public void b(boolean z) {
        this.h.a().edit().putBoolean(e, z).commit();
    }

    public boolean b() {
        return this.h.a().getBoolean(b, false);
    }

    public void c(boolean z) {
        this.h.a().edit().putBoolean(c, z).commit();
    }

    public boolean c() {
        return this.h.a().getBoolean(c, false);
    }

    public void d(boolean z) {
        this.h.a().edit().putBoolean(b, z).commit();
    }

    public boolean d() {
        return this.h.a().getBoolean(e, true);
    }

    public void e(boolean z) {
        this.h.a().edit().putBoolean(a, z).commit();
    }

    public boolean e() {
        return this.h.a().getBoolean(f, false);
    }

    public void f(boolean z) {
        this.h.a().edit().putBoolean(f, z).commit();
    }

    public boolean f() {
        return this.h.a().getBoolean(d, true);
    }
}
