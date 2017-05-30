package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;

@aaa
public class i implements b {
    private final b a;
    private final Context b;
    private final Object c = new Object();
    private c d;

    public i(Context context, b bVar) {
        this.a = bVar;
        this.b = context;
    }

    public void a() {
        synchronized (this.c) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.a();
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not forward show to RewardedVideoAd", e);
            }
        }
    }

    public void a(Context context) {
        synchronized (this.c) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.a(f.a((Object) context));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not forward pause to RewardedVideoAd", e);
            }
        }
    }

    public void a(c cVar) {
        synchronized (this.c) {
            this.d = cVar;
            if (this.a != null) {
                try {
                    this.a.a(new g(cVar));
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.b.d("Could not forward setRewardedVideoAdListener to RewardedVideoAd", e);
                }
            }
        }
    }

    public void a(String str) {
        com.google.android.gms.ads.internal.util.client.b.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void a(String str, com.google.android.gms.ads.c cVar) {
        synchronized (this.c) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.a(y.a().a(this.b, cVar.f(), str));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not forward loadAd to RewardedVideoAd", e);
            }
        }
    }

    public void b(Context context) {
        synchronized (this.c) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.b(f.a((Object) context));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not forward resume to RewardedVideoAd", e);
            }
        }
    }

    public boolean b() {
        boolean z = false;
        synchronized (this.c) {
            if (this.a == null) {
            } else {
                try {
                    z = this.a.b();
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.b.d("Could not forward isLoaded to RewardedVideoAd", e);
                }
            }
        }
        return z;
    }

    public void c() {
        a(null);
    }

    public void c(Context context) {
        synchronized (this.c) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.c(f.a((Object) context));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.b.d("Could not forward destroy to RewardedVideoAd", e);
            }
        }
    }

    public void d() {
        b(null);
    }

    public void e() {
        c(null);
    }

    public c f() {
        c cVar;
        synchronized (this.c) {
            cVar = this.d;
        }
        return cVar;
    }

    public String g() {
        com.google.android.gms.ads.internal.util.client.b.d("RewardedVideoAd.getUserId() is deprecated. Please do not call this method.");
        return null;
    }
}
