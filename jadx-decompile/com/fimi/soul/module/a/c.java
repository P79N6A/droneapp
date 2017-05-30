package com.fimi.soul.module.a;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.FakeActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class c extends FakeActivity {
    private e a;

    public c(e eVar) {
        this.a = eVar;
    }

    protected final void a(Platform platform) {
        this.a.b(platform);
    }

    protected final boolean a() {
        return this.a.a;
    }

    protected final ShareParams b(Platform platform) {
        return this.a.c(platform) ? this.a.d(platform) : null;
    }

    protected final HashMap<String, Object> b() {
        return this.a.b;
    }

    protected final boolean c() {
        return this.a.c;
    }

    protected final boolean c(Platform platform) {
        return this.a.a(platform);
    }

    protected final ArrayList<a> d() {
        return this.a.d;
    }

    protected final HashMap<String, String> e() {
        return this.a.e;
    }

    protected final PlatformActionListener f() {
        return this.a.f;
    }

    protected final f g() {
        return this.a.g;
    }

    protected final boolean h() {
        return this.a.h;
    }
}
