package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.b.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;

@aaa
public class aat extends a {
    private final Context a;
    private final Object b;
    private final VersionInfoParcel c;
    private final aau d;

    public aat(Context context, d dVar, xq xqVar, VersionInfoParcel versionInfoParcel) {
        this(context, versionInfoParcel, new aau(context, dVar, AdSizeParcel.a(), xqVar, versionInfoParcel));
    }

    aat(Context context, VersionInfoParcel versionInfoParcel, aau com_google_android_gms_internal_aau) {
        this.b = new Object();
        this.a = context;
        this.c = versionInfoParcel;
        this.d = com_google_android_gms_internal_aau;
    }

    public void a() {
        synchronized (this.b) {
            this.d.E();
        }
    }

    public void a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        synchronized (this.b) {
            this.d.a(rewardedVideoAdRequestParcel);
        }
    }

    public void a(com.google.android.gms.ads.internal.reward.client.d dVar) {
        synchronized (this.b) {
            this.d.a(dVar);
        }
    }

    public void a(e eVar) {
        synchronized (this.b) {
            this.d.d();
        }
    }

    public void a(String str) {
        b.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void b(e eVar) {
        synchronized (this.b) {
            Context context = eVar == null ? null : (Context) f.a(eVar);
            if (context != null) {
                try {
                    this.d.a(context);
                } catch (Throwable e) {
                    b.d("Unable to extract updated context.", e);
                }
            }
            this.d.c_();
        }
    }

    public boolean b() {
        boolean F;
        synchronized (this.b) {
            F = this.d.F();
        }
        return F;
    }

    public void c() {
        a(null);
    }

    public void c(e eVar) {
        synchronized (this.b) {
            this.d.b();
        }
    }

    public void d() {
        b(null);
    }

    public void e() {
        c(null);
    }
}
