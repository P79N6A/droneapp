package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.b.a;
import com.google.android.gms.ads.internal.reward.client.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.e;

public class o extends a {
    private d a;

    public void a() {
    }

    public void a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        b.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.a.a.post(new Runnable(this) {
            final /* synthetic */ o a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.a != null) {
                    try {
                        this.a.a.a(1);
                    } catch (Throwable e) {
                        b.d("Could not notify onRewardedVideoAdFailedToLoad event.", e);
                    }
                }
            }
        });
    }

    public void a(d dVar) {
        this.a = dVar;
    }

    public void a(e eVar) {
    }

    public void a(String str) {
    }

    public void b(e eVar) {
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public void c(e eVar) {
    }

    public void d() {
    }

    public void e() {
    }
}
