package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@aaa
public class wx {
    private final Object a;
    private final Context b;
    private final String c;
    private final VersionInfoParcel d;
    private aca<wu> e;
    private aca<wu> f;
    @Nullable
    private d g;
    private int h;

    public wx(Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.a = new Object();
        this.h = 1;
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = versionInfoParcel;
        this.e = new b();
        this.f = new b();
    }

    public wx(Context context, VersionInfoParcel versionInfoParcel, String str, aca<wu> com_google_android_gms_internal_aca_com_google_android_gms_internal_wu, aca<wu> com_google_android_gms_internal_aca_com_google_android_gms_internal_wu2) {
        this(context, versionInfoParcel, str);
        this.e = com_google_android_gms_internal_aca_com_google_android_gms_internal_wu;
        this.f = com_google_android_gms_internal_aca_com_google_android_gms_internal_wu2;
    }

    private d c(@Nullable ro roVar) {
        d dVar = new d(this.f);
        u.e().a(new 1(this, roVar, dVar));
        return dVar;
    }

    protected wu a(Context context, VersionInfoParcel versionInfoParcel, @Nullable ro roVar) {
        return new ww(context, versionInfoParcel, roVar, null);
    }

    public c a() {
        return b(null);
    }

    protected d a(@Nullable ro roVar) {
        d c = c(roVar);
        c.a(new 2(this, c), new 3(this, c));
        return c;
    }

    public c b(@Nullable ro roVar) {
        c r_;
        synchronized (this.a) {
            if (this.g == null || this.g.b() == -1) {
                this.h = 2;
                this.g = a(roVar);
                r_ = this.g.r_();
            } else if (this.h == 0) {
                r_ = this.g.r_();
            } else if (this.h == 1) {
                this.h = 2;
                a(roVar);
                r_ = this.g.r_();
            } else if (this.h == 2) {
                r_ = this.g.r_();
            } else {
                r_ = this.g.r_();
            }
        }
        return r_;
    }
}
