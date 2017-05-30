package com.google.android.gms.games.video;

import android.os.Bundle;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;

public final class a {
    private final boolean a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;

    private a(boolean z, int i, int i2, boolean z2, boolean z3) {
        d.b(VideoConfiguration.b(i, true));
        d.b(VideoConfiguration.a(i2, true));
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
    }

    public static a a(Bundle bundle) {
        return (bundle == null || bundle.get("IsCapturing") == null) ? null : new a(bundle.getBoolean("IsCapturing", false), bundle.getInt("CaptureMode", -1), bundle.getInt("CaptureQuality", -1), bundle.getBoolean("IsOverlayVisible", false), bundle.getBoolean("IsPaused", false));
    }

    public boolean a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public String toString() {
        return c.a(this).a("IsCapturing", Boolean.valueOf(this.a)).a("CaptureMode", Integer.valueOf(this.b)).a("CaptureQuality", Integer.valueOf(this.c)).a("IsOverlayVisible", Boolean.valueOf(this.d)).a("IsPaused", Boolean.valueOf(this.e)).toString();
    }
}
