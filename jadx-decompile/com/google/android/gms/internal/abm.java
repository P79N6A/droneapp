package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;

@aaa
public class abm {
    long a = -1;
    long b = -1;
    int c = -1;
    int d = -1;
    final String e;
    int f = 0;
    int g = 0;
    private final Object h = new Object();

    public abm(String str) {
        this.e = str;
    }

    public static boolean a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", SystemMediaRouteProvider.PACKAGE_NAME);
        if (identifier == 0) {
            b.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.a), 0).theme) {
                return true;
            }
            b.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException e) {
            b.d("Fail to fetch AdActivity theme");
            b.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public long a() {
        return this.b;
    }

    public Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.h) {
            bundle = new Bundle();
            bundle.putString("session_id", this.e);
            bundle.putLong("basets", this.b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putInt("pclick", this.f);
            bundle.putInt("pimp", this.g);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(AdRequestParcel adRequestParcel, long j) {
        synchronized (this.h) {
            if (this.b == -1) {
                if (j - u.i().l() > ((Long) uf.aq.c()).longValue()) {
                    a(-1);
                } else {
                    a(u.i().m());
                }
                this.b = j;
                this.a = this.b;
            } else {
                this.a = j;
            }
            if (adRequestParcel.c == null || adRequestParcel.c.getInt("gw", 2) != 1) {
                this.c++;
                this.d++;
                return;
            }
        }
    }

    public void b() {
        synchronized (this.h) {
            this.f++;
        }
    }

    public void c() {
        synchronized (this.h) {
            this.g++;
        }
    }

    public int d() {
        return this.d;
    }
}
