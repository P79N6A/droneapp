package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.doubleclick.b;
import com.google.android.gms.c.f;

@aaa
public class up implements b {
    private final uq a;

    public up(uq uqVar) {
        this.a = uqVar;
    }

    public String a() {
        try {
            return this.a.a();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not delegate getBaseURL to CustomRenderedAd", e);
            return null;
        }
    }

    public void a(View view) {
        try {
            this.a.a(view != null ? f.a((Object) view) : null);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not delegate onAdRendered to CustomRenderedAd", e);
        }
    }

    public String b() {
        try {
            return this.a.b();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not delegate getContent to CustomRenderedAd", e);
            return null;
        }
    }

    public void c() {
        try {
            this.a.c();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not delegate recordClick to CustomRenderedAd", e);
        }
    }

    public void d() {
        try {
            this.a.d();
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.b.d("Could not delegate recordImpression to CustomRenderedAd", e);
        }
    }
}
