package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.reward.client.i;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.xp;

@aaa
public class h {
    private static h a;
    private static final Object b = new Object();
    private ap c;
    private b d;

    private h() {
    }

    public static h a() {
        h hVar;
        synchronized (b) {
            if (a == null) {
                a = new h();
            }
            hVar = a;
        }
        return hVar;
    }

    public b a(Context context) {
        b bVar;
        synchronized (b) {
            if (this.d != null) {
                bVar = this.d;
            } else {
                this.d = new i(context, ac.b().a(context, new xp()));
                bVar = this.d;
            }
        }
        return bVar;
    }

    public void a(float f) {
        boolean z = true;
        boolean z2 = 0.0f <= f && f <= 1.0f;
        d.b(z2, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.c == null) {
            z = false;
        }
        d.a(z, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.c.a(f);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.b("Unable to set app volume.", e);
        }
    }

    public void a(Context context, String str) {
        d.a(this.c != null, (Object) "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.c.a(f.a((Object) context), str);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.b("Unable to open debug menu.", e);
        }
    }

    public void a(Context context, String str, i iVar) {
        synchronized (b) {
            if (this.c != null) {
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            } else {
                try {
                    this.c = ac.b().a(context);
                    this.c.a();
                    if (str != null) {
                        this.c.a(str);
                    }
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.b.d("Fail to initialize or set applicationCode on mobile ads setting manager", e);
                }
            }
        }
    }

    public void a(boolean z) {
        d.a(this.c != null, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.c.a(z);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.b("Unable to set app mute state.", e);
        }
    }
}
