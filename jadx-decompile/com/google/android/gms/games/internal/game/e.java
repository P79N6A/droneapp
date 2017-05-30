package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.games.internal.b.n;
import com.xiaomi.market.sdk.l;

public final class e extends j implements c {
    e(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String a() {
        return e("external_game_id");
    }

    public String d() {
        return e("instance_display_name");
    }

    public boolean e() {
        return c("real_time_support") > 0;
    }

    public boolean f() {
        return c("turn_based_support") > 0;
    }

    public int g() {
        return c("platform_type");
    }

    public String h() {
        return e(l.PACKAGE_NAME);
    }

    public boolean i() {
        return c("piracy_check") > 0;
    }

    public boolean j() {
        return c("installed") > 0;
    }

    public String toString() {
        return c.a(this).a("ApplicationId", a()).a("DisplayName", d()).a("SupportsRealTime", Boolean.valueOf(e())).a("SupportsTurnBased", Boolean.valueOf(f())).a("PlatformType", n.a(g())).a("PackageName", h()).a("PiracyCheckEnabled", Boolean.valueOf(i())).a("Installed", Boolean.valueOf(j())).toString();
    }
}
